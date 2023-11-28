package com.mycompany.urma_project_sa;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Add_Faculty_Assignments extends javax.swing.JFrame {
    private FacultyAssignments facHeads;

    public Add_Faculty_Assignments() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FacultyAssignments_Label = new javax.swing.JLabel();
        Back_Button = new javax.swing.JButton();
        ResourceName_Label = new javax.swing.JLabel();
        AssignmentName_TextField = new javax.swing.JTextField();
        AssignmentID_Label = new javax.swing.JLabel();
        AssignmentID_TextField = new javax.swing.JTextField();
        Department_Label = new javax.swing.JLabel();
        Department_TextField = new javax.swing.JTextField();
        Add_Button = new javax.swing.JButton();
        Clear_Button = new javax.swing.JButton();
        Export_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        FacultyAssignments_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        FacultyAssignments_Label.setForeground(new java.awt.Color(255, 255, 255));
        FacultyAssignments_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FacultyAssignments_Label.setText("Faculty Assignments");

        Back_Button.setBackground(new java.awt.Color(255, 0, 153));
        Back_Button.setForeground(new java.awt.Color(255, 255, 255));
        Back_Button.setText("Back");
        Back_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        ResourceName_Label.setBackground(new java.awt.Color(255, 255, 255));
        ResourceName_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ResourceName_Label.setForeground(new java.awt.Color(255, 255, 255));
        ResourceName_Label.setText("Assignment Name: ");

        AssignmentName_TextField.setBackground(new java.awt.Color(255, 255, 255));
        AssignmentName_TextField.setForeground(new java.awt.Color(0, 0, 0));
        AssignmentName_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AssignmentName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignmentName_TextFieldActionPerformed(evt);
            }
        });

        AssignmentID_Label.setBackground(new java.awt.Color(255, 255, 255));
        AssignmentID_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        AssignmentID_Label.setForeground(new java.awt.Color(255, 255, 255));
        AssignmentID_Label.setText("Assignment ID: ");

        AssignmentID_TextField.setBackground(new java.awt.Color(255, 255, 255));
        AssignmentID_TextField.setForeground(new java.awt.Color(0, 0, 0));
        AssignmentID_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AssignmentID_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignmentID_TextFieldActionPerformed(evt);
            }
        });

        Department_Label.setBackground(new java.awt.Color(255, 255, 255));
        Department_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Department_Label.setForeground(new java.awt.Color(255, 255, 255));
        Department_Label.setText("Department: ");

        Department_TextField.setBackground(new java.awt.Color(255, 255, 255));
        Department_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Department_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Department_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Department_TextFieldActionPerformed(evt);
            }
        });

        Add_Button.setBackground(new java.awt.Color(255, 0, 153));
        Add_Button.setForeground(new java.awt.Color(255, 255, 255));
        Add_Button.setText("ADD");
        Add_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });

        Clear_Button.setBackground(new java.awt.Color(255, 0, 153));
        Clear_Button.setForeground(new java.awt.Color(255, 255, 255));
        Clear_Button.setText("CLEAR");
        Clear_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Clear_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_ButtonActionPerformed(evt);
            }
        });

        Export_Button.setBackground(new java.awt.Color(255, 0, 153));
        Export_Button.setForeground(new java.awt.Color(255, 255, 255));
        Export_Button.setText("EXPORT");
        Export_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Export_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Export_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(FacultyAssignments_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResourceName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AssignmentID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Department_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AssignmentName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AssignmentID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Department_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(Export_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(FacultyAssignments_Label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResourceName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AssignmentName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AssignmentID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AssignmentID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Department_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Department_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Export_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
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
        facHeads = new FacultyAssignments();
        dispose();
        facHeads.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void AssignmentName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignmentName_TextFieldActionPerformed

    }//GEN-LAST:event_AssignmentName_TextFieldActionPerformed

    private void AssignmentID_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignmentID_TextFieldActionPerformed

    }//GEN-LAST:event_AssignmentID_TextFieldActionPerformed

    private void Department_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Department_TextFieldActionPerformed

    }//GEN-LAST:event_Department_TextFieldActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
// Retrieve values from text fields
        String assignmentName = AssignmentName_TextField.getText();
        String assignmentID = AssignmentID_TextField.getText();
        String department = Department_TextField.getText();


        // Create a connection to the database
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
            // Prepare the SQL INSERT statement
            String sql = "INSERT INTO faculty_assignments (assignment_name, assignment_id, department) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                // Set values for the parameters in the statement
                preparedStatement.setString(1, assignmentName);
                preparedStatement.setString(2, assignmentID);
                preparedStatement.setString(3, department);

                // Execute the statement to insert the data into the database
                preparedStatement.executeUpdate();

                // Display a success message or perform any other actions upon successful insertion
                System.out.println("Data inserted successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle the exception according to your needs
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception according to your needs
        }
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_ButtonActionPerformed
        AssignmentName_TextField.setText("");
        AssignmentID_TextField.setText("");
        Department_TextField.setText("");
    }//GEN-LAST:event_Clear_ButtonActionPerformed

    private void Export_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_ButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
    fileChooser.setFileFilter(filter);

    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();

        // Set the export directory
        String exportDirectoryPath = "C:\\Users\\sjanr\\Documents\\CTU\\2023\\Semester 2\\SAs Semester 2\\JD522\\URMA_project_SA\\src\\main\\java\\Faculty\\Assignments";

        // Create the destination file using the export directory and the selected file name
        File destinationFile = new File(exportDirectoryPath, selectedFile.getName());

        try {
            // Copy the file to the destination using Java NIO
            Path sourcePath = selectedFile.toPath();
            Path destinationPath = destinationFile.toPath();
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception
        }
      }
    }//GEN-LAST:event_Export_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Faculty_Assignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Faculty_Assignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Faculty_Assignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Faculty_Assignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Faculty_Assignments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JLabel AssignmentID_Label;
    private javax.swing.JTextField AssignmentID_TextField;
    private javax.swing.JTextField AssignmentName_TextField;
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Clear_Button;
    private javax.swing.JLabel Department_Label;
    private javax.swing.JTextField Department_TextField;
    private javax.swing.JButton Export_Button;
    private javax.swing.JLabel FacultyAssignments_Label;
    private javax.swing.JLabel ResourceName_Label;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
