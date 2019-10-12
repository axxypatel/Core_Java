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
public class LabOrderList {

    private ArrayList<LabOrder> labOrderList;

    public LabOrderList(){
        labOrderList = new ArrayList<LabOrder>();
    }
    public ArrayList<LabOrder> getLabOrderList() {
        return labOrderList;
    }

    public void setLabList(ArrayList<LabOrder> labOrderList) {
        this.labOrderList = labOrderList;
    }

    public LabOrder addLabOrder() {
        LabOrder labOrderObject = new LabOrder();
        labOrderList.add(labOrderObject);
        return labOrderObject;
    }

    public void deleteLabOrder(LabOrder labOrderObject) {
        labOrderList.remove(labOrderObject);
    }

    public LabOrder searchLabOrderTests(int labOrderId) {
        for (LabOrder labOrder : this.getLabOrderList()) {
            if (labOrder.getLabId() == labOrderId) {
                return labOrder;
            }
        }
        return null;
    }

}