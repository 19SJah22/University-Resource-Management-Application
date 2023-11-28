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

public class Add_A_Resource extends javax.swing.JFrame {
    private Resources resource;

    public Add_A_Resource() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AddResource_Label = new javax.swing.JLabel();
        ResourceID_Label = new javax.swing.JLabel();
        ResourceName_Label = new javax.swing.JLabel();
        Department_Label = new javax.swing.JLabel();
        ResourceName_TextField = new javax.swing.JTextField();
        ResourceID_TextField = new javax.swing.JTextField();
        Department_TextField = new javax.swing.JTextField();
        Add_Button = new javax.swing.JButton();
        Clear_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Export_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        AddResource_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        AddResource_Label.setForeground(new java.awt.Color(255, 255, 255));
        AddResource_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddResource_Label.setText("Add Resource");

        ResourceID_Label.setBackground(new java.awt.Color(255, 255, 255));
        ResourceID_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ResourceID_Label.setForeground(new java.awt.Color(255, 255, 255));
        ResourceID_Label.setText("Resource ID: ");

        ResourceName_Label.setBackground(new java.awt.Color(255, 255, 255));
        ResourceName_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ResourceName_Label.setForeground(new java.awt.Color(255, 255, 255));
        ResourceName_Label.setText("Resource Name: ");

        Department_Label.setBackground(new java.awt.Color(255, 255, 255));
        Department_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Department_Label.setForeground(new java.awt.Color(255, 255, 255));
        Department_Label.setText("Department: ");

        ResourceName_TextField.setBackground(new java.awt.Color(255, 255, 255));
        ResourceName_TextField.setForeground(new java.awt.Color(0, 0, 0));
        ResourceName_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ResourceName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResourceName_TextFieldActionPerformed(evt);
            }
        });

        ResourceID_TextField.setBackground(new java.awt.Color(255, 255, 255));
        ResourceID_TextField.setForeground(new java.awt.Color(0, 0, 0));
        ResourceID_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ResourceID_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResourceID_TextFieldActionPerformed(evt);
            }
        });

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

        Back_Button.setBackground(new java.awt.Color(255, 0, 153));
        Back_Button.setForeground(new java.awt.Color(255, 255, 255));
        Back_Button.setText("BACK");
        Back_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ResourceName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Department_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResourceID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResourceName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResourceID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Department_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(Export_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AddResource_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(AddResource_Label)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResourceName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResourceName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResourceID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResourceID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Department_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Department_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Export_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

    private void ResourceName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResourceName_TextFieldActionPerformed

    }//GEN-LAST:event_ResourceName_TextFieldActionPerformed

    private void ResourceID_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResourceID_TextFieldActionPerformed
    
    }//GEN-LAST:event_ResourceID_TextFieldActionPerformed

    private void Department_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Department_TextFieldActionPerformed
  
    }//GEN-LAST:event_Department_TextFieldActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
// TODO add your handling code here:
    String resourceID = ResourceID_TextField.getText();
    String resourceName = ResourceName_TextField.getText();
    String department = Department_TextField.getText();


    // Create a connection to the database
    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
        // Prepare the SQL INSERT statement
        String sql = "INSERT INTO dep_resources (resource_name, resource_id, department) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            // Set values for the parameters in the statement
            preparedStatement.setString(1, resourceID);
            preparedStatement.setString(2, resourceName);
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
    }


        
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_ButtonActionPerformed
    ResourceName_TextField.setText("");
    ResourceID_TextField.setText("");
    Department_TextField.setText("");         
    }//GEN-LAST:event_Clear_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
       resource = new Resources();
        dispose();
        resource.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Export_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_ButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
    fileChooser.setFileFilter(filter);

    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();

        // Set the export directory for Resources
        String exportDirectoryPath = "C:\\Users\\sjanr\\Documents\\CTU\\2023\\Semester 2\\SAs Semester 2\\JD522\\URMA_project_SA\\src\\main\\java\\Department\\Resources";

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
            java.util.logging.Logger.getLogger(Add_A_Resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_A_Resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_A_Resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_A_Resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_A_Resource().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddResource_Label;
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Clear_Button;
    private javax.swing.JLabel Department_Label;
    private javax.swing.JTextField Department_TextField;
    private javax.swing.JButton Export_Button;
    private javax.swing.JLabel ResourceID_Label;
    private javax.swing.JTextField ResourceID_TextField;
    private javax.swing.JLabel ResourceName_Label;
    private javax.swing.JTextField ResourceName_TextField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
