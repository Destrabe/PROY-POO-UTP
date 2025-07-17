
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
public class tienda_usuario extends javax.swing.JFrame {
    private CarritoDeCompras carrito = CarritoGlobal.getCarrito();
    controladoraLogicaLogin control;
    Usuario user;

    public tienda_usuario(controladoraLogicaLogin control, Usuario user) {
        initComponents();
        this.setSize(900, 550);
        this.setLocationRelativeTo(null);
        this.control= control;
        this.user= user;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitBtnTxt = new javax.swing.JLabel();
        paneltienda = new javax.swing.JPanel();
        volverbutton = new javax.swing.JPanel();
        volverbuttontxt = new javax.swing.JLabel();
        btncategorialaptops = new javax.swing.JButton();
        labelTienda = new javax.swing.JLabel();
        btncategoriacelulares = new javax.swing.JButton();
        btnCompletarCompraTienda = new javax.swing.JButton();
        labelCelulares = new javax.swing.JLabel();
        panelRound1 = new components.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnaniadir15pro = new javax.swing.JButton();
        jcomboboxaniadir15pro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        panelRound2 = new components.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnaniadir15promax = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jcomboboxaniadir15promax = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        panelRound3 = new components.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnaniadir16 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jcomboboxaniadir16pro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

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

        paneltienda.setBackground(new java.awt.Color(30, 41, 59));

        volverbutton.setBackground(new java.awt.Color(30, 41, 59));
        volverbutton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volverbuttontxt.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\assets\\backIcon.png")); // NOI18N
        volverbuttontxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 13, 1, 1));
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

        btncategorialaptops.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btncategorialaptops.setForeground(new java.awt.Color(255, 255, 255));
        btncategorialaptops.setText("LAPTOPS");
        btncategorialaptops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategorialaptopsActionPerformed(evt);
            }
        });

        labelTienda.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        labelTienda.setForeground(new java.awt.Color(255, 255, 255));
        labelTienda.setText("TIENDA");

        btncategoriacelulares.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btncategoriacelulares.setForeground(new java.awt.Color(255, 255, 255));
        btncategoriacelulares.setText("CELULARES");
        btncategoriacelulares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategoriacelularesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneltiendaLayout = new javax.swing.GroupLayout(paneltienda);
        paneltienda.setLayout(paneltiendaLayout);
        paneltiendaLayout.setHorizontalGroup(
            paneltiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btncategorialaptops, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paneltiendaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labelTienda)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(paneltiendaLayout.createSequentialGroup()
                .addComponent(volverbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btncategoriacelulares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneltiendaLayout.setVerticalGroup(
            paneltiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltiendaLayout.createSequentialGroup()
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

        labelCelulares.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        labelCelulares.setForeground(new java.awt.Color(0, 0, 0));
        labelCelulares.setText("CELULARES");

        panelRound1.setBackground(new java.awt.Color(153, 153, 153));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("IPHONE 15 PRO");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("S/ 3800");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        btnaniadir15pro.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnaniadir15pro.setForeground(new java.awt.Color(0, 0, 0));
        btnaniadir15pro.setText("Añadir");
        btnaniadir15pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaniadir15proActionPerformed(evt);
            }
        });
        panelRound1.add(btnaniadir15pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 30));

        jcomboboxaniadir15pro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jcomboboxaniadir15pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", " " }));
        panelRound1.add(jcomboboxaniadir15pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 60, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\assets\\iphone15pro.png")); // NOI18N
        jLabel2.setText("jLabel1");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 90));

        panelRound2.setBackground(new java.awt.Color(153, 153, 153));
        panelRound2.setPreferredSize(new java.awt.Dimension(200, 270));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("IPHONE 15 PRO");
        panelRound2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("S/ 4000 ");
        panelRound2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        btnaniadir15promax.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnaniadir15promax.setForeground(new java.awt.Color(0, 0, 0));
        btnaniadir15promax.setText("Añadir");
        btnaniadir15promax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaniadir15promaxActionPerformed(evt);
            }
        });
        panelRound2.add(btnaniadir15promax, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("MAX");
        panelRound2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jcomboboxaniadir15promax.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jcomboboxaniadir15promax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        panelRound2.add(jcomboboxaniadir15promax, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 60, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\assets\\iphone15promax.png")); // NOI18N
        jLabel4.setText("jLabel1");
        panelRound2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 120));

        panelRound3.setBackground(new java.awt.Color(153, 153, 153));
        panelRound3.setRoundBottomLeft(50);
        panelRound3.setRoundBottomRight(50);
        panelRound3.setRoundTopLeft(50);
        panelRound3.setRoundTopRight(50);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("IPHONE 16 PRO");
        panelRound3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("S/ 4500");
        panelRound3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        btnaniadir16.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnaniadir16.setForeground(new java.awt.Color(0, 0, 0));
        btnaniadir16.setText("Añadir");
        btnaniadir16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaniadir16ActionPerformed(evt);
            }
        });
        panelRound3.add(btnaniadir16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("MAX");
        panelRound3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jcomboboxaniadir16pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        panelRound3.add(jcomboboxaniadir16pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\assets\\iphone16.png")); // NOI18N
        jLabel1.setText("jLabel1");
        panelRound3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 120));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(paneltienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCelulares)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCompletarCompraTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneltienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelCelulares)
                .addGap(38, 38, 38)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnCompletarCompraTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnTxtMouseClicked

    private void exitBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseEntered
        exitBtn.setBackground(new Color(232,17,35,255));
        exitBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitBtnTxtMouseEntered

    private void exitBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitBtnTxtMouseExited

    private void volverbuttontxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseClicked
        usuario_entrada entrada= new usuario_entrada(control,user);
        entrada.setVisible(true);
        entrada.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volverbuttontxtMouseClicked

    private void volverbuttontxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseEntered
        volverbutton.setBackground(new Color(232,17,35,255));
        volverbuttontxt.setForeground(Color.white);
    }//GEN-LAST:event_volverbuttontxtMouseEntered

    private void volverbuttontxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseExited
        volverbutton.setBackground(new Color(30,41,59));
        volverbuttontxt.setForeground(Color.black);
    }//GEN-LAST:event_volverbuttontxtMouseExited

    private void btnCompletarCompraTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletarCompraTiendaActionPerformed
        if (carrito.getProductos().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El carrito está vacio, Añade productos");
            return;
        }
        
        registrar_datos registrar= new registrar_datos(carrito,control,user);
        registrar.setVisible(true);
        registrar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCompletarCompraTiendaActionPerformed

    private void btncategorialaptopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategorialaptopsActionPerformed
        tienda_usuario_laptops laptops=new tienda_usuario_laptops(control,user);
        laptops.setVisible(true);
        laptops.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btncategorialaptopsActionPerformed

    private void btnaniadir15proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaniadir15proActionPerformed
        int cantidad= Integer.parseInt(jcomboboxaniadir15pro.getSelectedItem().toString());
        carrito.agregarProducto("IPHONE 15 PRO", 3800.0,cantidad);        
    }//GEN-LAST:event_btnaniadir15proActionPerformed

    private void btnaniadir15promaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaniadir15promaxActionPerformed
        int cantidad= Integer.parseInt(jcomboboxaniadir15promax.getSelectedItem().toString());
        carrito.agregarProducto("IPHONE 15 PRO MAX",4000.0,cantidad);
    }//GEN-LAST:event_btnaniadir15promaxActionPerformed

    private void btnaniadir16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaniadir16ActionPerformed
        int cantidad= Integer.parseInt(jcomboboxaniadir16pro.getSelectedItem().toString());
        carrito.agregarProducto("IPHONE 16 PRO MAX",4500.0,cantidad);
    }//GEN-LAST:event_btnaniadir16ActionPerformed

    private void btncategoriacelularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategoriacelularesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncategoriacelularesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCompletarCompraTienda;
    private javax.swing.JButton btnaniadir15pro;
    private javax.swing.JButton btnaniadir15promax;
    private javax.swing.JButton btnaniadir16;
    private javax.swing.JButton btncategoriacelulares;
    private javax.swing.JButton btncategorialaptops;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitBtnTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcomboboxaniadir15pro;
    private javax.swing.JComboBox<String> jcomboboxaniadir15promax;
    private javax.swing.JComboBox<String> jcomboboxaniadir16pro;
    private javax.swing.JLabel labelCelulares;
    private javax.swing.JLabel labelTienda;
    private components.PanelRound panelRound1;
    private components.PanelRound panelRound2;
    private components.PanelRound panelRound3;
    private javax.swing.JPanel paneltienda;
    private javax.swing.JPanel volverbutton;
    private javax.swing.JLabel volverbuttontxt;
    // End of variables declaration//GEN-END:variables
}
