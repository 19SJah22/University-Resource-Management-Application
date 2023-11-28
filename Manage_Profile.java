package com.mycompany.urma_project_sa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Manage_Profile extends javax.swing.JFrame {
    private Administrator admin;
    private Register register;
   

    public Manage_Profile() {
         initComponents();
         ManageProfile_Table.setModel(tableModel);
        
    }
    private DefaultTableModel tableModel = new DefaultTableModel(
            new Object[][]{},
            new String[]{"First Name", "Last Name", "URMA ID", "Password", "Enrolled in", "Roll"}
    );
            

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Profiles_Label = new javax.swing.JLabel();
        Search_Button = new javax.swing.JButton();
        Search_TextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageProfile_Table = new javax.swing.JTable();
        Back_Button = new javax.swing.JButton();
        Add_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Edit_Button = new javax.swing.JButton();
        Display_Button1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Profiles_Label.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        Profiles_Label.setForeground(new java.awt.Color(255, 255, 255));
        Profiles_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Profiles_Label.setText("Manage Profiles");

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

        ManageProfile_Table.setBackground(new java.awt.Color(255, 255, 255));
        ManageProfile_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "URMA ID", "Password", "Enrolled in", "Roll"
            }
        ));
        ManageProfile_Table.setGridColor(new java.awt.Color(255, 0, 153));
        ManageProfile_Table.setShowGrid(true);
        jScrollPane1.setViewportView(ManageProfile_Table);

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

        Delete_Button.setBackground(new java.awt.Color(255, 255, 255));
        Delete_Button.setForeground(new java.awt.Color(0, 0, 0));
        Delete_Button.setText("Delete");
        Delete_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
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

        Display_Button1.setBackground(new java.awt.Color(255, 255, 255));
        Display_Button1.setForeground(new java.awt.Color(0, 0, 0));
        Display_Button1.setText("Display All");
        Display_Button1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        Display_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Display_Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(Profiles_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(Display_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Profiles_Label)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(Display_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_ButtonActionPerformed
// Get the search keyword from the text field
    String search = Search_TextField.getText();

    // Check if the search term is not empty
    if (!search.isEmpty()) {
        // Create a TableRowSorter to filter the JTable data
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) ManageProfile_Table.getModel());

        // Set the RowFilter to match the search term
        RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + search);
        sorter.setRowFilter(rowFilter);

        // Apply the sorter to the JTable
        ManageProfile_Table.setRowSorter(sorter);
    } else {
        // If the search term is empty, remove any existing sorter
        ManageProfile_Table.setRowSorter(null);
    }
    }//GEN-LAST:event_Search_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        admin = new Administrator();
        dispose();
        admin.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
        register = new Register();
        dispose();
        register .setVisible(true);
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
   // TODO add your handling code here:
         int selectedRowIndex = ManageProfile_Table.getSelectedRow();

    // Check if a row is selected
    if (selectedRowIndex != -1) {
        // Remove the selected row from the JTable
        DefaultTableModel tableModel = (DefaultTableModel) ManageProfile_Table.getModel();
        tableModel.removeRow(selectedRowIndex);

        // Get the values from the selected row
        String urmaIdToDelete = (String) ManageProfile_Table.getValueAt(selectedRowIndex, 2);


       String deleteSql = "DELETE FROM register WHERE urma_id = ?";
try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
    try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSql)) {
        preparedStatement.setString(1, urmaIdToDelete);
        preparedStatement.executeUpdate();
    }
} catch (SQLException e) {
    e.printStackTrace();
    // Handle the exception according to your needs
}
    }                                             
    }
    private void Display_ButtonActionPerformed() {                                               

    }//GEN-LAST:event_Delete_ButtonActionPerformed

    
     
    private void Edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_ButtonActionPerformed
      int selectedRowIndex = ManageProfile_Table.getSelectedRow();

    if (selectedRowIndex != -1) {
        DefaultTableModel tableModel = (DefaultTableModel) ManageProfile_Table.getModel();

        // Get the new values from the selected row
        String updatedFirstName = (String) tableModel.getValueAt(selectedRowIndex, 0);
        String updatedLastName = (String) tableModel.getValueAt(selectedRowIndex, 1);
        String updatedUrmaId = (String) tableModel.getValueAt(selectedRowIndex, 2);
        String updatedPassword = (String) tableModel.getValueAt(selectedRowIndex, 3);
        String updatedEnrolledIn = (String) tableModel.getValueAt(selectedRowIndex, 4);
        String updatedRoll = (String) tableModel.getValueAt(selectedRowIndex, 5);

        // Update the corresponding record in the database
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
            String updateSql = "UPDATE register SET first_name = ?, last_name = ?, urma_id = ?, password = ?, enrolled_in = ?, roll = ? WHERE urma_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(updateSql)) {
                preparedStatement.setString(1, updatedFirstName);
                preparedStatement.setString(2, updatedLastName);
                preparedStatement.setString(3, updatedUrmaId);
                preparedStatement.setString(4, updatedPassword);
                preparedStatement.setString(5, updatedEnrolledIn);
                preparedStatement.setString(6, updatedRoll);
                preparedStatement.setString(7, updatedUrmaId); // Use the URMA ID as a condition

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception according to your needs
        }
    } else {
        System.out.println("No row selected.");
    }
    }//GEN-LAST:event_Edit_ButtonActionPerformed

    
    private void Display_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_Button1ActionPerformed
      // TODO add your handling code here:
          DefaultTableModel tableModel = (DefaultTableModel) ManageProfile_Table.getModel();
    tableModel.setRowCount(0);

    // Fetch data from the database and update the table model
    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
        String selectSql = "SELECT first_name, last_name, urma_id, password, enrolled_in, roll FROM register";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSql)) {
            // Execute the query and update the table model with the retrieved data
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    // Add a new row to the table model with the data from the result set
                    tableModel.addRow(new Object[]{
                            resultSet.getString("first_name"),
                            resultSet.getString("last_name"),
                            resultSet.getString("urma_id"),
                            resultSet.getString("password"),
                            resultSet.getString("enrolled_in"),
                            resultSet.getString("roll")
                    });
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle the exception according to your needs
    }
    }//GEN-LAST:event_Display_Button1ActionPerformed


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
            java.util.logging.Logger.getLogger(Manage_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JButton Display_Button1;
    private javax.swing.JButton Edit_Button;
    private javax.swing.JTable ManageProfile_Table;
    private javax.swing.JLabel Profiles_Label;
    private javax.swing.JButton Search_Button;
    private javax.swing.JTextField Search_TextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
