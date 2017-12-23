/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import ADT.LDeliveryman;
import Entity.Deliveryman;
import Interface.DeliverymanInterface;

/**
 *
 * @author ADmin
 */
public class HomePage extends javax.swing.JFrame {
    
    public static DeliverymanInterface<Deliveryman> deliverymanList = new LDeliveryman<>();
    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        Deliveryman newDeliveryMan1 = new Deliveryman("D1001","QY","971008-56-5092","012-2222222","qy@gmail.com","test","23/12/2017",null,"Part-Time");
        Deliveryman newDeliveryMan2 = new Deliveryman("D1002","WZ","950518-56-5092","012-3333333","wz@gmail.com","test","23/12/2017",null,"Full-Time");
        Deliveryman newDeliveryMan3 = new Deliveryman("D1003","WS","952133-56-5092","012-2222222","ws@gmail.com","test","23/12/2017",null,"Retired");
        deliverymanList.addRecord(newDeliveryMan1);
        deliverymanList.addRecord(newDeliveryMan2);
        deliverymanList.addRecord(newDeliveryMan3);
        System.out.println(deliverymanList);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtRegistration = new javax.swing.JButton();
        jbtSelectToUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtRegistration.setText("Register Deliveryman");
        jbtRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRegistrationActionPerformed(evt);
            }
        });

        jbtSelectToUpdate.setText("Select To Update");
        jbtSelectToUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSelectToUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtSelectToUpdate)
                    .addComponent(jbtRegistration))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jbtRegistration)
                .addGap(26, 26, 26)
                .addComponent(jbtSelectToUpdate)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRegistrationActionPerformed
        new DeliveryManRegistration().setVisible(true);
    }//GEN-LAST:event_jbtRegistrationActionPerformed

    private void jbtSelectToUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSelectToUpdateActionPerformed
        new ManageDeliveryman().setVisible(true);
    }//GEN-LAST:event_jbtSelectToUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtRegistration;
    private javax.swing.JButton jbtSelectToUpdate;
    // End of variables declaration//GEN-END:variables
}
