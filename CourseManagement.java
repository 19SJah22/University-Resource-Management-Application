package com.mycompany.urma_project_sa;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CourseManagement extends javax.swing.JFrame {
private Faculty faculty;

    public CourseManagement() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CourseManagement_Label = new javax.swing.JLabel();
        Cources_Label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DownloadResource_Button = new javax.swing.JButton();
        UploadCourseButton = new javax.swing.JButton();
        UploadSchedule_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Resources_Lable = new javax.swing.JLabel();
        DownloadCourse_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DownloadAssignment_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        CourseManagement_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        CourseManagement_Label.setForeground(new java.awt.Color(255, 255, 255));
        CourseManagement_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseManagement_Label.setText("Course Management");

        Cources_Label.setBackground(new java.awt.Color(255, 255, 255));
        Cources_Label.setForeground(new java.awt.Color(255, 255, 255));
        Cources_Label.setText("Download the Cources from Department file");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Upload Course Resource for Student");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Upload Student Schedules for them");

        DownloadResource_Button.setBackground(new java.awt.Color(255, 255, 255));
        DownloadResource_Button.setForeground(new java.awt.Color(0, 0, 0));
        DownloadResource_Button.setText("Download Resources");
        DownloadResource_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        DownloadResource_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadResource_ButtonActionPerformed(evt);
            }
        });

        UploadCourseButton.setBackground(new java.awt.Color(255, 255, 255));
        UploadCourseButton.setForeground(new java.awt.Color(0, 0, 0));
        UploadCourseButton.setText("Upload Course Resources");
        UploadCourseButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        UploadCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadCourseButtonActionPerformed(evt);
            }
        });

        UploadSchedule_Button.setBackground(new java.awt.Color(255, 255, 255));
        UploadSchedule_Button.setForeground(new java.awt.Color(0, 0, 0));
        UploadSchedule_Button.setText("Upload Schedule");
        UploadSchedule_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        UploadSchedule_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadSchedule_ButtonActionPerformed(evt);
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

        Resources_Lable.setBackground(new java.awt.Color(255, 255, 255));
        Resources_Lable.setForeground(new java.awt.Color(255, 255, 255));
        Resources_Lable.setText("Download the Resources from Departmment file");

        DownloadCourse_Button.setBackground(new java.awt.Color(255, 255, 255));
        DownloadCourse_Button.setForeground(new java.awt.Color(0, 0, 0));
        DownloadCourse_Button.setText("Download Courses");
        DownloadCourse_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        DownloadCourse_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadCourse_ButtonActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Download Assignments from Department file");

        DownloadAssignment_Button.setBackground(new java.awt.Color(255, 255, 255));
        DownloadAssignment_Button.setForeground(new java.awt.Color(0, 0, 0));
        DownloadAssignment_Button.setText("Download Assignment");
        DownloadAssignment_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        DownloadAssignment_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadAssignment_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(UploadCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(UploadSchedule_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(CourseManagement_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(169, 169, 169)
                            .addComponent(DownloadAssignment_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(Cources_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(DownloadCourse_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(DownloadResource_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(107, Short.MAX_VALUE)
                    .addComponent(Resources_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(79, 79, 79)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(CourseManagement_Label)
                .addGap(104, 104, 104)
                .addComponent(DownloadResource_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Cources_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DownloadCourse_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DownloadAssignment_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UploadCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UploadSchedule_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(Resources_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(457, Short.MAX_VALUE)))
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

    private void DownloadResource_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadResource_ButtonActionPerformed
        // Create a file chooser dialog and select a directory
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedDirectory = fileChooser.getSelectedFile();

        // Set the source directory where the department added resources
        String sourceDirectoryPath = "C:\\Users\\sjanr\\Documents\\CTU\\2023\\Semester 2\\SAs Semester 2\\JD522\\URMA_project_SA\\src\\main\\java\\Department\\Resources";

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
    }//GEN-LAST:event_DownloadResource_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        faculty = new Faculty();
        dispose();
        faculty.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void DownloadAssignment_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadAssignment_ButtonActionPerformed
         JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedDirectory = fileChooser.getSelectedFile();

        // Set the source directory where the department added resources
        String sourceDirectoryPath = "C:\\Users\\sjanr\\Documents\\CTU\\2023\\Semester 2\\SAs Semester 2\\JD522\\URMA_project_SA\\src\\main\\java\\Department\\Assignments";

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
    }//GEN-LAST:event_DownloadAssignment_ButtonActionPerformed

    private void DownloadCourse_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadCourse_ButtonActionPerformed
       JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedDirectory = fileChooser.getSelectedFile();

        // Set the source directory where the department added resources
        String sourceDirectoryPath = "C:\\Users\\sjanr\\Documents\\CTU\\2023\\Semester 2\\SAs Semester 2\\JD522\\URMA_project_SA\\src\\main\\java\\Department\\Courses";

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
    }//GEN-LAST:event_DownloadCourse_ButtonActionPerformed

    private void UploadCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadCourseButtonActionPerformed
         JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
    fileChooser.setFileFilter(filter);

    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();

        // Set the export directory for Resources
        String exportDirectoryPath = "C:\\Users\\sjanr\\Documents\\CTU\\2023\\Semester 2\\SAs Semester 2\\JD522\\URMA_project_SA\\src\\main\\java\\Faculty\\Resources";

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
    }//GEN-LAST:event_UploadCourseButtonActionPerformed

    private void UploadSchedule_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadSchedule_ButtonActionPerformed
         JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
    fileChooser.setFileFilter(filter);

    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();

        // Set the export directory for Schedules
        String exportDirectoryPath = "C:\\Users\\sjanr\\Documents\\CTU\\2023\\Semester 2\\SAs Semester 2\\JD522\\URMA_project_SA\\src\\main\\java\\Faculty\\Schedules";

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
    }//GEN-LAST:event_UploadSchedule_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel Cources_Label;
    private javax.swing.JLabel CourseManagement_Label;
    private javax.swing.JButton DownloadAssignment_Button;
    private javax.swing.JButton DownloadCourse_Button;
    private javax.swing.JButton DownloadResource_Button;
    private javax.swing.JLabel Resources_Lable;
    private javax.swing.JButton UploadCourseButton;
    private javax.swing.JButton UploadSchedule_Button;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
