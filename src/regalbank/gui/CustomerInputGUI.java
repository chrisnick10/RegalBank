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
public class CustomerInputGUI extends javax.swing.JFrame {

    /**
     * Creates new form CustomerInput
     */
    public CustomerInputGUI() {
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

        CreditButtonGroup = new javax.swing.ButtonGroup();
        StudentButtonGroup = new javax.swing.ButtonGroup();
        GenderButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        FNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        MNameField = new javax.swing.JTextField();
        LNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DOBDay = new javax.swing.JTextField();
        DOBMonth = new javax.swing.JTextField();
        DOBYear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AddrNum = new javax.swing.JTextField();
        AddrStreet = new javax.swing.JTextField();
        AddrZIP = new javax.swing.JTextField();
        AddrCity = new javax.swing.JTextField();
        AddrState = new javax.swing.JTextField();
        AddrCountry = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        CISubmit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        GoodButton = new javax.swing.JRadioButton();
        BadButton = new javax.swing.JRadioButton();
        ExButton = new javax.swing.JRadioButton();
        StudentYes = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        GenderMale = new javax.swing.JRadioButton();
        GenderFemale = new javax.swing.JRadioButton();
        GenderOther = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Customer Information");

        FNameField.setText("First");

        jLabel2.setText("Name");

        MNameField.setText("Middle");

        LNameField.setText("Last");

        jLabel3.setText("DateOfBirth");

        DOBDay.setText("01");

        DOBMonth.setText("01");

        DOBYear.setText("2000");

        jLabel4.setText("Address");

        AddrNum.setText("500");

        AddrStreet.setText("Campus");

        AddrZIP.setText("48309");

        AddrCity.setText("Rochester");

        AddrState.setText("MI");

        AddrCountry.setText("United States");

        jLabel5.setText("Email");

        jLabel6.setText("Gender");

        jLabel7.setText("Phone");

        jTextField1.setText("222-333-4444");

        jTextField2.setText("example@gmail.com");

        CISubmit.setText("Submit");
        CISubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CISubmitActionPerformed(evt);
            }
        });

        jLabel8.setText("Student");

        jLabel9.setText("Credit");

        CreditButtonGroup.add(GoodButton);
        GoodButton.setText("Good");

        CreditButtonGroup.add(BadButton);
        BadButton.setText("Bad");

        CreditButtonGroup.add(ExButton);
        ExButton.setText("Execllent");

        StudentButtonGroup.add(StudentYes);
        StudentYes.setText("Yes");

        StudentButtonGroup.add(jRadioButton2);
        jRadioButton2.setText("No");

        GenderButtonGroup.add(GenderMale);
        GenderMale.setText("Male");

        GenderButtonGroup.add(GenderFemale);
        GenderFemale.setText("Female");

        GenderButtonGroup.add(GenderOther);
        GenderOther.setText("Other");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CISubmit))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(DOBDay))
                                        .addComponent(FNameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(MNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(LNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(DOBMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(DOBYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(AddrNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(AddrStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(AddrZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(AddrCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(AddrState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(AddrCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addComponent(jLabel7)
                        .addComponent(jLabel5)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BadButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(GoodButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ExButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(StudentYes)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(GenderMale)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(GenderFemale)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(GenderOther))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(MNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DOBDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOBMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOBYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AddrNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddrStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddrZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddrCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddrState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddrCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(GoodButton)
                    .addComponent(BadButton)
                    .addComponent(ExButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(StudentYes)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GenderMale)
                        .addComponent(GenderFemale)
                        .addComponent(GenderOther)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CISubmit))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CISubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CISubmitActionPerformed
        // Save Form to strings
        String City_str = AddrCity.getText();
        String Country_str = AddrCountry.getText();
        String Num_str = AddrNum.getText();
        String State_str = AddrState.getText();
        String Street_str = AddrStreet.getText();
        String ZIP_str = AddrStreet.getText();
        String Day_str = DOBDay.getText();
        String Month_str = DOBMonth.getText();
        String Year_str = DOBYear.getText();
        String FName_str = FNameField.getText();
        String MName_str = MNameField.getText();
        String LName_str = LNameField.getText();
        
        String Date_str = Year_str + "-" + Month_str + "-" + Day_str;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL =
"jdbc:mysql://localhost:3306/RegalBank?autoReconnect=true&useSSL=false";
            String insert = "Insert into Customer (CU_FirstName,CU_MiddleName,CU_LastName,CU_DOB,CU_Number,CU_Street,"
                    + "CU_ZIP,CU_City,CU_State,CU_Country)"
                    + "Values (\"" + FName_str + "\",\""+ MName_str + "\",\""+ LName_str + "\",\'" + Date_str + "\',\"" + Num_str 
                    + "\",\"" + Street_str + "\",\"" + ZIP_str + "\",\"" + City_str + "\",\"" + State_str + "\",\"" + Country_str + "\")";
            Connection connection = DriverManager.getConnection(connectionURL, "root", "");
            Statement statement = connection.createStatement();
            statement.executeUpdate(insert);
            
            String q5 = "select * from Customer";
            ResultSet set = statement.executeQuery(q5);
            
            System.out.println("Executed Query");
            System.out.println(set==null);
            while (set.next()) {
                System.out.println("Looping");
                System.out.println(set.getString(1)); //gets the first column's rows.
                System.out.println(set.getString(4)); //gets the first column's rows.

             }
            connection.close();
        } catch ( ClassNotFoundException e) {
            System.out.println("ClassException");
        } catch ( SQLException e) {
            System.out.println("SQLEXCEPTION");
            e.printStackTrace();
        }
    }//GEN-LAST:event_CISubmitActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerInputGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInputGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInputGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInputGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerInputGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddrCity;
    private javax.swing.JTextField AddrCountry;
    private javax.swing.JTextField AddrNum;
    private javax.swing.JTextField AddrState;
    private javax.swing.JTextField AddrStreet;
    private javax.swing.JTextField AddrZIP;
    private javax.swing.JRadioButton BadButton;
    private javax.swing.JButton CISubmit;
    private javax.swing.ButtonGroup CreditButtonGroup;
    private javax.swing.JTextField DOBDay;
    private javax.swing.JTextField DOBMonth;
    private javax.swing.JTextField DOBYear;
    private javax.swing.JRadioButton ExButton;
    private javax.swing.JTextField FNameField;
    private javax.swing.ButtonGroup GenderButtonGroup;
    private javax.swing.JRadioButton GenderFemale;
    private javax.swing.JRadioButton GenderMale;
    private javax.swing.JRadioButton GenderOther;
    private javax.swing.JRadioButton GoodButton;
    private javax.swing.JTextField LNameField;
    private javax.swing.JTextField MNameField;
    private javax.swing.ButtonGroup StudentButtonGroup;
    private javax.swing.JRadioButton StudentYes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
