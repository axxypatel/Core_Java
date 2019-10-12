/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.Order.LabOrder;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    LabTestWorkRequest request;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, LabTestWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        txtPatientMRN.setText(String.valueOf(request.getPatient().getMRN()));
        txtPatientName.setText(request.getPatient().getPatientName());
        txtLabTest.setText(request.getMessage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLabTest = new javax.swing.JTextField();
        txtPatientMRN = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDateTaken = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Result");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Lab Test:");

        jLabel3.setText("Patient MRN:");

        jLabel4.setText("Patient Name:");

        txtLabTest.setEnabled(false);

        txtPatientMRN.setEnabled(false);
        txtPatientMRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientMRNActionPerformed(evt);
            }
        });

        txtPatientName.setEnabled(false);

        jLabel5.setText("Date Taken:");

        jLabel6.setText("(MM/DD/YYYY format)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(85, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLabTest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatientMRN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatientName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDateTaken, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resultJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLabTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientMRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDateTaken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(submitJButton))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        Date date;
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        if (resultJTextField.getText().isEmpty() || txtDateTaken.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all the required fields.");
            return;
        }

        try {
            if (Float.parseFloat(resultJTextField.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Please enter result greater than 0");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter result in decimal number format");
            return;
        }

        try {
            sdf.setLenient(false);
            date = sdf.parse(txtDateTaken.getText());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter date in MM/dd/yyyy");
            return;
        }

        if (date.after(new Date()) && !(sdf.format(date).compareTo(sdf.format(new Date())) == 0)) {
            JOptionPane.showMessageDialog(null, "Date taken cannot be in future");
            return;
        }

        LabOrder labOrder = request.getPatient().getLabOrderList().searchLabOrderTests(request.getLabID());

        if (date.before(labOrder.getDateOrdered()) && !(sdf.format(date).compareTo(sdf.format(new Date())) == 0)) {
            JOptionPane.showMessageDialog(null, "Date taken cannot be before date ordered");
            return;
        }

        labOrder.setDateTaken(date);
        labOrder.setResult(Float.parseFloat(resultJTextField.getText()));
        request.setTestResult(resultJTextField.getText());
        request.setStatus("Completed");
        
        JOptionPane.showMessageDialog(null, "Result saved successfully");
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void txtPatientMRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientMRNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientMRNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField txtDateTaken;
    private javax.swing.JTextField txtLabTest;
    private javax.swing.JTextField txtPatientMRN;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}