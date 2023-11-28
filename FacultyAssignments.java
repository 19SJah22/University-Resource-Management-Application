package com.mycompany.urma_project_sa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FacultyAssignments extends javax.swing.JFrame {
    private Add_Faculty_Assignments facultyAssign;
    private DepartmentHeads depHeads;
    private DefaultTableModel tableModel;

    public FacultyAssignments() {
        initComponents();
         tableModel = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Assignment Name", "Assignment ID", "Department"}
        );
        Department_Table.setModel(tableModel);
        AssignmentsDisplay(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Faculty_Label = new javax.swing.JLabel();
        Search_Button = new javax.swing.JButton();
        Search_TextField = new javax.swing.JTextField();
        Department_Pane = new javax.swing.JScrollPane();
        Department_Table = new javax.swing.JTable();
        Edit_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Addassignment_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Display_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Faculty_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        Faculty_Label.setForeground(new java.awt.Color(255, 255, 255));
        Faculty_Label.setText("Faculty Assignments");

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
        Search_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_TextFieldActionPerformed(evt);
            }
        });

        Department_Table.setBackground(new java.awt.Color(255, 255, 255));
        Department_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Assignment Name", "Assignment ID", "Department"
            }
        ));
        Department_Table.setGridColor(new java.awt.Color(255, 0, 153));
        Department_Table.setShowGrid(true);
        Department_Pane.setViewportView(Department_Table);

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
        Delete_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153), 2));
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        Addassignment_Button.setBackground(new java.awt.Color(255, 255, 255));
        Addassignment_Button.setForeground(new java.awt.Color(0, 0, 0));
        Addassignment_Button.setText("Add");
        Addassignment_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Addassignment_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Addassignment_ButtonActionPerformed(evt);
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
                .addGap(52, 52, 52)
                .addComponent(Addassignment_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Display_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Faculty_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Department_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Faculty_Label)
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(Display_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Department_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addassignment_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
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
private void AssignmentsDisplay() {
      
        tableModel.setRowCount(0);

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
            String selectSql = "SELECT * FROM faculty_assignments";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectSql)) {
                // Execute the query and update the table model with the retrieved data
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        // Add a new row to the table model with the data from the result set
                        tableModel.addRow(new Object[]{
                                resultSet.getString("assignment_name"),
                                resultSet.getString("assignment_id"),
                                resultSet.getString("department")
                        });
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception according to your needs
        }
    }
    
private void editAssignment(int selectedRow, String newAssignmentId, String newAssignmentName, String newDepartment) {
        // Update the database with the new values
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
            String updateSql = "UPDATE faculty_assignments SET assingment_id=?, assignment_name=?, department=? WHERE id=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(updateSql)) {
                preparedStatement.setString(1, newAssignmentId);
                preparedStatement.setString(2, newAssignmentName);
                preparedStatement.setString(3, newDepartment);
                preparedStatement.setInt(4, Integer.parseInt(tableModel.getValueAt(selectedRow, 0).toString())); // Assuming the first column is the ID

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception according to your needs
        }
    }

    private void deleteAssignment(int selectedRow) {
      try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
        String deleteSql = "DELETE FROM faculty_assignments WHERE assignment_name=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSql)) {
            preparedStatement.setString(1, tableModel.getValueAt(selectedRow, 0).toString()); // Use assignment name as parameter
            preparedStatement.executeUpdate();
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle the exception according to your needs
    }
    }
    private void AssignmentsDisplay(String search) {
    // Display data in the table based on the search term
    // You need to fetch data from the database and update the table model

    // Clear existing rows from the table model
    tableModel.setRowCount(0);

    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
        String selectSql = "SELECT * FROM faculty_assignments WHERE assignment_name LIKE ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSql)) {
            preparedStatement.setString(1, "%" + search + "%");

            // Execute the query and update the table model with the retrieved data
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    // Add a new row to the table model with the data from the result set
                    tableModel.addRow(new Object[]{
                            resultSet.getString("assignment_name"),
                            resultSet.getString("assignment_id"),
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
    private void Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_ButtonActionPerformed
// TODO add your handling code here:
           String search = Search_TextField.getText().trim();
     AssignmentsDisplay(search);
    }//GEN-LAST:event_Search_ButtonActionPerformed

    private void Search_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_TextFieldActionPerformed

    }//GEN-LAST:event_Search_TextFieldActionPerformed

    private void Addassignment_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addassignment_ButtonActionPerformed
        facultyAssign = new Add_Faculty_Assignments();
        dispose();
        facultyAssign.setVisible(true);        
    }//GEN-LAST:event_Addassignment_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        depHeads = new DepartmentHeads();
        dispose();
        depHeads.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Display_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_ButtonActionPerformed
        // TODO add your handling code here:
        // Display all data in the table

    // Clear existing rows from the table model
    tableModel.setRowCount(0);

    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
        String selectSql = "SELECT * FROM faculty_assignments";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSql)) {
            // Execute the query and update the table model with the retrieved data
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    // Add a new row to the table model with the data from the result set
                    tableModel.addRow(new Object[]{
                            resultSet.getString("assignment_name"),
                            resultSet.getString("assignment_id"),
                            resultSet.getString("department")
                    });
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle the exception according to your needs
    }
    }//GEN-LAST:event_Display_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        int selectedRow = Department_Table.getSelectedRow();
        if (selectedRow != -1) {
            // Remove the selected row from the table model
            tableModel.removeRow(selectedRow);
            // Delete the assignment from the database
            deleteAssignment(selectedRow);
        } else {
            // Show a message to inform the user that no row is selected
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void Edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_ButtonActionPerformed
       int selectedRow = Department_Table.getSelectedRow();
        if (selectedRow != -1) {
            // Get the selected row data
            String assignmentName = tableModel.getValueAt(selectedRow, 0).toString();
            String assignmentId = tableModel.getValueAt(selectedRow, 1).toString();
            String department = tableModel.getValueAt(selectedRow, 2).toString();

            // Prompt the user for new values
            
            String newAssignmentName = JOptionPane.showInputDialog(this, "Enter new assignment name:", assignmentName);
            String newAssignmentId = JOptionPane.showInputDialog(this, "Enter new assignment ID:", assignmentId);
            String newDepartment = JOptionPane.showInputDialog(this, "Enter new department:", department);

            // Update the table if the user provided new values
            if (  newAssignmentName != null && newAssignmentId != null && newDepartment != null) {
                // Update the table model
                tableModel.setValueAt(newAssignmentName, selectedRow, 0);
                tableModel.setValueAt(newAssignmentId, selectedRow, 1);
                tableModel.setValueAt(newDepartment, selectedRow, 2);

                // Update the database
                editAssignment(selectedRow, newAssignmentName, newAssignmentId, newDepartment);
            }
        } else {
            // Show a message to inform the user that no row is selected
            JOptionPane.showMessageDialog(this, "Please select a row to edit.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Edit_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyAssignments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addassignment_Button;
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JScrollPane Department_Pane;
    private javax.swing.JTable Department_Table;
    private javax.swing.JButton Display_Button;
    private javax.swing.JButton Edit_Button;
    private javax.swing.JLabel Faculty_Label;
    private javax.swing.JButton Search_Button;
    private javax.swing.JTextField Search_TextField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
