package com.mycompany.urma_project_sa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {
   private Student student;
   private DepartmentHeads department;
   private Faculty faculty;
   private Administrator admin;
   private boolean isAppEnabled = true;
  
    public LogIn() {
        initComponents();
    }

    public void setAppEnabled(boolean enabled) {
        isAppEnabled = enabled;
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UserName_TextField = new javax.swing.JTextField();
        LogIn_Label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        URMA_Label = new javax.swing.JLabel();
        First_Name_Label1 = new javax.swing.JLabel();
        Roll_Label = new javax.swing.JLabel();
        URMAid_Label = new javax.swing.JLabel();
        Password_TextField = new javax.swing.JTextField();
        Roll_ComboBox = new javax.swing.JComboBox<>();
        LogIn_Button = new javax.swing.JButton();
        Password_Label1 = new javax.swing.JLabel();
        URMAid_TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        UserName_TextField.setBackground(new java.awt.Color(255, 255, 255));
        UserName_TextField.setForeground(new java.awt.Color(0, 0, 0));
        UserName_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        UserName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserName_TextFieldActionPerformed(evt);
            }
        });

        LogIn_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        LogIn_Label.setForeground(new java.awt.Color(255, 255, 255));
        LogIn_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogIn_Label.setText("Login");

        jPanel2.setBackground(new java.awt.Color(255, 0, 153));
        jPanel2.setBorder(null);

        URMA_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        URMA_Label.setForeground(new java.awt.Color(0, 0, 0));
        URMA_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        URMA_Label.setText("URMA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(URMA_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(URMA_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        First_Name_Label1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        First_Name_Label1.setForeground(new java.awt.Color(255, 255, 255));
        First_Name_Label1.setText("Username:");

        Roll_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Roll_Label.setForeground(new java.awt.Color(255, 255, 255));
        Roll_Label.setText("Roll:");

        URMAid_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        URMAid_Label.setForeground(new java.awt.Color(255, 255, 255));
        URMAid_Label.setText("URMA ID:");

        Password_TextField.setBackground(new java.awt.Color(255, 255, 255));
        Password_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Password_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Password_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_TextFieldActionPerformed(evt);
            }
        });

        Roll_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rolls", "Department Head", "Faculty", "Student" }));
        Roll_ComboBox.setMinimumSize(new java.awt.Dimension(5, 20));
        Roll_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Roll_ComboBoxActionPerformed(evt);
            }
        });

        LogIn_Button.setBackground(new java.awt.Color(255, 0, 153));
        LogIn_Button.setForeground(new java.awt.Color(255, 255, 255));
        LogIn_Button.setText("Login");
        LogIn_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        LogIn_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn_ButtonActionPerformed(evt);
            }
        });

        Password_Label1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Password_Label1.setForeground(new java.awt.Color(255, 255, 255));
        Password_Label1.setText("Password:");

        URMAid_TextField.setBackground(new java.awt.Color(255, 255, 255));
        URMAid_TextField.setForeground(new java.awt.Color(0, 0, 0));
        URMAid_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        URMAid_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URMAid_TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(LogIn_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(LogIn_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(First_Name_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(UserName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Password_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(URMAid_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Roll_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Roll_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(URMAid_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LogIn_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(First_Name_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(URMAid_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(URMAid_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Roll_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Roll_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(LogIn_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    
    //This is the connection to my database
    private Connection connectToDatabase() throws SQLException {
        try {
            // Load the SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");
            // Establish a connection to the SQLite database using the provided path
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db");
             // Return the established database connection
            return conn;
        } catch (ClassNotFoundException ex) {
             // Handle ClassNotFoundException (missing JDBC driver)
            ex.printStackTrace();
            throw new SQLException("SQLite JDBC Driver not found.", ex);
        }
    }
    
    private void UserName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserName_TextFieldActionPerformed
        
    }//GEN-LAST:event_UserName_TextFieldActionPerformed

    private void Password_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_TextFieldActionPerformed
        
    }//GEN-LAST:event_Password_TextFieldActionPerformed

    private void Roll_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Roll_ComboBoxActionPerformed
        
    }//GEN-LAST:event_Roll_ComboBoxActionPerformed

    private void LogIn_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn_ButtonActionPerformed
        // Retrieve the selected role from the Roll_ComboBox
        String selectedRole = (String) Roll_ComboBox.getSelectedItem();
        // Retrieve the username from the UserName_TextField
        String username = UserName_TextField.getText();
        
        // Retrieve and store the entered username, password, and URMA ID from their respective text fields
        String enteredUsername = UserName_TextField.getText();
        String enteredPassword = Password_TextField.getText();
        String enteredUrmaId = URMAid_TextField.getText();
        
    
    if (selectedRole.equals("Rolls")) {
         // Check if the entered credentials match admin credentials
        if (UserName_TextField.getText().equals("Sjanrie") && Password_TextField.getText().equals("admin123")  && URMAid_TextField.getText().equals("0")  ) {
            // Admin credentials are correct, now check if the app is enabled
            isAppEnabled = true;
            
            if (isAppEnabled) {
                 // If the app is enabled, open the Administrator interface
                admin = new Administrator();
                dispose();
                admin.setVisible(true);
                JOptionPane.showMessageDialog(null, "Welcome Admin");
            } else {
                // Display a message if the app is disabled
                JOptionPane.showMessageDialog(null, "The app is disabled. Contact the administrator for access.");
            }
        } else {
            // Display an error message for incorrect admin credentials
            JOptionPane.showMessageDialog(null, "Incorrect admin credentials.");
        }
    } else {
        // For student, department head, and faculty roles, check app status
        if (isAppEnabled) {
            
          // SQL query to retrieve user information based on role and username  
         String query = "SELECT urma_id, password, first_name FROM register WHERE roll = ? AND first_name = ?";

            try (Connection conn = connectToDatabase();
                 PreparedStatement pstmt = conn.prepareStatement(query)) {

                // Set parameters for the prepared statement
                pstmt.setString(1, selectedRole);
                pstmt.setString(2, enteredUsername);

                ResultSet rs = pstmt.executeQuery();

                // Check if the user with the entered username and role exists
                if (rs.next()) {
                    String storedUrmaId = rs.getString("urma_id");
                    String storedPassword = rs.getString("password");

                    // Check if the entered credentials match the stored credentials
                    if (enteredUrmaId.equals(storedUrmaId) && enteredPassword.equals(storedPassword)) {
                        
                        // Open the corresponding frame based on the selected role
                        switch (selectedRole) {
                            case "Student":
                                Information.startInformation(selectedRole,enteredUsername,storedUrmaId);
                                student = new Student();
                                dispose();
                                student.setVisible(true);
                                JOptionPane.showMessageDialog(null, "Welcome " + enteredUsername);
                                break;
                                
                            case "Department Head":
                                department = new DepartmentHeads();
                                dispose();
                                department.setVisible(true);
                                JOptionPane.showMessageDialog(null, "Welcome " + enteredUsername);
                                break;
                                
                            case "Faculty":
                                faculty = new Faculty();
                                dispose();
                                faculty.setVisible(true);
                                JOptionPane.showMessageDialog(null, "Welcome " + enteredUsername);
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid credentials.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "User with the entered username and role not found.");
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error while attempting to log in.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "The app is disabled. Contact the administrator for access.");
        }
    }
    
    }//GEN-LAST:event_LogIn_ButtonActionPerformed

    private void URMAid_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URMAid_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_URMAid_TextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel First_Name_Label1;
    private javax.swing.JButton LogIn_Button;
    private javax.swing.JLabel LogIn_Label;
    private javax.swing.JLabel Password_Label1;
    private javax.swing.JTextField Password_TextField;
    private javax.swing.JComboBox<String> Roll_ComboBox;
    private javax.swing.JLabel Roll_Label;
    private javax.swing.JLabel URMA_Label;
    private javax.swing.JLabel URMAid_Label;
    private javax.swing.JTextField URMAid_TextField;
    private javax.swing.JTextField UserName_TextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
