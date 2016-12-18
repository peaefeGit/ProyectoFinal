/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Caja;
import clases.MySQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author hp desktop
 */
public class NewJFrameCerrarCaja extends javax.swing.JFrame {
    private NewJFramePrincipal principal;
    private Caja cajaActual;
    private MySQL bd;
    /**
     * Creates new form NewJFrameCerrarCaja
     */
    public NewJFrameCerrarCaja(NewJFramePrincipal principal, Caja cajaA, MySQL bd) {
        this.bd = bd;
        this.cajaActual = cajaA;
        initComponents();
        this.principal = principal;
        setLocationRelativeTo(null);
        setResizable(false);
        //setDefaultCloseOperation(0);//anula la CRUZ exit
        setTitle("Colibrí Arte y Cultura - Cerrar Caja");
        
        //buscarle lugar! aca no va
        jLabelTotal.setText(jLabelTotal.getText()+this.cajaActual.getMonto().toString());
        jTextAperturaCaja.setText(this.cajaActual.getMontoApertura().toString());
        jTextAperturaCaja.setEditable(false);
         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCerrarCaja = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelUsuarioA = new javax.swing.JLabel();
        jTextFieldUsuarioA = new javax.swing.JTextField();
        jLabelPasswordA = new javax.swing.JLabel();
        jLabelTituloUsuarioA = new javax.swing.JLabel();
        jLabelUsuarioP = new javax.swing.JLabel();
        jTextFieldUsuarioP = new javax.swing.JTextField();
        jLabelPasswordP = new javax.swing.JLabel();
        jLabelTituloUsuarioP = new javax.swing.JLabel();
        jButtonCerrarCaja = new javax.swing.JButton();
        jScrollPaneVenta = new javax.swing.JScrollPane();
        jListVenta = new javax.swing.JList<>();
        jLabelAperturaCaja = new javax.swing.JLabel();
        jLabelVenta = new javax.swing.JLabel();
        jLabelGasto = new javax.swing.JLabel();
        jScrollPaneGasto = new javax.swing.JScrollPane();
        jListGasto = new javax.swing.JList<>();
        jPasswordFieldActual = new javax.swing.JPasswordField();
        jPasswordFieldUsuarioP = new javax.swing.JPasswordField();
        jButtonMenuPrincipal = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jPanelProxCaja = new javax.swing.JPanel();
        jTextFieldProxCaja = new javax.swing.JTextField();
        jLabelProxCaja = new javax.swing.JLabel();
        jLabelRetEfectivo = new javax.swing.JLabel();
        jTextFieldRetEfectivo = new javax.swing.JTextField();
        jTextFieldExtraProxCaja = new javax.swing.JTextField();
        jLabelExtraProxCaja = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jTextAperturaCaja = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCerrarCaja.setBackground(new java.awt.Color(109, 176, 248));
        jPanelCerrarCaja.setForeground(new java.awt.Color(109, 176, 248));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitulo.setText("Cerrar Caja");

        jLabelUsuarioA.setText("Usuario: ");

        jLabelPasswordA.setText("Contraseña: ");

        jLabelTituloUsuarioA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTituloUsuarioA.setText("Usuario Actual");

        jLabelUsuarioP.setText("Usuario: ");

        jLabelPasswordP.setText("Contraseña: ");

        jLabelTituloUsuarioP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTituloUsuarioP.setText("Proximo Usuario ");

        jButtonCerrarCaja.setText("Cerrar Caja");
        jButtonCerrarCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCerrarCajaMouseClicked(evt);
            }
        });

        jScrollPaneVenta.setViewportView(jListVenta);

        jLabelAperturaCaja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelAperturaCaja.setText("Apertura de caja");

        jLabelVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelVenta.setText("Ventas");

        jLabelGasto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelGasto.setText("Gastos / Egresos");

        jScrollPaneGasto.setViewportView(jListGasto);

        jButtonMenuPrincipal.setText("Menu Principal");
        jButtonMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMenuPrincipalMouseClicked(evt);
            }
        });

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTotal.setText("TOTAL: $");

        jTextFieldProxCaja.setEditable(false);
        jTextFieldProxCaja.setText(this.cajaActual.getMonto().toString());
        jTextFieldProxCaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldProxCajaKeyTyped(evt);
            }
        });

        jLabelProxCaja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelProxCaja.setText("Proxima caja");

        jLabelRetEfectivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelRetEfectivo.setText("Retiro de efectivo");

        jTextFieldRetEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRetEfectivoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRetEfectivoKeyTyped(evt);
            }
        });

        jTextFieldExtraProxCaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldExtraProxCajaKeyTyped(evt);
            }
        });

        jLabelExtraProxCaja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelExtraProxCaja.setText("Monto extra proxima caja");

        jButtonConfirmar.setText("Confirmar proxima caja");
        jButtonConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConfirmarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProxCajaLayout = new javax.swing.GroupLayout(jPanelProxCaja);
        jPanelProxCaja.setLayout(jPanelProxCajaLayout);
        jPanelProxCajaLayout.setHorizontalGroup(
            jPanelProxCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProxCajaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProxCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelProxCajaLayout.createSequentialGroup()
                        .addComponent(jLabelRetEfectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRetEfectivo))
                    .addGroup(jPanelProxCajaLayout.createSequentialGroup()
                        .addComponent(jLabelProxCaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldProxCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelProxCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProxCajaLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabelExtraProxCaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldExtraProxCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProxCajaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        jPanelProxCajaLayout.setVerticalGroup(
            jPanelProxCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProxCajaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProxCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProxCajaLayout.createSequentialGroup()
                        .addGroup(jPanelProxCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelProxCaja)
                            .addComponent(jTextFieldProxCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelProxCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRetEfectivo)
                            .addComponent(jTextFieldRetEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelProxCajaLayout.createSequentialGroup()
                        .addGroup(jPanelProxCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelExtraProxCaja)
                            .addComponent(jTextFieldExtraProxCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmar)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanelCerrarCajaLayout = new javax.swing.GroupLayout(jPanelCerrarCaja);
        jPanelCerrarCaja.setLayout(jPanelCerrarCajaLayout);
        jPanelCerrarCajaLayout.setHorizontalGroup(
            jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabelTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCerrarCajaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGasto)
                    .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                        .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPaneGasto, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(jTextAperturaCaja))
                        .addGap(97, 97, 97)
                        .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVenta)))
                    .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                        .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                                .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPasswordA)
                                    .addComponent(jLabelUsuarioA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldUsuarioA)
                                    .addComponent(jPasswordFieldActual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelTituloUsuarioA)
                            .addComponent(jLabelAperturaCaja))
                        .addGap(164, 164, 164)
                        .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTituloUsuarioP)
                            .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                                .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCerrarCajaLayout.createSequentialGroup()
                                        .addComponent(jLabelPasswordP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                                        .addComponent(jLabelUsuarioP)
                                        .addGap(30, 30, 30)))
                                .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldUsuarioP)
                                    .addComponent(jPasswordFieldUsuarioP, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(142, 142, 142))
            .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                        .addComponent(jButtonMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCerrarCaja))
                    .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelTotal)
                        .addComponent(jPanelProxCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCerrarCajaLayout.setVerticalGroup(
            jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabelAperturaCaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextAperturaCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelGasto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneGasto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTotal)
                        .addGap(24, 24, 24)))
                .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                        .addComponent(jLabelTituloUsuarioA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUsuarioA)
                            .addComponent(jTextFieldUsuarioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPasswordA)
                            .addComponent(jPasswordFieldActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCerrarCajaLayout.createSequentialGroup()
                        .addComponent(jLabelTituloUsuarioP)
                        .addGap(11, 11, 11)
                        .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUsuarioP)
                            .addComponent(jTextFieldUsuarioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPasswordP)
                            .addComponent(jPasswordFieldUsuarioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jPanelProxCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanelCerrarCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMenuPrincipal)
                    .addComponent(jButtonCerrarCaja))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCerrarCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMenuPrincipalMouseClicked
       this.principal.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonMenuPrincipalMouseClicked

    private void jButtonCerrarCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCerrarCajaMouseClicked
       boolean ok = false;
        //boton confirmar proxima caja
        if (jButtonConfirmar.getBackground().equals(Color.green)){
            boolean uProx = this.bd.validarLogin(jPasswordFieldUsuarioP, jTextFieldUsuarioP);
            boolean uActual = this.bd.validarLogin(jPasswordFieldActual, jTextFieldUsuarioA);
            if (uProx && uActual){
                ok = true;
            }else{
                JOptionPane.showMessageDialog(null, "ERROR en nombre de usuario o contraseña");
                }
        }else{
            JOptionPane.showMessageDialog(null, "ERROR falta confirmar proxima caja");
        }      
       //si caja cerrada exitosamente
       if (ok){       
            int eleccion = JOptionPane.showConfirmDialog(null," CAJA CERRADA EXITOSAMENTE - desea abrir una nueva caja?", " CERRAR CAJA ", JOptionPane.INFORMATION_MESSAGE);
            if (eleccion == JOptionPane.YES_OPTION){
                String t = jTextFieldProxCaja.getText();
                Double prox = Double.parseDouble(t);
                NewJFrameLogin cc = new NewJFrameLogin(this.bd, prox);
                cc.setVisible(true);
                this.dispose();
            }else if (eleccion == JOptionPane.NO_OPTION){
                this.dispose();
                System.exit(0);
            }else if (eleccion == JOptionPane.CANCEL_OPTION){
                this.dispose();
                System.exit(0);
            }else if (eleccion == JOptionPane.CLOSED_OPTION){
                this.dispose();
                System.exit(0);
            }
       }
    }//GEN-LAST:event_jButtonCerrarCajaMouseClicked

    private void jTextFieldProxCajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProxCajaKeyTyped
       //borrar!
    }//GEN-LAST:event_jTextFieldProxCajaKeyTyped

    private void jTextFieldRetEfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRetEfectivoKeyTyped
       //no deja escribir letras , solamente un solo punto, unicamente deja escribir numeros!
       int k = evt.getKeyChar();
       if ((k >= 46) && (k<= 57) ){
          if (k == 46){
             String dato =  jTextFieldRetEfectivo.getText();
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
           jButtonConfirmar.doClick();
        }
    }//GEN-LAST:event_jTextFieldRetEfectivoKeyTyped

    private void jTextFieldExtraProxCajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldExtraProxCajaKeyTyped
       //no deja escribir letras , solamente un solo punto, unicamente deja escribir numeros!
       int k = evt.getKeyChar();
       if ((k >= 46) && (k<= 57) ){
          if (k == 46){
             String dato =  jTextFieldExtraProxCaja.getText();
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
           jButtonConfirmar.doClick();
        }
    }//GEN-LAST:event_jTextFieldExtraProxCajaKeyTyped

    private void jTextFieldRetEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRetEfectivoKeyReleased
      //borrar!!
    }//GEN-LAST:event_jTextFieldRetEfectivoKeyReleased

    private void jButtonConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarMouseClicked
       try{
        String dato1 = jTextFieldRetEfectivo.getText();
        Double dat1 = Double.parseDouble(dato1);
        String dato2 = jTextFieldExtraProxCaja.getText();
        Double dat2 = Double.parseDouble(dato2);
        Double fin = this.cajaActual.getMonto() - dat1 + dat2;
        jTextFieldProxCaja.setText(fin.toString());
        jButtonConfirmar.setBackground(Color.green);
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR faltan ingresar datos");
       } 
    }//GEN-LAST:event_jButtonConfirmarMouseClicked
    
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
            java.util.logging.Logger.getLogger(NewJFrameCerrarCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameCerrarCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameCerrarCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameCerrarCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameCerrarCaja(null, null, null).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrarCaja;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonMenuPrincipal;
    private javax.swing.JLabel jLabelAperturaCaja;
    private javax.swing.JLabel jLabelExtraProxCaja;
    private javax.swing.JLabel jLabelGasto;
    private javax.swing.JLabel jLabelPasswordA;
    private javax.swing.JLabel jLabelPasswordP;
    private javax.swing.JLabel jLabelProxCaja;
    private javax.swing.JLabel jLabelRetEfectivo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloUsuarioA;
    private javax.swing.JLabel jLabelTituloUsuarioP;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelUsuarioA;
    private javax.swing.JLabel jLabelUsuarioP;
    private javax.swing.JLabel jLabelVenta;
    private javax.swing.JList<String> jListGasto;
    private javax.swing.JList<String> jListVenta;
    private javax.swing.JPanel jPanelCerrarCaja;
    private javax.swing.JPanel jPanelProxCaja;
    private javax.swing.JPasswordField jPasswordFieldActual;
    private javax.swing.JPasswordField jPasswordFieldUsuarioP;
    private javax.swing.JScrollPane jScrollPaneGasto;
    private javax.swing.JScrollPane jScrollPaneVenta;
    private javax.swing.JTextField jTextAperturaCaja;
    private javax.swing.JTextField jTextFieldExtraProxCaja;
    private javax.swing.JTextField jTextFieldProxCaja;
    private javax.swing.JTextField jTextFieldRetEfectivo;
    private javax.swing.JTextField jTextFieldUsuarioA;
    private javax.swing.JTextField jTextFieldUsuarioP;
    // End of variables declaration//GEN-END:variables
}
