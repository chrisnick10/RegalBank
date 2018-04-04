/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package regalbank.gui;

import java.sql.*;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reedtdan
 */
public class LoginGUI extends javax.swing.JFrame {

    private static String usertype;
    public static Connection c;
    
    /** Creates new form DataBaseGUI */
    public LoginGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LoginField = new javax.swing.JTextField();
        LoginLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RegalBank Database Access");

        LoginLabel.setText("Login:");

        PasswordLabel.setText("Password:");

        LoginButton.setText("Submit");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel)
                    .addComponent(LoginLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LoginField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(PasswordField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LoginButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginLabel)
                    .addComponent(LoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(LoginButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        
        String username_str = LoginField.getText();
        String pass_str = PasswordField.getText();
        
        String query = "SELECT LG_Type FROM Login WHERE LG_Username ='" + username_str + "' AND LG_Password = '" + pass_str+"';";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL = "jdbc:mysql://localhost:3306/RegalBank?autoReconnect=true&useSSL=false";
            Connection connection = DriverManager.getConnection(connectionURL, "root", "");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while (result.next()) {
                System.out.println(result.getString("LG_Type"));
                usertype = result.getString("LG_Type");
            }
            
            if (usertype.equalsIgnoreCase("admin")) {
                AdminPortalGUI newGUI = new AdminPortalGUI();
                this.setVisible(false);
                newGUI.setVisible(true);
            } else if (usertype.equalsIgnoreCase("employee")) {
                EmployeePortalGUI newGUI = new EmployeePortalGUI();
                this.setVisible(false);
                newGUI.setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ClassException");
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQL Exception");
        }
        
    }//GEN-LAST:event_LoginButtonActionPerformed

    public static Connection getConnection() throws ClassNotFoundException,SQLException {
        if ( c == null ) {
            Class.forName("com.mysql.jdbc.Driver");
            // Changed default password to "". 
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/regalbank?useSSL=false","root","");
        }
        return c;
}
    
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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JTextField LoginField;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
