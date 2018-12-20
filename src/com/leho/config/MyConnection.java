/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leho.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.leho.service.*;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.leho.daftar.*;
import com.leho.login.*;
import com.leho.login.admin.*;
import com.leho.login.user.*;

/**
 *
 * @author hp
 */
public class MyConnection implements serviceTiket, serviceLogin{
       
    private static Connection connection;
    ResultSet r = null;
   
    public static Connection getConnection(){
        if (connection==null) {
            try {
                String url = "jdbc:mysql://localhost:3306/login";
                String user ="root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection = (Connection) DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);     
            }
        }
        return connection;
    }

    @Override
    public void inputEkonomi(String stok, String harga) {
        getConnection();
        try {
            Statement s = connection.createStatement();
            String sql = "INSERT INTO ekonomi (stok,harga) VALUES ('"+ stok +"','"+ harga + "',"+ "')";
            s.executeUpdate(sql);
        } catch (SQLException e) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    @Override
    public void deleteEkonomi(String stok, String harga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inputVip(String stok, String harga) {
        getConnection();
        try {
            Statement s = connection.createStatement();
            String sql1 = "INSERT INTO vip(stok,harga) VALUES ('"+ stok +"','"+ harga + "',"+ "')";
            s.executeUpdate(sql1);
        } catch (SQLException e) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    @Override
    public void inputVvip(String stok, String harga) {
        getConnection();
        try {
            Statement s = connection.createStatement();
            String sql2 = "INSERT INTO vvip (stok,harga) VALUES ('"+ stok +"','"+ harga + "',"+ "')";
            s.executeUpdate(sql2);
        } catch (SQLException e) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    @Override
    public ResultSet cekLogin(String username, String password) {
        getConnection();
        try {
            Statement s = connection.createStatement();
            String sql = "SELECT * FROM users WHERE username='"+username+"'AND password='"+password+"'";   
            r = s.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        return r;
    }

    @Override
    public void halamanDaftar(String nama, String username, String password, String alamat, String email) {
        getConnection();
        try {
            Statement s =connection.createStatement();
            String sql = "INSERT INTO users (nama, username, password, alamat, email) VALUES ('"+ nama +"','"+username+ "'," +"'" +password  + "','"+alamat+"','"+email+"')";
            s.executeUpdate(sql);
	} catch (SQLException e) {
				Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, e);
				
		}
    }

    @Override
    public ResultSet cekLoginAdmin(String username, String password) {
        getConnection();
        try {
            Statement s = connection.createStatement();
            String sql = "SELECT * FROM admin WHERE username='"+username+"'AND password='"+password+"'";   
            r = s.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        return r;
    }

   
}
