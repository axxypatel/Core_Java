/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Order.PatientList;
import Business.EcoSystem;
import Business.Order.Order;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author Akshay
 */
public class MedicationReminderMultiThread extends Thread {

    private EcoSystem system;
    private int dayTime;
    private Thread thread;
    private String threadName;
    DateFormat dateFormat = new SimpleDateFormat("yyyy-dd-MM");
    DateFormat dateFormatTemp = new SimpleDateFormat("yyyy-dd-MM HH:mm");
    DateFormat dayFormat = new SimpleDateFormat("EEEE");
    Date currentDate = new Date();

    String SMTP_HOST = "smtp.gmail.com";
    String FROM_ADDRESS = "aedgrouptesting@gmail.com";
    String PASSWORD = "aedgroup123";

    String toAddress = "keshav.vyas14@gmail.com";
    String subject = "subject";
    String messageBody = "message body";

    public MedicationReminderMultiThread(EcoSystem system, String threadName) {
        this.system = system;
        this.threadName = threadName;
        
        for (Patient patient : system.getPatientList().getPatientList()) {
            patient.setReminderCount(patient.getReminderCount() + 1);
        }
    }

    public void start() {
        System.out.println("Start Function");
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

    //@Override
    public void run() {
        System.out.println("Run Function");
        while (true) {
            String morStartTime = dateFormat.format(currentDate) + " 09:00";
            String morEndTime = dateFormat.format(currentDate) + " 10:00";
            String aftStartTime = dateFormat.format(currentDate) + " 12:00";
            String aftEndTime = dateFormat.format(currentDate) + " 13:00";
            String eveStartTime = dateFormat.format(currentDate) + " 15:00";
            String eveEndTime = dateFormat.format(currentDate) + " 20:00";

            try {
                Date startTime = dateFormatTemp.parse(morStartTime);
                Date endTime = dateFormatTemp.parse(morEndTime);

                Date startTime1 = dateFormatTemp.parse(aftStartTime);
                Date endTime1 = dateFormatTemp.parse(aftEndTime);

                Date startTime2 = dateFormatTemp.parse(eveStartTime);
                Date endTime2 = dateFormatTemp.parse(eveEndTime);
                //System.out.println(dateFormatTemp.format(startTime2) + " "+ dateFormatTemp.format(endTime2));
                if ((currentDate.after(startTime)) && (currentDate.before(endTime))) {
                    dayTime = 1;
                    extractPatientList(dayTime);
                } else if ((currentDate.after(startTime1)) && (currentDate.before(endTime1))) {
                    dayTime = 2;
                    extractPatientList(dayTime);
                } else if ((currentDate.after(startTime2)) && (currentDate.before(endTime2))) {
                    dayTime = 3;
                    extractPatientList(dayTime);
                }
                thread.sleep(60 * 60 * 1000);
            } catch (ParseException ex) {
                System.out.println("Date format is not correct.");
            } catch (InterruptedException ex) {
                Logger.getLogger(MedicationReminderMultiThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void extractPatientList(int dayTime) {
        System.out.println("extractPatientList Function");
        for (Patient patient : system.getPatientList().getPatientList()) {
            subject = "Medication Reminder -  " + patient.getPatientName() + " " + dateFormat.format(currentDate);
            messageBody = patient.getPatientName();
            System.out.println(patient.getPatientName());
            for (Order order : patient.getOrderList().getOrderList()) {
                System.out.println(order.getDayTimeList());
                if (order.getDayTimeList().contains(dayTime)) {
                    System.out.println(order.getDayList());
                    if (order.getDayList().contains(dayFormat.format(currentDate).toString().toLowerCase())) {
                        toAddress = patient.getPatientEmail();
                        messageBody = messageBody + "  "  + order.getDrugObject().getDrugName() + "  " 
                                + dayFormat.format(currentDate).toString().toLowerCase() + "  " + java.time.LocalDate.now();
                    }
                }
            }
            sendEmail();
            patient.setReminderCount(patient.getReminderCount() + 1);
        }
    }

    public void sendEmail() {
        System.out.println("sendEmail Function");
        try {
            Properties props = new Properties();
            props.put("mail.smtp.host", SMTP_HOST);
            props.put("mail.smtp.auth", "true");
            props.put("mail.debug", "false");
            props.put("mail.smtp.ssl.enable", "true");

            Session session = Session.getInstance(props, new SocialAuth());
            Message msg = new MimeMessage(session);

            InternetAddress from = new InternetAddress(FROM_ADDRESS);
            msg.setFrom(from);
            
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));

            msg.setSubject(subject);
            msg.setContent(messageBody, "text/plain");
            Transport.send(msg);
            System.out.println("sending email");
        } catch (Exception exc) {
            System.out.println(exc);
        }

    }

    class SocialAuth extends Authenticator {

        protected PasswordAuthentication getPasswordAuthentication() {

            return new PasswordAuthentication(FROM_ADDRESS, PASSWORD);

        }
    }

}