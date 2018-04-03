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
import java.util.Random;

/**
 *
 * @author reedtdan
 */
public class CardGUI extends javax.swing.JFrame {

    /**
     * Creates new form CardGUI
     */
    public CardGUI() {
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
        jLabel2 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        CardBox = new javax.swing.JComboBox<>();
        AccountField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LoadNum = new javax.swing.JButton();
        IDField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Card");

        jLabel2.setText("Type");

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        CardBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot" }));

        jLabel3.setText("Account");

        LoadNum.setText("LoadByNum");

        jButton1.setText("Update");

        DeleteButton.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(CardBox, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AccountField)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LoadNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createButton)))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CardBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(LoadNum)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(DeleteButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        String type = (String) CardBox.getSelectedItem();
        Random random = new Random();
        //ASsume only can modify type
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL =
"jdbc:mysql://localhost:3306/RegalBank?autoReconnect=true&useSSL=false";
            
            String insert = " ";
            
            switch (type) {
                case "Alpha":
                    insert = "INSERT INTO CARD (CR_Number, CR_Type,CR_Assigned,CR_Expiration,CR_APR,CR_RewardRate,CR_RewardBonus,CR_LateFee,CR_AnnualFee,CR_AccountID) "
                    + "Values (" + random.nextInt() + ",\"" + type + "\",CURDATE(), CURDATE(), 0, 0, 100,100,100,100)";    
                    break;
                case "Bravo":
                    insert = "INSERT INTO CARD (CR_Number, CR_Type,CR_Assigned,CR_Expiration,CR_APR,CR_RewardRate,CR_RewardBonus,CR_LateFee,CR_AnnualFee,CR_AccountID) "
                    + "Values (" + random.nextInt() + ",\"" + type + "\",CURDATE(), CURDATE(), 0, 0, 100,100,100,100)";
                    break;
                case "Charlie":
                    insert = "INSERT INTO CARD (CR_Number, CR_Type,CR_Assigned,CR_Expiration,CR_APR,CR_RewardRate,CR_RewardBonus,CR_LateFee,CR_AnnualFee,CR_AccountID) "
                    + "Values (" + random.nextInt() + ",\"" + type + "\",CURDATE(), CURDATE(), 0, 0, 100,100,100,100)";
                    break;
                case "Delta":
                    insert = "INSERT INTO CARD (CR_Number, CR_Type,CR_Assigned,CR_Expiration,CR_APR,CR_RewardRate,CR_RewardBonus,CR_LateFee,CR_AnnualFee,CR_AccountID) "
                    + "Values (" + random.nextInt() + ",\"" + type + "\",CURDATE(), CURDATE(), 0, 0, 100,100,100,100)";
                    break;
                case "Echo":
                    insert = "INSERT INTO CARD (CR_Number, CR_Type,CR_Assigned,CR_Expiration,CR_APR,CR_RewardRate,CR_RewardBonus,CR_LateFee,CR_AnnualFee,CR_AccountID) "
                    + "Values (" + random.nextInt() + ",\"" + type + "\",CURDATE(), CURDATE(), 0, 0, 100,100,100,100)";
                    break;
                case "Foxtrot":
                    insert = "INSERT INTO CARD (CR_Number, CR_Type,CR_Assigned,CR_Expiration,CR_APR,CR_RewardRate,CR_RewardBonus,CR_LateFee,CR_AnnualFee,CR_AccountID) "
                    + "Values (" + random.nextInt() + ",\"" + type + "\",CURDATE(), CURDATE(), 0, 0, 100,100,100,100)";
                    break;
                default:        
            }
            
            Connection connection = DriverManager.getConnection(connectionURL, "root", "");
            Statement statement = connection.createStatement();
            statement.executeUpdate(insert);
            
            String result = "select * from Customer";
            ResultSet set = statement.executeQuery(result);
            
            System.out.println("Executed Query");
            String boxString = " ";
            while (set.next()) {
                
                for ( int i = 1; i <=9; i++ ) {
                    boxString = boxString + set.getString(i) + " "; 
                }
                boxString = boxString + "\n";
             }
            connection.close();
        } catch ( ClassNotFoundException e) {
            System.out.println("ClassException");
        } catch ( SQLException e) {
            System.out.println("SQLEXCEPTION");
            e.printStackTrace();
        }
    }//GEN-LAST:event_createButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountField;
    private javax.swing.JComboBox<String> CardBox;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField IDField;
    private javax.swing.JButton LoadNum;
    private javax.swing.JButton createButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
