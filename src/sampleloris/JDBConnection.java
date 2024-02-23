/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sampleloris;

/**
 *
 * @author User
 */

import java.sql.*;

public class JDBConnection {
    
    static final String JDBC_URL=""; 
    static final String USERNAME= "";
    static final String PASSWORD= "";
    
    
    public static Connection JDBConnection(){
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        }catch(SQLException ex){
            System.out.println(ex);
            
            
         
        }
        return null;

    }
}
