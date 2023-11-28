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
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Add_A_Course extends javax.swing.JFrame {
    private Courses courses;

    public Add_A_Course() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        AddCourse_Label = new javax.swing.JLabel();
        CourseID_Label = new javax.swing.JLabel();
        CourseName_Label = new javax.swing.JLabel();
        Department_Label = new javax.swing.JLabel();
        CourseName_TextField = new javax.swing.JTextField();
        CourseID_TextField = new javax.swing.JTextField();
        Department_TextField = new javax.swing.JTextField();
        Add_Button = new javax.swing.JButton();
        Clear_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Export_Button = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        AddCourse_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        AddCourse_Label.setForeground(new java.awt.Color(255, 255, 255));
        AddCourse_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddCourse_Label.setText("Add Course");

        CourseID_Label.setBackground(new java.awt.Color(255, 255, 255));
        CourseID_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        CourseID_Label.setForeground(new java.awt.Color(255, 255, 255));
        CourseID_Label.setText("Course ID: ");

        CourseName_Label.setBackground(new java.awt.Color(255, 255, 255));
        CourseName_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        CourseName_Label.setForeground(new java.awt.Color(255, 255, 255));
        CourseName_Label.setText("Course Name: ");

        Department_Label.setBackground(new java.awt.Color(255, 255, 255));
        Department_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Department_Label.setForeground(new java.awt.Color(255, 255, 255));
        Department_Label.setText("Department: ");

        CourseName_TextField.setBackground(new java.awt.Color(255, 255, 255));
        CourseName_TextField.setForeground(new java.awt.Color(0, 0, 0));
        CourseName_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CourseName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseName_TextFieldActionPerformed(evt);
            }
        });

        CourseID_TextField.setBackground(new java.awt.Color(255, 255, 255));
        CourseID_TextField.setForeground(new java.awt.Color(0, 0, 0));
        CourseID_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CourseID_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseID_TextFieldActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CourseName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Department_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CourseName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Department_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(AddCourse_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(Export_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(AddCourse_Label)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Department_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Department_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Export_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
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

    private void CourseName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseName_TextFieldActionPerformed
   CourseName_TextField.setText("");
    }//GEN-LAST:event_CourseName_TextFieldActionPerformed

    private void CourseID_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseID_TextFieldActionPerformed
         CourseID_TextField.setText("");
    }//GEN-LAST:event_CourseID_TextFieldActionPerformed

    private void Department_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Department_TextFieldActionPerformed
          Department_TextField.setText(""); 
    }//GEN-LAST:event_Department_TextFieldActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        courses = new Courses();
        dispose();
        courses.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_ButtonActionPerformed
    // Clear the text fields
    CourseName_TextField.setText("");
    CourseID_TextField.setText("");
    Department_TextField.setText(""); 
    }//GEN-LAST:event_Clear_ButtonActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
        String courseName = CourseName_TextField.getText().trim();
    String courseID = CourseID_TextField.getText().trim();
    String department = Department_TextField.getText().trim();

    // Validate that the required fields are not empty
    if (courseID.isEmpty() || courseName.isEmpty() || department.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "Incomplete Information", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Insert data into the database
    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
        String insertSql = "INSERT INTO add_course (course_name, course_id, department) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSql)) {
            preparedStatement.setString(1, courseName);
            preparedStatement.setString(2, courseID);
            preparedStatement.setString(3, department);
            preparedStatement.executeUpdate();
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle the exception according to your needs
    }
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Export_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_ButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
    fileChooser.setFileFilter(filter);

    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();

        // Set the export directory for Resources
        String exportDirectoryPath = "C:\\Users\\sjanr\\Documents\\CTU\\2023\\Semester 2\\SAs Semester 2\\JD522\\URMA_project_SA\\src\\main\\java\\Department\\Courses";

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
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddCourse_Label;
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Clear_Button;
    private javax.swing.JLabel CourseID_Label;
    private javax.swing.JTextField CourseID_TextField;
    private javax.swing.JLabel CourseName_Label;
    private javax.swing.JTextField CourseName_TextField;
    private javax.swing.JLabel Department_Label;
    private javax.swing.JTextField Department_TextField;
    private javax.swing.JButton Export_Button;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
