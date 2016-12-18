/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Caja;

/**
 *
 * @author hp desktop
 */
public class NewJFrameVerCaja extends javax.swing.JFrame {
    private NewJFramePrincipal principal;
    private Caja cajaActual;
    /**
     * Creates new form NewJFrameVerCaja
     */
    public NewJFrameVerCaja(NewJFramePrincipal principal, Caja cajaA) {
        this.cajaActual = cajaA;
        this.principal = principal;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        //setDefaultCloseOperation(0);//anula la CRUZ exit
        setTitle("Colibrí Arte y Cultura - Ver Caja");
        //buscarle lugar! aca no va!
        jTextFieldApertura.setText(this.cajaActual.getMontoApertura().toString());
        jTextFieldApertura.setEditable(false);
        jLabelTotal.setText(jLabelTotal.getText()+this.cajaActual.getMonto().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCaja = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAperturaCaja = new javax.swing.JLabel();
        jLabelGasto = new javax.swing.JLabel();
        jScrollPaneGasto = new javax.swing.JScrollPane();
        jListGasto = new javax.swing.JList<>();
        jScrollPaneVenta = new javax.swing.JScrollPane();
        jListVenta = new javax.swing.JList<>();
        jLabelVenta = new javax.swing.JLabel();
        jButtonCerrar = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jTextFieldApertura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCaja.setBackground(new java.awt.Color(109, 176, 248));
        jPanelCaja.setForeground(new java.awt.Color(109, 176, 248));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitulo.setText("Caja");

        jLabelAperturaCaja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelAperturaCaja.setText("Apertura de caja");

        jLabelGasto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelGasto.setText("Egreso / Gasto");

        jScrollPaneGasto.setViewportView(jListGasto);

        jScrollPaneVenta.setViewportView(jListVenta);

        jLabelVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelVenta.setText("Venta");

        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTotal.setText("Total Parcial: $");

        javax.swing.GroupLayout jPanelCajaLayout = new javax.swing.GroupLayout(jPanelCaja);
        jPanelCaja.setLayout(jPanelCajaLayout);
        jPanelCajaLayout.setHorizontalGroup(
            jPanelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCajaLayout.createSequentialGroup()
                .addGroup(jPanelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCajaLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCajaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCerrar)
                            .addGroup(jPanelCajaLayout.createSequentialGroup()
                                .addGroup(jPanelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelGasto)
                                    .addComponent(jLabelAperturaCaja)
                                    .addComponent(jScrollPaneGasto, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(jTextFieldApertura))
                                .addGap(37, 37, 37)
                                .addGroup(jPanelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelVenta)
                                    .addComponent(jScrollPaneVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelCajaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTotal)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelCajaLayout.setVerticalGroup(
            jPanelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCajaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAperturaCaja)
                    .addComponent(jLabelVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCajaLayout.createSequentialGroup()
                        .addComponent(jTextFieldApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelGasto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButtonCerrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
       this.principal.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrameVerCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameVerCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameVerCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameVerCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameVerCaja(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JLabel jLabelAperturaCaja;
    private javax.swing.JLabel jLabelGasto;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelVenta;
    private javax.swing.JList<String> jListGasto;
    private javax.swing.JList<String> jListVenta;
    public javax.swing.JPanel jPanelCaja;
    private javax.swing.JScrollPane jScrollPaneGasto;
    private javax.swing.JScrollPane jScrollPaneVenta;
    private javax.swing.JTextField jTextFieldApertura;
    // End of variables declaration//GEN-END:variables
}
