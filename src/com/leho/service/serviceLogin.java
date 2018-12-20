/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leho.service;

import java.sql.ResultSet;

/**
 *
 * @author achmadsatyap
 */
public interface serviceLogin {
    public ResultSet cekLogin(String username, String password);
    public void halamanDaftar(String nama, String username, String password, String alamat, String email);
    public ResultSet cekLoginAdmin(String username, String password);

}
