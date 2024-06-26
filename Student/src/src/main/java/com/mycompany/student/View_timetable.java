/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.student;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author 91877
 */
public class View_timetable extends javax.swing.JDialog {

    /**
     * Creates new form View_timetable
     */
    String usernamee;
    public View_timetable(String username) {
        
        usernamee = username;
        initComponents();
        populate_table();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jToggleButtonextc = new javax.swing.JToggleButton();
        jToggleButtonaids = new javax.swing.JToggleButton();
        jToggleButtonit = new javax.swing.JToggleButton();
        jToggleButtonmxtx = new javax.swing.JToggleButton();
        jToggleButtonmech = new javax.swing.JToggleButton();
        jToggleButtoncomps = new javax.swing.JToggleButton();
        jToggleButtonelectrical = new javax.swing.JToggleButton();
        jToggleButtoncivil = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 224, 223));

        jPanel1.setBackground(new java.awt.Color(255, 224, 223));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        jToggleButtonextc.setText("Extc");
        jToggleButtonextc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonextcActionPerformed(evt);
            }
        });

        jToggleButtonaids.setText("AI-DS");
        jToggleButtonaids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonaidsActionPerformed(evt);
            }
        });

        jToggleButtonit.setText("I.T");
        jToggleButtonit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonitActionPerformed(evt);
            }
        });

        jToggleButtonmxtx.setText("Mtrx");
        jToggleButtonmxtx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonmxtxActionPerformed(evt);
            }
        });

        jToggleButtonmech.setText("Mech");
        jToggleButtonmech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonmechActionPerformed(evt);
            }
        });

        jToggleButtoncomps.setText("Comps");
        jToggleButtoncomps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtoncompsActionPerformed(evt);
            }
        });

        jToggleButtonelectrical.setText("Electrical");
        jToggleButtonelectrical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonelectricalActionPerformed(evt);
            }
        });

        jToggleButtoncivil.setText("Civil");
        jToggleButtoncivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtoncivilActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("View TimeTable Details According to Branch");

        jButton2.setText("All Branch");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete All");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButtonit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtoncomps, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jToggleButtonextc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButtonaids, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jToggleButtonmxtx, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButtonmech, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jToggleButtonelectrical, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButtoncivil, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtoncomps)
                    .addComponent(jToggleButtonextc)
                    .addComponent(jToggleButtonaids)
                    .addComponent(jToggleButtonelectrical))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonit)
                    .addComponent(jToggleButtonmxtx)
                    .addComponent(jToggleButtonmech)
                    .addComponent(jToggleButtoncivil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton3)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void populate_table(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?zeroDateTimeBehavior=CONVERT_TO_NULL", "user", "password");
            //create an string object for SQL query on what is to display in table 
            String sqlquery = "SELECT id AS 'ID',Date AS 'Date',Branch AS 'Branch',Semester AS 'Semester',Subject As 'Subject', Start_Time As 'Start_Time', End_Time As 'End_Time' FROM time_table";
            PreparedStatement pst = conn.prepareStatement(sqlquery); 
            ResultSet rs = pst.executeQuery();
            
            //Add first the Maven dependencyof rs2xml
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setBackground(Color.WHITE);
            jTable1.setOpaque(false);
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jToggleButtonextcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonextcActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?zeroDateTimeBehavior=CONVERT_TO_NULL", "user", "password");
            //create an string object for SQL query on what is to display in table
            String sqlquery = "SELECT id AS 'ID',Date AS 'Date',Branch AS 'Branch',Semester AS 'Semester',Subject As 'Subject', Start_Time As 'Start_Time', End_Time As 'End_Time' FROM time_table WHERE branch='extx'";
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            ResultSet rs = pst.executeQuery();

            //Add first the Maven dependencyof rs2xml
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setBackground(Color.WHITE);
            jTable1.setOpaque(false);

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jToggleButtonextcActionPerformed

    private void jToggleButtonaidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonaidsActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?zeroDateTimeBehavior=CONVERT_TO_NULL", "user", "password");
            //create an string object for SQL query on what is to display in table
            String sqlquery = "SELECT id AS 'ID',Date AS 'Date',Branch AS 'Branch',Semester AS 'Semester',Subject As 'Subject', Start_Time As 'Start_Time', End_Time As 'End_Time' FROM time_table WHERE branch='aids'";
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            ResultSet rs = pst.executeQuery();

            //Add first the Maven dependencyof rs2xml
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setBackground(Color.WHITE);
            jTable1.setOpaque(false);

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jToggleButtonaidsActionPerformed

    private void jToggleButtonitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonitActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?zeroDateTimeBehavior=CONVERT_TO_NULL", "user", "password");
            //create an string object for SQL query on what is to display in table
            String sqlquery = "SELECT id AS 'ID',Date AS 'Date',Branch AS 'Branch',Semester AS 'Semester',Subject As 'Subject', Start_Time As 'Start_Time', End_Time As 'End_Time' FROM time_table WHERE branch='I.T.'";
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            ResultSet rs = pst.executeQuery();

            //Add first the Maven dependencyof rs2xml
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setBackground(Color.WHITE);
            jTable1.setOpaque(false);

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jToggleButtonitActionPerformed

    private void jToggleButtonmxtxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonmxtxActionPerformed
        // TODO add your handling code here:

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?zeroDateTimeBehavior=CONVERT_TO_NULL", "user", "password");
            //create an string object for SQL query on what is to display in table
            String sqlquery = "SELECT id AS 'ID',Date AS 'Date',Branch AS 'Branch',Semester AS 'Semester',Subject As 'Subject', Start_Time As 'Start_Time', End_Time As 'End_Time' FROM time_table WHERE branch='mtrx'";
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            ResultSet rs = pst.executeQuery();

            //Add first the Maven dependencyof rs2xml
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setBackground(Color.WHITE);
            jTable1.setOpaque(false);

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jToggleButtonmxtxActionPerformed

    private void jToggleButtonmechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonmechActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?zeroDateTimeBehavior=CONVERT_TO_NULL", "user", "password");
            //create an string object for SQL query on what is to display in table
            String sqlquery = "SELECT id AS 'ID',Date AS 'Date',Branch AS 'Branch',Semester AS 'Semester',Subject As 'Subject', Start_Time As 'Start_Time', End_Time As 'End_Time' FROM time_table WHERE branch='mech'";
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            ResultSet rs = pst.executeQuery();

            //Add first the Maven dependencyof rs2xml
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setBackground(Color.WHITE);
            jTable1.setOpaque(false);

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jToggleButtonmechActionPerformed

    private void jToggleButtoncompsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtoncompsActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?zeroDateTimeBehavior=CONVERT_TO_NULL", "user", "password");
            //create an string object for SQL query on what is to display in table
            String sqlquery = "SELECT id AS 'ID',Date AS 'Date',Branch AS 'Branch',Semester AS 'Semester',Subject As 'Subject', Start_Time As 'Start_Time', End_Time As 'End_Time' FROM time_table WHERE branch='comps'";
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            ResultSet rs = pst.executeQuery();

            //Add first the Maven dependencyof rs2xml
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setBackground(Color.WHITE);
            jTable1.setOpaque(false);

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jToggleButtoncompsActionPerformed

    private void jToggleButtonelectricalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonelectricalActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?zeroDateTimeBehavior=CONVERT_TO_NULL", "user", "password");
            //create an string object for SQL query on what is to display in table
            String sqlquery = "SELECT id AS 'ID',Date AS 'Date',Branch AS 'Branch',Semester AS 'Semester',Subject As 'Subject', Start_Time As 'Start_Time', End_Time As 'End_Time' FROM time_table WHERE branch='electronic'";
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            ResultSet rs = pst.executeQuery();

            //Add first the Maven dependencyof rs2xml
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setBackground(Color.WHITE);
            jTable1.setOpaque(false);

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jToggleButtonelectricalActionPerformed

    private void jToggleButtoncivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtoncivilActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?zeroDateTimeBehavior=CONVERT_TO_NULL", "user", "password");
            //create an string object for SQL query on what is to display in table
            String sqlquery = "SELECT id AS 'ID',Date AS 'Date',Branch AS 'Branch',Semester AS 'Semester',Subject As 'Subject', Start_Time As 'Start_Time', End_Time As 'End_Time' FROM time_table WHERE branch='civil'";
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            ResultSet rs = pst.executeQuery();

            //Add first the Maven dependencyof rs2xml
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setBackground(Color.WHITE);
            jTable1.setOpaque(false);

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jToggleButtoncivilActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?zeroDateTimeBehavior=CONVERT_TO_NULL", "user", "password");
            //create an string object for SQL query on what is to display in table
            String sqlquery = "SELECT id AS 'ID',Date AS 'Date',Branch AS 'Branch',Semester AS 'Semester',Subject As 'Subject', Start_Time As 'Start_Time', End_Time As 'End_Time' FROM time_table";
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            ResultSet rs = pst.executeQuery();

            //Add first the Maven dependencyof rs2xml
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setBackground(Color.WHITE);
            jTable1.setOpaque(false);

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"All Sample data will get erase so no delet but we can delete all");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        dispose();
        TimetableGenerator menu1 = new TimetableGenerator(usernamee);
        menu1.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(View_timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_timetable("jain").setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButtonaids;
    private javax.swing.JToggleButton jToggleButtoncivil;
    private javax.swing.JToggleButton jToggleButtoncomps;
    private javax.swing.JToggleButton jToggleButtonelectrical;
    private javax.swing.JToggleButton jToggleButtonextc;
    private javax.swing.JToggleButton jToggleButtonit;
    private javax.swing.JToggleButton jToggleButtonmech;
    private javax.swing.JToggleButton jToggleButtonmxtx;
    // End of variables declaration//GEN-END:variables
}
