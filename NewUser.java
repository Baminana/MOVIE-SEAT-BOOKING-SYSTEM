/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movie.seat.booking.system;

import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.time.*;
import java.time.format.*;
/**
 *
 * @author Me
 */
public class NewUser extends javax.swing.JFrame {

    /**
     * Creates new form NewUser
     */
    public NewUser() {
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

        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        MobileNo = new javax.swing.JFormattedTextField();
        Add = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New User");

        jLabel1.setText("Name:");

        Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameMouseClicked(evt);
            }
        });
        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NameKeyTyped(evt);
            }
        });

        jLabel2.setText("Password:");

        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });

        jLabel3.setText("Address:");

        Address.setColumns(10);
        Address.setRows(4);
        Address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddressMouseClicked(evt);
            }
        });
        Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Address);

        jLabel4.setText("Mobile No.:");

        try {
            MobileNo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("09#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        MobileNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MobileNoMouseClicked(evt);
            }
        });
        MobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MobileNoKeyTyped(evt);
            }
        });

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel5.setText("Username:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(MobileNo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Add)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        if (Name.getText().isBlank()){
            Name.setBackground(Color.red);
            Name.requestFocus();
        }else if(Username.getText().isBlank()){
            Username.setBackground(Color.red);
           Username.requestFocus();
        }else if(Password.getText().isBlank()){
            Password.setBackground(Color.red);
            Password.requestFocus();
        }else if(Address.getText().isBlank()){
            Address.setBackground(Color.red);
            Address.requestFocus();
       }else if(!MobileNo.isEditValid()){
            MobileNo.setBackground(Color.red);
            MobileNo.requestFocus();
        }else{
           JOptionPane.showMessageDialog(null,"Your Username:"+Username.getText()+"\n"+"Your Password: "+Password.getText(), "Remember your Account", 1);
             try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/movieseatbooking","root","root");
                Statement stmt = con.createStatement();
                DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyyMMddHm");
                LocalDateTime now = LocalDateTime.now();
                String ID = Username.getText().substring(0,1) + Name.getText().substring(0,1) + DTF.format(now);
                String name = Name.getText();
                String username = Username.getText();
                String password  = Password.getText();
                String address = Address.getText();
                String mobileno = MobileNo.getText();
                String sql = "Insert into user Values ('" +ID + "','"+username+"','"+name+"','"+password+"','"+address+"','"+mobileno+"')";
                stmt.executeUpdate(sql);
                Login login = new Login();
                login.setVisible(true);
                dispose();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }//GEN-LAST:event_AddActionPerformed

    private void NameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameMouseClicked
        Name.setBackground(Color.WHITE);
    }//GEN-LAST:event_NameMouseClicked

    private void NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyTyped
        Name.setBackground(Color.WHITE);
    }//GEN-LAST:event_NameKeyTyped

    private void UsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameKeyTyped
        Username.setBackground(Color.WHITE);
    }//GEN-LAST:event_UsernameKeyTyped

    private void UsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseClicked
        Username.setBackground(Color.WHITE);
    }//GEN-LAST:event_UsernameMouseClicked

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
        Password.setBackground(Color.WHITE);
    }//GEN-LAST:event_PasswordKeyTyped

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked
        Password.setBackground(Color.WHITE);
    }//GEN-LAST:event_PasswordMouseClicked

    private void AddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressKeyTyped
        Address.setBackground(Color.WHITE);
    }//GEN-LAST:event_AddressKeyTyped

    private void AddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddressMouseClicked
        Address.setBackground(Color.WHITE);
    }//GEN-LAST:event_AddressMouseClicked

    private void MobileNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MobileNoKeyTyped
        MobileNo.setBackground(Color.WHITE);
    }//GEN-LAST:event_MobileNoKeyTyped

    private void MobileNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MobileNoMouseClicked
        MobileNo.setBackground(Color.WHITE);
    }//GEN-LAST:event_MobileNoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextArea Address;
    private javax.swing.JFormattedTextField MobileNo;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
