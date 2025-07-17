
package IGU;

import java.awt.Color;
import logica.CarritoDeCompras;
import logica.CarritoGlobal;
import logica.Usuario;
import logica.controladoraLogicaLogin;

/**
 *
 * @author Valentino
 */
public class usuario_entrada extends javax.swing.JFrame {
    int xMouse, yMouse;
    private CarritoDeCompras carrito = CarritoGlobal.getCarrito();
    controladoraLogicaLogin control;
    Usuario user;
    
    public usuario_entrada(controladoraLogicaLogin control, Usuario user) {
        initComponents();
        this.setSize(900, 550);
        this.control= control;
        this.user= user;
        carrito.limpiarCarrito();
        
        
        System.out.println("Carrito despues de limpiar: ");
        System.out.println("Cantidad de productos: "+ CarritoGlobal.getCarrito().getProductos().size());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkbox1 = new java.awt.Checkbox();
        background = new javax.swing.JPanel();
        sistemadeventasusuariolabel = new javax.swing.JLabel();
        header1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitBtnTxt = new javax.swing.JLabel();
        productosbtn = new components.PanelRound();
        productosbtntxt = new javax.swing.JLabel();
        vercomprasbtn = new components.PanelRound();
        vercomprasbtntxt = new javax.swing.JLabel();
        cerrarsesionbtn = new components.PanelRound();
        cerrarsesionbtntxt = new javax.swing.JLabel();
        volverBtn = new components.PanelRound();
        volverBtnTxt = new javax.swing.JLabel();

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sistemadeventasusuariolabel.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        sistemadeventasusuariolabel.setForeground(new java.awt.Color(0, 0, 0));
        sistemadeventasusuariolabel.setText("SISTEMA DE VENTAS");
        background.add(sistemadeventasusuariolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 41, -1, -1));

        header1.setBackground(new java.awt.Color(255, 255, 255));
        header1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header1MouseDragged(evt);
            }
        });
        header1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header1MousePressed(evt);
            }
        });

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
                .addComponent(exitBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header1Layout.createSequentialGroup()
                .addGap(0, 865, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        productosbtn.setBackground(new java.awt.Color(45, 62, 85));
        productosbtn.setRoundBottomLeft(20);
        productosbtn.setRoundBottomRight(20);
        productosbtn.setRoundTopLeft(20);
        productosbtn.setRoundTopRight(20);

        productosbtntxt.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        productosbtntxt.setForeground(new java.awt.Color(255, 255, 255));
        productosbtntxt.setText("                   PRODUCTOS");
        productosbtntxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productosbtntxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productosbtntxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productosbtntxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout productosbtnLayout = new javax.swing.GroupLayout(productosbtn);
        productosbtn.setLayout(productosbtnLayout);
        productosbtnLayout.setHorizontalGroup(
            productosbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productosbtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        productosbtnLayout.setVerticalGroup(
            productosbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productosbtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        background.add(productosbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 129, 430, -1));

        vercomprasbtn.setBackground(new java.awt.Color(45, 62, 85));
        vercomprasbtn.setRoundBottomLeft(20);
        vercomprasbtn.setRoundBottomRight(20);
        vercomprasbtn.setRoundTopLeft(20);
        vercomprasbtn.setRoundTopRight(20);

        vercomprasbtntxt.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        vercomprasbtntxt.setForeground(new java.awt.Color(255, 255, 255));
        vercomprasbtntxt.setText("                 VER COMPRAS");
        vercomprasbtntxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vercomprasbtntxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vercomprasbtntxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vercomprasbtntxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout vercomprasbtnLayout = new javax.swing.GroupLayout(vercomprasbtn);
        vercomprasbtn.setLayout(vercomprasbtnLayout);
        vercomprasbtnLayout.setHorizontalGroup(
            vercomprasbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vercomprasbtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        vercomprasbtnLayout.setVerticalGroup(
            vercomprasbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vercomprasbtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        background.add(vercomprasbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 266, 430, -1));

        cerrarsesionbtn.setBackground(new java.awt.Color(45, 62, 85));
        cerrarsesionbtn.setRoundBottomLeft(20);
        cerrarsesionbtn.setRoundBottomRight(20);
        cerrarsesionbtn.setRoundTopLeft(20);
        cerrarsesionbtn.setRoundTopRight(20);

        cerrarsesionbtntxt.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        cerrarsesionbtntxt.setForeground(new java.awt.Color(255, 255, 255));
        cerrarsesionbtntxt.setText("                CERRAR SESION");
        cerrarsesionbtntxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarsesionbtntxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarsesionbtntxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarsesionbtntxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarsesionbtnLayout = new javax.swing.GroupLayout(cerrarsesionbtn);
        cerrarsesionbtn.setLayout(cerrarsesionbtnLayout);
        cerrarsesionbtnLayout.setHorizontalGroup(
            cerrarsesionbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarsesionbtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        cerrarsesionbtnLayout.setVerticalGroup(
            cerrarsesionbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarsesionbtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        background.add(cerrarsesionbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 408, -1, -1));

        volverBtn.setBackground(new java.awt.Color(30, 41, 59));
        volverBtn.setRoundBottomLeft(25);
        volverBtn.setRoundBottomRight(25);
        volverBtn.setRoundTopLeft(25);
        volverBtn.setRoundTopRight(25);

        volverBtnTxt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        volverBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        volverBtnTxt.setText("Volver");
        volverBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout volverBtnLayout = new javax.swing.GroupLayout(volverBtn);
        volverBtn.setLayout(volverBtnLayout);
        volverBtnLayout.setHorizontalGroup(
            volverBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volverBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volverBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
        );
        volverBtnLayout.setVerticalGroup(
            volverBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        background.add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 41, -1, -1));

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
        exitBtn.setBackground(new Color(232, 17, 35, 255));
        exitBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitBtnTxtMouseEntered

    private void exitBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitBtnTxtMouseExited

    private void header1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y- yMouse);
    }//GEN-LAST:event_header1MouseDragged

    private void header1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_header1MousePressed

    private void productosbtntxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosbtntxtMouseEntered
        productosbtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_productosbtntxtMouseEntered

    private void productosbtntxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosbtntxtMouseExited
        productosbtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_productosbtntxtMouseExited

    private void productosbtntxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosbtntxtMouseClicked
        tienda_usuario tienda = new tienda_usuario(control,user);
        tienda.setVisible(true);
        tienda.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_productosbtntxtMouseClicked

    private void vercomprasbtntxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vercomprasbtntxtMouseEntered
        vercomprasbtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_vercomprasbtntxtMouseEntered

    private void vercomprasbtntxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vercomprasbtntxtMouseExited
        vercomprasbtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_vercomprasbtntxtMouseExited

    private void vercomprasbtntxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vercomprasbtntxtMouseClicked
        ver_compras_realizadas comprasRealizadas = new ver_compras_realizadas(carrito,control,user);
        comprasRealizadas.setVisible(true);
        comprasRealizadas.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_vercomprasbtntxtMouseClicked

    private void cerrarsesionbtntxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarsesionbtntxtMouseEntered
        cerrarsesionbtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_cerrarsesionbtntxtMouseEntered

    private void cerrarsesionbtntxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarsesionbtntxtMouseExited
        cerrarsesionbtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_cerrarsesionbtntxtMouseExited

    private void cerrarsesionbtntxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarsesionbtntxtMouseClicked
        login login = new login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_cerrarsesionbtntxtMouseClicked

    private void volverBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBtnTxtMouseClicked
        login ver=new login();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volverBtnTxtMouseClicked

    private void volverBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBtnTxtMouseEntered
        volverBtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_volverBtnTxtMouseEntered

    private void volverBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBtnTxtMouseExited
        volverBtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_volverBtnTxtMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private components.PanelRound cerrarsesionbtn;
    private javax.swing.JLabel cerrarsesionbtntxt;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitBtnTxt;
    private javax.swing.JPanel header1;
    private components.PanelRound productosbtn;
    private javax.swing.JLabel productosbtntxt;
    private javax.swing.JLabel sistemadeventasusuariolabel;
    private components.PanelRound vercomprasbtn;
    private javax.swing.JLabel vercomprasbtntxt;
    private components.PanelRound volverBtn;
    private javax.swing.JLabel volverBtnTxt;
    // End of variables declaration//GEN-END:variables
}
