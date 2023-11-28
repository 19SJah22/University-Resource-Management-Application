package com.mycompany.urma_project_sa;

import javax.swing.JOptionPane;

public class Administrator extends javax.swing.JFrame {
    private LogIn login;
    private Manage_Profile manage;
    private Admin_SystemSettings systemsettings;

    public Administrator() {
        initComponents();
    }

    public void setAppEnabled(boolean isAppEnabled) {
        this.isAppEnabled = isAppEnabled;
    }

    private boolean isAppEnabled = true;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogOut_Button = new javax.swing.JButton();
        ManageProfile_Button = new javax.swing.JButton();
        Administrator_Label = new javax.swing.JLabel();
        SystemSettings_Button = new javax.swing.JButton();
        SystemWideReports_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        LogOut_Button.setBackground(new java.awt.Color(255, 0, 153));
        LogOut_Button.setForeground(new java.awt.Color(255, 255, 255));
        LogOut_Button.setText("Log out");
        LogOut_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        LogOut_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut_ButtonActionPerformed(evt);
            }
        });

        ManageProfile_Button.setBackground(new java.awt.Color(255, 255, 255));
        ManageProfile_Button.setForeground(new java.awt.Color(0, 0, 0));
        ManageProfile_Button.setText("Manage Profile");
        ManageProfile_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        ManageProfile_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageProfile_ButtonActionPerformed(evt);
            }
        });

        Administrator_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        Administrator_Label.setForeground(new java.awt.Color(255, 255, 255));
        Administrator_Label.setText("Administrator");

        SystemSettings_Button.setBackground(new java.awt.Color(255, 255, 255));
        SystemSettings_Button.setForeground(new java.awt.Color(0, 0, 0));
        SystemSettings_Button.setText("System Settings");
        SystemSettings_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        SystemSettings_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemSettings_ButtonActionPerformed(evt);
            }
        });

        SystemWideReports_Button.setBackground(new java.awt.Color(255, 255, 255));
        SystemWideReports_Button.setForeground(new java.awt.Color(0, 0, 0));
        SystemWideReports_Button.setText("System-Wide Reports");
        SystemWideReports_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        SystemWideReports_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemWideReports_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(ManageProfile_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(SystemSettings_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(SystemWideReports_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Administrator_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LogOut_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Administrator_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SystemSettings_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SystemWideReports_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageProfile_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(LogOut_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOut_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut_ButtonActionPerformed
        login = new LogIn();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_LogOut_ButtonActionPerformed

    private void ManageProfile_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageProfile_ButtonActionPerformed
       manage = new Manage_Profile();
        dispose();
        manage.setVisible(true);
    }//GEN-LAST:event_ManageProfile_ButtonActionPerformed

    private void SystemSettings_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemSettings_ButtonActionPerformed
        systemsettings = new Admin_SystemSettings();
        dispose();
        systemsettings.setVisible(true);
    }//GEN-LAST:event_SystemSettings_ButtonActionPerformed

    private void SystemWideReports_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemWideReports_ButtonActionPerformed
          if (isAppEnabled) {
        JOptionPane.showMessageDialog(this, "The application is currently running!");
            } else {
                 JOptionPane.showMessageDialog(this, "The application is currently disabled. Please enable it in System Settings.");
         }  
    }//GEN-LAST:event_SystemWideReports_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Administrator_Label;
    private javax.swing.JButton LogOut_Button;
    private javax.swing.JButton ManageProfile_Button;
    private javax.swing.JButton SystemSettings_Button;
    private javax.swing.JButton SystemWideReports_Button;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
