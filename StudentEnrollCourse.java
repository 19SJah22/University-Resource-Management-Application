package com.mycompany.urma_project_sa;

public class StudentEnrollCourse extends javax.swing.JFrame {
    private Student student;

    public StudentEnrollCourse() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CourseMaterial_Label = new javax.swing.JLabel();
        FirstName_Label = new javax.swing.JLabel();
        FirstName_TextField = new javax.swing.JTextField();
        Course_Label = new javax.swing.JLabel();
        LastName_TextField = new javax.swing.JTextField();
        IDnumber_Label = new javax.swing.JLabel();
        IDnumber_TextField = new javax.swing.JTextField();
        LastName_Label = new javax.swing.JLabel();
        Course_TextField = new javax.swing.JTextField();
        Submit_Button = new javax.swing.JButton();
        Clear_Button = new javax.swing.JButton();
        Cancel_Button = new javax.swing.JButton();
        Email_Label = new javax.swing.JLabel();
        Email_Label1 = new javax.swing.JLabel();
        Email_TextField = new javax.swing.JTextField();
        Number_TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        CourseMaterial_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        CourseMaterial_Label.setForeground(new java.awt.Color(255, 255, 255));
        CourseMaterial_Label.setText("Enroll in course");

        FirstName_Label.setBackground(new java.awt.Color(255, 255, 255));
        FirstName_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        FirstName_Label.setForeground(new java.awt.Color(255, 255, 255));
        FirstName_Label.setText("First Name: ");

        FirstName_TextField.setBackground(new java.awt.Color(255, 255, 255));
        FirstName_TextField.setForeground(new java.awt.Color(0, 0, 0));
        FirstName_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        FirstName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName_TextFieldActionPerformed(evt);
            }
        });

        Course_Label.setBackground(new java.awt.Color(255, 255, 255));
        Course_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Course_Label.setForeground(new java.awt.Color(255, 255, 255));
        Course_Label.setText("Course: ");

        LastName_TextField.setBackground(new java.awt.Color(255, 255, 255));
        LastName_TextField.setForeground(new java.awt.Color(0, 0, 0));
        LastName_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        LastName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastName_TextFieldActionPerformed(evt);
            }
        });

        IDnumber_Label.setBackground(new java.awt.Color(255, 255, 255));
        IDnumber_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        IDnumber_Label.setForeground(new java.awt.Color(255, 255, 255));
        IDnumber_Label.setText("ID Number:");

        IDnumber_TextField.setBackground(new java.awt.Color(255, 255, 255));
        IDnumber_TextField.setForeground(new java.awt.Color(0, 0, 0));
        IDnumber_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        IDnumber_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDnumber_TextFieldActionPerformed(evt);
            }
        });

        LastName_Label.setBackground(new java.awt.Color(255, 255, 255));
        LastName_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LastName_Label.setForeground(new java.awt.Color(255, 255, 255));
        LastName_Label.setText("Last Name: ");

        Course_TextField.setBackground(new java.awt.Color(255, 255, 255));
        Course_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Course_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Course_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Course_TextFieldActionPerformed(evt);
            }
        });

        Submit_Button.setBackground(new java.awt.Color(255, 0, 153));
        Submit_Button.setForeground(new java.awt.Color(255, 255, 255));
        Submit_Button.setText("SUBMIT");
        Submit_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Submit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_ButtonActionPerformed(evt);
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

        Cancel_Button.setBackground(new java.awt.Color(255, 0, 153));
        Cancel_Button.setForeground(new java.awt.Color(255, 255, 255));
        Cancel_Button.setText("CANCEL");
        Cancel_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ButtonActionPerformed(evt);
            }
        });

        Email_Label.setBackground(new java.awt.Color(255, 255, 255));
        Email_Label.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Email_Label.setForeground(new java.awt.Color(255, 255, 255));
        Email_Label.setText("Phone number: ");

        Email_Label1.setBackground(new java.awt.Color(255, 255, 255));
        Email_Label1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Email_Label1.setForeground(new java.awt.Color(255, 255, 255));
        Email_Label1.setText("Email:");

        Email_TextField.setBackground(new java.awt.Color(255, 255, 255));
        Email_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Email_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Email_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_TextFieldActionPerformed(evt);
            }
        });

        Number_TextField.setBackground(new java.awt.Color(255, 255, 255));
        Number_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Number_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Number_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(CourseMaterial_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Submit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(FirstName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IDnumber_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Course_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LastName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Email_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Email_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDnumber_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Course_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(CourseMaterial_Label)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDnumber_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDnumber_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Course_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Submit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
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

    private void FirstName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName_TextFieldActionPerformed

    }//GEN-LAST:event_FirstName_TextFieldActionPerformed

    private void LastName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastName_TextFieldActionPerformed

    }//GEN-LAST:event_LastName_TextFieldActionPerformed

    private void IDnumber_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDnumber_TextFieldActionPerformed
        
    }//GEN-LAST:event_IDnumber_TextFieldActionPerformed

    private void Course_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Course_TextFieldActionPerformed
        
    }//GEN-LAST:event_Course_TextFieldActionPerformed

    private void Submit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_ButtonActionPerformed
         // Show a message dialog
          javax.swing.JOptionPane.showMessageDialog(this, "Your information is being sent to the right channels. \nPlease wait patiently for your registration confirmation.");
          Student student = new Student();
          dispose();
          student.setVisible(true);

    }//GEN-LAST:event_Submit_ButtonActionPerformed

    private void Clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_ButtonActionPerformed
        // Clear the text fields
        FirstName_TextField.setText("");
        LastName_TextField.setText("");
        IDnumber_TextField.setText("");
        Course_TextField.setText("");
        Email_TextField.setText("");
        Number_TextField.setText("");
         
    }//GEN-LAST:event_Clear_ButtonActionPerformed

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        student = new Student();
        dispose();
        student.setVisible(true);
    }//GEN-LAST:event_Cancel_ButtonActionPerformed

    private void Email_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_TextFieldActionPerformed
        
    }//GEN-LAST:event_Email_TextFieldActionPerformed

    private void Number_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_TextFieldActionPerformed
        
    }//GEN-LAST:event_Number_TextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(StudentEnrollCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentEnrollCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentEnrollCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentEnrollCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentEnrollCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JButton Clear_Button;
    private javax.swing.JLabel CourseMaterial_Label;
    private javax.swing.JLabel Course_Label;
    private javax.swing.JTextField Course_TextField;
    private javax.swing.JLabel Email_Label;
    private javax.swing.JLabel Email_Label1;
    private javax.swing.JTextField Email_TextField;
    private javax.swing.JLabel FirstName_Label;
    private javax.swing.JTextField FirstName_TextField;
    private javax.swing.JLabel IDnumber_Label;
    private javax.swing.JTextField IDnumber_TextField;
    private javax.swing.JLabel LastName_Label;
    private javax.swing.JTextField LastName_TextField;
    private javax.swing.JTextField Number_TextField;
    private javax.swing.JButton Submit_Button;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
