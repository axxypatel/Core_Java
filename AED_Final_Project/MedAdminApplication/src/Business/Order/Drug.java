/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

/**
 *
 * @author Akshay
 */
public class Drug {
    private int drugId;
    private String drugName;
    private int dispenseQty;
    private float volume;
    private String volumeUnit;
    private float strength;
    private String strengthUnit;
    private String dispenseQtyUnit;
    private String drugType;

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getDispenseQty() {
        return dispenseQty;
    }

    public void setDispenseQty(int dispenseQty) {
        this.dispenseQty = dispenseQty;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getVolumeUnit() {
        return volumeUnit;
    }

    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    public float getStrength() {
        return strength;
    }

    public void setStrength(float strength) {
        this.strength = strength;
    }

    public String getStrengthUnit() {
        return strengthUnit;
    }

    public void setStrengthUnit(String strengthUnit) {
        this.strengthUnit = strengthUnit;
    }

    public String getDispenseQtyUnit() {
        return dispenseQtyUnit;
    }

    public void setDispenseQtyUnit(String dispenseQtyUnit) {
        this.dispenseQtyUnit = dispenseQtyUnit;
    }
    
    @Override
    public String toString(){
        return this.drugName;
    }
    
}
