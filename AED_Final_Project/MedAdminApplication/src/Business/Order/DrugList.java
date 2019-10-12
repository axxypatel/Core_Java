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
public class DrugList {

    private ArrayList<Drug> drugList;

    public DrugList() {
        drugList = new ArrayList<Drug>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    public Drug addDrug() {
        Drug drugObject = new Drug();
        drugList.add(drugObject);
        return drugObject;
    }

    public void deleteDrug(Drug drug) {
        drugList.remove(drug);
    }

    public Drug searchDrugTests(String drugName) {
        for (Drug drug : this.getDrugList()) {
            if (drug.getDrugName().equalsIgnoreCase(drugName)) {
                return drug;
            }
        }
        return null;
    }
}
