/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leho.login.user;

<<<<<<< HEAD
import com.leho.daftar.IUser;
import com.leho.daftar.MyConnection;
import com.leho.daftar.daftarFrame;
import com.leho.login.loginFrame;
import com.leho.model.UserModel;
import com.leho.pemesanan.pemesananFrame;
import java.sql.Connection;
=======
import com.leho.config.MyConnection;
import com.leho.daftar.daftarFrame;
import com.leho.login.loginFrame;
import com.leho.pemesanan.pemesananFrame;
import java.sql.PreparedStatement;
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author satya
 */
public class loginUserFrame extends javax.swing.JFrame {
    public static IUser loginUser;
    private static Connection koneksi;
    public static UserModel usermodel = new UserModel();
    /**
     * Creates new form loginUserFrame
     */
    public loginUserFrame() {
        initComponents();
        loginUser = new MyConnection();
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
<<<<<<< HEAD
        usernameLogin = new javax.swing.JTextField();
=======
        userLogin = new javax.swing.JTextField();
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
        userPassword = new javax.swing.JPasswordField();
        daftarRegis = new javax.swing.JButton();
        btnMasuk = new javax.swing.JButton();
        keluarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

<<<<<<< HEAD
        usernameLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameLoginActionPerformed(evt);
=======
        userLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLoginActionPerformed(evt);
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
            }
        });

        daftarRegis.setText("Daftar");
        daftarRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarRegisActionPerformed(evt);
            }
        });
<<<<<<< HEAD

        btnMasuk.setText("Masuk");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });

=======

        btnMasuk.setText("Masuk");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });

>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
        keluarLogin.setText("Keluar");
        keluarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(userPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(daftarRegis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(keluarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(usernameLogin)))))
                .addContainerGap(34, Short.MAX_VALUE))
=======
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(keluarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
<<<<<<< HEAD
                    .addComponent(usernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                    .addComponent(userLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daftarRegis)
                    .addComponent(btnMasuk)
                    .addComponent(keluarLogin))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
<<<<<<< HEAD
        usermodel.setUsername(usernameLogin.getText());
	ResultSet rs = loginUser.cekLogin(usernameLogin.getText(), userPassword.getText());
	
            try {
                if (rs.next()) {
                    if(usernameLogin.getText().equals(rs.getString("username")) && userPassword.getText().equals(rs.getString("password"))){
                       JOptionPane.showMessageDialog(null, "berhasil login");
                       new pemesananFrame().show();
                       this.dispose();
                    }
                }else{
                       JOptionPane.showMessageDialog(null, "username atau password salah");
                       new loginUserFrame().show();
                       this.dispose();
                }
		      
            } catch (SQLException ex) {
                   Logger.getLogger(loginUserFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnMasukActionPerformed

    private void usernameLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameLoginActionPerformed

    private void keluarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarLoginActionPerformed
        loginFrame lf = new loginFrame();
=======
//        MyConnection.buka_koneksi();
//        PreparedStatement ps;
//        ResultSet rs;
//        
//        String user = userLogin.getText();
//        String password = String.valueOf(userPassword.getPassword());
//        
//        String query ="SELECT * FROM `users` WHERE `username`=? AND `password`=?";
//        try {
//            ps = MyConnection.koneksi.prepareStatement(query);
//            
//            ps.setString(1, user);
//            ps.setString(2, password);
//            
//            rs = ps.executeQuery();
//            
//            if(rs.next()){
//                JOptionPane.showMessageDialog(null, "YES");
//            }else {
//                JOptionPane.showMessageDialog(null, "NO");
//                
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(loginUserFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        pemesananFrame pf = new pemesananFrame();
        pf.setVisible(true);
        pf.pack();
        pf.setLocationRelativeTo(null);
        pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnMasukActionPerformed

    private void userLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userLoginActionPerformed

    private void keluarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarLoginActionPerformed
        loginFrame lf = new loginFrame();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
        this.dispose();
    }//GEN-LAST:event_keluarLoginActionPerformed

    private void daftarRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarRegisActionPerformed
        daftarFrame rgf = new daftarFrame();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_daftarRegisActionPerformed

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
            java.util.logging.Logger.getLogger(loginUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginUserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMasuk;
    private javax.swing.JButton daftarRegis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton keluarLogin;
<<<<<<< HEAD
    private javax.swing.JPasswordField userPassword;
    private javax.swing.JTextField usernameLogin;
=======
    private javax.swing.JTextField userLogin;
    private javax.swing.JPasswordField userPassword;
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
    // End of variables declaration//GEN-END:variables
}
