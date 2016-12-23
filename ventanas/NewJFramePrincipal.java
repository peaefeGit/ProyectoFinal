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
    
    public NewJFramePrincipal(MySQL db, Caja cajaA) {
        this.cajaActual = cajaA;
        this.mesas = new Hashtable<JButton, NewJFrameMesa>();
        this.db = db;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        //setDefaultCloseOperation(0);//anula la CRUZ exit
        setTitle("Colibrí Arte y Cultura");
        this.jLabelUsuario.setText(this.jLabelUsuario.getText()+this.cajaActual.getUser().getUser());
        
        jButtonCerrarCaja.setContentAreaFilled(false);
        jButtonCerrarCaja.setBorderPainted(false);
        
        jButtonEditarMenu.setContentAreaFilled(false);
        jButtonEditarMenu.setBorderPainted(false);
        
        jButtonEgresosPagos.setContentAreaFilled(false);
        jButtonEgresosPagos.setBorderPainted(false);
        
        jButtonMovCaja.setContentAreaFilled(false);
        jButtonMovCaja.setBorderPainted(false);
        
        jButtonVerCaja.setContentAreaFilled(false);
        jButtonVerCaja.setBorderPainted(false);
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
        jLabelFotoSalon1 = new javax.swing.JLabel();
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
        jLabelFotoSalon2 = new javax.swing.JLabel();
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
        jLabelFotoCalle = new javax.swing.JLabel();
        jButtonCerrarCaja = new javax.swing.JButton();
        jButtonVerCaja = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonMovCaja = new javax.swing.JButton();
        jButtonEditarMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colibrí Arte y Cultura");
        setBackground(new java.awt.Color(0, 51, 102));

        jPanelPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPrincipal.setForeground(new java.awt.Color(109, 176, 248));
        jPanelPrincipal.setLayout(null);

        jButtonEgresosPagos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEgresosPagos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEgresosPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/payment.png"))); // NOI18N
        jButtonEgresosPagos.setText("Proveedores");
        jButtonEgresosPagos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEgresosPagos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEgresosPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEgresosPagosMouseClicked(evt);
            }
        });
        jPanelPrincipal.add(jButtonEgresosPagos);
        jButtonEgresosPagos.setBounds(710, 320, 125, 75);

        jPanelSalon1.setBackground(new java.awt.Color(151, 108, 59));
        jPanelSalon1.setLayout(null);

        jButtonM1.setText("Mesa 1");
        jButtonM1.setBackground(Color.green);
        jButtonM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM1ActionPerformed(evt);
            }
        });
        jPanelSalon1.add(jButtonM1);
        jButtonM1.setBounds(10, 11, 75, 80);

        jButtonM2.setText("Mesa 2");
        jButtonM2.setBackground(Color.green);
        jButtonM2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM2MouseClicked(evt);
            }
        });
        jPanelSalon1.add(jButtonM2);
        jButtonM2.setBounds(95, 11, 75, 80);

        jButtonM3.setText("Mesa 3");
        jButtonM3.setBackground(Color.green);
        jButtonM3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM3MouseClicked(evt);
            }
        });
        jPanelSalon1.add(jButtonM3);
        jButtonM3.setBounds(180, 11, 75, 80);

        jButtonM6.setText("Mesa 6");
        jButtonM6.setBackground(Color.green);
        jButtonM6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM6MouseClicked(evt);
            }
        });
        jPanelSalon1.add(jButtonM6);
        jButtonM6.setBounds(470, 10, 90, 80);

        jButtonM5.setText("Mesa 5");
        jButtonM5.setBackground(Color.green);
        jButtonM5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM5MouseClicked(evt);
            }
        });
        jPanelSalon1.add(jButtonM5);
        jButtonM5.setBounds(370, 10, 90, 80);

        jButtonM4.setText("Mesa 4");
        jButtonM4.setBackground(Color.green);
        jButtonM4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM4MouseClicked(evt);
            }
        });
        jPanelSalon1.add(jButtonM4);
        jButtonM4.setBounds(265, 11, 90, 80);

        jButtonM11.setText("Mesa 11");
        jButtonM11.setBackground(Color.green);
        jButtonM11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM11MouseClicked(evt);
            }
        });
        jPanelSalon1.add(jButtonM11);
        jButtonM11.setBounds(480, 110, 90, 80);

        jButtonM10.setText("Mesa 10");
        jButtonM10.setBackground(Color.green);
        jButtonM10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM10MouseClicked(evt);
            }
        });
        jPanelSalon1.add(jButtonM10);
        jButtonM10.setBounds(370, 110, 100, 80);

        jButtonM9.setText("Mesa 9");
        jButtonM9.setBackground(Color.green);
        jButtonM9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM9MouseClicked(evt);
            }
        });
        jPanelSalon1.add(jButtonM9);
        jButtonM9.setBounds(265, 109, 90, 80);

        jButtonM8.setText("Mesa 8");
        jButtonM8.setBackground(Color.green);
        jButtonM8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM8MouseClicked(evt);
            }
        });
        jPanelSalon1.add(jButtonM8);
        jButtonM8.setBounds(180, 109, 75, 80);

        jButtonM7.setText("Mesa 7");
        jButtonM7.setBackground(Color.green);
        jButtonM7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonM7MouseClicked(evt);
            }
        });
        jPanelSalon1.add(jButtonM7);
        jButtonM7.setBounds(95, 109, 75, 80);

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));
        jPanel1.setLayout(null);

        jButtonB1.setText("Barra 1");
        jButtonB1.setBackground(Color.green);
        jButtonB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonB1MouseClicked(evt);
            }
        });
        jPanel1.add(jButtonB1);
        jButtonB1.setBounds(10, 10, 80, 80);

        jButtonB2.setText("Barra 2");
        jButtonB2.setBackground(Color.green);
        jButtonB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonB2MouseClicked(evt);
            }
        });
        jPanel1.add(jButtonB2);
        jButtonB2.setBounds(100, 10, 80, 80);

        jButtonB3.setText("Barra 3");
        jButtonB3.setBackground(Color.green);
        jButtonB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonB3MouseClicked(evt);
            }
        });
        jPanel1.add(jButtonB3);
        jButtonB3.setBounds(190, 10, 80, 80);

        jButtonB4.setText("Barra 4");
        jButtonB4.setBackground(Color.green);
        jButtonB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonB4MouseClicked(evt);
            }
        });
        jPanel1.add(jButtonB4);
        jButtonB4.setBounds(280, 10, 80, 80);

        jPanelSalon1.add(jPanel1);
        jPanel1.setBounds(10, 250, 380, 102);

        jLabelFotoSalon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salon1.png"))); // NOI18N
        jPanelSalon1.add(jLabelFotoSalon1);
        jLabelFotoSalon1.setBounds(0, 0, 600, 360);

        jTabbedPaneSalon.addTab("Salón 1", jPanelSalon1);

        jPanelSalon2.setBackground(new java.awt.Color(151, 108, 59));
        jPanelSalon2.setLayout(null);

        jButtonM13.setText("Mesa 13");
        jButtonM13.setBackground(Color.green);
        jButtonM13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM13ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM13);
        jButtonM13.setBounds(129, 67, 84, 60);

        jButtonM12.setText("Mesa 12");
        jButtonM12.setBackground(Color.green);
        jButtonM12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM12ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM12);
        jButtonM12.setBounds(10, 67, 84, 60);

        jButtonM15.setText("Mesa 15");
        jButtonM15.setBackground(Color.green);
        jButtonM15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM15ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM15);
        jButtonM15.setBounds(378, 67, 84, 60);

        jButtonM14.setText("Mesa 14");
        jButtonM14.setBackground(Color.green);
        jButtonM14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM14ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM14);
        jButtonM14.setBounds(253, 67, 84, 60);

        jButtonM16.setText("Mesa 16");
        jButtonM16.setBackground(Color.green);
        jButtonM16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM16ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM16);
        jButtonM16.setBounds(503, 67, 85, 60);

        jButtonM17.setText("Mesa 17");
        jButtonM17.setBackground(Color.green);
        jButtonM17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM17ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM17);
        jButtonM17.setBounds(10, 138, 84, 60);

        jButtonM18.setText("Mesa 18");
        jButtonM18.setBackground(Color.green);
        jButtonM18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM18ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM18);
        jButtonM18.setBounds(129, 138, 84, 60);

        jButtonM19.setText("Mesa 19");
        jButtonM19.setBackground(Color.green);
        jButtonM19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM19ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM19);
        jButtonM19.setBounds(253, 138, 84, 60);

        jButtonM20.setText("Mesa 20");
        jButtonM20.setBackground(Color.green);
        jButtonM20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM20ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM20);
        jButtonM20.setBounds(378, 138, 84, 60);

        jButtonM21.setText("Mesa 21");
        jButtonM21.setBackground(Color.green);
        jButtonM21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM21ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM21);
        jButtonM21.setBounds(503, 138, 85, 60);

        jButtonM23.setText("Mesa 23");
        jButtonM23.setBackground(Color.green);
        jButtonM23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM23ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM23);
        jButtonM23.setBounds(129, 209, 84, 60);

        jButtonM26.setText("Mesa 26");
        jButtonM26.setBackground(Color.green);
        jButtonM26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM26ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM26);
        jButtonM26.setBounds(503, 209, 85, 60);

        jButtonM25.setText("Mesa 25");
        jButtonM25.setBackground(Color.green);
        jButtonM25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM25ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM25);
        jButtonM25.setBounds(378, 209, 84, 60);

        jButtonM22.setText("Mesa 22");
        jButtonM22.setBackground(Color.green);
        jButtonM22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM22ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM22);
        jButtonM22.setBounds(10, 209, 84, 60);

        jButtonM24.setText("Mesa 24");
        jButtonM24.setBackground(Color.green);
        jButtonM24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM24ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM24);
        jButtonM24.setBounds(253, 209, 84, 60);

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

        jPanelSalon2.add(jPanel2);
        jPanel2.setBounds(10, 11, 235, 50);

        jButtonM27.setText("Mesa 27");
        jButtonM27.setBackground(Color.green);
        jButtonM27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM27ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM27);
        jButtonM27.setBounds(10, 280, 84, 60);

        jButtonM28.setText("Mesa 28");
        jButtonM28.setBackground(Color.green);
        jButtonM28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM28ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM28);
        jButtonM28.setBounds(129, 280, 84, 60);

        jButtonM29.setText("Mesa 29");
        jButtonM29.setBackground(Color.green);
        jButtonM29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM29ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM29);
        jButtonM29.setBounds(253, 280, 84, 60);

        jButtonM30.setText("Mesa 30");
        jButtonM30.setBackground(Color.green);
        jButtonM30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM30ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM30);
        jButtonM30.setBounds(378, 280, 84, 60);

        jButtonM31.setText("Mesa 31");
        jButtonM31.setBackground(Color.green);
        jButtonM31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM31ActionPerformed(evt);
            }
        });
        jPanelSalon2.add(jButtonM31);
        jButtonM31.setBounds(503, 280, 85, 60);

        jLabelFotoSalon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salon2.png"))); // NOI18N
        jPanelSalon2.add(jLabelFotoSalon2);
        jLabelFotoSalon2.setBounds(0, 0, 600, 360);

        jTabbedPaneSalon.addTab("Salón 2", jPanelSalon2);

        jPanelCalle.setBackground(new java.awt.Color(151, 108, 59));
        jPanelCalle.setLayout(null);

        jButtonC1.setText("Calle 1");
        jButtonC1.setBackground(Color.green);
        jButtonC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC1ActionPerformed(evt);
            }
        });
        jPanelCalle.add(jButtonC1);
        jButtonC1.setBounds(30, 110, 75, 80);

        jButtonC2.setText("Calle 2");
        jButtonC2.setBackground(Color.green);
        jButtonC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC2ActionPerformed(evt);
            }
        });
        jPanelCalle.add(jButtonC2);
        jButtonC2.setBounds(30, 200, 75, 80);

        jButtonC5.setText("Calle 5");
        jButtonC5.setBackground(Color.green);
        jButtonC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC5ActionPerformed(evt);
            }
        });
        jPanelCalle.add(jButtonC5);
        jButtonC5.setBounds(220, 110, 75, 80);

        jButtonC6.setText("Calle 6");
        jButtonC6.setBackground(Color.green);
        jButtonC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC6ActionPerformed(evt);
            }
        });
        jPanelCalle.add(jButtonC6);
        jButtonC6.setBounds(220, 200, 75, 80);

        jButtonC7.setText("Calle 7");
        jButtonC7.setBackground(Color.green);
        jButtonC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC7ActionPerformed(evt);
            }
        });
        jPanelCalle.add(jButtonC7);
        jButtonC7.setBounds(420, 110, 75, 80);

        jButtonC8.setText("Calle 8");
        jButtonC8.setBackground(Color.green);
        jButtonC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC8ActionPerformed(evt);
            }
        });
        jPanelCalle.add(jButtonC8);
        jButtonC8.setBounds(420, 200, 75, 80);

        jButtonC4.setText("Calle 4");
        jButtonC4.setBackground(Color.green);
        jButtonC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC4ActionPerformed(evt);
            }
        });
        jPanelCalle.add(jButtonC4);
        jButtonC4.setBounds(120, 200, 75, 80);

        jButtonC3.setText("Calle 3");
        jButtonC3.setBackground(Color.green);
        jButtonC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC3ActionPerformed(evt);
            }
        });
        jPanelCalle.add(jButtonC3);
        jButtonC3.setBounds(120, 110, 75, 80);

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

        jPanelCalle.add(jPanelArbol);
        jPanelArbol.setBounds(510, 170, 64, 64);

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

        jPanelCalle.add(jPanelArbol2);
        jPanelArbol2.setBounds(320, 170, 65, 64);

        jLabelFotoCalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calle2.png"))); // NOI18N
        jPanelCalle.add(jLabelFotoCalle);
        jLabelFotoCalle.setBounds(0, 0, 600, 360);

        jTabbedPaneSalon.addTab("Calle", jPanelCalle);

        jPanelPrincipal.add(jTabbedPaneSalon);
        jTabbedPaneSalon.setBounds(70, 170, 603, 390);

        jButtonCerrarCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCerrarCaja.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money_bag.png"))); // NOI18N
        jButtonCerrarCaja.setText("Cerrar Caja");
        jButtonCerrarCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCerrarCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCerrarCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCerrarCajaMouseClicked(evt);
            }
        });
        jPanelPrincipal.add(jButtonCerrarCaja);
        jButtonCerrarCaja.setBounds(710, 490, 125, 89);

        jButtonVerCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonVerCaja.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cash_register.png"))); // NOI18N
        jButtonVerCaja.setText("Caja");
        jButtonVerCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVerCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonVerCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVerCajaMouseClicked(evt);
            }
        });
        jPanelPrincipal.add(jButtonVerCaja);
        jButtonVerCaja.setBounds(710, 140, 125, 83);

        jLabelUsuario.setText("Usuario: ");
        jPanelPrincipal.add(jLabelUsuario);
        jLabelUsuario.setBounds(680, 90, 160, 14);

        jButtonMovCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonMovCaja.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMovCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coin_stacks_copper_share.png"))); // NOI18N
        jButtonMovCaja.setText("Movimiento Caja");
        jButtonMovCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMovCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonMovCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMovCajaMouseClicked(evt);
            }
        });
        jPanelPrincipal.add(jButtonMovCaja);
        jButtonMovCaja.setBounds(700, 230, 140, 82);

        jButtonEditarMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditarMenu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editmenu.png"))); // NOI18N
        jButtonEditarMenu.setText("Editar Menu");
        jButtonEditarMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEditarMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEditarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditarMenuMouseClicked(evt);
            }
        });
        jPanelPrincipal.add(jButtonEditarMenu);
        jButtonEditarMenu.setBounds(710, 400, 125, 81);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoprincipal.jpg"))); // NOI18N
        jPanelPrincipal.add(jLabel1);
        jLabel1.setBounds(-10, -20, 910, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
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
       NewJFrameMovimientoCaja cc = new NewJFrameMovimientoCaja(this, this.cajaActual, this.db);
       cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMovCajaMouseClicked

    private void jButtonVerCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVerCajaMouseClicked
        NewJFrameVerCaja cc = new NewJFrameVerCaja(this, this.cajaActual);
       cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVerCajaMouseClicked

    private void jButtonEgresosPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEgresosPagosMouseClicked
        NewJFrameEgreso cc = new NewJFrameEgreso(this, this.cajaActual, db);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFotoCalle;
    private javax.swing.JLabel jLabelFotoSalon1;
    private javax.swing.JLabel jLabelFotoSalon2;
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
