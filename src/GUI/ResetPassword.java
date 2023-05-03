/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DTO.Common;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author agond
 */
public class ResetPassword extends javax.swing.JFrame {

    /**
     * Creates new form Signin
     */
    public ResetPassword() {
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

        lblTitle = new javax.swing.JLabel();
        ctnUsername = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        cntNewPass = new javax.swing.JPanel();
        lblNewPass = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JPasswordField();
        btnResetPwd = new javax.swing.JButton();
        ctnConfirmNewPass = new javax.swing.JPanel();
        lblConfirmNewPass = new javax.swing.JLabel();
        txtConfirmNewPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PhoneStore: Reset Password");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(25, 25, 25));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Đặt lại mật khẩu");

        txtUsername.setForeground(new java.awt.Color(25, 25, 25));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(25, 25, 25));
        lblUsername.setText("Tên đăng nhập");

        javax.swing.GroupLayout ctnUsernameLayout = new javax.swing.GroupLayout(ctnUsername);
        ctnUsername.setLayout(ctnUsernameLayout);
        ctnUsernameLayout.setHorizontalGroup(
            ctnUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ctnUsernameLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(ctnUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ctnUsernameLayout.setVerticalGroup(
            ctnUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ctnUsernameLayout.createSequentialGroup()
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblNewPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNewPass.setForeground(new java.awt.Color(25, 25, 25));
        lblNewPass.setText("Mật khẩu mới");

        txtNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cntNewPassLayout = new javax.swing.GroupLayout(cntNewPass);
        cntNewPass.setLayout(cntNewPassLayout);
        cntNewPassLayout.setHorizontalGroup(
            cntNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cntNewPassLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(cntNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        cntNewPassLayout.setVerticalGroup(
            cntNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cntNewPassLayout.createSequentialGroup()
                .addComponent(lblNewPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnResetPwd.setBackground(new java.awt.Color(25, 25, 25));
        btnResetPwd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResetPwd.setForeground(new java.awt.Color(255, 255, 255));
        btnResetPwd.setText("Đặt lại mật khẩu");
        btnResetPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPwdActionPerformed(evt);
            }
        });

        lblConfirmNewPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfirmNewPass.setForeground(new java.awt.Color(25, 25, 25));
        lblConfirmNewPass.setText("Xác nhận mật khẩu mới");

        txtConfirmNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmNewPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ctnConfirmNewPassLayout = new javax.swing.GroupLayout(ctnConfirmNewPass);
        ctnConfirmNewPass.setLayout(ctnConfirmNewPassLayout);
        ctnConfirmNewPassLayout.setHorizontalGroup(
            ctnConfirmNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ctnConfirmNewPassLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ctnConfirmNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConfirmNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ctnConfirmNewPassLayout.setVerticalGroup(
            ctnConfirmNewPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ctnConfirmNewPassLayout.createSequentialGroup()
                .addComponent(lblConfirmNewPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtConfirmNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctnUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnResetPwd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ctnConfirmNewPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cntNewPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(322, 322, 322))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(ctnUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cntNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ctnConfirmNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnResetPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        txtUsername.addActionListener((ActionEvent e) -> {
            txtNewPass.requestFocus(); // Thiết lập focus cho txtNewPwd
        });
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnResetPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPwdActionPerformed
        Common.choiceDialog = JOptionPane.showConfirmDialog(this, "Thay đổi password thành công\nTrở lại trang đăng nhập", "Reset Password Success",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (Common.choiceDialog == JOptionPane.YES_OPTION){
            Signin SigninForm = new Signin(); 
            SigninForm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnResetPwdActionPerformed

    private void txtNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPassActionPerformed
        txtNewPass.addActionListener((ActionEvent e) -> {
            txtConfirmNewPass.requestFocus(); // Thiết lập focus cho txtConfirmNewPwd
        });
    }//GEN-LAST:event_txtNewPassActionPerformed

    private void txtConfirmNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmNewPassActionPerformed
        txtConfirmNewPass.addActionListener((ActionEvent e) -> {
            btnResetPwd.requestFocus(); // Thiết lập focus cho btnResetPwd
        });
    }//GEN-LAST:event_txtConfirmNewPassActionPerformed

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
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResetPwd;
    private javax.swing.JPanel cntNewPass;
    private javax.swing.JPanel ctnConfirmNewPass;
    private javax.swing.JPanel ctnUsername;
    private javax.swing.JLabel lblConfirmNewPass;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtConfirmNewPass;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
