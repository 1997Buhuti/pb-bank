/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.User_Controller;
import Model.UserModel;
//import com.sun.xml.internal.ws.util.JAXWSUtils;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dpman
 */
public class Create_user extends javax.swing.JFrame {
    
    public static int number=0;
    /**
     * Creates new form create_user
     */
    public Create_user() {
        initComponents();
        lbl_id.setText(userId_generate());
        this.setLocationRelativeTo(null);
        setResizable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_access_level = new javax.swing.JTextField();
        txtx_user_name = new javax.swing.JTextField();
        txtx_password = new javax.swing.JTextField();
        btn_clear = new javax.swing.JButton();
        btn_create_user1 = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("                         Create User Form");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Access_Level :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("User_Id :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("User_Name :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txt_access_level.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(txt_access_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 330, -1));

        txtx_user_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(txtx_user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 330, -1));

        txtx_password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(txtx_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 330, -1));

        btn_clear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_clear.setText("clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        btn_create_user1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_create_user1.setText("Create");
        btn_create_user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_create_user1MouseClicked(evt);
            }
        });
        btn_create_user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_user1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_create_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        lbl_id.setBackground(new java.awt.Color(0, 0, 0));
        lbl_id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       public String encrypt_password(String passsword){
       
           try {
  
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
  
            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            byte[] messageDigest = md.digest(passsword.getBytes());
  
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
  
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } 
  
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
       }
        
    public void clearAll() throws ClassNotFoundException, SQLException{
                    txtx_user_name.setText("");
                    txtx_password.setText("");
                    txt_access_level.setText("");
             
        }
        
    public String userId_generate(){
            String UID = "Dev" ;
            String uuid=UUID.randomUUID().toString();
            uuid=uuid.substring(0,3);
            UID=UID+uuid;
            lbl_id.setText(UID);
            return UID;
            
        }
        
    private void btn_create_user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_create_user1MouseClicked
            
            String UserId = lbl_id.getText();
            String UserName= txtx_user_name.getText();
            String UserPassword = txtx_password.getText();
            String hashedPassword = encrypt_password(UserPassword);
            String AcessLevel = txt_access_level.getText();
            
            UserModel user = new UserModel(UserId,UserName,hashedPassword,AcessLevel);
            User_Controller controller= new User_Controller();
            
        try {
            if(controller.saveUser(user)){
                userId_generate();
                JOptionPane.showMessageDialog(this, "The record inserted");
                clearAll();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Create_user.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Create_user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_create_user1MouseClicked

    private void btn_create_user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_user1ActionPerformed
            String UserId = lbl_id.getText();
            String UserName= txtx_user_name.getText();
            String UserPassword = txtx_password.getText();
            String hashedPassword = encrypt_password(UserPassword);
            String AcessLevel = txt_access_level.getText();
            
            UserModel user = new UserModel(UserId,UserName,hashedPassword,AcessLevel);
            User_Controller controller= new User_Controller();
            
        try {
            if(controller.saveUser(user)){
                userId_generate();
                JOptionPane.showMessageDialog(this, "The record inserted");
                clearAll();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Create_user.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Create_user.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }//GEN-LAST:event_btn_create_user1ActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txtx_user_name.setText("");
        txtx_password.setText("");
        txt_access_level.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Create_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_create_user1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTextField txt_access_level;
    private javax.swing.JTextField txtx_password;
    private javax.swing.JTextField txtx_user_name;
    // End of variables declaration//GEN-END:variables
}
