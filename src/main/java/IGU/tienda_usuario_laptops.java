
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
        panelRound2 = new components.PanelRound();
        labelLaptopHP = new javax.swing.JLabel();
        labelPrecioLaptopHp = new javax.swing.JLabel();
        btnaniadirhp = new javax.swing.JButton();
        panelRound3 = new components.PanelRound();
        labelLaptopVictus = new javax.swing.JLabel();
        labelPrecioLaptopVictus = new javax.swing.JLabel();
        btnaniadirvictus = new javax.swing.JButton();
        labelVictus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, -1));

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

        jPanel1.add(panelTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 550));

        btnCompletarCompraTienda.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCompletarCompraTienda.setForeground(new java.awt.Color(0, 0, 0));
        btnCompletarCompraTienda.setText("COMPLETAR COMPRA");
        btnCompletarCompraTienda.setFocusPainted(false);
        btnCompletarCompraTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletarCompraTiendaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompletarCompraTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 250, 60));

        labelLaptops.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        labelLaptops.setForeground(new java.awt.Color(0, 0, 0));
        labelLaptops.setText("LAPTOPS");
        jPanel1.add(labelLaptops, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        panelRound1.setBackground(new java.awt.Color(153, 153, 153));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLaptopLenovo.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        labelLaptopLenovo.setForeground(new java.awt.Color(0, 0, 0));
        labelLaptopLenovo.setText("LAPTOP LENOVO");
        panelRound1.add(labelLaptopLenovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        labelPrecioLaptopLenovo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        labelPrecioLaptopLenovo.setForeground(new java.awt.Color(0, 0, 0));
        labelPrecioLaptopLenovo.setText("S/ 3900");
        panelRound1.add(labelPrecioLaptopLenovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        btnaniadirlenovo.setText("Añadir");
        btnaniadirlenovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaniadirlenovoActionPerformed(evt);
            }
        });
        panelRound1.add(btnaniadirlenovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, -1));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 160, 270));

        panelRound2.setBackground(new java.awt.Color(153, 153, 153));
        panelRound2.setPreferredSize(new java.awt.Dimension(200, 270));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLaptopHP.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        labelLaptopHP.setForeground(new java.awt.Color(0, 0, 0));
        labelLaptopHP.setText("LAPTOP HP");
        panelRound2.add(labelLaptopHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, -1));

        labelPrecioLaptopHp.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        labelPrecioLaptopHp.setForeground(new java.awt.Color(0, 0, 0));
        labelPrecioLaptopHp.setText("S/ 3090");
        panelRound2.add(labelPrecioLaptopHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        btnaniadirhp.setText("Añadir");
        btnaniadirhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaniadirhpActionPerformed(evt);
            }
        });
        panelRound2.add(btnaniadirhp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, -1));

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 160, -1));

        panelRound3.setBackground(new java.awt.Color(153, 153, 153));
        panelRound3.setRoundBottomLeft(50);
        panelRound3.setRoundBottomRight(50);
        panelRound3.setRoundTopLeft(50);
        panelRound3.setRoundTopRight(50);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLaptopVictus.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        labelLaptopVictus.setForeground(new java.awt.Color(0, 0, 0));
        labelLaptopVictus.setText("LAPTOP GAYMER");
        panelRound3.add(labelLaptopVictus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        labelPrecioLaptopVictus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        labelPrecioLaptopVictus.setForeground(new java.awt.Color(0, 0, 0));
        labelPrecioLaptopVictus.setText("S/ 4500");
        panelRound3.add(labelPrecioLaptopVictus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        btnaniadirvictus.setText("Añadir");
        btnaniadirvictus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaniadirvictusActionPerformed(evt);
            }
        });
        panelRound3.add(btnaniadirvictus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, -1));

        labelVictus.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        labelVictus.setForeground(new java.awt.Color(0, 0, 0));
        labelVictus.setText("VICTUS");
        panelRound3.add(labelVictus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jPanel1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 160, 270));

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
        carrito.agregarProducto("LAPTOP LENOVO", 2900);
    }//GEN-LAST:event_btnaniadirlenovoActionPerformed

    private void btnaniadirhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaniadirhpActionPerformed
        carrito.agregarProducto("LAPTOP HP", 3090);
    }//GEN-LAST:event_btnaniadirhpActionPerformed

    private void btnaniadirvictusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaniadirvictusActionPerformed
        carrito.agregarProducto("LAPTOP VICTUS", 4500);
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
