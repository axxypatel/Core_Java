/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Akshay
 */
enum Day
{
    Sunday,Monday,Thuesday,Wednesday,Thusday,Friday,Saturday;
}
enum DayTime
{
    Morning,Afternoon,Night;
}
public class Order {
    private Drug drugObject;
    private int drugDose;
    private ArrayList<String> dayList;
    private ArrayList<Integer> dayTimeList;
    private Date startDate;
    private Date endDate;
    private Date orderTimeStamp;

    public Date getOrderTimeStamp() {
        return orderTimeStamp;
    }

    public void setOrderTimeStamp(Date orderTimeStamp) {
        this.orderTimeStamp = orderTimeStamp;
    }
    
    public Order()
    {
        dayList = new ArrayList<String>();
        dayTimeList = new ArrayList<Integer>();    
    }

    public ArrayList<String> getDayList() {
        return dayList;
    }

    public void setDayList(ArrayList<String> dayList) {
        this.dayList = dayList;
    }

    public ArrayList<Integer> getDayTimeList() {
        return dayTimeList;
    }

    public void setDayTimeList(ArrayList<Integer> dayTimeList) {
        this.dayTimeList = dayTimeList;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    
    public Drug getDrugObject() {
        return drugObject;
    }

    public void setDrugObject(Drug drugObject) {
        this.drugObject = drugObject;
    }

    public int getDrugDose() {
        return drugDose;
    }

    public void setDrugDose(int drugDose) {
        this.drugDose = drugDose;
    }
    
    @Override
    public String toString(){
        return this.getDrugObject().getDrugName();
                
    }
    
    
}
