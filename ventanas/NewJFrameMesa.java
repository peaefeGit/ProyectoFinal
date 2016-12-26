/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Caja;
import clases.Cuenta;
import clases.Movimiento;
import clases.MySQL;
import clases.Producto;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hp desktop
 */

public class NewJFrameMesa extends javax.swing.JFrame {
    private NewJFramePrincipal principal;
    private JButton btn;
    private MySQL db;
    private Caja cajaActual;
    private String ultimoBoton = "prueba";
    private Double total;
    private Movimiento m;
    private ArrayList<Producto> prodList = new ArrayList<Producto>();
    //traje la caja hasta aca solamente. falta sumar precios de productos en la cuenta
    
    public NewJFrameMesa(NewJFramePrincipal principal, MySQL db, JButton btn, Caja cajaA) {
        this.cajaActual= cajaA;
        System.out.println(cajaActual.getIdCaja());
        this.btn = btn;
        this.db = db;
        this.principal = principal;        
        this.total = 0.0;
        initComponents();        
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);//anula la CRUZ exit
        setTitle("Colibrí Arte y Cultura - Cuenta");     
        
        //llena lista base datos
        db.llenarJlist(jListPlato);
        //botones transparantes
             
        jButtonDescuento.setContentAreaFilled(false);
        jButtonDescuento.setBorderPainted(false);

        jButtonBorrar.setContentAreaFilled(false);
        jButtonBorrar.setBorderPainted(false);
        
        jButtonPlato.setContentAreaFilled(false);
        jButtonPlato.setBorderPainted(false);
    
        jButtonIngrediente.setContentAreaFilled(false);
        jButtonIngrediente.setBorderPainted(false);
        
        jButtonCerrarCuenta.setContentAreaFilled(false);
        jButtonCerrarCuenta.setBorderPainted(false);
        
        jButtonBorrarCuenta.setContentAreaFilled(false);
        jButtonBorrarCuenta.setBorderPainted(false);
        
        jButtonMenuPrincipal.setContentAreaFilled(false);
        jButtonMenuPrincipal.setBorderPainted(false);

        jTextFieldTotal.setEditable(false);
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMesa = new javax.swing.JPanel();
        jTextFieldPlato = new javax.swing.JTextField();
        jTextFieldIngrediente = new javax.swing.JTextField();
        jScrollPanePlato = new javax.swing.JScrollPane();
        jListPlato = new javax.swing.JList<>();
        jScrollPaneIngrediente = new javax.swing.JScrollPane();
        jListIngrediente = new javax.swing.JList<>();
        jButtonPlato = new javax.swing.JButton();
        jButtonIngrediente = new javax.swing.JButton();
        jLabelPlato = new javax.swing.JLabel();
        jLabelIngrediente = new javax.swing.JLabel();
        jPanelCuenta = new javax.swing.JPanel();
        jButtonBorrar = new javax.swing.JButton();
        jButtonDescuento = new javax.swing.JButton();
        jButtonCerrarCuenta = new javax.swing.JButton();
        jLabelCuenta = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCuenta = new javax.swing.JTable();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabelMesa = new javax.swing.JLabel();
        jTextFieldMesa = new javax.swing.JTextField();
        jCheckBoxMesa = new javax.swing.JCheckBox();
        jButtonMenuPrincipal = new javax.swing.JButton();
        jButtonBorrarCuenta = new javax.swing.JButton();
        jButtonBebidas = new javax.swing.JButton();
        jButtonPostre = new javax.swing.JButton();
        jButtonCafeteria = new javax.swing.JButton();
        jButtonPanqueque = new javax.swing.JButton();
        jButtonTortilla = new javax.swing.JButton();
        jButtonPan1 = new javax.swing.JButton();
        jButtonHamburgesa = new javax.swing.JButton();
        jButtonFritas = new javax.swing.JButton();
        jButtonEnsalada = new javax.swing.JButton();
        jButtonPastas = new javax.swing.JButton();
        jButtonMilanesas = new javax.swing.JButton();
        jButtonPiza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMesa.setBackground(new java.awt.Color(151, 108, 59));
        jPanelMesa.setLayout(null);

        jTextFieldPlato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPlatoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPlatoKeyReleased(evt);
            }
        });
        jPanelMesa.add(jTextFieldPlato);
        jTextFieldPlato.setBounds(269, 110, 137, 20);
        jPanelMesa.add(jTextFieldIngrediente);
        jTextFieldIngrediente.setBounds(416, 110, 125, 20);

        jListPlato.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if(evt.getClickCount()==2){
                    String opcion = jListPlato.getSelectedValue();
                    Producto p = db.getProducto(opcion);//FALTA DEFINICION
                    total = total + p.getPrecio();
                    jTextFieldTotal.setText(total.toString() );
                    DefaultTableModel model = (DefaultTableModel) jTableCuenta.getModel();
                    Object[] row = new Object[3];
                    row[0] = p.getNombre();
                    row[1] =  1;
                    row[2] =  p.getPrecio();
                    model.addRow(row);
                    jTableCuenta.setModel(model);
                }
            }
        });
        jScrollPanePlato.setViewportView(jListPlato);

        jPanelMesa.add(jScrollPanePlato);
        jScrollPanePlato.setBounds(269, 144, 137, 183);

        jListIngrediente.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if(evt.getClickCount()==2){
                    String opcion = jListIngrediente.getSelectedValue();
                    Producto p = db.getProducto(opcion);//FALTA DEFINICION
                    total = total + p.getPrecio();
                    jTextFieldTotal.setText(total.toString() );
                    DefaultTableModel model = (DefaultTableModel) jTableCuenta.getModel();
                    Object[] row = new Object[3];
                    row[0] = p.getNombre();
                    row[1] =  1;
                    row[2] =  p.getPrecio();
                    model.addRow(row);
                    jTableCuenta.setModel(model);
                }
            }
        });
        jScrollPaneIngrediente.setViewportView(jListIngrediente);

        jPanelMesa.add(jScrollPaneIngrediente);
        jScrollPaneIngrediente.setBounds(416, 144, 125, 183);

        jButtonPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        jButtonPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPlatoMouseClicked(evt);
            }
        });
        jButtonPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlatoActionPerformed(evt);
            }
        });
        jPanelMesa.add(jButtonPlato);
        jButtonPlato.setBounds(310, 330, 60, 40);

        jButtonIngrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        jButtonIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngredienteActionPerformed(evt);
            }
        });
        jPanelMesa.add(jButtonIngrediente);
        jButtonIngrediente.setBounds(450, 330, 60, 40);

        jLabelPlato.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlato.setText("Buscar");
        jPanelMesa.add(jLabelPlato);
        jLabelPlato.setBounds(269, 90, 60, 14);

        jLabelIngrediente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIngrediente.setText("Buscar");
        jPanelMesa.add(jLabelIngrediente);
        jLabelIngrediente.setBounds(416, 90, 120, 14);

        jPanelCuenta.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCuenta.setLayout(null);

        jButtonBorrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBorrarMouseClicked(evt);
            }
        });
        jPanelCuenta.add(jButtonBorrar);
        jButtonBorrar.setBounds(340, 30, 80, 50);

        jButtonDescuento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonDescuento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descuento.png"))); // NOI18N
        jButtonDescuento.setText("Descuento");
        jButtonDescuento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDescuento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescuentoActionPerformed(evt);
            }
        });
        jPanelCuenta.add(jButtonDescuento);
        jButtonDescuento.setBounds(330, 90, 100, 60);

        jButtonCerrarCuenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCerrarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarcaja.png"))); // NOI18N
        jButtonCerrarCuenta.setText("Cerrar Cuenta");
        jButtonCerrarCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCerrarCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCerrarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCerrarCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCerrarCuentaMouseEntered(evt);
            }
        });
        jButtonCerrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarCuentaActionPerformed(evt);
            }
        });
        jPanelCuenta.add(jButtonCerrarCuenta);
        jButtonCerrarCuenta.setBounds(310, 230, 120, 80);

        jLabelCuenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCuenta.setText("CUENTA");
        jPanelCuenta.add(jLabelCuenta);
        jLabelCuenta.setBounds(161, 6, 47, 15);

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTotal.setText("TOTAL: $ ");
        jPanelCuenta.add(jLabelTotal);
        jLabelTotal.setBounds(10, 263, 52, 14);

        jTableCuenta = new javax.swing.JTable() {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTableCuenta);

        jPanelCuenta.add(jScrollPane1);
        jScrollPane1.setBounds(10, 32, 300, 221);

        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });
        jPanelCuenta.add(jTextFieldTotal);
        jTextFieldTotal.setBounds(66, 260, 84, 20);

        jPanelMesa.add(jPanelCuenta);
        jPanelCuenta.setBounds(559, 100, 430, 310);

        jLabelMesa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMesa.setText("COMENTARIO: ");
        jPanelMesa.add(jLabelMesa);
        jLabelMesa.setBounds(315, 14, 90, 14);

        jTextFieldMesa.setText(this.btn.getText());
        jTextFieldMesa.setEditable(false);
        jPanelMesa.add(jTextFieldMesa);
        jTextFieldMesa.setBounds(409, 11, 180, 20);

        jCheckBoxMesa.setSelected(true);
        jCheckBoxMesa.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxMesa.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMesaMouseClicked(evt);
            }
        });
        jPanelMesa.add(jCheckBoxMesa);
        jCheckBoxMesa.setBounds(590, 10, 21, 21);

        jButtonMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuPrincipal.png"))); // NOI18N
        jButtonMenuPrincipal.setText("MENU PRINCIPAL");
        jButtonMenuPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMenuPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuPrincipalActionPerformed(evt);
            }
        });
        jPanelMesa.add(jButtonMenuPrincipal);
        jButtonMenuPrincipal.setBounds(580, 420, 146, 80);

        jButtonBorrarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBorrarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarcuenta.png"))); // NOI18N
        jButtonBorrarCuenta.setText("BORRAR CUENTA");
        jButtonBorrarCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBorrarCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonBorrarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBorrarCuentaMouseClicked(evt);
            }
        });
        jPanelMesa.add(jButtonBorrarCuenta);
        jButtonBorrarCuenta.setBounds(430, 420, 140, 80);

        jButtonPiza.setIcon(new ImageIcon("../imagenes/iconoPiza.jpg"));
        jButtonBebidas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoBebidas.jpg"))); // NOI18N
        jButtonBebidas.setText("Bebidas");
        jButtonBebidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBebidas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBebidasActionPerformed(evt);
            }
        });
        jPanelMesa.add(jButtonBebidas);
        jButtonBebidas.setBounds(127, 343, 110, 77);

        jButtonPiza.setIcon(new ImageIcon("../imagenes/iconoPiza.jpg"));
        jButtonPostre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPostre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flan.jpg"))); // NOI18N
        jButtonPostre.setText("Postres");
        jButtonPostre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPostre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPostreActionPerformed(evt);
            }
        });
        jPanelMesa.add(jButtonPostre);
        jButtonPostre.setBounds(127, 426, 110, 77);

        jButtonPiza.setIcon(new ImageIcon("../imagenes/iconoPiza.jpg"));
        jButtonCafeteria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCafeteria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoCafe.jpg"))); // NOI18N
        jButtonCafeteria.setText("Cafeteria");
        jButtonCafeteria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCafeteria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCafeteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCafeteriaActionPerformed(evt);
            }
        });
        jPanelMesa.add(jButtonCafeteria);
        jButtonCafeteria.setBounds(10, 426, 111, 77);

        jButtonPiza.setIcon(new ImageIcon("../imagenes/iconoPiza.jpg"));
        jButtonPanqueque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPanqueque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconPancakes.jpg"))); // NOI18N
        jButtonPanqueque.setText("Panqueques");
        jButtonPanqueque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPanqueque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPanqueque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPanquequeActionPerformed(evt);
            }
        });
        jPanelMesa.add(jButtonPanqueque);
        jButtonPanqueque.setBounds(126, 11, 112, 77);

        jButtonTortilla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTortilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tortilla.jpg"))); // NOI18N
        jButtonTortilla.setText("Tortillas");
        jButtonTortilla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTortilla.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonTortilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTortillaActionPerformed(evt);
            }
        });
        jPanelMesa.add(jButtonTortilla);
        jButtonTortilla.setBounds(10, 94, 110, 77);

        jButtonPan1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pan.jpg"))); // NOI18N
        jButtonPan1.setText("Pan de 10");
        jButtonPan1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPan1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPan1ActionPerformed(evt);
            }
        });
        jButtonPan1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButtonPan1KeyReleased(evt);
            }
        });
        jPanelMesa.add(jButtonPan1);
        jButtonPan1.setBounds(11, 11, 109, 77);

        jButtonHamburgesa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonHamburgesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hamburgesa.jpg"))); // NOI18N
        jButtonHamburgesa.setText("Hamburgesa");
        jButtonHamburgesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonHamburgesa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelMesa.add(jButtonHamburgesa);
        jButtonHamburgesa.setBounds(127, 177, 112, 77);

        jButtonFritas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonFritas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fritas.jpg"))); // NOI18N
        jButtonFritas.setText("Papa fritas");
        jButtonFritas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFritas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonFritas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFritasActionPerformed(evt);
            }
        });
        jPanelMesa.add(jButtonFritas);
        jButtonFritas.setBounds(10, 343, 110, 77);

        jButtonEnsalada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEnsalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ensalada.png"))); // NOI18N
        jButtonEnsalada.setText("Ensaladas");
        jButtonEnsalada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEnsalada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEnsalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnsaladaActionPerformed(evt);
            }
        });
        jPanelMesa.add(jButtonEnsalada);
        jButtonEnsalada.setBounds(127, 260, 111, 77);

        jButtonPastas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPastas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tallarines.jpg"))); // NOI18N
        jButtonPastas.setText("Pastas");
        jButtonPastas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPastas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPastas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPastasActionPerformed(evt);
            }
        });
        jPanelMesa.add(jButtonPastas);
        jButtonPastas.setBounds(10, 177, 111, 77);

        jButtonPiza.setIcon(new ImageIcon("../imagenes/iconoPiza.jpg"));
        jButtonMilanesas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonMilanesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/milanesa.jpg"))); // NOI18N
        jButtonMilanesas.setText("Milanesas");
        jButtonMilanesas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMilanesas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelMesa.add(jButtonMilanesas);
        jButtonMilanesas.setBounds(10, 260, 110, 77);

        jButtonPiza.setIcon(new ImageIcon("../imagenes/iconoPiza.jpg"));
        jButtonPiza.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/piza.jpg"))); // NOI18N
        jButtonPiza.setText("Pizza");
        jButtonPiza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPiza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPizaActionPerformed(evt);
            }
        });
        jPanelMesa.add(jButtonPiza);
        jButtonPiza.setBounds(126, 94, 112, 77);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuenta.png"))); // NOI18N
        jPanelMesa.add(jLabel1);
        jLabel1.setBounds(0, 0, 1040, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuPrincipalActionPerformed
       this.principal.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuPrincipalActionPerformed

    private void jButtonCerrarCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCerrarCuentaMouseEntered
    
        //lo hice al pedo!
    }//GEN-LAST:event_jButtonCerrarCuentaMouseEntered

    private void jButtonCerrarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCerrarCuentaMouseClicked
       int eleccion = JOptionPane.showConfirmDialog(null,jLabelTotal.getText()+jTextFieldTotal.getText(), " CERRAR CUENTA ", JOptionPane.WARNING_MESSAGE);
       if (eleccion == JOptionPane.YES_OPTION){
           //Date d = new Date();
           //java.sql.Date fecha = new java.sql.Date(d.getTime());
           
           java.util.Date dt = new java.util.Date();
           java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm");
           String fecha = sdf.format(dt);         
           
           m = new Movimiento (total, cajaActual.getUser().getUser(), "", fecha, "", "Venta", cajaActual.getIdCaja());
           db.guardarMovimiento(m);
           int idMov = db.recuperarIdMov();
           for (int i = 0; i < prodList.size(); i++){
               db.guardarMovProd(idMov, prodList.get(i).getIdProducto());
           }
           
           this.cajaActual.setMonto(this.cajaActual.getMonto()+ total);
           this.btn.setBackground(Color.green);
           this.principal.setVisible(true);
           this.principal.getMesas().remove(btn);
           this.dispose();      
       }else if (eleccion == JOptionPane.CANCEL_OPTION){
           
       }else if (eleccion == JOptionPane.CLOSED_OPTION){
           
       }
    }//GEN-LAST:event_jButtonCerrarCuentaMouseClicked

    private void jCheckBoxMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMesaMouseClicked
        if (jCheckBoxMesa.isSelected()){
            jTextFieldMesa.setEditable(false);
        }else{
            jTextFieldMesa.setEditable(true);
        }
    }//GEN-LAST:event_jCheckBoxMesaMouseClicked

    private void jButtonPlatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPlatoMouseClicked
    try{ 
        if (jListPlato.isSelectionEmpty()){
            jButtonPlato.disable();
        }else{
        String opcion = jListPlato.getSelectedValue();
        System.out.println(opcion);
        Producto p = db.getProducto(opcion);
        System.out.println(p.getIdProducto());
        prodList.add(p);
        total = total + p.getPrecio();
        jTextFieldTotal.setText(total.toString() );
       
        
        DefaultTableModel model = (DefaultTableModel) jTableCuenta.getModel();
        Object[] row = new Object[3];
        row[0] = p.getNombre();
        row[1] =  1;
        row[2] =  p.getPrecio();
        model.addRow(row);
        jTableCuenta.setModel(model); 
        }
        
        //float precio = db.getPrecioProd(opcion);
        //DefaultListModel  modelo = (DefaultListModel) jListCuenta.getModel();
        //modelo.addElement(precio);
        //jListCuenta.setModel(modelo);
    }catch(Exception e){
        
    }
    }//GEN-LAST:event_jButtonPlatoMouseClicked
    public JButton getButton(){
        return this.btn;
    }
    private void jButtonBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBorrarMouseClicked
    try{    
        int i = jTableCuenta.getSelectedRow();
        String opcion = jTableCuenta.getModel().getValueAt(i,0).toString();
        System.out.println(opcion);
        Producto p = db.getProducto(opcion);       
        prodList.remove(i);
        DefaultTableModel model = (DefaultTableModel) jTableCuenta.getModel();
        total = total - (float) jTableCuenta.getValueAt(i, 2);
        jTextFieldTotal.setText(total.toString());
        model.removeRow(i);
        
        
        /*String opcion = jListCuenta.getSelectedValue();
        System.out.println(opcion);
        DefaultListModel  modelo = (DefaultListModel) jListCuenta.getModel();
        modelo.removeElement(opcion);
        jListCuenta.setModel(modelo);  */
    }catch(Exception e){
        
    }
    }//GEN-LAST:event_jButtonBorrarMouseClicked

    private void jButtonBorrarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBorrarCuentaMouseClicked
       int eleccion = JOptionPane.showConfirmDialog(null,"¿ DESEA ELIMINAR LA CUENTA ? ", " BORRAR CUENTA ", JOptionPane.WARNING_MESSAGE);     
       if (eleccion == JOptionPane.YES_OPTION){
           
           this.btn.setBackground(Color.green);
           this.principal.setVisible(true);
           this.principal.getMesas().remove(btn);
           this.dispose();
       }else if (eleccion == JOptionPane.CANCEL_OPTION){
           
       }else if (eleccion == JOptionPane.CLOSED_OPTION){
           
       }
    }//GEN-LAST:event_jButtonBorrarCuentaMouseClicked

    private void jTextFieldPlatoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPlatoKeyPressed
       
    }//GEN-LAST:event_jTextFieldPlatoKeyPressed

    private void jButtonTortillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTortillaActionPerformed
         db.buscarPorCategoria(jListPlato, jButtonTortilla.getText());
         ultimoBoton = jButtonTortilla.getText();
    }//GEN-LAST:event_jButtonTortillaActionPerformed

    private void jButtonPan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPan1ActionPerformed
         db.buscarPorCategoria(jListPlato, jButtonPan1.getText());
         ultimoBoton = jButtonPan1.getText();
    }//GEN-LAST:event_jButtonPan1ActionPerformed

    private void jButtonPanquequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPanquequeActionPerformed
        db.buscarPorCategoria(jListPlato, jButtonPanqueque.getText()); 
        ultimoBoton = jButtonPanqueque.getText();
    }//GEN-LAST:event_jButtonPanquequeActionPerformed

    private void jButtonCafeteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCafeteriaActionPerformed
         db.buscarPorCategoria(jListPlato, jButtonCafeteria.getText());
         ultimoBoton = jButtonCafeteria.getText();
    }//GEN-LAST:event_jButtonCafeteriaActionPerformed

    private void jButtonPizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPizaActionPerformed
         db.buscarPorCategoria(jListPlato, jButtonPiza.getText());
         ultimoBoton = jButtonPiza.getText();
    }//GEN-LAST:event_jButtonPizaActionPerformed

    private void jButtonPan1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonPan1KeyReleased
               // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPan1KeyReleased

    private void jButtonPastasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPastasActionPerformed
         db.buscarPorCategoria(jListPlato, jButtonPastas.getText());
         ultimoBoton = jButtonPastas.getText();
    }//GEN-LAST:event_jButtonPastasActionPerformed

    private void jButtonEnsaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnsaladaActionPerformed
         db.buscarPorCategoria(jListPlato, jButtonEnsalada.getText());
         ultimoBoton = jButtonEnsalada.getText();
    }//GEN-LAST:event_jButtonEnsaladaActionPerformed

    private void jButtonFritasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFritasActionPerformed
        db.buscarPorCategoria(jListPlato, jButtonFritas.getText());
        ultimoBoton = jButtonFritas.getText();
    }//GEN-LAST:event_jButtonFritasActionPerformed

    private void jButtonBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBebidasActionPerformed
        db.buscarPorCategoria(jListPlato, jButtonBebidas.getText());
        ultimoBoton = jButtonBebidas.getText();
    }//GEN-LAST:event_jButtonBebidasActionPerformed

    private void jButtonPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPostreActionPerformed
        db.buscarPorCategoria(jListPlato, jButtonPostre.getText());
        ultimoBoton = jButtonPostre.getText();
    }//GEN-LAST:event_jButtonPostreActionPerformed

    private void jTextFieldPlatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPlatoKeyReleased
       db.buscarPlatos(jListPlato, jTextFieldPlato.getText(), ultimoBoton);       
    }//GEN-LAST:event_jTextFieldPlatoKeyReleased

    private void jButtonPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPlatoActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jButtonCerrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarCuentaActionPerformed
            
    }//GEN-LAST:event_jButtonCerrarCuentaActionPerformed

    private void jButtonIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngredienteActionPerformed
       try{ 
        if (jListIngrediente.isSelectionEmpty()){
            jButtonIngrediente.disable();
        }else{
           String opcion = jListIngrediente.getSelectedValue();
        //System.out.println(opcion);
        Producto p = db.getProducto(opcion);//FALTA DEFINICION
        total = total + p.getPrecio();
        jTextFieldTotal.setText(total.toString() );
        //System.out.println(p.toString());
        
        DefaultTableModel model = (DefaultTableModel) jTableCuenta.getModel();
        Object[] row = new Object[3];
        row[0] = p.getNombre();
        row[1] =  1;
        row[2] =  p.getPrecio();
        model.addRow(row);
        jTableCuenta.setModel(model); 
        }
        
        //float precio = db.getPrecioProd(opcion);
        //DefaultListModel  modelo = (DefaultListModel) jListCuenta.getModel();
        //modelo.addElement(precio);
        //jListCuenta.setModel(modelo);
    }catch(Exception e){
        
    }
    }//GEN-LAST:event_jButtonIngredienteActionPerformed

    private void jButtonDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDescuentoActionPerformed
    try{
        String response = JOptionPane.showInputDialog(null, "PORCENTAJE DE DESCUENTO (%)", "Descuento", JOptionPane.QUESTION_MESSAGE);
        Double desc = Double.parseDouble(response);
        desc = desc/100;
        desc = total*desc;
        total = total-desc;
        jTextFieldTotal.setText(total.toString() );
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, " ERROR ");
        
    }    
    }//GEN-LAST:event_jButtonDescuentoActionPerformed



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
            java.util.logging.Logger.getLogger(NewJFrameMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameMesa(null,null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBebidas;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBorrarCuenta;
    private javax.swing.JButton jButtonCafeteria;
    private javax.swing.JButton jButtonCerrarCuenta;
    private javax.swing.JButton jButtonDescuento;
    private javax.swing.JButton jButtonEnsalada;
    private javax.swing.JButton jButtonFritas;
    private javax.swing.JButton jButtonHamburgesa;
    private javax.swing.JButton jButtonIngrediente;
    private javax.swing.JButton jButtonMenuPrincipal;
    private javax.swing.JButton jButtonMilanesas;
    private javax.swing.JButton jButtonPan1;
    private javax.swing.JButton jButtonPanqueque;
    private javax.swing.JButton jButtonPastas;
    private javax.swing.JButton jButtonPiza;
    private javax.swing.JButton jButtonPlato;
    private javax.swing.JButton jButtonPostre;
    private javax.swing.JButton jButtonTortilla;
    private javax.swing.JCheckBox jCheckBoxMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCuenta;
    private javax.swing.JLabel jLabelIngrediente;
    private javax.swing.JLabel jLabelMesa;
    private javax.swing.JLabel jLabelPlato;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JList<String> jListIngrediente;
    private javax.swing.JList<String> jListPlato;
    private javax.swing.JPanel jPanelCuenta;
    private javax.swing.JPanel jPanelMesa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneIngrediente;
    private javax.swing.JScrollPane jScrollPanePlato;
    private javax.swing.JTable jTableCuenta;
    private javax.swing.JTextField jTextFieldIngrediente;
    private javax.swing.JTextField jTextFieldMesa;
    private javax.swing.JTextField jTextFieldPlato;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
