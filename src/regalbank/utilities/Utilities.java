/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regalbank.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import regalbank.gui.LoginGUI;

/**
 *
 * @author cjwn
 */
public class Utilities {
    private static String filePath = "sql/DataInsertion.sql";
    public static Connection c;
    
    public static void insertData() {
        String s = new String();
        StringBuffer sb = new StringBuffer();
        
        try {
            FileReader fr = new FileReader(filePath);
            
            BufferedReader br = new BufferedReader(fr);
            
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            br.close();
            
            //splitter 
            String[] inst = sb.toString().split(";");
            Connection c = LoginGUI.getConnection();
            Statement  st = c.createStatement();
            
            // trim the whitespaces
            for (int i = 0; i < inst.length; i++) {
                if (!inst[i].trim().equals("")) {
                    String query = inst[i] + ";";
                    
                    st.executeUpdate(query);
                }
            }
            
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if ( c == null ) {
            Class.forName("com.mysql.jdbc.Driver");
            // Changed default password to "". 
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/regalbank?useSSL=false","root","");
        }
        return c;
    }
}
