/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leho.daftar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class MyConnection{
        
    public static Connection koneksi;
    public static void buka_koneksi(){
        if(koneksi == null){
            try {
            String url = "jdbc:mysql://localhost:3306/login";
            String user = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url,user,password);
            } catch (SQLException e) {
                System.out.println("Error membuat koneksi");
            }
        }
    }
}
