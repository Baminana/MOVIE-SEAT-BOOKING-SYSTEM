/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movie.seat.booking.system;

import java.awt.Color;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Me
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static String UnameField;
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        StaffLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        Username.setToolTipText("Enter Username");
        Username.setName("Username"); // NOI18N
        Username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernameMouseClicked(evt);
            }
        });
        Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsernameKeyTyped(evt);
            }
        });

        Password.setToolTipText("Enter Password");
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });
        Password.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                PasswordInputMethodTextChanged(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });

        Login.setBackground(new java.awt.Color(204, 204, 255));
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Register.setBackground(new java.awt.Color(0, 255, 102));
        Register.setText("Register");
        Register.setToolTipText("No Account Yet? Create Now!");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Register))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register)
                    .addComponent(Login))
                .addContainerGap())
        );

        StaffLogin.setText("Staff Login");
        StaffLogin.setFocusable(false);
        StaffLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(StaffLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(StaffLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        NewUser newuser = new NewUser();
        newuser.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegisterActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        
        
        UnameField = Username.getText();
        String PwordField = Password.getText();
       
        if(UnameField.isBlank()){
            Username.requestFocus();
            Username.setBackground(Color.red);
        }else if(PwordField.isBlank()){
            Password.requestFocus();
            Password.setBackground(Color.red);
        }else{
                try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/movieseatbooking","root","root");
                Statement stmt = con.createStatement();
                ResultSet RS = stmt.executeQuery("Select * from user where Username = '"+UnameField+"' and UserPassword='"+PwordField+"'");
                if(RS.next()){
                    RegisteredUser registereduser = new RegisteredUser();
                    registereduser.setVisible(true);
                    registereduser.Name.setText(RS.getString(3));
                    registereduser.MobileNo.setText(RS.getString(6));
                    registereduser.Address.setText(RS.getString(5));
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Wrong Password or Username","Oops! Try Again",0);
                
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_LoginActionPerformed

    private void UsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseClicked
        Username.setBackground(Color.WHITE);
    }//GEN-LAST:event_UsernameMouseClicked

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked
        Password.setBackground(Color.WHITE);
    }//GEN-LAST:event_PasswordMouseClicked

    private void PasswordInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_PasswordInputMethodTextChanged
        Password.setBackground(Color.WHITE);
    }//GEN-LAST:event_PasswordInputMethodTextChanged

    private void UsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameKeyTyped
        Username.setBackground(Color.WHITE);
    }//GEN-LAST:event_UsernameKeyTyped

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
        Password.setBackground(Color.WHITE);
    }//GEN-LAST:event_PasswordKeyTyped

    private void StaffLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffLoginActionPerformed
        StaffLogin stafflogin = new StaffLogin();
        stafflogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_StaffLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Register;
    private javax.swing.JButton StaffLogin;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
  
}
