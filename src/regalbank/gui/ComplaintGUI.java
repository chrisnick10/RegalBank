/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regalbank.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author reedtdan
 */
public class ComplaintGUI extends javax.swing.JFrame {

    /**
     * Creates new form ComplaintGUI
     */
    public ComplaintGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        toField = new javax.swing.JTextField();
        subjectField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageField = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        ComplaintSubmitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fromField = new javax.swing.JTextField();
        LoadButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Complaint");

        jLabel3.setText("To (ID)");

        jLabel4.setText("Subject");

        messageField.setColumns(20);
        messageField.setRows(5);
        jScrollPane1.setViewportView(messageField);

        jLabel5.setText("Message");

        ComplaintSubmitButton.setText("Submit");
        ComplaintSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComplaintSubmitButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("From (ID)");

        LoadButton.setText("Load");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fromField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(toField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(subjectField))))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LoadButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComplaintSubmitButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(fromField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComplaintSubmitButton)
                            .addComponent(LoadButton))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComplaintSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComplaintSubmitButtonActionPerformed
        // TODO add your handling code here:
        String From_int = fromField.getText();
        String To_int = toField.getText();
        String Subject_str = subjectField.getText();
        String Message_str = messageField.getText();
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL =
"jdbc:mysql://localhost:3306/RegalBank?autoReconnect=true&useSSL=false";
            String insert = "Insert into Complaint (CO_ComplaintFrom,CO_ComplaintTo,CO_Message, CO_Subject,CO_Date) values( " 
                    + From_int +  "," + To_int +  ",\"" 
                    + Message_str +  "\",\"" + Subject_str 
                    + "\", CURDATE() )";
            Connection connection = DriverManager.getConnection(connectionURL, "root", "");
            Statement statement = connection.createStatement();
            statement.executeUpdate(insert);
            
            String q5 = "select * from Complaint";
            ResultSet set = statement.executeQuery(q5);
            
            System.out.println("Executed Query");

            while (set.next()) {
                
                for ( int i = 1; i <=5; i++ ) {
                    System.out.print(set.getString(i) + " "); 
                }
                System.out.println();
             }
            
            connection.close();
        } catch ( ClassNotFoundException e) {
            System.out.println("ClassException");
        } catch ( SQLException e) {
            System.out.println("SQLEXCEPTION");
            e.printStackTrace();
        }
    }//GEN-LAST:event_ComplaintSubmitButtonActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        // TODO add your handling code here:
        String From_int = fromField.getText();
        String To_int = toField.getText();
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL =
"jdbc:mysql://localhost:3306/RegalBank?autoReconnect=true&useSSL=false";
            String query = "SELECT CO_Message where CU_ComplaintFrom = " + From_int + "AND CU_ComplaintTo = " + To_int;
            Connection connection = DriverManager.getConnection(connectionURL, "root", "");
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(query);

            while (set.next()) {
                
                for ( int i = 1; i <=5; i++ ) {
                    System.out.print(set.getString(i) + " "); 
                }
                System.out.println();
             }
            
            connection.close();
        } catch ( ClassNotFoundException e) {
            System.out.println("ClassException");
        } catch ( SQLException e) {
            System.out.println("SQLEXCEPTION");
            e.printStackTrace();
        }
    }//GEN-LAST:event_LoadButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ComplaintGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplaintGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplaintGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplaintGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplaintGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComplaintSubmitButton;
    private javax.swing.JButton LoadButton;
    private javax.swing.JTextField fromField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messageField;
    private javax.swing.JTextField subjectField;
    private javax.swing.JTextField toField;
    // End of variables declaration//GEN-END:variables
}
