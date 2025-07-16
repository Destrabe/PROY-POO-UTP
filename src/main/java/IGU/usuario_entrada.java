
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

    private CarritoDeCompras carrito = CarritoGlobal.getCarrito();
    controladoraLogicaLogin control;
    Usuario user;
    
    public usuario_entrada(controladoraLogicaLogin control, Usuario user) {
        initComponents();
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
        exitBtn = new javax.swing.JPanel();
        exitBtnTxt = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        btnverCompras = new javax.swing.JButton();
        sistemadeventasusuariolabel = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        btnverCompras1 = new javax.swing.JButton();

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        background.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, -1));

        btnProductos.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProductos.setFocusPainted(false);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        background.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 430, 110));

        btnverCompras.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnverCompras.setText("Cerrar Sesion");
        btnverCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnverCompras.setFocusPainted(false);
        btnverCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverComprasActionPerformed(evt);
            }
        });
        background.add(btnverCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 430, 110));

        sistemadeventasusuariolabel.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        sistemadeventasusuariolabel.setForeground(new java.awt.Color(0, 0, 0));
        sistemadeventasusuariolabel.setText("SISTEMA DE VENTAS");
        background.add(sistemadeventasusuariolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo_temporal.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 150, 160));

        btnverCompras1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnverCompras1.setText("Ver Compras");
        btnverCompras1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnverCompras1.setFocusPainted(false);
        btnverCompras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverCompras1ActionPerformed(evt);
            }
        });
        background.add(btnverCompras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 430, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
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

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        tienda_usuario tienda = new tienda_usuario(control,user);
        tienda.setVisible(true);
        tienda.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnverComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverComprasActionPerformed
        login login = new login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnverComprasActionPerformed

    private void btnverCompras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverCompras1ActionPerformed
        ver_compras_realizadas comprasRealizadas = new ver_compras_realizadas(carrito,control,user);
        comprasRealizadas.setVisible(true);
        comprasRealizadas.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnverCompras1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnverCompras;
    private javax.swing.JButton btnverCompras1;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitBtnTxt;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel sistemadeventasusuariolabel;
    // End of variables declaration//GEN-END:variables
}
