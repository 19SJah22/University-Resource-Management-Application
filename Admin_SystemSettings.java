package com.mycompany.urma_project_sa;

import javax.swing.JOptionPane;

public class Admin_SystemSettings extends javax.swing.JFrame {
private Administrator systemsettings; 
private boolean isAppEnabled; // Variable to track if the app is enabled
private LogIn LogIn; // Instance of the LogIn class
   
    // Constructor
    public Admin_SystemSettings() {
        initComponents();
        LogIn = new LogIn();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SystemSettings_Label = new javax.swing.JLabel();
        Back_Button = new javax.swing.JButton();
        Enable_Button = new javax.swing.JButton();
        Disable_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        SystemSettings_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        SystemSettings_Label.setForeground(new java.awt.Color(255, 255, 255));
        SystemSettings_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SystemSettings_Label.setText("System Settings");

        Back_Button.setBackground(new java.awt.Color(255, 0, 153));
        Back_Button.setForeground(new java.awt.Color(255, 255, 255));
        Back_Button.setText("Back");
        Back_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        Enable_Button.setBackground(new java.awt.Color(255, 255, 255));
        Enable_Button.setForeground(new java.awt.Color(0, 0, 0));
        Enable_Button.setText("Enable App");
        Enable_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Enable_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enable_ButtonActionPerformed(evt);
            }
        });

        Disable_Button.setBackground(new java.awt.Color(255, 255, 255));
        Disable_Button.setForeground(new java.awt.Color(0, 0, 0));
        Disable_Button.setText("Disable App");
        Disable_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Disable_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Disable_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(SystemSettings_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Enable_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Disable_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(SystemSettings_Label)
                .addGap(41, 41, 41)
                .addComponent(Enable_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Disable_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        systemsettings = new Administrator();
        dispose();
        systemsettings.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Enable_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enable_ButtonActionPerformed
         isAppEnabled = true; //Set app enabled
         LogIn.setAppEnabled(true);  // Update app status in the LogIn instance
    
         JOptionPane.showMessageDialog(this, "App is now Enabled");
         dispose(); // Close the current frame
         LogIn.setVisible(true);
    }//GEN-LAST:event_Enable_ButtonActionPerformed

    private void Disable_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Disable_ButtonActionPerformed
       isAppEnabled = false; // Set app disabled
       LogIn.setAppEnabled(false);  // Update app status in the LogIn instance
    
       JOptionPane.showMessageDialog(this, "App is now Disabled");
    
       // Redirect to the login page
       dispose(); // Close the current frame
       LogIn.setVisible(true);
    }//GEN-LAST:event_Disable_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_SystemSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_SystemSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_SystemSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_SystemSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_SystemSettings().setVisible(true);
            }
        });
    }
    
    public class YourApplicationSettings {
        // Initialize as disabled by default
        private static boolean featureEnabled = false; 

    public static boolean isFeatureEnabled() {
        return featureEnabled;
    }

    public static void setFeatureEnabled(boolean enabled) {
        featureEnabled = enabled;
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Disable_Button;
    private javax.swing.JButton Enable_Button;
    private javax.swing.JLabel SystemSettings_Label;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
