/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author keshav
 */
public class LabList {

    private ArrayList<Lab> labList;

    public LabList() {
        labList = new ArrayList<Lab>();
    }

    public ArrayList<Lab> getLabList() {
        return labList;
    }

    public void setLabList(ArrayList<Lab> labList) {
        this.labList = labList;
    }

    public Lab addLab() {
        Lab labObject = new Lab();
        labList.add(labObject);
        return labObject;
    }

    public void deleteLab(Lab labObject) {
        labList.remove(labObject);
    }

    public Lab searchLabTests(String labTestName) {
        for (Lab lab : this.getLabList()) {
            if (lab.getLabTestName().equalsIgnoreCase(labTestName)) {
                return lab;
            }
        }
        return null;
    }
}