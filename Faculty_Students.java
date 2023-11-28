package com.mycompany.urma_project_sa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Faculty_Students extends javax.swing.JFrame {
    private Faculty faculty;
    private DefaultTableModel model;

    public Faculty_Students() {
        initComponents();
        model = (DefaultTableModel) Students_Table.getModel();
         StudentsEnrolled_ButtonActionPerformed(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Students_Label = new javax.swing.JLabel();
        Search_Button = new javax.swing.JButton();
        Search_TextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Students_Table = new javax.swing.JTable();
        Back_Button = new javax.swing.JButton();
        Edit_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        StudentsEnrolled_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Students_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        Students_Label.setForeground(new java.awt.Color(255, 255, 255));
        Students_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Students_Label.setText("Students");

        Search_Button.setBackground(new java.awt.Color(0, 0, 0));
        Search_Button.setForeground(new java.awt.Color(255, 255, 255));
        Search_Button.setText("Search");
        Search_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_ButtonActionPerformed(evt);
            }
        });

        Search_TextField.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        Search_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Students_Table.setBackground(new java.awt.Color(255, 255, 255));
        Students_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "URMA ID", "Course", "Assignment", "Grade", "Comment"
            }
        ));
        Students_Table.setGridColor(new java.awt.Color(255, 0, 153));
        Students_Table.setShowGrid(true);
        jScrollPane1.setViewportView(Students_Table);

        Back_Button.setBackground(new java.awt.Color(255, 0, 153));
        Back_Button.setForeground(new java.awt.Color(255, 255, 255));
        Back_Button.setText("Back");
        Back_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        Edit_Button.setBackground(new java.awt.Color(255, 255, 255));
        Edit_Button.setForeground(new java.awt.Color(0, 0, 0));
        Edit_Button.setText("Edit");
        Edit_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Edit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_ButtonActionPerformed(evt);
            }
        });

        Delete_Button.setBackground(new java.awt.Color(255, 255, 255));
        Delete_Button.setForeground(new java.awt.Color(0, 0, 0));
        Delete_Button.setText("Delete");
        Delete_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        StudentsEnrolled_Button.setBackground(new java.awt.Color(255, 255, 255));
        StudentsEnrolled_Button.setForeground(new java.awt.Color(0, 0, 0));
        StudentsEnrolled_Button.setText("List of Students Enrolled");
        StudentsEnrolled_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        StudentsEnrolled_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentsEnrolled_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("- Will only display Students in your course.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Students_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(StudentsEnrolled_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Students_Label)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentsEnrolled_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
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

    private void Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_ButtonActionPerformed
String keyword = Search_TextField.getText().trim().toLowerCase();

// Loop through each row in the table
    for (int i = 0; i < Students_Table.getRowCount(); i++) {
        // Loop through each column in the row
        for (int j = 0; j < Students_Table.getColumnCount(); j++) {
            // Get the value in the current cell
            String cellValue = Students_Table.getValueAt(i, j).toString().toLowerCase();

            // Check if the cell value contains the search keyword
            if (cellValue.contains(keyword)) {
                // Highlight the row or take any other action as needed
                Students_Table.getSelectionModel().setSelectionInterval(i, i);
                break;  // Break the inner loop since we found a match
            }
            if (keyword.isEmpty()) {
    // Clear the selection if the search keyword is empty
         Students_Table.clearSelection();
            }
        }
      }
    }//GEN-LAST:event_Search_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        faculty = new Faculty();
        dispose();
        faculty.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed

        
        int selectedRowIndex = Students_Table.getSelectedRow();

        if (selectedRowIndex != -1) {
            // Get the student name and urmaId for deletion
            String studentName = (String) Students_Table.getValueAt(selectedRowIndex, 0);
            String urmaId = (String) Students_Table.getValueAt(selectedRowIndex, 1);

            // Remove the selected row from the table
            model.removeRow(selectedRowIndex);

            // Delete the record from the database
            deleteStudentGrade(studentName, urmaId);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }//GEN-LAST:event_Delete_ButtonActionPerformed
private void deleteStudentGrade(String studentName, String urmaId) {
        // Implement the logic to delete the record from the database
        String JDBC_URL = "jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db";
        String DELETE_QUERY = "DELETE FROM student_grade WHERE student_name = ? AND urma_id = ?";

        try (
                Connection connection = DriverManager.getConnection(JDBC_URL);
                PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)
        ) {
            preparedStatement.setString(1, studentName);
            preparedStatement.setString(2, urmaId);

            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Record deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete record.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
    
    private void Edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_ButtonActionPerformed
int selectedRowIndex = Students_Table.getSelectedRow();

    if (selectedRowIndex != -1) {
        for (int columnIndex = 0; columnIndex < Students_Table.getColumnCount(); columnIndex++) {
            // Get the current value in the selected cell
            String currentValue = (String) Students_Table.getValueAt(selectedRowIndex, columnIndex);

            // Prompt the user to edit the value
            String editedValue = JOptionPane.showInputDialog(this, "Edit " + Students_Table.getColumnName(columnIndex) + ":", currentValue);

            if (editedValue != null) {  // Check if the user didn't click Cancel
                // Update the table with the edited value
                model.setValueAt(editedValue, selectedRowIndex, columnIndex);
            }
        }

        // Update the database with the edited values
        String studentName = (String) Students_Table.getValueAt(selectedRowIndex, 0);
        String urmaId = (String) Students_Table.getValueAt(selectedRowIndex, 1);
        String courseName = (String) Students_Table.getValueAt(selectedRowIndex, 2);
        String assignments = (String) Students_Table.getValueAt(selectedRowIndex, 3);
        String grade = (String) Students_Table.getValueAt(selectedRowIndex, 4);
        String comment = (String) Students_Table.getValueAt(selectedRowIndex, 5);

        updateStudentGrade(studentName, urmaId, courseName, assignments, grade, comment);
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to edit.");
    }
    }//GEN-LAST:event_Edit_ButtonActionPerformed

    
    private void updateStudentGrade(String studentName, String urmaId, String courseName, String assignments, String grade, String comment) {
    // Implement the logic to update the record in the database
    String JDBC_URL = "jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db";
    String UPDATE_QUERY = "UPDATE student_grade SET student_name = ?, course = ?, assignement = ?, grade = ?, comment = ? WHERE urma_id = ?";

    try (
            Connection connection = DriverManager.getConnection(JDBC_URL);
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)
    ) {
        preparedStatement.setString(1, studentName);
        preparedStatement.setString(2, courseName);
        preparedStatement.setString(3, assignments);
        preparedStatement.setString(4, grade);
        preparedStatement.setString(5, comment);
        preparedStatement.setString(6, urmaId);

        int rowsUpdated = preparedStatement.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Record updated successfully!");
            
        } else {
            JOptionPane.showMessageDialog(this, "Error: Failed to update record.");
            
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    private void StudentsEnrolled_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentsEnrolled_ButtonActionPerformed
        // TODO add your handling code here:
        String JDBC_URL = "jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db";
    String SELECT_STUDENTS_QUERY = "SELECT student_name, urma_id, course, assignement, grade, comment FROM student_grade";

    try (
        // Establish a connection to the database
        Connection connection = DriverManager.getConnection(JDBC_URL);

        // Create a prepared statement for the query
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_STUDENTS_QUERY);

        // Execute the query and get the result set
        ResultSet resultSet = preparedStatement.executeQuery()
    ) {
        // Populate the Students_Table with the fetched data
        model.setRowCount(0); // Clear existing rows

        while (resultSet.next()) {
            String studentName = resultSet.getString("student_name");
            String urmaId = resultSet.getString("urma_id");
            String courseName = resultSet.getString("course");
            String assignments = resultSet.getString("assignement");
            String grade = resultSet.getString("grade");
            String comment = resultSet.getString("comment");

            Object[] row = {studentName, urmaId, courseName, assignments, grade, comment};
            model.addRow(row);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle any SQL exceptions appropriately
    }
        
    }//GEN-LAST:event_StudentsEnrolled_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Faculty_Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculty_Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculty_Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty_Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faculty_Students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JButton Edit_Button;
    private javax.swing.JButton Search_Button;
    private javax.swing.JTextField Search_TextField;
    private javax.swing.JButton StudentsEnrolled_Button;
    private javax.swing.JLabel Students_Label;
    private javax.swing.JTable Students_Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
