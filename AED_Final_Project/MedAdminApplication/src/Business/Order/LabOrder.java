/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.Date;

/**
 *
 * @author keshav
 */
public class LabOrder {

    private Lab labObject;
    private int labId;
    private float result;
    private Date dateTaken;
    private Date dateOrdered;

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    public Lab getLabObject() {
        return labObject;
    }

    public void setLabObject(Lab labObject) {
        this.labObject = labObject;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public Date getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    @Override
    public String toString() {
        return this.getLabObject().getLabTestName();

    }
}
