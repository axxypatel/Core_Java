/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

/**
 *
 * @author keshav
 */
public class HighRiskCriteria {

    private int HRCId;
    private String HRCName;
    private String drugName;
    private String labName;
    private float greaterRange;
    private float lesserRange;
    private boolean isLab;
    private boolean isGreaterRangeAvailable;
    private boolean isLesserRangeAvailable;

    public boolean isIsLab() {
        return isLab;
    }

    public void setIsLab(boolean isLab) {
        this.isLab = isLab;
    }

    public boolean isIsGreaterRangeAvailable() {
        return isGreaterRangeAvailable;
    }

    public void setIsGreaterRangeAvailable(boolean isGreaterRangeAvailable) {
        this.isGreaterRangeAvailable = isGreaterRangeAvailable;
    }

    public boolean isIsLesserRangeAvailable() {
        return isLesserRangeAvailable;
    }

    public void setIsLesserRangeAvailable(boolean isLesserRangeAvailable) {
        this.isLesserRangeAvailable = isLesserRangeAvailable;
    }

    public int getHRCId() {
        return HRCId;
    }

    public void setHRCId(int HRCId) {
        this.HRCId = HRCId;
    }

    public String getHRCName() {
        return HRCName;
    }

    public void setHRCName(String HRCName) {
        this.HRCName = HRCName;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public float getGreaterRange() {
        return greaterRange;
    }

    public void setGreaterRange(float greaterRange) {
        this.greaterRange = greaterRange;
    }

    public float getLesserRange() {
        return lesserRange;
    }

    public void setLesserRange(float lesserRange) {
        this.lesserRange = lesserRange;
    }

    @Override
    public String toString() {
        return this.HRCName;
    }
}
