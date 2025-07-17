
package IGU;

import java.awt.Color;
import javax.swing.JOptionPane;
import logica.CarritoDeCompras;
import logica.CarritoGlobal;
import logica.Usuario;
import logica.controladoraLogicaLogin;


/**
 *
 * @author Valentino
 */

public class tienda_usuario_laptops extends javax.swing.JFrame {
    private CarritoDeCompras carrito = CarritoGlobal.getCarrito();
    controladoraLogicaLogin control;
    Usuario user;

    public tienda_usuario_laptops(controladoraLogicaLogin control, Usuario user) {
        initComponents();
        this.control= control;
        this.user= user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitBtnTxt = new javax.swing.JLabel();
        panelTienda = new javax.swing.JPanel();
        volverbutton = new javax.swing.JPanel();
        volverbuttontxt = new javax.swing.JLabel();
        btncategorialaptops = new javax.swing.JButton();
        labelTienda = new javax.swing.JLabel();
        btncategoriacelulares = new javax.swing.JButton();
        btnCompletarCompraTienda = new javax.swing.JButton();
        labelLaptops = new javax.swing.JLabel();
        panelRound1 = new components.PanelRound();
        labelLaptopLenovo = new javax.swing.JLabel();
        labelPrecioLaptopLenovo = new javax.swing.JLabel();
        btnaniadirlenovo = new javax.swing.JButton();
        jcomboboxaniadirlenovo = new javax.swing.JComboBox<>();
        panelRound2 = new components.PanelRound();
        labelLaptopHP = new javax.swing.JLabel();
        labelPrecioLaptopHp = new javax.swing.JLabel();
        btnaniadirhp = new javax.swing.JButton();
        jcomboboxaniadirhp = new javax.swing.JComboBox<>();
        panelRound3 = new components.PanelRound();
        labelLaptopVictus = new javax.swing.JLabel();
        labelPrecioLaptopVictus = new javax.swing.JLabel();
        btnaniadirvictus = new javax.swing.JButton();
        labelVictus = new javax.swing.JLabel();
        jcomboboxaniadirvictus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitBtnTxt.setBackground(new java.awt.Color(0, 0, 0));
        exitBtnTxt.setFont(new java.awt.Font("Dubai Light", 1, 30)); // NOI18N
        exitBtnTxt.setForeground(new java.awt.Color(0, 0, 0));
        exitBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBtnTxt.setText("X");
        exitBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtnTxt))
        );

        panelTienda.setBackground(new java.awt.Color(30, 41, 59));

        volverbutton.setBackground(new java.awt.Color(30, 41, 59));
        volverbutton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volverbuttontxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverbuttontxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverbuttontxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverbuttontxtMouseExited(evt);
            }
        });
        volverbutton.add(volverbuttontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        btncategorialaptops.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        btncategorialaptops.setForeground(new java.awt.Color(0, 0, 0));
        btncategorialaptops.setText("LAPTOPS");

        labelTienda.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        labelTienda.setText("TIENDA");

        btncategoriacelulares.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        btncategoriacelulares.setForeground(new java.awt.Color(0, 0, 0));
        btncategoriacelulares.setText("CELULARES");
        btncategoriacelulares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategoriacelularesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTiendaLayout = new javax.swing.GroupLayout(panelTienda);
        panelTienda.setLayout(panelTiendaLayout);
        panelTiendaLayout.setHorizontalGroup(
            panelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btncategorialaptops, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTiendaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labelTienda)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(panelTiendaLayout.createSequentialGroup()
                .addComponent(volverbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btncategoriacelulares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTiendaLayout.setVerticalGroup(
            panelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiendaLayout.createSequentialGroup()
                .addComponent(volverbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTienda)
                .addGap(108, 108, 108)
                .addComponent(btncategoriacelulares, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncategorialaptops, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        btnCompletarCompraTienda.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCompletarCompraTienda.setForeground(new java.awt.Color(0, 0, 0));
        btnCompletarCompraTienda.setText("COMPLETAR COMPRA");
        btnCompletarCompraTienda.setFocusPainted(false);
        btnCompletarCompraTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletarCompraTiendaActionPerformed(evt);
            }
        });

        labelLaptops.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        labelLaptops.setForeground(new java.awt.Color(0, 0, 0));
        labelLaptops.setText("LAPTOPS");

        panelRound1.setBackground(new java.awt.Color(153, 153, 153));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        labelLaptopLenovo.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        labelLaptopLenovo.setForeground(new java.awt.Color(0, 0, 0));
        labelLaptopLenovo.setText("LAPTOP LENOVO");

        labelPrecioLaptopLenovo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        labelPrecioLaptopLenovo.setForeground(new java.awt.Color(0, 0, 0));
        labelPrecioLaptopLenovo.setText("S/ 3900");

        btnaniadirlenovo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnaniadirlenovo.setForeground(new java.awt.Color(0, 0, 0));
        btnaniadirlenovo.setText("Añadir");
        btnaniadirlenovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaniadirlenovoActionPerformed(evt);
            }
        });

        jcomboboxaniadirlenovo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(labelPrecioLaptopLenovo))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(btnaniadirlenovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jcomboboxaniadirlenovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelLaptopLenovo))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(labelLaptopLenovo)
                .addGap(7, 7, 7)
                .addComponent(labelPrecioLaptopLenovo)
                .addGap(16, 16, 16)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnaniadirlenovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboboxaniadirlenovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound2.setBackground(new java.awt.Color(153, 153, 153));
        panelRound2.setPreferredSize(new java.awt.Dimension(200, 270));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);

        labelLaptopHP.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        labelLaptopHP.setForeground(new java.awt.Color(0, 0, 0));
        labelLaptopHP.setText("LAPTOP HP");

        labelPrecioLaptopHp.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        labelPrecioLaptopHp.setForeground(new java.awt.Color(0, 0, 0));
        labelPrecioLaptopHp.setText("S/ 3090");

        btnaniadirhp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnaniadirhp.setForeground(new java.awt.Color(0, 0, 0));
        btnaniadirhp.setText("Añadir");
        btnaniadirhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaniadirhpActionPerformed(evt);
            }
        });

        jcomboboxaniadirhp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", " " }));

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelLaptopHP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(labelPrecioLaptopHp))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnaniadirhp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboboxaniadirhp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(labelLaptopHP)
                .addGap(18, 18, 18)
                .addComponent(labelPrecioLaptopHp)
                .addGap(16, 16, 16)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboboxaniadirhp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaniadirhp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelRound3.setBackground(new java.awt.Color(153, 153, 153));
        panelRound3.setRoundBottomLeft(50);
        panelRound3.setRoundBottomRight(50);
        panelRound3.setRoundTopLeft(50);
        panelRound3.setRoundTopRight(50);

        labelLaptopVictus.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        labelLaptopVictus.setForeground(new java.awt.Color(0, 0, 0));
        labelLaptopVictus.setText("LAPTOP GAYMER");

        labelPrecioLaptopVictus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        labelPrecioLaptopVictus.setForeground(new java.awt.Color(0, 0, 0));
        labelPrecioLaptopVictus.setText("S/ 4500");

        btnaniadirvictus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnaniadirvictus.setForeground(new java.awt.Color(0, 0, 0));
        btnaniadirvictus.setText("Añadir");
        btnaniadirvictus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaniadirvictusActionPerformed(evt);
            }
        });

        labelVictus.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        labelVictus.setForeground(new java.awt.Color(0, 0, 0));
        labelVictus.setText("VICTUS");

        jcomboboxaniadirvictus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(labelPrecioLaptopVictus))
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addComponent(btnaniadirvictus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcomboboxaniadirvictus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(labelVictus))
                            .addComponent(labelLaptopVictus))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelVictus))
                    .addComponent(labelLaptopVictus))
                .addGap(7, 7, 7)
                .addComponent(labelPrecioLaptopVictus)
                .addGap(14, 14, 14)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaniadirvictus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboboxaniadirvictus))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCompletarCompraTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelLaptops)
                        .addGap(66, 66, 66))))
            .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(labelLaptops)
                            .addGap(38, 38, 38)
                            .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(btnCompletarCompraTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnTxtMouseClicked

    private void exitBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseEntered
        exitBtn.setBackground(new Color(232, 17, 35, 255));
        exitBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitBtnTxtMouseEntered

    private void exitBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitBtnTxtMouseExited

    private void volverbuttontxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseClicked
        usuario_entrada entrada = new usuario_entrada(control,user);
        entrada.setVisible(true);
        entrada.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volverbuttontxtMouseClicked

    private void volverbuttontxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseEntered
        volverbutton.setBackground(new Color(232, 17, 35, 255));
        volverbuttontxt.setForeground(Color.white);
    }//GEN-LAST:event_volverbuttontxtMouseEntered

    private void volverbuttontxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseExited
        volverbutton.setBackground(new Color(30, 41, 59));
        volverbuttontxt.setForeground(Color.black);
    }//GEN-LAST:event_volverbuttontxtMouseExited

    private void btnCompletarCompraTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletarCompraTiendaActionPerformed
        if (carrito.getProductos().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El carrito está vacio, Añade productos");
            return;
        }
        
        registrar_datos registrar = new registrar_datos(carrito,control,user);
        registrar.setVisible(true);
        registrar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCompletarCompraTiendaActionPerformed

    private void btncategoriacelularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategoriacelularesActionPerformed
        tienda_usuario celulares = new tienda_usuario(control,user);
        celulares.setVisible(true);
        celulares.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btncategoriacelularesActionPerformed

    private void btnaniadirlenovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaniadirlenovoActionPerformed
        int cantidad= Integer.parseInt(jcomboboxaniadirlenovo.getSelectedItem().toString());
        carrito.agregarProducto("LAPTOP LENOVO", 2900, cantidad);
    }//GEN-LAST:event_btnaniadirlenovoActionPerformed

    private void btnaniadirhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaniadirhpActionPerformed
        int cantidad= Integer.parseInt(jcomboboxaniadirhp.getSelectedItem().toString());
        carrito.agregarProducto("LAPTOP HP", 3090, cantidad);
    }//GEN-LAST:event_btnaniadirhpActionPerformed

    private void btnaniadirvictusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaniadirvictusActionPerformed
        int cantidad= Integer.parseInt(jcomboboxaniadirvictus.getSelectedItem().toString());
        carrito.agregarProducto("LAPTOP VICTUS", 4500, cantidad);
    }//GEN-LAST:event_btnaniadirvictusActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompletarCompraTienda;
    private javax.swing.JButton btnaniadirhp;
    private javax.swing.JButton btnaniadirlenovo;
    private javax.swing.JButton btnaniadirvictus;
    private javax.swing.JButton btncategoriacelulares;
    private javax.swing.JButton btncategorialaptops;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitBtnTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcomboboxaniadirhp;
    private javax.swing.JComboBox<String> jcomboboxaniadirlenovo;
    private javax.swing.JComboBox<String> jcomboboxaniadirvictus;
    private javax.swing.JLabel labelLaptopHP;
    private javax.swing.JLabel labelLaptopLenovo;
    private javax.swing.JLabel labelLaptopVictus;
    private javax.swing.JLabel labelLaptops;
    private javax.swing.JLabel labelPrecioLaptopHp;
    private javax.swing.JLabel labelPrecioLaptopLenovo;
    private javax.swing.JLabel labelPrecioLaptopVictus;
    private javax.swing.JLabel labelTienda;
    private javax.swing.JLabel labelVictus;
    private components.PanelRound panelRound1;
    private components.PanelRound panelRound2;
    private components.PanelRound panelRound3;
    private javax.swing.JPanel panelTienda;
    private javax.swing.JPanel volverbutton;
    private javax.swing.JLabel volverbuttontxt;
    // End of variables declaration//GEN-END:variables
}
