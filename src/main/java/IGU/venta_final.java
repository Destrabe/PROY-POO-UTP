
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

    private CarritoDeCompras carrito = CarritoGlobal.getCarrito();
    controladoraLogicaLogin control;
    Usuario user;

    public venta_final(controladoraLogicaLogin control, Usuario user) {
        initComponents();
        this.control= control;
        this.user= user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnSeguirComprando = new javax.swing.JButton();
        panelGracias = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelCompraRealizada = new javax.swing.JLabel();
        volverbutton = new javax.swing.JPanel();
        volverbuttontxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(0, 153, 204));

        btnCerrar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setFocusPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnSeguirComprando.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnSeguirComprando.setText("SEGUIR COMPRANDO");
        btnSeguirComprando.setFocusPainted(false);
        btnSeguirComprando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguirComprandoActionPerformed(evt);
            }
        });

        panelGracias.setBackground(new java.awt.Color(0, 153, 204));
        panelGracias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        panelGracias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Su pedido llegara pronto");
        panelGracias.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gracias por comprar con nosotros");
        panelGracias.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        labelCompraRealizada.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
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

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelGracias, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnSeguirComprando, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(labelCompraRealizada))
                    .addComponent(volverbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(volverbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(labelCompraRealizada)
                .addGap(18, 18, 18)
                .addComponent(panelGracias, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSeguirComprando, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
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

    private void btnSeguirComprandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguirComprandoActionPerformed
        tienda_usuario tienda = new tienda_usuario(control,user);
        tienda.setVisible(true);
        tienda.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSeguirComprandoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        carrito.limpiarCarrito();
        SesionDeCompra.cerrarSesion();
        usuario_entrada entrada = new usuario_entrada(control,user);
        entrada.setVisible(true);
        entrada.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnSeguirComprando;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelCompraRealizada;
    private javax.swing.JPanel panelGracias;
    private javax.swing.JPanel volverbutton;
    private javax.swing.JLabel volverbuttontxt;
    // End of variables declaration//GEN-END:variables
}
