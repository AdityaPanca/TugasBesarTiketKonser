/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leho.service;

/**
 *
 * @author achmadsatyap
 */
public interface serviceTiket {
    public void inputEkonomi(String stok, String harga);
    public void deleteEkonomi(String stok, String harga);
    public void inputVip(String stok, String harga);
    public void inputVvip(String stok, String harga);
}
