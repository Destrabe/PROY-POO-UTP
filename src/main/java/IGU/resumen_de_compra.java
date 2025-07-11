
package IGU;

import java.awt.Color;
import java.net.URL;
import java.util.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import logica.CarritoDeCompras;
import logica.CarritoGlobal;
import logica.Compra;
import logica.Usuario;
import logica.controladoraLogicaLogin;

/**
 *
 * @author Valentino
 */
public class resumen_de_compra extends javax.swing.JFrame {
    private CarritoDeCompras carrito= CarritoGlobal.getCarrito();
    controladoraLogicaLogin control;
    Usuario user;
    
    public resumen_de_compra(controladoraLogicaLogin control,Usuario user) {
        initComponents();
        this.control = control;
        this.user = user;
        carrito.limpiarProductosInvalidos();
        List<Compra> comprasActuales= carrito.generarComprasSimuladas();
        mostrarResumen(comprasActuales); 
        scrolltxtresumen_compra.setBorder(null);
        txtresumen_compra.setBorder(BorderFactory.createEmptyBorder());
        URL imgURL = getClass().getResource("/imagenes/icono.png");
if (imgURL != null) {
    ImageIcon icon = new ImageIcon(imgURL);
    jLabel2.setIcon(icon);
} else {
    System.err.println("No se encontró la imagen: /imagenes/icono.png");
}

    }
    
    
    public void mostrarResumen(List<Compra> compras){
        double totalGeneral=0.0;
        StringBuilder resumen= new StringBuilder();
        
        Map<String, Integer> conteo= new LinkedHashMap<>();
        Map<String, Double> precioUnitario= new LinkedHashMap<>();        
        
        for (Compra c : compras) {
            String nombre= c.getNombreproducto();
            int cantidad= c.getCantidad();
            double precio= c.getPrecioproducto();
            
            if (nombre == null || nombre.trim().isEmpty() || cantidad <= 0 || precio <= 0.0) {
                continue;
            }
            
            conteo.put(nombre, conteo.getOrDefault(nombre, 0)+cantidad);
            precioUnitario.put(nombre, precio);
        }
        
        
        for (String nombre : conteo.keySet()) {
            int cantidad= conteo.get(nombre);
            double precio = precioUnitario.get(nombre);
            double subtotal = cantidad*precio;
            
            resumen.append("Producto: ").append(nombre).append("\n");
            resumen.append("Cantidad: ").append(cantidad).append("\n");
            resumen.append("Precio unitario: S/ ").append(String.format("%.2f", precio)).append("\n");
            resumen.append("Subtotal: S/ ").append(String.format("%.2f", subtotal)).append("\n");
            resumen.append("__________________________________________________________\n");
            
            totalGeneral+= subtotal;
        }
        
        resumen.append("TOTAL A PAGAR: S/ ").append(String.format("%.2f", totalGeneral));
        
        txtresumen_compra.setText(resumen.toString());
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        scrolltxtresumen_compra = new javax.swing.JScrollPane();
        txtresumen_compra = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitBtnTxt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        volverbutton = new javax.swing.JPanel();
        volverbuttontxt = new javax.swing.JLabel();
        btnCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(0, 153, 204));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\assets\\laptop.png")); // NOI18N
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtresumen_compra.setBackground(new java.awt.Color(0, 153, 204));
        txtresumen_compra.setColumns(20);
        txtresumen_compra.setRows(5);
        scrolltxtresumen_compra.setViewportView(txtresumen_compra);

        jPanel1.add(scrolltxtresumen_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 4, 870, 310));

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 880, 320));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\assets\\laptop.png")); // NOI18N
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, -1, -1));

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(exitBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, 40));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("RESUMEN DE TU COMPRA");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        volverbutton.setBackground(new java.awt.Color(0, 153, 204));
        volverbutton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volverbuttontxt.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\assets\\volver.png")); // NOI18N
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

        background.add(volverbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        btnCompra.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        btnCompra.setForeground(new java.awt.Color(0, 0, 0));
        btnCompra.setText("COMPLETAR COMPRA");
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });
        background.add(btnCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 230, 70));

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
        exitBtn.setBackground(new Color(232,17,35,255));
        exitBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitBtnTxtMouseEntered

    private void exitBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseExited
        exitBtn.setBackground(new Color(0,153,204));
        exitBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitBtnTxtMouseExited

    private void volverbuttontxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseEntered
        volverbutton.setBackground(new Color(232,17,35,255));
        volverbuttontxt.setForeground(Color.white);
    }//GEN-LAST:event_volverbuttontxtMouseEntered

    private void volverbuttontxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseExited
        volverbutton.setBackground(new Color(0,153,204));
        volverbuttontxt.setForeground(Color.black);
    }//GEN-LAST:event_volverbuttontxtMouseExited

    private void volverbuttontxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseClicked
        tienda_usuario volver= new tienda_usuario(control,user);
        volver.setVisible(true);
        volver.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volverbuttontxtMouseClicked

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        venta_final ventaFinal= new venta_final(control,user);
        ventaFinal.setVisible(true);
        ventaFinal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCompraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCompra;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitBtnTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrolltxtresumen_compra;
    private javax.swing.JTextArea txtresumen_compra;
    private javax.swing.JPanel volverbutton;
    private javax.swing.JLabel volverbuttontxt;
    // End of variables declaration//GEN-END:variables
}
