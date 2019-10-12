/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Order.Patient;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Arrays;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshay
 */
public class InteractionsShowPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private String finalInteractions;
    private Boolean flg;
    private Patient patient;
    /**
     * Creates new form InteractionsShowPanel
     */
    public InteractionsShowPanel(JPanel userProcessContainer, String finalInteractions, Patient patient) {
        this.userProcessContainer = userProcessContainer;
        this.finalInteractions = finalInteractions;
        this.patient = patient;
        initComponents();
        populateInteractions(finalInteractions);
        flg = true;
    }

    public void populateInteractions(String finalInteractions){
        String[] strArray = finalInteractions.split("~");
        DefaultTableModel dtm = (DefaultTableModel) interactionjTable.getModel();
        
        //finalInteractions = Arrays.stream(finalInteractions.split("~").distinct().collect(Collectors.joining("~")));
        //System.out.println(finalInteractions);
        int temp = 0;
        for(int i =1; i<=strArray.length -1; i++){
            
            if(i%2==0)
                continue;
            else{
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = strArray[i];
                row[1] = strArray[i+1];                           
                dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        backBtnjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        interactionjTable = new javax.swing.JTable();
        btnOverride = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Interactions");

        backBtnjButton.setText("<< Back");
        backBtnjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnjButtonActionPerformed(evt);
            }
        });

        interactionjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Comments", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(interactionjTable);

        btnOverride.setText("Override Interactions");
        btnOverride.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOverrideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtnjButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(532, 532, 532)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(btnOverride)))
                .addContainerGap(516, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backBtnjButton)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnOverride, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 396, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnjButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PlaceOrderPanel pdjp = (PlaceOrderPanel) component;
        pdjp.setFlag(flg);
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnjButtonActionPerformed

    private void btnOverrideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOverrideActionPerformed
        // TODO add your handling code here:
        flg = false;
        patient.setOverrideCount(patient.getOverrideCount() + 1);
        JOptionPane.showMessageDialog(null, "Interactions has been ignored for the prescribe medication.");
    }//GEN-LAST:event_btnOverrideActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtnjButton;
    private javax.swing.JButton btnOverride;
    private javax.swing.JTable interactionjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
