/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.MySQL;
import clases.Producto;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author hp desktop
 */
public class NewJFrameEditarMenu extends javax.swing.JFrame {
    private NewJFramePrincipal principal;
    private MySQL db; 
    /**
     * Creates new form NewJFrameEditarMenu
     */
    public NewJFrameEditarMenu(NewJFramePrincipal principal, MySQL bd) {
        this.db= bd;
        this.principal = principal;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Colibrí Arte y Cultura - Editar Menu");
        
        db.llenarJtable(jTableProductos);
        jTableProductos.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        jTableProductos.getColumnModel().getColumn(0).setPreferredWidth(200);
        
        jTableProductos.getSelectionModel().addListSelectionListener(
                new javax.swing.event.ListSelectionListener(){
                    @Override
                     public void valueChanged(ListSelectionEvent evt) {
                        customRowSelectionHandler(evt);
                     }
                    private void customRowSelectionHandler(ListSelectionEvent evt) {
                        jTextFieldProdEdit.setText(jTableProductos.getValueAt(jTableProductos.getSelectedRow(), 0).toString());
                        jTextFieldPrecioEdit.setText(jTableProductos.getValueAt(jTableProductos.getSelectedRow(), 1).toString());
                    }
                }
        );
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanelEditarMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelCambios = new javax.swing.JPanel();
        jLabelProdEdit = new javax.swing.JLabel();
        jLabelPrecioEdit = new javax.swing.JLabel();
        jTextFieldPrecioEdit = new javax.swing.JTextField();
        jTextFieldProdEdit = new javax.swing.JTextField();
        jButtonGuardarCambios = new javax.swing.JButton();
        jButtonEditarPrecio = new javax.swing.JButton();
        jButtonPrincipal = new javax.swing.JButton();
        jLabelProducto = new javax.swing.JLabel();
        jTextFieldProducto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelEditarMenu.setBackground(new java.awt.Color(109, 176, 248));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Editar Menu");

        jPanelCambios.setBackground(new java.awt.Color(0, 204, 255));

        jLabelProdEdit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelProdEdit.setText("Producto: ");

        jLabelPrecioEdit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPrecioEdit.setText("Precio:  $ ");

        jTextFieldPrecioEdit.setEditable(false);
        jTextFieldPrecioEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioEditKeyTyped(evt);
            }
        });

        jTextFieldProdEdit.setEditable(false);

        jButtonGuardarCambios.setText("GUARDAR CAMBIOS");
        jButtonGuardarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGuardarCambiosMouseClicked(evt);
            }
        });

        jButtonEditarPrecio.setBackground(new java.awt.Color(102, 255, 51));
        jButtonEditarPrecio.setText("Editar!");
        jButtonEditarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCambiosLayout = new javax.swing.GroupLayout(jPanelCambios);
        jPanelCambios.setLayout(jPanelCambiosLayout);
        jPanelCambiosLayout.setHorizontalGroup(
            jPanelCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambiosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCambiosLayout.createSequentialGroup()
                        .addGroup(jPanelCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProdEdit)
                            .addComponent(jLabelPrecioEdit))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldProdEdit)
                            .addGroup(jPanelCambiosLayout.createSequentialGroup()
                                .addComponent(jTextFieldPrecioEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEditarPrecio)
                                .addGap(0, 17, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCambiosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelCambiosLayout.setVerticalGroup(
            jPanelCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambiosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProdEdit)
                    .addComponent(jTextFieldProdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPrecioEdit)
                        .addComponent(jTextFieldPrecioEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEditarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jButtonGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jButtonPrincipal.setText("MENU PRINCIPAL");
        jButtonPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrincipalActionPerformed(evt);
            }
        });

        jLabelProducto.setText("Buscar Productos");

        jTableProductos = new javax.swing.JTable() {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(

            new Object [][] {

            },
            new String [] {
                "Producto", "Precio"
            }
        ));
        jTableProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableProductos);

        javax.swing.GroupLayout jPanelEditarMenuLayout = new javax.swing.GroupLayout(jPanelEditarMenu);
        jPanelEditarMenu.setLayout(jPanelEditarMenuLayout);
        jPanelEditarMenuLayout.setHorizontalGroup(
            jPanelEditarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarMenuLayout.createSequentialGroup()
                .addGroup(jPanelEditarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEditarMenuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanelEditarMenuLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanelEditarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelEditarMenuLayout.createSequentialGroup()
                                .addComponent(jLabelProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanelEditarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditarMenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(jButtonPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129))
                            .addGroup(jPanelEditarMenuLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanelCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(26, 26, 26))
        );
        jPanelEditarMenuLayout.setVerticalGroup(
            jPanelEditarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanelEditarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEditarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditarMenuLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanelEditarMenuLayout.createSequentialGroup()
                        .addComponent(jPanelCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEditarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEditarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrincipalActionPerformed
      this.principal.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonPrincipalActionPerformed

    private void jButtonGuardarCambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarCambiosMouseClicked
       try{
            
            String precioSTR = jTextFieldPrecioEdit.getText();
            Float precio = Float.parseFloat(precioSTR);
            int eleccion = JOptionPane.showConfirmDialog(null,"¿ Desea guardar los cambios en "+jTextFieldProdEdit.getText().toUpperCase()+" ? " , " EDITAR PRODUCTO ", JOptionPane.WARNING_MESSAGE);
            if (eleccion == JOptionPane.YES_OPTION){
                Producto p = db.getProducto(jTextFieldProdEdit.getText());
                p.setPrecio(precio);
                db.updateProducto(p);
                jTextFieldPrecioEdit.setEditable(false);
                //guardar cambios en base de datos (precio)
            }else if (eleccion == JOptionPane.CANCEL_OPTION){
           
            }else if (eleccion == JOptionPane.CLOSED_OPTION){
           
            } 
       }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "FORMATO INCORRECTO EN EL INGRESO DE DATOS", "ERROR", JOptionPane.ERROR_MESSAGE);
            
       } 
    }//GEN-LAST:event_jButtonGuardarCambiosMouseClicked

    private void jTextFieldPrecioEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioEditKeyTyped
       //no deja escribir letras , solamente un solo punto, unicamente deja escribir numeros!
       int k = evt.getKeyChar();
       if ((k >= 46) && (k<= 57) ){
          if (k == 46){
             String dato =  jTextFieldPrecioEdit.getText();
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
    }//GEN-LAST:event_jTextFieldPrecioEditKeyTyped

    private void jButtonEditarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarPrecioActionPerformed
        jTextFieldPrecioEdit.setEditable(true);
    }//GEN-LAST:event_jButtonEditarPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrameEditarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameEditarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameEditarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameEditarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameEditarMenu(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditarPrecio;
    private javax.swing.JButton jButtonGuardarCambios;
    private javax.swing.JButton jButtonPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPrecioEdit;
    private javax.swing.JLabel jLabelProdEdit;
    private javax.swing.JLabel jLabelProducto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelCambios;
    private javax.swing.JPanel jPanelEditarMenu;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextFieldPrecioEdit;
    private javax.swing.JTextField jTextFieldProdEdit;
    private javax.swing.JTextField jTextFieldProducto;
    // End of variables declaration//GEN-END:variables
}
