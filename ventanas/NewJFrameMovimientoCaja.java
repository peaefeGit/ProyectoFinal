/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Caja;
import clases.Movimiento;
import clases.MySQL;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author hp desktop
 */
public class NewJFrameMovimientoCaja extends javax.swing.JFrame {
    private MySQL db;
    private NewJFramePrincipal principal;
    private Caja cajaActual;
    private Movimiento m;
    /**
     * Creates new form NewJFrameMovimientoCaja
     */
    public NewJFrameMovimientoCaja(NewJFramePrincipal principal, Caja cajaA, MySQL bd) {
        this.db= bd;
        this.cajaActual = cajaA;
        this.principal = principal;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        //setDefaultCloseOperation(0);//anula la CRUZ exit
        setTitle("Colibrí Arte y Cultura - Movimiento de Caja");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupMovimiento = new javax.swing.ButtonGroup();
        jPanelMovCaja = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabelMonto = new javax.swing.JLabel();
        jTextFieldMonto = new javax.swing.JTextField();
        jButtonMovimiento = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonMenuPrincipal = new javax.swing.JButton();
        jRadioButtonDeposito = new javax.swing.JRadioButton();
        jRadioButtonExtraccion = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMovCaja.setBackground(new java.awt.Color(109, 176, 248));
        jPanelMovCaja.setForeground(new java.awt.Color(109, 176, 248));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitulo.setText("Movimiento de Caja");

        jLabelDescripcion.setText("Descripcion del movimiento");

        jTextFieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescripcionActionPerformed(evt);
            }
        });
        jTextFieldDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescripcionKeyTyped(evt);
            }
        });

        jLabelMonto.setText("Monto        $");

        jTextFieldMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMontoKeyTyped(evt);
            }
        });

        jButtonMovimiento.setText("Realizar Movimiento");
        jButtonMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMovimientoActionPerformed(evt);
            }
        });

        jLabelUsuario.setText("Usuario");

        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyTyped(evt);
            }
        });

        jLabelPassword.setText("Contraseña");

        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyTyped(evt);
            }
        });

        jButtonMenuPrincipal.setText("Menu Principal");
        jButtonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuPrincipalActionPerformed(evt);
            }
        });

        jRadioButtonDeposito.setBackground(new java.awt.Color(109, 176, 248));
        buttonGroupMovimiento.add(jRadioButtonDeposito);
        jRadioButtonDeposito.setText("Depósito");

        jRadioButtonExtraccion.setBackground(new java.awt.Color(109, 176, 248));
        buttonGroupMovimiento.add(jRadioButtonExtraccion);
        jRadioButtonExtraccion.setText("Extracción");

        javax.swing.GroupLayout jPanelMovCajaLayout = new javax.swing.GroupLayout(jPanelMovCaja);
        jPanelMovCaja.setLayout(jPanelMovCajaLayout);
        jPanelMovCajaLayout.setHorizontalGroup(
            jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMovCajaLayout.createSequentialGroup()
                .addGroup(jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMovCajaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMovimiento))
                    .addGroup(jPanelMovCajaLayout.createSequentialGroup()
                        .addGroup(jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMovCajaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelMovCajaLayout.createSequentialGroup()
                                        .addComponent(jLabelDescripcion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelMovCajaLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelMovCajaLayout.createSequentialGroup()
                                                .addGroup(jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelMonto)
                                                    .addComponent(jLabelUsuario))
                                                .addGroup(jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanelMovCajaLayout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanelMovCajaLayout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanelMovCajaLayout.createSequentialGroup()
                                                .addComponent(jLabelPassword)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelMovCajaLayout.createSequentialGroup()
                                                .addComponent(jRadioButtonDeposito)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButtonExtraccion))))))
                            .addGroup(jPanelMovCajaLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabelTitulo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMovCajaLayout.setVerticalGroup(
            jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMovCajaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulo)
                .addGap(35, 35, 35)
                .addGroup(jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescripcion)
                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonDeposito)
                    .addComponent(jRadioButtonExtraccion))
                .addGap(7, 7, 7)
                .addGroup(jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMonto)
                    .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanelMovCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMovimiento)
                    .addComponent(jButtonMenuPrincipal))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMovCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMovCaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescripcionActionPerformed

    private void jButtonMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMovimientoActionPerformed
         try{ 
            // falta la parte de la validacion de usuario
                int eleccion = JOptionPane.showConfirmDialog(null," ¿ DESEA REALIZAR EL MOVIMIENTO ? ", "CERRAR CUENTA ", JOptionPane.WARNING_MESSAGE);
                if (eleccion == JOptionPane.YES_OPTION){
                    boolean actual = this.db.validarLogin(jPasswordField, jTextFieldUsuario);
                    if (actual){  
                         String movStr = jTextFieldMonto.getText();
                         Double mov = Double.parseDouble(movStr);
                         java.util.Date dt = new java.util.Date();
                         java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm");
                         String fecha = sdf.format(dt);
                         System.out.println(fecha);
                         if (jRadioButtonDeposito.isSelected()){
                            cajaActual.setMonto(cajaActual.getMonto() + mov);
                            cajaActual.getMovimiento().add("+"+jTextFieldDescripcion.getText()+"##"+jTextFieldUsuario.getText());
                            JOptionPane.showMessageDialog(null, " MOVIMIENTO REALIZADO ");
                            String responsable = jTextFieldUsuario.getText();
                             m = new Movimiento (mov, responsable, jTextFieldDescripcion.getText(), fecha, "", "Deposito");
                             System.out.println(responsable);
                             db.guardarMovimiento(m); 
                            jTextFieldMonto.setText("");
                             jTextFieldDescripcion.setText("");
                             jTextFieldUsuario.setText("");
                             jPasswordField.setText(""); 
                             
                             
                        }   else if (jRadioButtonExtraccion.isSelected()){
                            cajaActual.setMonto(cajaActual.getMonto() - mov);
                            cajaActual.getMovimiento().add("-"+jTextFieldDescripcion.getText()+""
                                    + "#"+jTextFieldUsuario.getText());
                            JOptionPane.showMessageDialog(null, " MOVIMIENTO REALIZADO ");
                             m = new Movimiento (mov, jTextFieldUsuario.getText(), jTextFieldDescripcion.getText(), fecha, "", "Extraccion");
                             db.guardarMovimiento(m);
                             jTextFieldMonto.setText("");
                             jTextFieldDescripcion.setText("");
                             jTextFieldUsuario.setText("");
                             jPasswordField.setText("");
                            
                        } else {
                             JOptionPane.showMessageDialog(null, " Debes seleccionar entre Extraccion o Deposito antes de realizar el movimiento ");
                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Error en el ingreso de datos del usuario");
                    }
                }else if (eleccion == JOptionPane.CANCEL_OPTION){
                
                }else if (eleccion == JOptionPane.CLOSED_OPTION){
           
                } 
            
            //prueba en consola
            Iterator<String> itr = this.cajaActual.getMovimiento().iterator();
            while (itr.hasNext()) {
               String element = itr.next();
               System.out.println(element);
            }
            System.out.println(cajaActual.getMonto());
            
            //mensaje operacion exitosa
                     
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "FORMATO INCORRECTO EN EL INGRESO DE DATOS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
       
       
    }//GEN-LAST:event_jButtonMovimientoActionPerformed

    private void jButtonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuPrincipalActionPerformed
       this.principal.setVisible(true);
       dispose();
       
    }//GEN-LAST:event_jButtonMenuPrincipalActionPerformed

    private void jTextFieldMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMontoKeyTyped
       //no deja escribir letras , solamente un solo punto, unicamente deja escribir numeros!
       int k = evt.getKeyChar();
       if ((k >= 46) && (k<= 57) ){
          if (k == 46){
             String dato =  jTextFieldMonto.getText();
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
       }if (k == KeyEvent.VK_ENTER){
           jButtonMovimiento.doClick();
       }
    }//GEN-LAST:event_jTextFieldMontoKeyTyped

    private void jTextFieldDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionKeyTyped
       presEnterMovimientoCaja(evt);
    }//GEN-LAST:event_jTextFieldDescripcionKeyTyped

    private void jTextFieldUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyTyped
        presEnterMovimientoCaja(evt);
    }//GEN-LAST:event_jTextFieldUsuarioKeyTyped

    private void jPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyTyped
        presEnterMovimientoCaja(evt);
    }//GEN-LAST:event_jPasswordFieldKeyTyped
    public void presEnterMovimientoCaja (java.awt.event.KeyEvent evt){
        char teclaPres = evt.getKeyChar();
        if (teclaPres == KeyEvent.VK_ENTER){
           jButtonMovimiento.doClick();
        }
    }
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
            java.util.logging.Logger.getLogger(NewJFrameMovimientoCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameMovimientoCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameMovimientoCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameMovimientoCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameMovimientoCaja(null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupMovimiento;
    private javax.swing.JButton jButtonMenuPrincipal;
    private javax.swing.JButton jButtonMovimiento;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelMonto;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelMovCaja;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JRadioButton jRadioButtonDeposito;
    private javax.swing.JRadioButton jRadioButtonExtraccion;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldMonto;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
