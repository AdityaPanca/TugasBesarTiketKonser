/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leho.daftar;

<<<<<<< HEAD
import com.leho.daftar.MyConnection;
import com.leho.login.user.loginUserFrame;
=======
import com.leho.config.MyConnection;
import com.leho.login.user.loginUserFrame;
import com.leho.pemesanan.pemesananFrame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
import javax.swing.JOptionPane;

/**
 *
 * @author satya
 */
public class daftarFrame extends javax.swing.JFrame {
    private final IUser daftarBaru;
    /**
     * Creates new form daftarFrame
     */
    public daftarFrame() {
        initComponents();
        daftarBaru = new MyConnection();
    }
    
    private boolean validasiDaftar(){
	    boolean valid = false;
	    if (regNama.getText().isEmpty() || regUsername.getText().isEmpty() || regPassword.getText().isEmpty() || regAlamat.getText().isEmpty()|| regEmail.getText().isEmpty()) {
		    
		    JOptionPane.showMessageDialog(this, "Silahkan isi semua kolom");
	    }else {
		    valid = true;
	    }
	    return valid;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
<<<<<<< HEAD
        regNama = new javax.swing.JTextField();
        regUsername = new javax.swing.JTextField();
        regEmail = new javax.swing.JTextField();
        regPassword = new javax.swing.JPasswordField();
=======
        regName = new javax.swing.JTextField();
        regUser = new javax.swing.JTextField();
        regEmail = new javax.swing.JTextField();
        regPass = new javax.swing.JPasswordField();
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
        btnRegister = new javax.swing.JButton();
        exitDaftar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        regAlamat = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setText("Alamat");

        jLabel5.setText("Email");

        btnRegister.setText("Submit");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        exitDaftar.setText("Keluar");
        exitDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitDaftarActionPerformed(evt);
            }
        });

        regAlamat.setColumns(20);
        regAlamat.setRows(5);
        jScrollPane2.setViewportView(regAlamat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                            .addComponent(regPassword)
                            .addComponent(regNama)
                            .addComponent(regUsername)
=======
                            .addComponent(regPass)
                            .addComponent(regName)
                            .addComponent(regUser)
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
                            .addComponent(regEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(exitDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
<<<<<<< HEAD
                    .addComponent(regNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(regUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(regPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                    .addComponent(regName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(regUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(regPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(regEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(exitDaftar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
<<<<<<< HEAD
       
        if (validasiDaftar()==true) {
            daftarBaru.userDaftar(regNama.getText(),regUsername.getText(),regPassword.getText(),regAlamat.getText(),regEmail.getText());			
            JOptionPane.showMessageDialog(rootPane, "Registrasi berhasil silahkan login untuk melanjutakan");
            new loginUserFrame().show();
            dispose();
			
	}
        
    }//GEN-LAST:event_btnRegisterActionPerformed
 
=======
//        MyConnection.buka_koneksi();
//        String nama = regName.getText();
//        String user = regUser.getText();
//        String password = String.valueOf(regPass.getPassword());
//        String alamat = regAlamat.getText();
//        String email = regEmail.getText();
//        
//        PreparedStatement ps;
//        String query = "INSERT INTO `users`(`nama`, `username`, `password`, `alamat`, `email`) VALUES (?,?,?,?,?)";
//        try {
//            ps = MyConnection.koneksi.prepareStatement(query);
//            
//            ps.setString(1, nama);
//            ps.setString(2, user);
//            ps.setString(3, password);
//            ps.setString(4, alamat);
//            ps.setString(5, email);
//            
//            if (user.equals("")){
//                JOptionPane.showInternalMessageDialog(null, "menambah username");
//            }
//                
//            else if (password.equals("")){
//                JOptionPane.showInternalMessageDialog(null, "menambah password");
//            }
//            
//            else if(checkUsername(user)){
//                JOptionPane.showMessageDialog(null, "Username telah ada");
//            }
//            
//            if(ps.executeUpdate() > 0){
//                JOptionPane.showMessageDialog(null,"user telah terdaftar");
//            } 
//                
//         
//        } catch (SQLException ex) {
//            Logger.getLogger(daftarFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        loginUserFrame pf = new loginUserFrame();
        pf.setVisible(true);
        pf.pack();
        pf.setLocationRelativeTo(null);
        pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnRegisterActionPerformed

//    public boolean checkUsername (String user){
//        MyConnection.buka_koneksi();
//        PreparedStatement ps;
//        ResultSet rs;
//        boolean checkUser = false;
//        String query ="SELECT * FROM `users` WHERE `username`=?";
//        
//        try {
//            ps = MyConnection.koneksi.prepareStatement(query);
//            ps.setString(1, user);
//            
//            rs = ps.executeQuery();
//            
//            if(rs.next()){
//                checkUser = true;
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(daftarFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return checkUser;
//            
//    }
//    
    
    
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
    
    private void exitDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitDaftarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitDaftarActionPerformed

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
            java.util.logging.Logger.getLogger(daftarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton exitDaftar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea regAlamat;
    private javax.swing.JTextField regEmail;
<<<<<<< HEAD
    private javax.swing.JTextField regNama;
    private javax.swing.JPasswordField regPassword;
    private javax.swing.JTextField regUsername;
=======
    private javax.swing.JTextField regName;
    private javax.swing.JPasswordField regPass;
    private javax.swing.JTextField regUser;
>>>>>>> 55cb1d3cb952c2359c975c31b6000e11ba624b4d
    // End of variables declaration//GEN-END:variables
}
