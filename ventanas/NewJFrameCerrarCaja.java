package ventanas;

import clases.Caja;
import clases.MySQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class NewJFrameCerrarCaja extends javax.swing.JFrame {
    private NewJFramePrincipal principal;
    private Caja cajaActual;
    private MySQL bd;
     
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
        jLabelUsuario.setText(jLabelUsuario.getText()+this.cajaActual.getUser().getUser());
        jLabelTotal.setText(jLabelTotal.getText()+this.cajaActual.getMonto().toString());
        jTextAperturaCaja.setText(this.cajaActual.getMontoApertura().toString());
        jTextAperturaCaja.setEditable(false);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCerrarCaja = new javax.swing.JPanel();
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
        jLabelUsuario = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCerrarCaja.setBackground(new java.awt.Color(0, 0, 0));
        jPanelCerrarCaja.setForeground(new java.awt.Color(109, 176, 248));
        jPanelCerrarCaja.setLayout(null);

        jLabelUsuarioA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUsuarioA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuarioA.setText("Usuario: ");
        jPanelCerrarCaja.add(jLabelUsuarioA);
        jLabelUsuarioA.setBounds(30, 440, 70, 20);

        jTextFieldUsuarioA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioAKeyTyped(evt);
            }
        });
        jPanelCerrarCaja.add(jTextFieldUsuarioA);
        jTextFieldUsuarioA.setBounds(80, 440, 150, 20);

        jLabelPasswordA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPasswordA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPasswordA.setText("Contraseña: ");
        jPanelCerrarCaja.add(jLabelPasswordA);
        jLabelPasswordA.setBounds(10, 470, 90, 20);

        jLabelTituloUsuarioA.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelTituloUsuarioA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloUsuarioA.setText("Usuario Actual");
        jPanelCerrarCaja.add(jLabelTituloUsuarioA);
        jLabelTituloUsuarioA.setBounds(100, 420, 140, 16);

        jLabelUsuarioP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUsuarioP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuarioP.setText("Usuario: ");
        jPanelCerrarCaja.add(jLabelUsuarioP);
        jLabelUsuarioP.setBounds(420, 440, 60, 14);

        jTextFieldUsuarioP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioPKeyTyped(evt);
            }
        });
        jPanelCerrarCaja.add(jTextFieldUsuarioP);
        jTextFieldUsuarioP.setBounds(470, 440, 151, 20);

        jLabelPasswordP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPasswordP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPasswordP.setText("Contraseña: ");
        jPanelCerrarCaja.add(jLabelPasswordP);
        jLabelPasswordP.setBounds(400, 470, 80, 14);

        jLabelTituloUsuarioP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelTituloUsuarioP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloUsuarioP.setText("Proximo Usuario ");
        jPanelCerrarCaja.add(jLabelTituloUsuarioP);
        jLabelTituloUsuarioP.setBounds(470, 420, 150, 16);

        jButtonCerrarCaja.setText("Cerrar Caja");
        jButtonCerrarCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCerrarCajaMouseClicked(evt);
            }
        });
        jButtonCerrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarCajaActionPerformed(evt);
            }
        });
        jPanelCerrarCaja.add(jButtonCerrarCaja);
        jButtonCerrarCaja.setBounds(551, 628, 100, 23);

        jScrollPaneVenta.setViewportView(jListVenta);

        jPanelCerrarCaja.add(jScrollPaneVenta);
        jScrollPaneVenta.setBounds(360, 110, 261, 270);

        jLabelAperturaCaja.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAperturaCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAperturaCaja.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAperturaCaja.setText("Apertura de caja");
        jPanelCerrarCaja.add(jLabelAperturaCaja);
        jLabelAperturaCaja.setBounds(10, 90, 140, 15);

        jLabelVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVenta.setText("Ventas");
        jPanelCerrarCaja.add(jLabelVenta);
        jLabelVenta.setBounds(360, 90, 70, 15);

        jLabelGasto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelGasto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGasto.setText("Gastos / Egresos");
        jPanelCerrarCaja.add(jLabelGasto);
        jLabelGasto.setBounds(10, 160, 140, 15);

        jScrollPaneGasto.setViewportView(jListGasto);

        jPanelCerrarCaja.add(jScrollPaneGasto);
        jScrollPaneGasto.setBounds(10, 180, 253, 200);

        jPasswordFieldActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldActualKeyTyped(evt);
            }
        });
        jPanelCerrarCaja.add(jPasswordFieldActual);
        jPasswordFieldActual.setBounds(80, 470, 150, 20);

        jPasswordFieldUsuarioP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldUsuarioPKeyTyped(evt);
            }
        });
        jPanelCerrarCaja.add(jPasswordFieldUsuarioP);
        jPasswordFieldUsuarioP.setBounds(470, 470, 151, 20);

        jButtonMenuPrincipal.setText("Menu Principal");
        jButtonMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMenuPrincipalMouseClicked(evt);
            }
        });
        jPanelCerrarCaja.add(jButtonMenuPrincipal);
        jButtonMenuPrincipal.setBounds(406, 628, 138, 23);

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotal.setText("TOTAL: $");
        jPanelCerrarCaja.add(jLabelTotal);
        jLabelTotal.setBounds(10, 390, 170, 15);

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
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
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

        jPanelCerrarCaja.add(jPanelProxCaja);
        jPanelProxCaja.setBounds(10, 510, 641, 110);
        jPanelCerrarCaja.add(jTextAperturaCaja);
        jTextAperturaCaja.setBounds(10, 110, 253, 28);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario: ");
        jPanelCerrarCaja.add(jLabelUsuario);
        jLabelUsuario.setBounds(530, 60, 120, 17);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarcaja3.png"))); // NOI18N
        jPanelCerrarCaja.add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 674, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCerrarCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMenuPrincipalMouseClicked
       this.principal.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonMenuPrincipalMouseClicked

    private void jButtonCerrarCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCerrarCajaMouseClicked
      //borrar
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
       //borrAR
    }//GEN-LAST:event_jButtonConfirmarMouseClicked

    private void jTextFieldUsuarioAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioAKeyTyped
       presEnterCerrarCaja(evt);        
    }//GEN-LAST:event_jTextFieldUsuarioAKeyTyped

    private void jPasswordFieldActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldActualKeyTyped
       presEnterCerrarCaja(evt);
    }//GEN-LAST:event_jPasswordFieldActualKeyTyped

    private void jTextFieldUsuarioPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioPKeyTyped
        presEnterCerrarCaja(evt);
    }//GEN-LAST:event_jTextFieldUsuarioPKeyTyped

    private void jPasswordFieldUsuarioPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldUsuarioPKeyTyped
        presEnterCerrarCaja(evt);
    }//GEN-LAST:event_jPasswordFieldUsuarioPKeyTyped

    private void jButtonCerrarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarCajaActionPerformed
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
    }//GEN-LAST:event_jButtonCerrarCajaActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
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
    }//GEN-LAST:event_jButtonConfirmarActionPerformed
    public void presEnterCerrarCaja (java.awt.event.KeyEvent evt){
        char teclaPres = evt.getKeyChar();
        if (teclaPres == KeyEvent.VK_ENTER){
           jButtonCerrarCaja.doClick();
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
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGasto;
    private javax.swing.JLabel jLabelPasswordA;
    private javax.swing.JLabel jLabelPasswordP;
    private javax.swing.JLabel jLabelProxCaja;
    private javax.swing.JLabel jLabelRetEfectivo;
    private javax.swing.JLabel jLabelTituloUsuarioA;
    private javax.swing.JLabel jLabelTituloUsuarioP;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelUsuario;
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
