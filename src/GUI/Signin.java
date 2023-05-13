/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.KhachHangBUS;
import BUS.NhanVienBUS;
import DTO.KhachHang;
import DTO.NhanVien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author agond
 */
public class Signin extends javax.swing.JFrame {
    KhachHang kh;
    KhachHangBUS khBUS;
    NhanVien nv;
    NhanVienBUS nvBUS;
    /**
     * Creates new form Signin
     */
    public Signin() throws ClassNotFoundException, SQLException, IOException{
        this.khBUS = new KhachHangBUS();
        this.kh = new KhachHang();
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        lblTitle = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        btnSignin = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        btnForgotPwd = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PhoneStore: Sign in");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(25, 25, 25));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Đăng nhập");

        txtUsername.setForeground(new java.awt.Color(25, 25, 25));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(25, 25, 25));
        lblUsername.setText("Tên đăng nhập");

        lblPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPass.setForeground(new java.awt.Color(25, 25, 25));
        lblPass.setText("Mật khẩu");

        btnSignin.setBackground(new java.awt.Color(25, 25, 25));
        btnSignin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSignin.setForeground(new java.awt.Color(255, 255, 255));
        btnSignin.setText("Đăng nhập");
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });

        btnSignup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSignup.setText("Đăng ký");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        btnForgotPwd.setBackground(new java.awt.Color(242, 242, 242));
        btnForgotPwd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnForgotPwd.setForeground(new java.awt.Color(25, 25, 25));
        btnForgotPwd.setText("Quên mật khẩu?");
        btnForgotPwd.setBorder(null);
        btnForgotPwd.setMargin(new java.awt.Insets(4, 12, 4, 12));
        btnForgotPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPwdActionPerformed(evt);
            }
        });

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnForgotPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSignin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsername)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(322, 322, 322))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnForgotPwd)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        txtUsername.addActionListener((ActionEvent e) -> {
            txtPass.requestFocus();
        });
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        kh.setUsername(txtUsername.getText());
        kh.setPassword(txtPass.getText());           
        KhachHang khSearch = khBUS.searchObjectByUsername(kh.getUsername());
        nv.setUsername(txtUsername.getText());
        nv.setPassword(txtPass.getText());
        NhanVien nvSearch = nvBUS.searchObjectByUsername(nv.getUsername());    
        
        if(khSearch != null){
            if(kh.getPassword().equals(khSearch.getPassword())){
                MuaHang muaHangForm = new MuaHang(); 
                muaHangForm.setVisible(true); 
                this.dispose();                
            }
            else JOptionPane.showMessageDialog(null,"Sai mật khẩu!", "Đăng nhập thất bại",JOptionPane.INFORMATION_MESSAGE);
        }         
        else if(nvSearch != null){
            if(nv.getPassword().equals(nvSearch.getPassword())){
                MuaHang muaHangForm = new MuaHang(); 
                muaHangForm.setVisible(true); 
                this.dispose();
            }
            else JOptionPane.showMessageDialog(null,"Sai mật khẩu!", "Đăng nhập thất bại",JOptionPane.INFORMATION_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null,"Tài khoản không tồn tại", "Đăng nhập thất bại",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSigninActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        Signup signupForm = null; 
        try {
            signupForm = new Signup();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
        signupForm.setVisible(true); // Hiển thị form "Signup"
        this.dispose(); // Ẩn form hiện tại (Signin)
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnForgotPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPwdActionPerformed
        ResetPassword ResetPasswordForm = null; 
        try {
            ResetPasswordForm = new ResetPassword();
        } catch (IOException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResetPasswordForm.setVisible(true); // Hiển thị form "ResetPassword"
        this.dispose(); // Ẩn form hiện tại (Signin)
    }//GEN-LAST:event_btnForgotPwdActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        txtPass.addActionListener((ActionEvent e) -> {
            kh.setUsername(txtUsername.getText());
            kh.setPassword(txtPass.getText());
            KhachHang khSearch = khBUS.searchObjectByUsername(kh.getUsername());
            if(khSearch != null){
                if(kh.getPassword().equals(khSearch.getPassword())){
                    MuaHang muaHangForm = new MuaHang(); 
                    muaHangForm.setVisible(true); 
                    this.dispose();
                }
                else JOptionPane.showMessageDialog(null,"Sai mật khẩu!", "Đăng nhập thất bại",JOptionPane.INFORMATION_MESSAGE);
            }
            else JOptionPane.showMessageDialog(null,"Tài khoản không tồn tại", "Đăng nhập thất bại",JOptionPane.INFORMATION_MESSAGE);
        });
    }//GEN-LAST:event_txtPassActionPerformed

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
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Signin().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotPwd;
    private javax.swing.JButton btnSignin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
