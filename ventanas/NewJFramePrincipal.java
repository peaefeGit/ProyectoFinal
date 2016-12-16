/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Caja;
import clases.MySQL;

import java.awt.Color;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author hp desktop
 */
public class NewJFramePrincipal extends javax.swing.JFrame {
    private Hashtable<JButton, NewJFrameMesa> mesas;
    private MySQL db;
    private Caja cajaActual;
    private String prueba;
    
    public NewJFramePrincipal(MySQL db, Caja cajaA) {
        this.cajaActual = cajaA;
        this.mesas = new Hashtable<JButton, NewJFrameMesa>();
        this.db = db;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        //setDefaultCloseOperation(0);//anula la CRUZ exit
        setTitle("Colibrí Arte y Cultura");
        this.jLabelNombreUsuario.setText(this.jLabelNombreUsuario.getText()+this.cajaActual.getUser().getUser());
        
    }
    
    public void crearMesa (JButton btn){
       if (btn.getBackground().equals(Color.green)){
            NewJFrameMesa cc = new NewJFrameMesa(this,this.db, btn, this.cajaActual);
            this.mesas.put(btn,cc);
            cc.setVisible(true);
            this.setVisible(false); 
            btn.setBackground(Color.red);
            btn.setBorderPainted(true);
       }else{
           NewJFrameMesa aux = new NewJFrameMesa(this, this.db, btn, this.cajaActual);
           aux = this.mesas.get(btn);
           aux.setVisible(true);
           this.setVisible(false);
        }
    }
    
     public  Hashtable getMesas (){
        return this.mesas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonEgresosPagos = new javax.swing.JButton();
        jTabbedPaneSalon = new javax.swing.JTabbedPane();
        jPanelSalon1 = new javax.swing.JPanel();
        jButtonM1 = new javax.swing.JButton();
        jButtonM2 = new javax.swing.JButton();
        jButtonM3 = new javax.swing.JButton();
        jButtonM6 = new javax.swing.JButton();
        jButtonM5 = new javax.swing.JButton();
        jButtonM4 = new javax.swing.JButton();
        jButtonM11 = new javax.swing.JButton();
        jButtonM10 = new javax.swing.JButton();
        jButtonM9 = new javax.swing.JButton();
        jButtonM8 = new javax.swing.JButton();
        jButtonM7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonB1 = new javax.swing.JButton();
        jButtonB2 = new javax.swing.JButton();
        jButtonB3 = new javax.swing.JButton();
        jButtonB4 = new javax.swing.JButton();
        jPanelSalon2 = new javax.swing.JPanel();
        jButtonM13 = new javax.swing.JButton();
        jButtonM12 = new javax.swing.JButton();
        jButtonM15 = new javax.swing.JButton();
        jButtonM14 = new javax.swing.JButton();
        jButtonM16 = new javax.swing.JButton();
        jButtonM17 = new javax.swing.JButton();
        jButtonM18 = new javax.swing.JButton();
        jButtonM19 = new javax.swing.JButton();
        jButtonM20 = new javax.swing.JButton();
        jButtonM21 = new javax.swing.JButton();
        jButtonM23 = new javax.swing.JButton();
        jButtonM26 = new javax.swing.JButton();
        jButtonM25 = new javax.swing.JButton();
        jButtonM22 = new javax.swing.JButton();
        jButtonM24 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonM27 = new javax.swing.JButton();
        jButtonM28 = new javax.swing.JButton();
        jButtonM29 = new javax.swing.JButton();
        jButtonM30 = new javax.swing.JButton();
        jButtonM31 = new javax.swing.JButton();
        jPanelCalle = new javax.swing.JPanel();
        jButtonC1 = new javax.swing.JButton();
        jButtonC2 = new javax.swing.JButton();
        jButtonC5 = new javax.swing.JButton();
        jButtonC6 = new javax.swing.JButton();
        jButtonC7 = new javax.swing.JButton();
        jButtonC8 = new javax.swing.JButton();
        jButtonC4 = new javax.swing.JButton();
        jButtonC3 = new javax.swing.JButton();
        jPanelArbol = new javax.swing.JPanel();
        jPanelArbol2 = new javax.swing.JPanel();
        jButtonCerrarCaja = new javax.swing.JButton();
        jButtonVerCaja = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jButtonMovCaja = new javax.swing.JButton();
        jButtonEditarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colibrí Arte y Cultura");
        setBackground(new java.awt.Color(0, 51, 102));

        jPanelPrincipal.setBackground(new java.awt.Color(109, 176, 248));
        jPanelPrincipal.setForeground(new java.awt.Color(109, 176, 248));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setText("COLIBRÍ ARTE Y CULTURA");

        jButtonEgresosPagos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonEgresosPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/payment.png"))); // NOI18N
        jButtonEgresosPagos.setText("Egresos / Pagos");
        jButtonEgresosPagos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEgresosPagos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEgresosPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEgresosPagosMouseClicked(evt);
            }
        });

        jPanelSalon1.setBackground(new java.awt.Color(0, 102, 255));

        jButtonM1.setText("Mesa 1");
        jButtonM1.setBackground(Color.green);
        jButtonM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM1ActionPerformed(evt);
            }
        });

        jButtonM2.setText("Mesa 2");
        jButtonM2.setBackground(Color.green);
        jButtonM2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM2MouseClicked(evt);
            }
        });

        jButtonM3.setText("Mesa 3");
        jButtonM3.setBackground(Color.green);
        jButtonM3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM3MouseClicked(evt);
            }
        });

        jButtonM6.setText("Mesa 6");
        jButtonM6.setBackground(Color.green);
        jButtonM6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM6MouseClicked(evt);
            }
        });

        jButtonM5.setText("Mesa 5");
        jButtonM5.setBackground(Color.green);
        jButtonM5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM5MouseClicked(evt);
            }
        });

        jButtonM4.setText("Mesa 4");
        jButtonM4.setBackground(Color.green);
        jButtonM4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM4MouseClicked(evt);
            }
        });

        jButtonM11.setText("Mesa 11");
        jButtonM11.setBackground(Color.green);
        jButtonM11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM11MouseClicked(evt);
            }
        });

        jButtonM10.setText("Mesa 10");
        jButtonM10.setBackground(Color.green);
        jButtonM10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM10MouseClicked(evt);
            }
        });

        jButtonM9.setText("Mesa 9");
        jButtonM9.setBackground(Color.green);
        jButtonM9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM9MouseClicked(evt);
            }
        });

        jButtonM8.setText("Mesa 8");
        jButtonM8.setBackground(Color.green);
        jButtonM8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM8MouseClicked(evt);
            }
        });

        jButtonM7.setText("Mesa 7");
        jButtonM7.setBackground(Color.green);
        jButtonM7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM7MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));

        jButtonB1.setText("Barra 1");
        jButtonB1.setBackground(Color.green);
        jButtonB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonB1MouseClicked(evt);
            }
        });

        jButtonB2.setText("Barra 2");
        jButtonB2.setBackground(Color.green);
        jButtonB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonB2MouseClicked(evt);
            }
        });

        jButtonB3.setText("Barra 3");
        jButtonB3.setBackground(Color.green);
        jButtonB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonB3MouseClicked(evt);
            }
        });

        jButtonB4.setText("Barra 4");
        jButtonB4.setBackground(Color.green);
        jButtonB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonB4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButtonB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonB2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonB3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonB4)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonB1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonB2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonB3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSalon1Layout = new javax.swing.GroupLayout(jPanelSalon1);
        jPanelSalon1.setLayout(jPanelSalon1Layout);
        jPanelSalon1Layout.setHorizontalGroup(
            jPanelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalon1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSalon1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelSalon1Layout.createSequentialGroup()
                        .addComponent(jButtonM1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonM7, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jButtonM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSalon1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonM3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonM4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonM5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSalon1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonM8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonM9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonM10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonM11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonM6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(76, Short.MAX_VALUE))))
        );
        jPanelSalon1Layout.setVerticalGroup(
            jPanelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalon1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonM1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonM11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneSalon.addTab("Salón 1", jPanelSalon1);

        jPanelSalon2.setBackground(new java.awt.Color(0, 102, 255));

        jButtonM13.setText("Mesa 13");
        jButtonM13.setBackground(Color.green);
        jButtonM13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM13ActionPerformed(evt);
            }
        });

        jButtonM12.setText("Mesa 12");
        jButtonM12.setBackground(Color.green);
        jButtonM12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM12ActionPerformed(evt);
            }
        });

        jButtonM15.setText("Mesa 15");
        jButtonM15.setBackground(Color.green);
        jButtonM15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM15ActionPerformed(evt);
            }
        });

        jButtonM14.setText("Mesa 14");
        jButtonM14.setBackground(Color.green);
        jButtonM14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM14ActionPerformed(evt);
            }
        });

        jButtonM16.setText("Mesa 16");
        jButtonM16.setBackground(Color.green);
        jButtonM16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM16ActionPerformed(evt);
            }
        });

        jButtonM17.setText("Mesa 17");
        jButtonM17.setBackground(Color.green);
        jButtonM17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM17ActionPerformed(evt);
            }
        });

        jButtonM18.setText("Mesa 18");
        jButtonM18.setBackground(Color.green);
        jButtonM18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM18ActionPerformed(evt);
            }
        });

        jButtonM19.setText("Mesa 19");
        jButtonM19.setBackground(Color.green);
        jButtonM19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM19ActionPerformed(evt);
            }
        });

        jButtonM20.setText("Mesa 20");
        jButtonM20.setBackground(Color.green);
        jButtonM20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM20ActionPerformed(evt);
            }
        });

        jButtonM21.setText("Mesa 21");
        jButtonM21.setBackground(Color.green);
        jButtonM21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM21ActionPerformed(evt);
            }
        });

        jButtonM23.setText("Mesa 23");
        jButtonM23.setBackground(Color.green);
        jButtonM23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM23ActionPerformed(evt);
            }
        });

        jButtonM26.setText("Mesa 26");
        jButtonM26.setBackground(Color.green);
        jButtonM26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM26ActionPerformed(evt);
            }
        });

        jButtonM25.setText("Mesa 25");
        jButtonM25.setBackground(Color.green);
        jButtonM25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM25ActionPerformed(evt);
            }
        });

        jButtonM22.setText("Mesa 22");
        jButtonM22.setBackground(Color.green);
        jButtonM22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM22ActionPerformed(evt);
            }
        });

        jButtonM24.setText("Mesa 24");
        jButtonM24.setBackground(Color.green);
        jButtonM24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM24ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jButtonM27.setText("Mesa 27");
        jButtonM27.setBackground(Color.green);
        jButtonM27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM27ActionPerformed(evt);
            }
        });

        jButtonM28.setText("Mesa 28");
        jButtonM28.setBackground(Color.green);
        jButtonM28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM28ActionPerformed(evt);
            }
        });

        jButtonM29.setText("Mesa 29");
        jButtonM29.setBackground(Color.green);
        jButtonM29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM29ActionPerformed(evt);
            }
        });

        jButtonM30.setText("Mesa 30");
        jButtonM30.setBackground(Color.green);
        jButtonM30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM30ActionPerformed(evt);
            }
        });

        jButtonM31.setText("Mesa 31");
        jButtonM31.setBackground(Color.green);
        jButtonM31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSalon2Layout = new javax.swing.GroupLayout(jPanelSalon2);
        jPanelSalon2.setLayout(jPanelSalon2Layout);
        jPanelSalon2Layout.setHorizontalGroup(
            jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalon2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSalon2Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelSalon2Layout.createSequentialGroup()
                        .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSalon2Layout.createSequentialGroup()
                                .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonM17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonM12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelSalon2Layout.createSequentialGroup()
                                .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonM22, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jButtonM27, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                .addGap(35, 35, 35)))
                        .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonM13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonM18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonM23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonM28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonM24, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonM14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonM19, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonM29, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonM25, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonM15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonM20, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonM30, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)))
                .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonM16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jButtonM21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonM26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonM31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSalon2Layout.setVerticalGroup(
            jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalon2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonM13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonM14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonM12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonM15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonM17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonM24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSalon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonM29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPaneSalon.addTab("Salón 2", jPanelSalon2);

        jPanelCalle.setBackground(new java.awt.Color(0, 102, 255));

        jButtonC1.setText("Calle 1");
        jButtonC1.setBackground(Color.green);
        jButtonC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC1ActionPerformed(evt);
            }
        });

        jButtonC2.setText("Calle 2");
        jButtonC2.setBackground(Color.green);
        jButtonC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC2ActionPerformed(evt);
            }
        });

        jButtonC5.setText("Calle 5");
        jButtonC5.setBackground(Color.green);
        jButtonC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC5ActionPerformed(evt);
            }
        });

        jButtonC6.setText("Calle 6");
        jButtonC6.setBackground(Color.green);
        jButtonC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC6ActionPerformed(evt);
            }
        });

        jButtonC7.setText("Calle 7");
        jButtonC7.setBackground(Color.green);
        jButtonC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC7ActionPerformed(evt);
            }
        });

        jButtonC8.setText("Calle 8");
        jButtonC8.setBackground(Color.green);
        jButtonC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC8ActionPerformed(evt);
            }
        });

        jButtonC4.setText("Calle 4");
        jButtonC4.setBackground(Color.green);
        jButtonC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC4ActionPerformed(evt);
            }
        });

        jButtonC3.setText("Calle 3");
        jButtonC3.setBackground(Color.green);
        jButtonC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC3ActionPerformed(evt);
            }
        });

        jPanelArbol.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanelArbolLayout = new javax.swing.GroupLayout(jPanelArbol);
        jPanelArbol.setLayout(jPanelArbolLayout);
        jPanelArbolLayout.setHorizontalGroup(
            jPanelArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jPanelArbolLayout.setVerticalGroup(
            jPanelArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jPanelArbol2.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanelArbol2Layout = new javax.swing.GroupLayout(jPanelArbol2);
        jPanelArbol2.setLayout(jPanelArbol2Layout);
        jPanelArbol2Layout.setHorizontalGroup(
            jPanelArbol2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelArbol2Layout.setVerticalGroup(
            jPanelArbol2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelCalleLayout = new javax.swing.GroupLayout(jPanelCalle);
        jPanelCalle.setLayout(jPanelCalleLayout);
        jPanelCalleLayout.setHorizontalGroup(
            jPanelCalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalleLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanelCalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonC1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonC4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelCalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonC6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelArbol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanelCalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonC7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelArbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCalleLayout.setVerticalGroup(
            jPanelCalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalleLayout.createSequentialGroup()
                .addGroup(jPanelCalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCalleLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jPanelArbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCalleLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jPanelArbol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCalleLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanelCalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCalleLayout.createSequentialGroup()
                                .addComponent(jButtonC3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonC4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCalleLayout.createSequentialGroup()
                                .addGroup(jPanelCalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonC5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonC7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonC6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonC8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCalleLayout.createSequentialGroup()
                                .addComponent(jButtonC1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonC2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jTabbedPaneSalon.addTab("Calle", jPanelCalle);

        jButtonCerrarCaja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonCerrarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money_bag.png"))); // NOI18N
        jButtonCerrarCaja.setText("Cerrar Caja");
        jButtonCerrarCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCerrarCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCerrarCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCerrarCajaMouseClicked(evt);
            }
        });

        jButtonVerCaja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonVerCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cash_register.png"))); // NOI18N
        jButtonVerCaja.setText("Ver Caja");
        jButtonVerCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVerCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonVerCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVerCajaMouseClicked(evt);
            }
        });

        jLabelUsuario.setText("Usuario: ");

        jButtonMovCaja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonMovCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coin_stacks_copper_share.png"))); // NOI18N
        jButtonMovCaja.setText("Movimiento Caja");
        jButtonMovCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMovCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonMovCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMovCajaMouseClicked(evt);
            }
        });

        jButtonEditarMenu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonEditarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editmenu.png"))); // NOI18N
        jButtonEditarMenu.setText("Editar Menu");
        jButtonEditarMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEditarMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEditarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditarMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jTabbedPaneSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEditarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEgresosPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMovCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVerCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabelTitulo)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNombreUsuario)
                        .addGap(72, 72, 72))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabelUsuario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelNombreUsuario))
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jTabbedPaneSalon))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonVerCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMovCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEgresosPagos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCerrarCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM1ActionPerformed
      crearMesa(jButtonM1);  
    }//GEN-LAST:event_jButtonM1ActionPerformed

    private void jButtonM2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonM2MouseClicked
      crearMesa(jButtonM2); 
    }//GEN-LAST:event_jButtonM2MouseClicked

    private void jButtonEditarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMenuMouseClicked
       NewJFrameEditarMenu cc = new NewJFrameEditarMenu(this, this.db);
       cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEditarMenuMouseClicked

    private void jButtonMovCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMovCajaMouseClicked
       NewJFrameMovimientoCaja cc = new NewJFrameMovimientoCaja(this, this.cajaActual);
       cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMovCajaMouseClicked

    private void jButtonVerCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVerCajaMouseClicked
        NewJFrameVerCaja cc = new NewJFrameVerCaja(this, this.cajaActual);
       cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVerCajaMouseClicked

    private void jButtonEgresosPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEgresosPagosMouseClicked
        NewJFrameEgreso cc = new NewJFrameEgreso(this, this.cajaActual);
       cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEgresosPagosMouseClicked

    private void jButtonCerrarCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCerrarCajaMouseClicked
        NewJFrameCerrarCaja cc = new NewJFrameCerrarCaja(this, this.cajaActual, this.db);
       cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarCajaMouseClicked

    private void jButtonM3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonM3MouseClicked
       crearMesa(jButtonM3);
    }//GEN-LAST:event_jButtonM3MouseClicked

    private void jButtonM4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonM4MouseClicked
      crearMesa(jButtonM4); 
    }//GEN-LAST:event_jButtonM4MouseClicked

    private void jButtonM5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonM5MouseClicked
      crearMesa(jButtonM5); 
    }//GEN-LAST:event_jButtonM5MouseClicked

    private void jButtonM6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonM6MouseClicked
      crearMesa(jButtonM6);
    }
     {{
       }     }//GEN-LAST:event_jButtonM6MouseClicked

    private void jButtonM7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonM7MouseClicked
        crearMesa(jButtonM7);
    }//GEN-LAST:event_jButtonM7MouseClicked

    private void jButtonM8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonM8MouseClicked
     crearMesa(jButtonM8);
    }//GEN-LAST:event_jButtonM8MouseClicked

    private void jButtonM9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonM9MouseClicked
      crearMesa(jButtonM9); 
    }//GEN-LAST:event_jButtonM9MouseClicked

    private void jButtonM10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonM10MouseClicked
      crearMesa(jButtonM10); 
    }//GEN-LAST:event_jButtonM10MouseClicked

    private void jButtonM11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonM11MouseClicked
      crearMesa(jButtonM11);
    }//GEN-LAST:event_jButtonM11MouseClicked

    private void jButtonB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonB1MouseClicked
      crearMesa(jButtonB1); 
    }//GEN-LAST:event_jButtonB1MouseClicked

    private void jButtonB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonB2MouseClicked
     crearMesa(jButtonB2);
    }//GEN-LAST:event_jButtonB2MouseClicked

    private void jButtonB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonB3MouseClicked
      crearMesa(jButtonB3); 
    }//GEN-LAST:event_jButtonB3MouseClicked

    private void jButtonB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonB4MouseClicked
      crearMesa(jButtonB4); 
    }//GEN-LAST:event_jButtonB4MouseClicked

    private void jButtonM13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM13ActionPerformed
        crearMesa(jButtonM13);
    }//GEN-LAST:event_jButtonM13ActionPerformed

    private void jButtonM12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM12ActionPerformed
        crearMesa(jButtonM12);
    }//GEN-LAST:event_jButtonM12ActionPerformed

    private void jButtonM15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM15ActionPerformed
        crearMesa(jButtonM15);
    }//GEN-LAST:event_jButtonM15ActionPerformed

    private void jButtonM14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM14ActionPerformed
        crearMesa(jButtonM14);
    }//GEN-LAST:event_jButtonM14ActionPerformed

    private void jButtonM16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM16ActionPerformed
        crearMesa(jButtonM16);
    }//GEN-LAST:event_jButtonM16ActionPerformed

    private void jButtonM17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM17ActionPerformed
       crearMesa(jButtonM17);
    }//GEN-LAST:event_jButtonM17ActionPerformed

    private void jButtonM18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM18ActionPerformed
        crearMesa(jButtonM18);
    }//GEN-LAST:event_jButtonM18ActionPerformed

    private void jButtonM19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM19ActionPerformed
        crearMesa(jButtonM19);
    }//GEN-LAST:event_jButtonM19ActionPerformed

    private void jButtonM20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM20ActionPerformed
        crearMesa(jButtonM20);
    }//GEN-LAST:event_jButtonM20ActionPerformed

    private void jButtonM21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM21ActionPerformed
        crearMesa(jButtonM21);
    }//GEN-LAST:event_jButtonM21ActionPerformed

    private void jButtonM23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM23ActionPerformed
        crearMesa(jButtonM23);
    }//GEN-LAST:event_jButtonM23ActionPerformed

    private void jButtonM26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM26ActionPerformed
        crearMesa(jButtonM26);
    }//GEN-LAST:event_jButtonM26ActionPerformed

    private void jButtonM25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM25ActionPerformed
        crearMesa(jButtonM25);
    }//GEN-LAST:event_jButtonM25ActionPerformed

    private void jButtonM22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM22ActionPerformed
        crearMesa(jButtonM22);
    }//GEN-LAST:event_jButtonM22ActionPerformed

    private void jButtonM24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM24ActionPerformed
       crearMesa(jButtonM24);
    }//GEN-LAST:event_jButtonM24ActionPerformed

    private void jButtonC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC1ActionPerformed
        crearMesa(jButtonC1);
    }//GEN-LAST:event_jButtonC1ActionPerformed

    private void jButtonC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC2ActionPerformed
        crearMesa(jButtonC2);
    }//GEN-LAST:event_jButtonC2ActionPerformed

    private void jButtonC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC5ActionPerformed
        crearMesa(jButtonC5);
    }//GEN-LAST:event_jButtonC5ActionPerformed

    private void jButtonC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC6ActionPerformed
        crearMesa(jButtonC6);
    }//GEN-LAST:event_jButtonC6ActionPerformed

    private void jButtonC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC7ActionPerformed
        crearMesa(jButtonC7);
    }//GEN-LAST:event_jButtonC7ActionPerformed

    private void jButtonC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC8ActionPerformed
        crearMesa(jButtonC8);
    }//GEN-LAST:event_jButtonC8ActionPerformed

    private void jButtonC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC4ActionPerformed
        crearMesa(jButtonC4);
    }//GEN-LAST:event_jButtonC4ActionPerformed

    private void jButtonC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC3ActionPerformed
        crearMesa(jButtonC3);
    }//GEN-LAST:event_jButtonC3ActionPerformed

    private void jButtonM27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM27ActionPerformed
        crearMesa(jButtonM27);
    }//GEN-LAST:event_jButtonM27ActionPerformed

    private void jButtonM28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM28ActionPerformed
       crearMesa(jButtonM28);
    }//GEN-LAST:event_jButtonM28ActionPerformed

    private void jButtonM29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM29ActionPerformed
       crearMesa(jButtonM29);
    }//GEN-LAST:event_jButtonM29ActionPerformed

    private void jButtonM30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM30ActionPerformed
        crearMesa(jButtonM30);
    }//GEN-LAST:event_jButtonM30ActionPerformed

    private void jButtonM31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM31ActionPerformed
        crearMesa(jButtonM31);
    }//GEN-LAST:event_jButtonM31ActionPerformed
   
    
    
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
            java.util.logging.Logger.getLogger(NewJFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJFramePrincipal principal =  new NewJFramePrincipal(null, null);
                principal.setDefaultCloseOperation(NewJFrameLogin.EXIT_ON_CLOSE);
                principal.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonB1;
    private javax.swing.JButton jButtonB2;
    private javax.swing.JButton jButtonB3;
    private javax.swing.JButton jButtonB4;
    private javax.swing.JButton jButtonC1;
    private javax.swing.JButton jButtonC2;
    private javax.swing.JButton jButtonC3;
    private javax.swing.JButton jButtonC4;
    private javax.swing.JButton jButtonC5;
    private javax.swing.JButton jButtonC6;
    private javax.swing.JButton jButtonC7;
    private javax.swing.JButton jButtonC8;
    private javax.swing.JButton jButtonCerrarCaja;
    private javax.swing.JButton jButtonEditarMenu;
    private javax.swing.JButton jButtonEgresosPagos;
    private javax.swing.JButton jButtonM1;
    private javax.swing.JButton jButtonM10;
    private javax.swing.JButton jButtonM11;
    private javax.swing.JButton jButtonM12;
    private javax.swing.JButton jButtonM13;
    private javax.swing.JButton jButtonM14;
    private javax.swing.JButton jButtonM15;
    private javax.swing.JButton jButtonM16;
    private javax.swing.JButton jButtonM17;
    private javax.swing.JButton jButtonM18;
    private javax.swing.JButton jButtonM19;
    private javax.swing.JButton jButtonM2;
    private javax.swing.JButton jButtonM20;
    private javax.swing.JButton jButtonM21;
    private javax.swing.JButton jButtonM22;
    private javax.swing.JButton jButtonM23;
    private javax.swing.JButton jButtonM24;
    private javax.swing.JButton jButtonM25;
    private javax.swing.JButton jButtonM26;
    private javax.swing.JButton jButtonM27;
    private javax.swing.JButton jButtonM28;
    private javax.swing.JButton jButtonM29;
    private javax.swing.JButton jButtonM3;
    private javax.swing.JButton jButtonM30;
    private javax.swing.JButton jButtonM31;
    private javax.swing.JButton jButtonM4;
    private javax.swing.JButton jButtonM5;
    private javax.swing.JButton jButtonM6;
    private javax.swing.JButton jButtonM7;
    private javax.swing.JButton jButtonM8;
    private javax.swing.JButton jButtonM9;
    private javax.swing.JButton jButtonMovCaja;
    private javax.swing.JButton jButtonVerCaja;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelArbol;
    private javax.swing.JPanel jPanelArbol2;
    private javax.swing.JPanel jPanelCalle;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelSalon1;
    private javax.swing.JPanel jPanelSalon2;
    private javax.swing.JTabbedPane jTabbedPaneSalon;
    // End of variables declaration//GEN-END:variables
}
