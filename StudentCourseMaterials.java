package com.mycompany.urma_project_sa;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import javax.swing.JFileChooser;

public class StudentCourseMaterials extends javax.swing.JFrame {
    private Student student;

    public StudentCourseMaterials() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CourseMaterial_Button = new javax.swing.JButton();
        Assignment_Label = new javax.swing.JLabel();
        Back_Button = new javax.swing.JButton();
        CourseMaterial_Label = new javax.swing.JLabel();
        Assignments_Button1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        CourseMaterial_Button.setBackground(new java.awt.Color(255, 255, 255));
        CourseMaterial_Button.setForeground(new java.awt.Color(0, 0, 0));
        CourseMaterial_Button.setText("Course Material");
        CourseMaterial_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        CourseMaterial_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseMaterial_ButtonActionPerformed(evt);
            }
        });

        Assignment_Label.setBackground(new java.awt.Color(255, 255, 255));
        Assignment_Label.setForeground(new java.awt.Color(255, 255, 255));
        Assignment_Label.setText("-Download your Assignments here");

        Back_Button.setBackground(new java.awt.Color(255, 0, 153));
        Back_Button.setForeground(new java.awt.Color(255, 255, 255));
        Back_Button.setText("Back");
        Back_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        CourseMaterial_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        CourseMaterial_Label.setForeground(new java.awt.Color(255, 255, 255));
        CourseMaterial_Label.setText("Course Material");

        Assignments_Button1.setBackground(new java.awt.Color(255, 255, 255));
        Assignments_Button1.setForeground(new java.awt.Color(0, 0, 0));
        Assignments_Button1.setText("Assignments");
        Assignments_Button1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Assignments_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Assignments_Button1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("-Download your Course Material here");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Assignments_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Assignment_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CourseMaterial_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(CourseMaterial_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(CourseMaterial_Label)
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseMaterial_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Assignments_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Assignment_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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
        student = new Student();
        dispose();
        student.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void CourseMaterial_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseMaterial_ButtonActionPerformed
         // Create a file chooser dialog and set it to select directories only
         JFileChooser fileChooser = new JFileChooser();
         fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

         // Open the file chooser dialog and await user selection
        int returnValue = fileChooser.showOpenDialog(this);
        
        // If the user selects a directory and approves
        if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedDirectory = fileChooser.getSelectedFile();

        // Set the source directory where the Faculty added Recources
        String sourceDirectoryPath = "C:\\Users\\sjanr\\Documents\\CTU\\2023\\Semester 2\\SAs Semester 2\\JD522\\URMA_project_SA\\src\\main\\java\\Faculty\\Courses";

        // Iterate through files in the source directory and copy them to the selected directory
        File sourceDirectory = new File(sourceDirectoryPath);
        File[] files = sourceDirectory.listFiles();
        for (File file : files) {
            try {
                // Create the destination file using the selected directory and the file name
                File destinationFile = new File(selectedDirectory, file.getName());

                // Copy the file to the destination using Java NIO
                Path sourcePath = file.toPath();
                Path destinationPath = destinationFile.toPath();
                Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
                // Handle the exception
            }
        }
    }
    }//GEN-LAST:event_CourseMaterial_ButtonActionPerformed

    private void Assignments_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Assignments_Button1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedDirectory = fileChooser.getSelectedFile();

        // Set the source directory where the Faculty added Assignments
        String sourceDirectoryPath = "C:\\Users\\sjanr\\Documents\\CTU\\2023\\Semester 2\\SAs Semester 2\\JD522\\URMA_project_SA\\src\\main\\java\\Faculty\\Assignments";

        // Iterate through files in the source directory and copy them to the selected directory
        File sourceDirectory = new File(sourceDirectoryPath);
        File[] files = sourceDirectory.listFiles();
        for (File file : files) {
            try {
                // Create the destination file using the selected directory and the file name
                File destinationFile = new File(selectedDirectory, file.getName());

                // Copy the file to the destination using Java NIO
                Path sourcePath = file.toPath();
                Path destinationPath = destinationFile.toPath();
                Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
                // Handle the exception
            }
        }
      }
    }//GEN-LAST:event_Assignments_Button1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentCourseMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentCourseMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentCourseMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentCourseMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentCourseMaterials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Assignment_Label;
    private javax.swing.JButton Assignments_Button1;
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton CourseMaterial_Button;
    private javax.swing.JLabel CourseMaterial_Label;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
