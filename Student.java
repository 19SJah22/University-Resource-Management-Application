package com.mycompany.urma_project_sa;

public class Student extends javax.swing.JFrame {
    private LogIn login;
    private StudentEnrollCourse enroll;
    private StudentCourses courses;
    private StudentGrades grades;
    private StudentSchedules schedules;
    private StudentCourseMaterials materials;

    public Student() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogOut_Button = new javax.swing.JButton();
        EnrollInCourses_Button = new javax.swing.JButton();
        Schedules_Button = new javax.swing.JButton();
        Materials_Button = new javax.swing.JButton();
        Student_Label = new javax.swing.JLabel();
        Grades_Button = new javax.swing.JButton();
        YourCourses_Button1 = new javax.swing.JButton();

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

        EnrollInCourses_Button.setBackground(new java.awt.Color(255, 255, 255));
        EnrollInCourses_Button.setForeground(new java.awt.Color(0, 0, 0));
        EnrollInCourses_Button.setText("Enroll in Courses");
        EnrollInCourses_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        EnrollInCourses_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnrollInCourses_ButtonActionPerformed(evt);
            }
        });

        Schedules_Button.setBackground(new java.awt.Color(255, 255, 255));
        Schedules_Button.setForeground(new java.awt.Color(0, 0, 0));
        Schedules_Button.setText("Schedules");
        Schedules_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Schedules_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Schedules_ButtonActionPerformed(evt);
            }
        });

        Materials_Button.setBackground(new java.awt.Color(255, 255, 255));
        Materials_Button.setForeground(new java.awt.Color(0, 0, 0));
        Materials_Button.setText("Course Materials");
        Materials_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Materials_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Materials_ButtonActionPerformed(evt);
            }
        });

        Student_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        Student_Label.setForeground(new java.awt.Color(255, 255, 255));
        Student_Label.setText("Student");

        Grades_Button.setBackground(new java.awt.Color(255, 255, 255));
        Grades_Button.setForeground(new java.awt.Color(0, 0, 0));
        Grades_Button.setText("Grades");
        Grades_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Grades_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grades_ButtonActionPerformed(evt);
            }
        });

        YourCourses_Button1.setBackground(new java.awt.Color(255, 255, 255));
        YourCourses_Button1.setForeground(new java.awt.Color(0, 0, 0));
        YourCourses_Button1.setText("Your Courses");
        YourCourses_Button1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        YourCourses_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YourCourses_Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(459, Short.MAX_VALUE)
                        .addComponent(LogOut_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(YourCourses_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Schedules_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(EnrollInCourses_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Grades_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55)
                                .addComponent(Materials_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(Student_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Student_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YourCourses_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grades_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Materials_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Schedules_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnrollInCourses_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(LogOut_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void EnrollInCourses_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnrollInCourses_ButtonActionPerformed
         enroll = new StudentEnrollCourse();
         dispose();
         enroll.setVisible(true);
    }//GEN-LAST:event_EnrollInCourses_ButtonActionPerformed

    private void Schedules_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Schedules_ButtonActionPerformed
        schedules = new StudentSchedules();
        dispose();
        schedules.setVisible(true);
    }//GEN-LAST:event_Schedules_ButtonActionPerformed

    private void Materials_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Materials_ButtonActionPerformed
        materials = new StudentCourseMaterials();
        dispose();
        materials.setVisible(true);
    }//GEN-LAST:event_Materials_ButtonActionPerformed

    private void Grades_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grades_ButtonActionPerformed
        grades = new StudentGrades();
        dispose();
        grades.setVisible(true);
    }//GEN-LAST:event_Grades_ButtonActionPerformed

    private void YourCourses_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YourCourses_Button1ActionPerformed
        courses = new StudentCourses();
        dispose();
        courses.setVisible(true);        
    }//GEN-LAST:event_YourCourses_Button1ActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnrollInCourses_Button;
    private javax.swing.JButton Grades_Button;
    private javax.swing.JButton LogOut_Button;
    private javax.swing.JButton Materials_Button;
    private javax.swing.JButton Schedules_Button;
    private javax.swing.JLabel Student_Label;
    private javax.swing.JButton YourCourses_Button1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
