/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Caja;
import clases.MySQL;
import clases.Usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author hp desktop
 */
public class NewJFrameLogin extends javax.swing.JFrame {

    private Caja cajaA;
    private MySQL db;
    
    public NewJFrameLogin(MySQL db, Double montoInicial){
        this.db  = db;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Colibrí Arte y Cultura");
        jTextFieldMontoApertura.setText(montoInicial.toString());
        jTextFieldMontoApertura.setEditable(false);
    }
    public NewJFrameLogin(MySQL db) {
        this.db  = db;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Colibrí Arte y Cultura");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jLabelMontoApertura = new javax.swing.JLabel();
        jTextFieldMontoApertura = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelLogin.setBackground(new java.awt.Color(0, 0, 0));
        jPanelLogin.setForeground(new java.awt.Color(109, 176, 248));
        jPanelLogin.setLayout(null);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario: ");
        jPanelLogin.add(jLabelUsuario);
        jLabelUsuario.setBounds(13, 70, 60, 14);

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Contraseña: ");
        jPanelLogin.add(jLabelPassword);
        jLabelPassword.setBounds(13, 100, 80, 14);

        jTextFieldUsuario.setText("pedrofava");
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyTyped(evt);
            }
        });
        jPanelLogin.add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(100, 70, 150, 20);

        jButtonLogin.setText("Ingresar");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanelLogin.add(jButtonLogin);
        jButtonLogin.setBounds(163, 170, 90, 23);

        jLabelMontoApertura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMontoApertura.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMontoApertura.setText("Monto apertura: ");
        jPanelLogin.add(jLabelMontoApertura);
        jLabelMontoApertura.setBounds(12, 130, 100, 14);

        jTextFieldMontoApertura.setText("5000");
        jTextFieldMontoApertura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMontoAperturaKeyTyped(evt);
            }
        });
        jPanelLogin.add(jTextFieldMontoApertura);
        jTextFieldMontoApertura.setBounds(110, 130, 136, 20);

        jPasswordField.setText("123456");
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyTyped(evt);
            }
        });
        jPanelLogin.add(jPasswordField);
        jPasswordField.setBounds(100, 100, 149, 20);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login2.png"))); // NOI18N
        jPanelLogin.add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 280, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
      try{
       boolean actual = this.db.validarLogin(jPasswordField, jTextFieldUsuario);  
      /*
       * Verifico si el login fue valido
       */
       if (actual){
         Usuario logueado = new Usuario(jTextFieldUsuario.getText(), jPasswordField.getText()); 
         Double f = Double.parseDouble(jTextFieldMontoApertura.getText()); 
         this.cajaA = new Caja(f, logueado);
         NewJFramePrincipal cc = new NewJFramePrincipal(db, this.cajaA);
         cc.setVisible(true);
         dispose();
       
       }else{
           JOptionPane.showMessageDialog(null, "Error en el Usuario o en la Contraseña");
       }
      }catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null, "Error en el ingreso de datos");
      }
       
       
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jTextFieldMontoAperturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMontoAperturaKeyTyped
        //no deja escribir letras , solamente un solo punto, unicamente deja escribir numeros!
       int k = evt.getKeyChar();
       if ((k >= 46) && (k<= 57) ){
          if (k == 46){
             String dato =  jTextFieldMontoApertura.getText();
             int tam = dato.length();
             for (int i=0; i<=tam; i++){
                 if(dato.contains("."))
                     evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                 
                 
             }
          }if (k == 47){
              evt.setKeyChar((char)KeyEvent.VK_CLEAR);
          } 
       }else{
           evt.setKeyChar((char)KeyEvent.VK_CLEAR);
           evt.consume();
       }
       if (k == KeyEvent.VK_ENTER){
           jButtonLogin.doClick();
        }
    }//GEN-LAST:event_jTextFieldMontoAperturaKeyTyped

    private void jTextFieldUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyTyped
       
        //aprestas enter y te activa el boton!
        char teclaPres = evt.getKeyChar();
        if (teclaPres == KeyEvent.VK_ENTER){
           jButtonLogin.doClick();
        }
    }//GEN-LAST:event_jTextFieldUsuarioKeyTyped

    private void jPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyTyped
        char teclaPres = evt.getKeyChar();
        if (teclaPres == KeyEvent.VK_ENTER){
           jButtonLogin.doClick();
        }
        
        //tira una exception!! hay q ver solamente cuando apretas enter en la password
        
    }//GEN-LAST:event_jPasswordFieldKeyTyped

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
            java.util.logging.Logger.getLogger(NewJFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             NewJFrameLogin login = new NewJFrameLogin(null);
             login.setDefaultCloseOperation(NewJFrameLogin.EXIT_ON_CLOSE);
             login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelMontoApertura;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldMontoApertura;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
