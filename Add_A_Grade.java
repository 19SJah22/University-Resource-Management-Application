package com.mycompany.urma_project_sa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Add_A_Grade extends javax.swing.JFrame {
    private Faculty faculty;

    public Add_A_Grade() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AddGrade_Label = new javax.swing.JLabel();
        CourseID_Label = new javax.swing.JLabel();
        CourseName_Label = new javax.swing.JLabel();
        Grade_Label = new javax.swing.JLabel();
        StudentName_TextField = new javax.swing.JTextField();
        Course_TextField = new javax.swing.JTextField();
        Grade_TextField = new javax.swing.JTextField();
        Add_Button = new javax.swing.JButton();
        Clear_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        CourseID_Label1 = new javax.swing.JLabel();
        StudentID_Label2 = new javax.swing.JLabel();
        StudentID_TextField = new javax.swing.JTextField();
        CourseID_TextField = new javax.swing.JTextField();
        Comment_Label = new javax.swing.JLabel();
        Comment_TextField = new javax.swing.JTextField();
        Assignment_Label = new javax.swing.JLabel();
        Assignment_TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        AddGrade_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        AddGrade_Label.setForeground(new java.awt.Color(255, 255, 255));
        AddGrade_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddGrade_Label.setText("Add Grade");

        CourseID_Label.setBackground(new java.awt.Color(255, 255, 255));
        CourseID_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        CourseID_Label.setForeground(new java.awt.Color(255, 255, 255));
        CourseID_Label.setText("Course: ");

        CourseName_Label.setBackground(new java.awt.Color(255, 255, 255));
        CourseName_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        CourseName_Label.setForeground(new java.awt.Color(255, 255, 255));
        CourseName_Label.setText("Student Name: ");

        Grade_Label.setBackground(new java.awt.Color(255, 255, 255));
        Grade_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Grade_Label.setForeground(new java.awt.Color(255, 255, 255));
        Grade_Label.setText("Grade:");

        StudentName_TextField.setBackground(new java.awt.Color(255, 255, 255));
        StudentName_TextField.setForeground(new java.awt.Color(0, 0, 0));
        StudentName_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        StudentName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentName_TextFieldActionPerformed(evt);
            }
        });

        Course_TextField.setBackground(new java.awt.Color(255, 255, 255));
        Course_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Course_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Course_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Course_TextFieldActionPerformed(evt);
            }
        });

        Grade_TextField.setBackground(new java.awt.Color(255, 255, 255));
        Grade_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Grade_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Grade_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grade_TextFieldActionPerformed(evt);
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

        CourseID_Label1.setBackground(new java.awt.Color(255, 255, 255));
        CourseID_Label1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        CourseID_Label1.setForeground(new java.awt.Color(255, 255, 255));
        CourseID_Label1.setText("Course ID:");

        StudentID_Label2.setBackground(new java.awt.Color(255, 255, 255));
        StudentID_Label2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        StudentID_Label2.setForeground(new java.awt.Color(255, 255, 255));
        StudentID_Label2.setText("URMA ID:");

        StudentID_TextField.setBackground(new java.awt.Color(255, 255, 255));
        StudentID_TextField.setForeground(new java.awt.Color(0, 0, 0));
        StudentID_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        StudentID_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentID_TextFieldActionPerformed(evt);
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

        Comment_Label.setBackground(new java.awt.Color(255, 255, 255));
        Comment_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Comment_Label.setForeground(new java.awt.Color(255, 255, 255));
        Comment_Label.setText("Comment:");

        Comment_TextField.setBackground(new java.awt.Color(255, 255, 255));
        Comment_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Comment_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Comment_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comment_TextFieldActionPerformed(evt);
            }
        });

        Assignment_Label.setBackground(new java.awt.Color(255, 255, 255));
        Assignment_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Assignment_Label.setForeground(new java.awt.Color(255, 255, 255));
        Assignment_Label.setText("Assignment:");

        Assignment_TextField.setBackground(new java.awt.Color(255, 255, 255));
        Assignment_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Assignment_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Assignment_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Assignment_TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(AddGrade_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CourseName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StudentID_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseID_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Assignment_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Grade_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Comment_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudentName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Course_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StudentID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Grade_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Comment_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Assignment_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(AddGrade_Label)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentID_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Course_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CourseID_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Assignment_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Assignment_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Grade_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grade_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comment_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comment_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
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

    private void StudentName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentName_TextFieldActionPerformed

    }//GEN-LAST:event_StudentName_TextFieldActionPerformed

    private void Course_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Course_TextFieldActionPerformed

    }//GEN-LAST:event_Course_TextFieldActionPerformed

    private void Grade_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grade_TextFieldActionPerformed

    }//GEN-LAST:event_Grade_TextFieldActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
    String studentName = StudentName_TextField.getText();
    String urmaId = StudentID_TextField.getText();
    String course = Course_TextField.getText();
    String courseId = CourseID_TextField.getText();
    String assignments = Assignment_TextField.getText();
    String grade = Grade_TextField.getText();
    String comment = Comment_TextField.getText();

    // Connect to the database (replace placeholders with your actual database connection code)
    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
        // Create a PreparedStatement for the SQL query
        String query = "INSERT INTO student_grade ( student_name, urma_id, course, course_id, assignement, grade, comment) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            // Set values for the prepared statement
          
            pstmt.setString(1, studentName);
            pstmt.setString(2, urmaId);
            pstmt.setString(3, course);
            pstmt.setString(4, courseId);
            pstmt.setString(5, assignments);
            pstmt.setString(6, grade);
            pstmt.setString(7, comment);

            // Execute the update
            int rowsAffected = pstmt.executeUpdate();

            // Check if the update was successful
            if (rowsAffected > 0) {
                System.out.println("Grade added successfully!");
            } else {
                System.out.println("Failed to add grade.");
            }
        }
    } catch (SQLException e) {
        // Handle any SQL exceptions
        e.printStackTrace();
    }
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_ButtonActionPerformed
        // Clear the text fields
        StudentName_TextField.setText("");
        Course_TextField.setText("");
        Grade_TextField.setText("");
    }//GEN-LAST:event_Clear_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
       faculty = new Faculty();
        dispose();
        faculty.setVisible(true);;
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void StudentID_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentID_TextFieldActionPerformed
       
    }//GEN-LAST:event_StudentID_TextFieldActionPerformed

    private void CourseID_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseID_TextFieldActionPerformed
        
    }//GEN-LAST:event_CourseID_TextFieldActionPerformed

    private void Comment_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comment_TextFieldActionPerformed
       
    }//GEN-LAST:event_Comment_TextFieldActionPerformed

    private void Assignment_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Assignment_TextFieldActionPerformed
        
    }//GEN-LAST:event_Assignment_TextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Add_A_Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_A_Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_A_Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_A_Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_A_Grade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddGrade_Label;
    private javax.swing.JButton Add_Button;
    private javax.swing.JLabel Assignment_Label;
    private javax.swing.JTextField Assignment_TextField;
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Clear_Button;
    private javax.swing.JLabel Comment_Label;
    private javax.swing.JTextField Comment_TextField;
    private javax.swing.JLabel CourseID_Label;
    private javax.swing.JLabel CourseID_Label1;
    private javax.swing.JTextField CourseID_TextField;
    private javax.swing.JLabel CourseName_Label;
    private javax.swing.JTextField Course_TextField;
    private javax.swing.JLabel Grade_Label;
    private javax.swing.JTextField Grade_TextField;
    private javax.swing.JLabel StudentID_Label2;
    private javax.swing.JTextField StudentID_TextField;
    private javax.swing.JTextField StudentName_TextField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
