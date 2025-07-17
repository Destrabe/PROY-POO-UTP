
package IGU;

import java.awt.Color;
import logica.CarritoDeCompras;
import logica.CarritoGlobal;
import logica.SesionDeCompra;
import logica.Usuario;
import logica.controladoraLogicaLogin;

/**
 *
 * @author Valentino
 */
public class venta_final extends javax.swing.JFrame {
    int xMouse, yMouse;
    private CarritoDeCompras carrito = new CarritoGlobal().getCarrito();
    controladoraLogicaLogin control;
    Usuario user;

    public venta_final(controladoraLogicaLogin control, Usuario user) {
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
        panelGracias = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelCompraRealizada = new javax.swing.JLabel();
        volverbutton = new javax.swing.JPanel();
        volverbuttontxt = new javax.swing.JLabel();
        header1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitBtnTxt = new javax.swing.JLabel();
        cerrarbtn = new components.PanelRound();
        cerrarbtntxt = new javax.swing.JLabel();
        seguircomprandobtn = new components.PanelRound();
        seguircomprandobtntxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(0, 153, 204));

        panelGracias.setBackground(new java.awt.Color(0, 153, 204));
        panelGracias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        panelGracias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Su pedido llegara pronto");
        panelGracias.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gracias por comprar con nosotros");
        panelGracias.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        labelCompraRealizada.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        labelCompraRealizada.setForeground(new java.awt.Color(0, 0, 0));
        labelCompraRealizada.setText("COMPRA REALIZADA");

        volverbutton.setBackground(new java.awt.Color(0, 153, 204));
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

        header1.setBackground(new java.awt.Color(0, 153, 204));
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

        exitBtn.setBackground(new java.awt.Color(0, 153, 204));

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
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(exitBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header1Layout.createSequentialGroup()
                .addGap(0, 848, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cerrarbtn.setBackground(new java.awt.Color(45, 62, 85));
        cerrarbtn.setRoundBottomLeft(20);
        cerrarbtn.setRoundBottomRight(20);
        cerrarbtn.setRoundTopLeft(20);
        cerrarbtn.setRoundTopRight(20);

        cerrarbtntxt.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        cerrarbtntxt.setForeground(new java.awt.Color(255, 255, 255));
        cerrarbtntxt.setText("            CERRAR");
        cerrarbtntxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarbtntxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarbtntxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarbtntxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarbtnLayout = new javax.swing.GroupLayout(cerrarbtn);
        cerrarbtn.setLayout(cerrarbtnLayout);
        cerrarbtnLayout.setHorizontalGroup(
            cerrarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarbtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );
        cerrarbtnLayout.setVerticalGroup(
            cerrarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarbtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );

        seguircomprandobtn.setBackground(new java.awt.Color(45, 62, 85));
        seguircomprandobtn.setRoundBottomLeft(20);
        seguircomprandobtn.setRoundBottomRight(20);
        seguircomprandobtn.setRoundTopLeft(20);
        seguircomprandobtn.setRoundTopRight(20);

        seguircomprandobtntxt.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        seguircomprandobtntxt.setForeground(new java.awt.Color(255, 255, 255));
        seguircomprandobtntxt.setText(" SEGUIR COMPRANDO");
        seguircomprandobtntxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seguircomprandobtntxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seguircomprandobtntxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seguircomprandobtntxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout seguircomprandobtnLayout = new javax.swing.GroupLayout(seguircomprandobtn);
        seguircomprandobtn.setLayout(seguircomprandobtnLayout);
        seguircomprandobtnLayout.setHorizontalGroup(
            seguircomprandobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seguircomprandobtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );
        seguircomprandobtnLayout.setVerticalGroup(
            seguircomprandobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seguircomprandobtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(volverbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(labelCompraRealizada))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(panelGracias, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(cerrarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(seguircomprandobtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volverbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(labelCompraRealizada)
                .addGap(18, 18, 18)
                .addComponent(panelGracias, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cerrarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seguircomprandobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
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

    private void volverbuttontxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseClicked
        tienda_usuario volver = new tienda_usuario(control,user);
        volver.setVisible(true);
        volver.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volverbuttontxtMouseClicked

    private void volverbuttontxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseEntered
        volverbutton.setBackground(new Color(232, 17, 35, 255));
        volverbuttontxt.setForeground(Color.white);
    }//GEN-LAST:event_volverbuttontxtMouseEntered

    private void volverbuttontxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseExited
        volverbutton.setBackground(new Color(0, 153, 204));
        volverbuttontxt.setForeground(Color.black);
    }//GEN-LAST:event_volverbuttontxtMouseExited

    private void exitBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnTxtMouseClicked

    private void exitBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseEntered
        exitBtn.setBackground(new Color(232, 17, 35, 255));
        exitBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitBtnTxtMouseEntered

    private void exitBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseExited
        exitBtn.setBackground(new Color(0, 153, 204));
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

    private void cerrarbtntxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarbtntxtMouseEntered
        cerrarbtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_cerrarbtntxtMouseEntered

    private void cerrarbtntxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarbtntxtMouseExited
        cerrarbtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_cerrarbtntxtMouseExited

    private void cerrarbtntxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarbtntxtMouseClicked
        carrito.limpiarCarrito();
        SesionDeCompra.cerrarSesion();
        usuario_entrada entrada = new usuario_entrada(control,user);
        entrada.setVisible(true);
        entrada.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_cerrarbtntxtMouseClicked

    private void seguircomprandobtntxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seguircomprandobtntxtMouseEntered
        seguircomprandobtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_seguircomprandobtntxtMouseEntered

    private void seguircomprandobtntxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seguircomprandobtntxtMouseExited
        seguircomprandobtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_seguircomprandobtntxtMouseExited

    private void seguircomprandobtntxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seguircomprandobtntxtMouseClicked
        tienda_usuario tienda = new tienda_usuario(control,user);
        tienda.setVisible(true);
        tienda.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_seguircomprandobtntxtMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private components.PanelRound cerrarbtn;
    private javax.swing.JLabel cerrarbtntxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitBtnTxt;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelCompraRealizada;
    private javax.swing.JPanel panelGracias;
    private components.PanelRound seguircomprandobtn;
    private javax.swing.JLabel seguircomprandobtntxt;
    private javax.swing.JPanel volverbutton;
    private javax.swing.JLabel volverbuttontxt;
    // End of variables declaration//GEN-END:variables
}
