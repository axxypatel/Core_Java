/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import Business.Enterprise.Enterprise;
import Business.Order.*;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.EcoSystem;

/**
 *
 * @author keshav
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private NurseOrganization nurseOrganization;
    private EcoSystem system;

    /**
     * Creates new form NurseJPanel
     */
    public NurseWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.nurseOrganization = (NurseOrganization) organization;
        this.system = system;
        valueLabel.setText(enterprise.getName());
        HRCJTable.setDefaultRenderer(Object.class, new MultiLineCellRenderer());
        populateTable();
    }

    public void populateTable() {
        Map<Patient, ArrayList<HighRiskCriteria>> patientWithHRCMap = new HashMap<>();
        ArrayList<HighRiskCriteria> HRClist = new ArrayList<HighRiskCriteria>();
        boolean labConditionSatisfy = false;
        String strActual;
        String strIdeal;

        for (Patient patient : system.getPatientList().getPatientList()) {
            for (Order order : patient.getOrderList().getOrderList()) {
                for (HighRiskCriteria hrc : enterprise.getHighRiskCriteriaDirectory().getHighRiskCriteriaList()) {
                    if (!hrc.isIsLab()) {
                        if (order.getDrugObject().getDrugName().equals(hrc.getDrugName())) {
                            if (!HRClist.contains(hrc)) {
                                HRClist.add(hrc);
                            }

                            if (patientWithHRCMap.containsKey(patient)) {
                                ArrayList<HighRiskCriteria> templist = patientWithHRCMap.get(patient);
                                templist.add(hrc);
                                patientWithHRCMap.put(patient, templist);
                            } else {
                                ArrayList<HighRiskCriteria> templist = new ArrayList<HighRiskCriteria>();
                                templist.add(hrc);
                                patientWithHRCMap.put(patient, templist);
                            }
                        }
                    }
                }
            }

            for (LabOrder laborder : patient.getLabOrderList().getLabOrderList()) {
                for (HighRiskCriteria hrc : enterprise.getHighRiskCriteriaDirectory().getHighRiskCriteriaList()) {
                    if (hrc.isIsLab()) {
                        if (laborder.getLabObject().getLabTestName().equals(hrc.getLabName())) {
                            if (!HRClist.contains(hrc)) {
                                HRClist.add(hrc);
                            }
                            labConditionSatisfy = true;
                            if (hrc.isIsGreaterRangeAvailable() || hrc.isIsLesserRangeAvailable()) {
                                labConditionSatisfy = false;

                                if (hrc.isIsGreaterRangeAvailable()) {
                                    if (laborder.getResult() > hrc.getGreaterRange()) {
                                        labConditionSatisfy = true;
                                    }
                                }
                                if (hrc.isIsLesserRangeAvailable()) {
                                    if (laborder.getResult() < hrc.getLesserRange()) {
                                        labConditionSatisfy = true;
                                    }
                                }
                            }
                            if (labConditionSatisfy) {
                                if (patientWithHRCMap.containsKey(patient)) {
                                    ArrayList<HighRiskCriteria> templist = patientWithHRCMap.get(patient);
                                    templist.add(hrc);
                                    patientWithHRCMap.put(patient, templist);
                                } else {
                                    ArrayList<HighRiskCriteria> templist = new ArrayList<HighRiskCriteria>();
                                    templist.add(hrc);
                                    patientWithHRCMap.put(patient, templist);
                                }
                            }
                        }
                    }
                }
            }
        }

        AnalysisStore(patientWithHRCMap);

        DefaultTableModel hrcdtm = (DefaultTableModel) HRCJTable.getModel();
        hrcdtm.setRowCount(0);
        hrcdtm.addColumn("Patient");
        ArrayList<HighRiskCriteria> templist;
        for (HighRiskCriteria hrc : HRClist) {
            hrcdtm.addColumn(hrc.getHRCName());
        }

        for (Patient pat : patientWithHRCMap.keySet()) {
            Object[] row = new Object[hrcdtm.getColumnCount()];
            row[0] = pat.getPatientName();
            templist = patientWithHRCMap.get(pat);
            for (int i = 1; i < hrcdtm.getColumnCount(); i++) {
                row[i] = " ";
                for (HighRiskCriteria pathrc : templist) {
                    if (pathrc.getHRCName().equals(hrcdtm.getColumnName(i))) {
                        if (!pathrc.isIsLab()) {
                            for (Order order : pat.getOrderList().getOrderList()) {
                                if (order.getDrugObject().getDrugName().equals(pathrc.getDrugName())) {
                                    {
                                        row[i] = row[i] + " " + pathrc.getDrugName();
                                    }
                                }
                            }
                        }

                        if (pathrc.isIsLab()) {
                            strActual = "Result: ";
                            strIdeal = "";

                            for (LabOrder laborder : pat.getLabOrderList().getLabOrderList()) {
                                if (laborder.getLabObject().getLabTestName().equals(pathrc.getLabName())) {
                                    labConditionSatisfy = true;
                                    if (pathrc.isIsGreaterRangeAvailable() || pathrc.isIsLesserRangeAvailable()) {
                                        labConditionSatisfy = false;
                                        strIdeal = "Ideal: ";
                                        if (pathrc.isIsLesserRangeAvailable()) {
                                            strIdeal = strIdeal + " > " + pathrc.getLesserRange();
                                            if (laborder.getResult() < pathrc.getLesserRange()) {
                                                labConditionSatisfy = true;
                                            }

                                            if (pathrc.isIsGreaterRangeAvailable()) {
                                                strIdeal = strIdeal + " and ";
                                            }
                                        }

                                        if (pathrc.isIsGreaterRangeAvailable()) {
                                            strIdeal = strIdeal + " < " + pathrc.getGreaterRange();
                                            if (laborder.getResult() > pathrc.getGreaterRange()) {
                                                labConditionSatisfy = true;
                                            }
                                        }
                                    }
                                    if (labConditionSatisfy) {
                                        strActual = strActual + String.valueOf(laborder.getResult());
                                        row[i] = laborder.getLabObject().getLabTestName() + "     " + strActual + "    " + strIdeal;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            hrcdtm.addRow(row);
        }
    }

    public void AnalysisStore(Map<Patient, ArrayList<HighRiskCriteria>> patientWithHRCMap) {
        Patient patient;
        PatientList patientList = system.getPatientList();
        for (Patient pat : patientWithHRCMap.keySet()) {
            patient = patientList.searchPatientByMRN(pat.getMRN());
            if (patient != null) {
                patient.setHighRiskConsultationCount(patient.getHighRiskConsultationCount() + 1);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HRCJTable = new javax.swing.JTable();
        enterpriseLabel1 = new javax.swing.JLabel();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        valueLabel.setText("<value>");

        HRCJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        HRCJTable.setRowHeight(35);
        jScrollPane1.setViewportView(HRCJTable);

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("High Risk Patient Worklist");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HRCJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
