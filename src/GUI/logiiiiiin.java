/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import org.eclipse.persistence.internal.oxm.schema.model.Import;

/**
 *
 * @author keroles samer
 */
import  opnsrc.fcih.trainrsys.backend.*;

public class logiiiiiin extends javax.swing.JFrame {

    /**
     * Creates new form logiiiiiin
     */
    Adminn x;
    emolyee eo;
    Employee e;
    public logiiiiiin() {
        initComponents();
        setExtendedState(emolyee.MAXIMIZED_HORIZ);
        setResizable(false);
        x=new Adminn();
        e=new Employee();
        eo=new emolyee();
    }
    Admin admin =new Admin();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsrText = new javax.swing.JTextField();
        Button = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jerror = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(249, 149, 23));
        Title.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 250));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("LOGIN");
        Title.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Title.setOpaque(true);
        Title.setOpaque(true);
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 350, 50));

        UsrText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UsrText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsrTextActionPerformed(evt);
            }
        });
        getContentPane().add(UsrText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 254, 33));
        getContentPane().add(UsrIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, 40));

        PwIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PwIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/password.png"))); // NOI18N
        PwIcon.setToolTipText(null);
        PwIcon.setDoubleBuffered(true);
        PwIcon.setOpaque(true);
        PwIcon.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(PwIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 40, 40));

        Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button.setText("Login");
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 390, 150, 50));

        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PasswordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 254, 33));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/img/loginname.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 50, 40));

        jerror.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/logiiiin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsrTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsrTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsrTextActionPerformed

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
        if(admin.loginn(UsrText.getText(), PasswordField.getText()))
            x.setVisible(true);
        
        else {
            try {
                if(e.login(Integer.parseInt(UsrText.getText()), PasswordField.getText())){
                    eo.setVisible(true);
                }
                else {
                    jerror.setText("you are not employee or admin");
              }
            }
            catch(Exception e){
                jerror.setText("Un valid user name");
            }
            
        }    
    }//GEN-LAST:event_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(logiiiiiin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logiiiiiin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logiiiiiin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logiiiiiin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logiiiiiin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button;
    private javax.swing.JPasswordField PasswordField;
    private final javax.swing.JLabel PwIcon = new javax.swing.JLabel();
    private final javax.swing.JLabel Title = new javax.swing.JLabel();
    private final javax.swing.JLabel UsrIcon = new javax.swing.JLabel();
    private javax.swing.JTextField UsrText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jerror;
    // End of variables declaration//GEN-END:variables
}