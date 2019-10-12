/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author Akshay
 */
public class Patient {

    private Long MRN;
    private LabOrderList labOrderList;
    private String patientName;
    private String patientEmail;
    private String patientNumber;
    private String patientSex;
    private int age;
    private String patientAddress;
    private String patientLocation;
    private OrderList orderList;
    private String physicianNotes;
    private Boolean interactionCheckFlg;
    private int interactionCount;
    private int overrideCount;
    private int reminderCount;
    private int HighRiskConsultationCount;
    private String enterpriseName;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
    
    public Boolean getInteractionCheckFlg() {
        return interactionCheckFlg;
    }

    public void setInteractionCheckFlg(Boolean interactionCheckFlg) {
        this.interactionCheckFlg = interactionCheckFlg;
    }

    public int getInteractionCount() {
        return interactionCount;
    }

    public void setInteractionCount(int interactionCount) {
        this.interactionCount = interactionCount;
    }

    public int getOverrideCount() {
        return overrideCount;
    }

    public void setOverrideCount(int overrideCount) {
        this.overrideCount = overrideCount;
    }
    
    public Patient() {
        labOrderList = new LabOrderList();
        orderList = new OrderList();
        interactionCheckFlg = true;
    }

    public String getPhysicianNotes() {
        return physicianNotes;
    }

    public void setPhysicianNotes(String physicianNotes) {
        this.physicianNotes = physicianNotes;
    }

    public Long getMRN() {
        return MRN;
    }

    public void setMRN(Long MRN) {
        this.MRN = MRN;
    }

    public LabOrderList getLabOrderList() {
        return labOrderList;
    }

    public void setLabOrderList(LabOrderList labOrderList) {
        this.labOrderList = labOrderList;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public void setOrderList(OrderList orderList) {
        this.orderList = orderList;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientLocation() {
        return patientLocation;
    }

    public void setPatientLocation(String patientLocation) {
        this.patientLocation = patientLocation;
    }

    public int getReminderCount() {
        return reminderCount;
    }

    public void setReminderCount(int reminderCount) {
        this.reminderCount = reminderCount;
    }

    public int getHighRiskConsultationCount() {
        return HighRiskConsultationCount;
    }

    public void setHighRiskConsultationCount(int HighRiskConsultationCount) {
        this.HighRiskConsultationCount = HighRiskConsultationCount;
    }
    
    
    @Override
    public String toString() {
        return String.valueOf(this.getMRN());
    }

}
