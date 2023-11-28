package com.mycompany.urma_project_sa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Resources extends javax.swing.JFrame {
    private DepartmentHeads depHeads;
    private Add_A_Resource addResource;
    private DefaultTableModel tableModel;
    
    public Resources() {
        initComponents();
        tableModel = new DefaultTableModel(
            new Object[][] {
               
            },
            new String[] {"Resource ID", "Resource Name", "Department", }
    );

    Resource_Table.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Resources_Label = new javax.swing.JLabel();
        Search_Button = new javax.swing.JButton();
        Search_TextField = new javax.swing.JTextField();
        Department_Pane = new javax.swing.JScrollPane();
        Resource_Table = new javax.swing.JTable();
        Edit_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Addassignment_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Display_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Resources_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        Resources_Label.setForeground(new java.awt.Color(255, 255, 255));
        Resources_Label.setText("Resources");

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

        Resource_Table.setBackground(new java.awt.Color(255, 255, 255));
        Resource_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Resource Name", "Resource ID", "Department"
            }
        ));
        Resource_Table.setGridColor(new java.awt.Color(255, 0, 153));
        Resource_Table.setShowGrid(true);
        Department_Pane.setViewportView(Resource_Table);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Department_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Resources_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(Addassignment_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Display_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Resources_Label)
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(Display_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Department_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addassignment_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
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
    ResourcesSearch(search);
    }//GEN-LAST:event_Search_ButtonActionPerformed

    private void Search_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_TextFieldActionPerformed

    }//GEN-LAST:event_Search_TextFieldActionPerformed

    private void Addassignment_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addassignment_ButtonActionPerformed
        addResource = new Add_A_Resource();
        dispose();
        addResource.setVisible(true);
    }//GEN-LAST:event_Addassignment_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        depHeads = new DepartmentHeads();
        dispose();
        depHeads.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
       int selectedRow = Resource_Table.getSelectedRow();
    if (selectedRow != -1) {
        // Get the selected row data
        String resource_id = tableModel.getValueAt(selectedRow, 0).toString();

        // Delete the selected row from the database
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
            String deleteSql = "DELETE FROM dep_resources WHERE resource_id = ? ";
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSql)) {
                preparedStatement.setString(1, resource_id);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception according to your needs
        }

        // Remove the selected row from the table model
        tableModel.removeRow(selectedRow);
    } else {
        // Show a message to inform the user that no row is selected
    }
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void Display_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_ButtonActionPerformed
      
        populatedTable();
        
    }//GEN-LAST:event_Display_ButtonActionPerformed
private void populatedTable() {
    tableModel.setRowCount(0); // Clear existing data

    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
        String sql = "SELECT * FROM dep_resources";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    // Retrieve data from the result set
                    String resource_name = resultSet.getString("resource_name");
                    String resource_id = resultSet.getString("resource_id");
                    String department = resultSet.getString("department");

                    // Add data to the table model
                    tableModel.addRow(new Object[]{resource_name, resource_id, department});
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle the exception according to your needs
    }
}
    

    
    private void ResourcesSearch(String search) {
    // Display data in the table based on the search term
    // You need to fetch data from the database and update the table model

    // Clear existing rows from the table model
    tableModel.setRowCount(0);

    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
        String selectSql = "SELECT * FROM dep_resources WHERE resource_name LIKE ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSql)) {
            preparedStatement.setString(1, "%" + search + "%");

            // Execute the query and update the table model with the retrieved data
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    // Add a new row to the table model with the data from the result set
                    tableModel.addRow(new Object[]{
                            resultSet.getString("resource_name"),
                            resultSet.getString("resource_id"),
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
        // TODO add your handling code here:
        int selectedRow = Resource_Table.getSelectedRow();
    if (selectedRow != -1) {
        // Get the selected row data
        String resource_name = tableModel.getValueAt(selectedRow, 0).toString();
        String resource_id = tableModel.getValueAt(selectedRow, 1).toString();
        String department = tableModel.getValueAt(selectedRow, 2).toString();

        // Prompt the user for new values
        String newResourceName = JOptionPane.showInputDialog(this, "Enter new Resource name:", resource_name);
        String newResourceID = JOptionPane.showInputDialog(this, "Enter new Resource id:", resource_id);
        String newDepartment = JOptionPane.showInputDialog(this, "Enter new Department:", department);

        // Update the table if the user provided new values
        if (newResourceName != null &&newResourceID != null && newDepartment != null) {
            // Update the table model
            tableModel.setValueAt(newResourceName, selectedRow , 0);
            tableModel.setValueAt(newResourceID, selectedRow, 1);
            tableModel.setValueAt(newDepartment, selectedRow, 2);

            // Update the database (replace with your actual update query)
            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
                String updateSql = "UPDATE dep_resources SET resource_name = ?, department = ? WHERE resource_id = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(updateSql)) {
                    preparedStatement.setString(1, newResourceName);
                    preparedStatement.setString(2, newDepartment);
                    preparedStatement.setString(3, resource_id);
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
            java.util.logging.Logger.getLogger(Resources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resources().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addassignment_Button;
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JScrollPane Department_Pane;
    private javax.swing.JButton Display_Button;
    private javax.swing.JButton Edit_Button;
    private javax.swing.JTable Resource_Table;
    private javax.swing.JLabel Resources_Label;
    private javax.swing.JButton Search_Button;
    private javax.swing.JTextField Search_TextField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
