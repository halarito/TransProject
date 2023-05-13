/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.sql.*;

/**
 *
 * @author Arlindo Halar
 */

public class Modulo {
    public static java.sql.Connection conector(){
        
        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.jdbc.Driver";
        
        String url = "jdbc:mysql://localhost:3306/transproject";
        String user = "root";
        String pass = "";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, pass);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    
}
}
