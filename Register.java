package com.mycompany.urma_project_sa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Register extends javax.swing.JFrame {
    private Administrator admin;
   
    //This is the connection to my database
    private Connection connection;
    private static final String db_connection = "jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db ";

    public Register() {
        initComponents();
        initListeners();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Last_Name_Label = new javax.swing.JLabel();
        FirstName_TextField = new javax.swing.JTextField();
        Register_Label = new javax.swing.JLabel();
        First_Name_Label1 = new javax.swing.JLabel();
        Roll_Label = new javax.swing.JLabel();
        Password_Label = new javax.swing.JLabel();
        LastName_TextField = new javax.swing.JTextField();
        Password_TextField = new javax.swing.JTextField();
        Roll_ComboBox = new javax.swing.JComboBox<>();
        Register_Button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        URMA_Label = new javax.swing.JLabel();
        Password_Label1 = new javax.swing.JLabel();
        urmaID_TextField1 = new javax.swing.JTextField();
        Enrolled_Label = new javax.swing.JLabel();
        EnrolledIn_TextField = new javax.swing.JTextField();
        Back_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 100));

        Last_Name_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Last_Name_Label.setForeground(new java.awt.Color(255, 255, 255));
        Last_Name_Label.setText("Last Name:");

        FirstName_TextField.setBackground(new java.awt.Color(255, 255, 255));
        FirstName_TextField.setForeground(new java.awt.Color(0, 0, 0));
        FirstName_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        FirstName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName_TextFieldActionPerformed(evt);
            }
        });

        Register_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        Register_Label.setForeground(new java.awt.Color(255, 255, 255));
        Register_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Register_Label.setText("Register");

        First_Name_Label1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        First_Name_Label1.setForeground(new java.awt.Color(255, 255, 255));
        First_Name_Label1.setText("First Name:");

        Roll_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Roll_Label.setForeground(new java.awt.Color(255, 255, 255));
        Roll_Label.setText("Roll:");

        Password_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Password_Label.setForeground(new java.awt.Color(255, 255, 255));
        Password_Label.setText("Password:");

        LastName_TextField.setBackground(new java.awt.Color(255, 255, 255));
        LastName_TextField.setForeground(new java.awt.Color(0, 0, 0));
        LastName_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        LastName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastName_TextFieldActionPerformed(evt);
            }
        });

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

        Register_Button.setBackground(new java.awt.Color(255, 0, 153));
        Register_Button.setForeground(new java.awt.Color(255, 255, 255));
        Register_Button.setText("Register");
        Register_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_ButtonActionPerformed(evt);
            }
        });

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
                .addGap(34, 34, 34)
                .addComponent(URMA_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(URMA_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Password_Label1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Password_Label1.setForeground(new java.awt.Color(255, 255, 255));
        Password_Label1.setText("URMA ID:");

        urmaID_TextField1.setBackground(new java.awt.Color(255, 255, 255));
        urmaID_TextField1.setForeground(new java.awt.Color(0, 0, 0));
        urmaID_TextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        urmaID_TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urmaID_TextField1ActionPerformed(evt);
            }
        });

        Enrolled_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Enrolled_Label.setForeground(new java.awt.Color(255, 255, 255));
        Enrolled_Label.setText("Enrolled in:");

        EnrolledIn_TextField.setBackground(new java.awt.Color(255, 255, 255));
        EnrolledIn_TextField.setForeground(new java.awt.Color(0, 0, 0));
        EnrolledIn_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        EnrolledIn_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnrolledIn_TextFieldActionPerformed(evt);
            }
        });

        Back_Button.setBackground(new java.awt.Color(255, 0, 153));
        Back_Button.setForeground(new java.awt.Color(255, 255, 255));
        Back_Button.setText("Back");
        Back_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Password_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(urmaID_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(First_Name_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FirstName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Last_Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LastName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Password_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Enrolled_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EnrolledIn_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Roll_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Roll_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(Register_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(Register_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Register_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(First_Name_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Last_Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urmaID_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enrolled_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnrolledIn_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Roll_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Roll_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Register_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initListeners() {
         // Adds a document listener to the URMA_ID text field
        urmaID_TextField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                 // Calls the method to validate URMA ID when text is inserted
                 validateURMA_ID();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                 // Calls the method to validate URMA_ID when text is removed
                 validateURMA_ID();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // This is not needed for plain text components
            }
        });
    }
    
   private void connectToDatabase(String connStr) {
       try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(connStr);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            
        }
    }
    
    private void validateURMA_ID() {
    String text = urmaID_TextField1.getText();
    // This will allow only an empty string or digits
    if (!text.matches("\\d*") && !text.isEmpty()) { 
        // Display an error message when the URMA ID is not a numeric value
        JOptionPane.showMessageDialog(this, "Please note: URMA ID must only contain numeric values.");
        urmaID_TextField1.setText("");
    }
}

private boolean isValidURMA_ID() {
    // Check if urmaID contains digits only
    return urmaID_TextField1.getText().matches("\\d*"); 
}
    
    private void Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_ButtonActionPerformed
        String firstName = FirstName_TextField.getText();
        String lastName = LastName_TextField.getText();
        String urmaID = urmaID_TextField1.getText();
        String password = Password_TextField.getText();
        String enrolledIn = EnrolledIn_TextField.getText();
        String selectedRole = (String) Roll_ComboBox.getSelectedItem();

    // Call the registerUser method to perform the registration
    boolean success = registerUser(firstName, lastName, urmaID, password, enrolledIn, selectedRole);
        
if (success) {
        // If registration is successful, navigate to the AdminFrame
        admin = new Administrator();
        dispose();
        admin.setVisible(true);
       }
    }//GEN-LAST:event_Register_ButtonActionPerformed

    // Registers a user with the provided details into the system.
    private boolean registerUser(String firstName, String lastName, String urmaID, String password, String enrolledIn, String roll) {
   
    try {
        // Establish a connection to the SQLite database
        connectToDatabase(db_connection);

        // Define the SQL INSERT statement to insert a new row of data into the table
        String sql = "INSERT INTO register (first_name, last_name, urma_id, password, enrolled_in, roll) VALUES (?, ?, ?, ?, ?, ?)";

        //Create a PreparedStatement to execute the SQL statement with parameterized values
        PreparedStatement statement = connection.prepareStatement(sql);

        // Set the values for the parameters in the prepared SQL statement
        statement.setString(1, firstName);
        statement.setString(2, lastName);

        // Check and set URMA_ID if it contains only numeric values before inserting into the database
        if (isValidURMA_ID()) {
            statement.setString(3, urmaID);
        } else {
            // Display an error message if URMA ID is invalid and return false
            JOptionPane.showMessageDialog(this, "URMA_ID must contain only numeric values.");
            return false;
        }

        statement.setString(4, password);
        statement.setString(5, enrolledIn);
        statement.setString(6, roll);

        // Execute the insert statement and retrieve the number of affected rows
        int rowsAffected = statement.executeUpdate();

        // Close the resources: prepared statement and the database connection
        statement.close();
        connection.close();

        // Check if the insert operation was successful (rowsAffected should be 1 for success)
        return rowsAffected == 1;
    } catch (SQLException e) {
        e.printStackTrace();
         // Handle the SQL exception (log it, display an error message, etc.)
        JOptionPane.showMessageDialog(this, "Error during registration: " + e.getMessage());
        return false;
    }
    }
  
    private void Roll_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Roll_ComboBoxActionPerformed

    }//GEN-LAST:event_Roll_ComboBoxActionPerformed

    private void Password_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_TextFieldActionPerformed

    }//GEN-LAST:event_Password_TextFieldActionPerformed

    private void LastName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastName_TextFieldActionPerformed

    }//GEN-LAST:event_LastName_TextFieldActionPerformed

    private void FirstName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName_TextFieldActionPerformed

    }//GEN-LAST:event_FirstName_TextFieldActionPerformed

    private void urmaID_TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urmaID_TextField1ActionPerformed
        
    }//GEN-LAST:event_urmaID_TextField1ActionPerformed

    private void EnrolledIn_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnrolledIn_TextFieldActionPerformed
        
    }//GEN-LAST:event_EnrolledIn_TextFieldActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        admin = new Administrator();
        dispose();
        admin.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JTextField EnrolledIn_TextField;
    private javax.swing.JLabel Enrolled_Label;
    private javax.swing.JTextField FirstName_TextField;
    private javax.swing.JLabel First_Name_Label1;
    private javax.swing.JTextField LastName_TextField;
    private javax.swing.JLabel Last_Name_Label;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JLabel Password_Label1;
    private javax.swing.JTextField Password_TextField;
    private javax.swing.JButton Register_Button;
    private javax.swing.JLabel Register_Label;
    private javax.swing.JComboBox<String> Roll_ComboBox;
    private javax.swing.JLabel Roll_Label;
    private javax.swing.JLabel URMA_Label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField urmaID_TextField1;
    // End of variables declaration//GEN-END:variables

}
