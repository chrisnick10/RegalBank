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
    
    private String Gender_str = "yes";
    private char Student_str = 'y';
    private char Credit_str = 'b';
    
    public CustomerInputGUI() {
        initComponents();
        GenderMale.setActionCommand(GenderMale.getText());
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        CISubmit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        GoodButton = new javax.swing.JRadioButton();
        BadButton = new javax.swing.JRadioButton();
        ExButton = new javax.swing.JRadioButton();
        StudentYes = new javax.swing.JRadioButton();
        StudentNo = new javax.swing.JRadioButton();
        GenderMale = new javax.swing.JRadioButton();
        GenderFemale = new javax.swing.JRadioButton();
        GenderOther = new javax.swing.JRadioButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        LoadIDButton = new javax.swing.JButton();
        IDField = new javax.swing.JTextField();

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

        AddrNum.setText("Number");

        AddrStreet.setText("Street");

        AddrZIP.setText("ZIPCODE");

        AddrCity.setText("CITY");

        AddrState.setText("MI");

        jLabel5.setText("Email");

        jLabel6.setText("Gender");

        jLabel7.setText("Phone");

        Phone.setText("222-333-4444");

        Email.setText("example@gmail.com");

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
        GoodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoodButtonActionPerformed(evt);
            }
        });

        CreditButtonGroup.add(BadButton);
        BadButton.setText("Bad");
        BadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BadButtonActionPerformed(evt);
            }
        });

        CreditButtonGroup.add(ExButton);
        ExButton.setText("Exellent");
        ExButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExButtonActionPerformed(evt);
            }
        });

        StudentButtonGroup.add(StudentYes);
        StudentYes.setText("Yes");
        StudentYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentYesActionPerformed(evt);
            }
        });

        StudentButtonGroup.add(StudentNo);
        StudentNo.setText("No");
        StudentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNoActionPerformed(evt);
            }
        });

        GenderButtonGroup.add(GenderMale);
        GenderMale.setText("Male");
        GenderMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderMaleActionPerformed(evt);
            }
        });

        GenderButtonGroup.add(GenderFemale);
        GenderFemale.setText("Female");
        GenderFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderFemaleActionPerformed(evt);
            }
        });

        GenderButtonGroup.add(GenderOther);
        GenderOther.setText("Other");
        GenderOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderOtherActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");

        DeleteButton.setText("Delete");

        LoadIDButton.setText("LoadID:");
        LoadIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadIDButtonActionPerformed(evt);
            }
        });

        IDField.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoadIDButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(DeleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CISubmit))
                            .addComponent(UpdateButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DOBDay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DOBMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DOBYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AddrNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AddrStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AddrZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AddrCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AddrState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BadButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(GoodButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ExButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(StudentYes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(StudentNo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(GenderMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(GenderFemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(GenderOther)))))
                        .addGap(66, 66, 66)))
                .addGap(16, 16, 16))
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
                    .addComponent(AddrState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(StudentNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GenderMale)
                        .addComponent(GenderFemale)
                        .addComponent(GenderOther)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CISubmit)
                        .addComponent(UpdateButton)
                        .addComponent(DeleteButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LoadIDButton)
                        .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CISubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CISubmitActionPerformed
        // Save Form to strings
        String City_str = AddrCity.getText();
        String Num_str = AddrNum.getText();
        String State_str = AddrState.getText();
        String Street_str = AddrStreet.getText();
        String ZIP_str = AddrZIP.getText();
        String Day_str = DOBDay.getText();
        String Month_str = DOBMonth.getText();
        String Year_str = DOBYear.getText();
        String FName_str = FNameField.getText();
        String MName_str = MNameField.getText();
        String LName_str = LNameField.getText();
        String Phone_str = Phone.getText();
        String Email_str = Email.getText();
        
        String Date_str = Year_str + "-" + Month_str + "-" + Day_str;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL =
"jdbc:mysql://localhost:3306/RegalBank?autoReconnect=true&useSSL=false";
            String insert = "Insert into Customer (CU_Student, CU_CreditHistory, CU_FirstName,CU_MiddleName,CU_LastName,CU_DOB,CU_Number,CU_Street,"
                    + "CU_ZIP,CU_City,CU_State, CU_Email, CU_Gender, CU_Phone)"
                    + "Values (\'" + Student_str + "\',\"" + Credit_str + "\",\"" +FName_str + "\",\""+ MName_str + "\",\""+ LName_str + "\",\"" + Date_str + "\",\"" + Num_str 
                    + "\",\"" + Street_str + "\",\"" + ZIP_str + "\",\"" + City_str + "\",\"" + State_str 
                    + "\",\"" + Email_str + "\",\"" + Gender_str + "\",\"" + Phone_str + "\")";
            Connection connection = DriverManager.getConnection(connectionURL, "root", "");
            Statement statement = connection.createStatement();
            statement.executeUpdate(insert);
            
            String q5 = "select * from Customer";
            ResultSet set = statement.executeQuery(q5);
            
            System.out.println("Executed Query");

            while (set.next()) {
                
                for ( int i = 1; i <=15; i++ ) {
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
    }//GEN-LAST:event_CISubmitActionPerformed

    private void BadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BadButtonActionPerformed
        // TODO add your handling code here:
        Credit_str = 'b';
    }//GEN-LAST:event_BadButtonActionPerformed

    private void GenderOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderOtherActionPerformed
        // TODO add your handling code here:
        Gender_str = "other";
    }//GEN-LAST:event_GenderOtherActionPerformed

    private void GoodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoodButtonActionPerformed
        // TODO add your handling code here:
        Credit_str = 'g';
    }//GEN-LAST:event_GoodButtonActionPerformed

    private void ExButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExButtonActionPerformed
        // TODO add your handling code here:
        Credit_str = 'e';
    }//GEN-LAST:event_ExButtonActionPerformed

    private void StudentYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentYesActionPerformed
        // TODO add your handling code here:
        Student_str = 'y';
    }//GEN-LAST:event_StudentYesActionPerformed

    private void StudentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNoActionPerformed
        // TODO add your handling code here:
        Student_str = 'n';
    }//GEN-LAST:event_StudentNoActionPerformed

    private void GenderMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderMaleActionPerformed
        // TODO add your handling code here:
        Gender_str = "male";
    }//GEN-LAST:event_GenderMaleActionPerformed

    private void GenderFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderFemaleActionPerformed
        // TODO add your handling code here:
        Gender_str = "female";
    }//GEN-LAST:event_GenderFemaleActionPerformed

    private void LoadIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadIDButtonActionPerformed
        // TODO add your handling code here:
        
        String City_str = AddrCity.getText();
        String Num_str = AddrNum.getText();
        String State_str = AddrState.getText();
        String Street_str = AddrStreet.getText();
        String ZIP_str = AddrZIP.getText();
        String Day_str = DOBDay.getText();
        String Month_str = DOBMonth.getText();
        String Year_str = DOBYear.getText();
        String FName_str = FNameField.getText();
        String MName_str = MNameField.getText();
        String LName_str = LNameField.getText();
        String Phone_str = Phone.getText();
        String Email_str = Email.getText();
        
        String Gender_str = "male";
        
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL =
"jdbc:mysql://localhost:3306/RegalBank?autoReconnect=true&useSSL=false";
            Connection connection = DriverManager.getConnection(connectionURL, "root", "");
            Statement statement = connection.createStatement();      
            String query = "select * from Customer where CU_ID = \"" + IDField.getText() + "\"";
            ResultSet set = statement.executeQuery(query);
            
            System.out.println("Executed Query");

            while (set.next()) {
                
                String student_str = set.getString(2);
                switch(student_str) {
                    case "y" :   StudentYes.doClick();
                                    break;
                    case "n" :   StudentNo.doClick();
                                    break;
                    default : 
                }
                
                String credit_str = set.getString(3);
                switch(credit_str) {
                    case "b" :  BadButton.doClick();
                                    break;
                    case "g" :  GoodButton.doClick();
                                    break;
                    case "e" :  ExButton.doClick();
                                    break;
                    default : 
                }
                
                FNameField.setText(set.getString(4));
                MNameField.setText(set.getString(5));
                LNameField.setText(set.getString(6));
                
                Phone.setText(set.getString(16));
     
                String gender_str = set.getString(15);
                switch(gender_str) {
                    case "male" :   GenderMale.doClick();
                                    break;
                    case "female":  GenderFemale.doClick();
                                    break;
                    case "other":   GenderOther.doClick();
                                    break;
                    default : 
                }
                
             }
           connection.close();
        } catch ( ClassNotFoundException e) {
            System.out.println("ClassException");
        } catch ( SQLException e) {
            System.out.println("SQLEXCEPTION");
            e.printStackTrace();
        }
    }//GEN-LAST:event_LoadIDButtonActionPerformed

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
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField Email;
    private javax.swing.JRadioButton ExButton;
    private javax.swing.JTextField FNameField;
    private javax.swing.ButtonGroup GenderButtonGroup;
    private javax.swing.JRadioButton GenderFemale;
    private javax.swing.JRadioButton GenderMale;
    private javax.swing.JRadioButton GenderOther;
    private javax.swing.JRadioButton GoodButton;
    private javax.swing.JTextField IDField;
    private javax.swing.JTextField LNameField;
    private javax.swing.JButton LoadIDButton;
    private javax.swing.JTextField MNameField;
    private javax.swing.JTextField Phone;
    private javax.swing.ButtonGroup StudentButtonGroup;
    private javax.swing.JRadioButton StudentNo;
    private javax.swing.JRadioButton StudentYes;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
