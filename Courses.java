package com.mycompany.urma_project_sa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Courses extends javax.swing.JFrame {
    private Add_A_Course addCourse;
    private DepartmentHeads depHeads;
    private DefaultTableModel tableModel;

    public Courses() {
   initComponents();
        tableModel = new DefaultTableModel(
                new Object[][]{
                 
                },
                new String[]{"Course Name", "Course ID ", "Department "}
        );

        Courses_Table.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Courses_Label = new javax.swing.JLabel();
        Search_Button = new javax.swing.JButton();
        Search_TextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Courses_Table = new javax.swing.JTable();
        Back_Button = new javax.swing.JButton();
        Add_Button = new javax.swing.JButton();
        Edit_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Display_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Courses_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        Courses_Label.setForeground(new java.awt.Color(255, 255, 255));
        Courses_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Courses_Label.setText("Courses");

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

        Courses_Table.setBackground(new java.awt.Color(255, 255, 255));
        Courses_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course Name", "Course ID", "Dedpartment"
            }
        ));
        Courses_Table.setGridColor(new java.awt.Color(255, 0, 153));
        Courses_Table.setShowGrid(true);
        jScrollPane1.setViewportView(Courses_Table);

        Back_Button.setBackground(new java.awt.Color(255, 0, 153));
        Back_Button.setForeground(new java.awt.Color(255, 255, 255));
        Back_Button.setText("Back");
        Back_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        Add_Button.setBackground(new java.awt.Color(255, 255, 255));
        Add_Button.setForeground(new java.awt.Color(0, 0, 0));
        Add_Button.setText("Add");
        Add_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
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

        Display_Button.setBackground(new java.awt.Color(255, 255, 255));
        Display_Button.setForeground(new java.awt.Color(0, 0, 0));
        Display_Button.setText("Display All");
        Display_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Display_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Display_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Courses_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(Display_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Courses_Label)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(Display_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
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
      String search = Search_TextField.getText().trim();
    CoursesSearch(search);
    }//GEN-LAST:event_Search_ButtonActionPerformed
private void CoursesSearch(String search) {
    // Display data in the table based on the search term
    // You need to fetch data from the database and update the table model

    // Clear existing rows from the table model
    tableModel.setRowCount(0);

    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
        String selectSql = "SELECT * FROM add_course WHERE course_name LIKE ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSql)) {
            preparedStatement.setString(1, "%" + search + "%");

            // Execute the query and update the table model with the retrieved data
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    // Add a new row to the table model with the data from the result set
                    tableModel.addRow(new Object[]{
                            resultSet.getString("course_name"),
                            resultSet.getString("course_id"),
                            resultSet.getString("department")
                    });
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle the exception according to your needs
    }
}
    
    
    
    
    
    
    
    
    private void Edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_ButtonActionPerformed
        int selectedRow = Courses_Table.getSelectedRow();
        if (selectedRow != -1) {
            // Get the selected row data
            String TheCourseName = tableModel.getValueAt(selectedRow, 0).toString();
            String TheCourseID = tableModel.getValueAt(selectedRow, 1).toString();
            String Department = tableModel.getValueAt(selectedRow, 2).toString();

            // Prompt the user for new values
            String newCourse_name = JOptionPane.showInputDialog(this, "Enter new course_name", TheCourseName);
            String newCourse_id = JOptionPane.showInputDialog(this, "Enter new course_id:", TheCourseID);
            String newDepartment = JOptionPane.showInputDialog(this, "Enter new department:", Department);

            // Update the table if the user provided new values
            if (newCourse_id != null && newCourse_name != null && newDepartment != null) {
                // Update the table model
                tableModel.setValueAt(newCourse_id, selectedRow, 0);
                tableModel.setValueAt(newCourse_name, selectedRow, 1);
                tableModel.setValueAt(newDepartment, selectedRow, 2);

                // Update the database (replace with your actual update query)
                try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
                    String updateSql = "UPDATE add_course SET course_id = ?, course_name = ? WHERE department = ?";
                    try (PreparedStatement preparedStatement = connection.prepareStatement(updateSql)) {
                        preparedStatement.setString(1, newCourse_name);
                        preparedStatement.setString(2, newCourse_id);
                        preparedStatement.setString(3, newDepartment);
                        preparedStatement.executeUpdate();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    // Handle the exception according to your needs
                }
            }
        } else {
            // Show a message to inform the user that no row is selected
            JOptionPane.showMessageDialog(this, "Please select a row to edit.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Edit_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        int selectedRow = Courses_Table.getSelectedRow();
        if (selectedRow != -1) {
            // Get the selected row data
            String CourseName = tableModel.getValueAt(selectedRow, 0).toString();
          


            // Delete the selected row from the database (replace with your actual delete query)
            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
                String deleteSql = "DELETE FROM add_course WHERE course_name = ? ";
                try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSql)) {
                    preparedStatement.setString(1, CourseName);

                    preparedStatement.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle the exception according to your needs
            }

            // Remove the selected row from the table model
            tableModel.removeRow(selectedRow);
        } else {
            // Show a message to inform the user that no row is selected
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
        addCourse = new Add_A_Course();
        dispose();
         addCourse .setVisible(true);
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        depHeads = new DepartmentHeads();
        dispose();
        depHeads.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Display_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_ButtonActionPerformed
        // Clear existing rows from the table model
    tableModel.setRowCount(0);

    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
        String selectSql = "SELECT * FROM add_course";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSql)) {
            // Execute the query and update the table model with the retrieved data
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    // Add a new row to the table model with the data from the result set
                    tableModel.addRow(new Object[]{
                            resultSet.getString("course_name"),
                            resultSet.getString("course_id"),
                            resultSet.getString("department")
                    });
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle the exception according to your needs
    }
        
    }//GEN-LAST:event_Display_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Courses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel Courses_Label;
    private javax.swing.JTable Courses_Table;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JButton Display_Button;
    private javax.swing.JButton Edit_Button;
    private javax.swing.JButton Search_Button;
    private javax.swing.JTextField Search_TextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
