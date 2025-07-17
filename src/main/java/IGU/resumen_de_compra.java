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
    int xMouse, yMouse;
    private CarritoDeCompras carrito = CarritoGlobal.getCarrito();
    controladoraLogicaLogin control;
    Usuario user;

    public resumen_de_compra(controladoraLogicaLogin control, Usuario user) {
        initComponents();
        this.setSize(900, 550);
        this.setLocationRelativeTo(null);
        this.control = control;
        this.user = user;
        carrito.limpiarProductosInvalidos();
        List<Compra> comprasActuales = carrito.generarComprasSimuladas();
        mostrarResumen(comprasActuales);
        scrolltxtresumen_compra.setBorder(null);
        txtresumen_compra.setBorder(BorderFactory.createEmptyBorder());        
    }

    public void mostrarResumen(List<Compra> compras) {
        double totalGeneral = 0.0;
        StringBuilder resumen = new StringBuilder();

        Map<String, Integer> conteo = new LinkedHashMap<>();
        Map<String, Double> precioUnitario = new LinkedHashMap<>();

        for (Compra c : compras) {
            String nombre = c.getNombreproducto();
            int cantidad = c.getCantidad();
            double precio = c.getPrecioproducto();

            if (nombre == null || nombre.trim().isEmpty() || cantidad <= 0 || precio <= 0.0) {
                continue;
            }

            conteo.put(nombre, conteo.getOrDefault(nombre, 0) + cantidad);
            precioUnitario.put(nombre, precio);
        }

        for (String nombre : conteo.keySet()) {
            int cantidad = conteo.get(nombre);
            double precio = precioUnitario.get(nombre);
            double subtotal = cantidad * precio;
            resumen.append("Producto: ").append(nombre).append("\n");
            resumen.append("Cantidad: ").append(cantidad).append("\n");
            resumen.append("Precio unitario: S/ ").append(String.format("%.2f", precio)).append("\n");
            resumen.append("Subtotal: S/ ").append(String.format("%.2f", subtotal)).append("\n");
            resumen.append("__________________________________________________________\n");
            
            totalGeneral += subtotal;
        }

        resumen.append("TOTAL A PAGAR: S/ ").append(String.format("%.2f", totalGeneral));

        txtresumen_compra.setText(resumen.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelresultados = new javax.swing.JPanel();
        scrolltxtresumen_compra = new javax.swing.JScrollPane();
        txtresumen_compra = new javax.swing.JTextArea();
        labelResumenDeCompra = new javax.swing.JLabel();
        volverbutton = new javax.swing.JPanel();
        header1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitBtnTxt = new javax.swing.JLabel();
        completarcomprabtn = new components.PanelRound();
        completarcomprabtntxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(0, 153, 204));

        panelresultados.setBackground(new java.awt.Color(0, 153, 204));
        panelresultados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        panelresultados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtresumen_compra.setBackground(new java.awt.Color(0, 153, 204));
        txtresumen_compra.setColumns(20);
        txtresumen_compra.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtresumen_compra.setRows(5);
        scrolltxtresumen_compra.setViewportView(txtresumen_compra);

        panelresultados.add(scrolltxtresumen_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 4, 870, 310));

        labelResumenDeCompra.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        labelResumenDeCompra.setForeground(new java.awt.Color(0, 0, 0));
        labelResumenDeCompra.setText("RESUMEN DE TU COMPRA");

        volverbutton.setBackground(new java.awt.Color(0, 153, 204));
        volverbutton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        completarcomprabtn.setBackground(new java.awt.Color(45, 62, 85));
        completarcomprabtn.setRoundBottomLeft(20);
        completarcomprabtn.setRoundBottomRight(20);
        completarcomprabtn.setRoundTopLeft(20);
        completarcomprabtn.setRoundTopRight(20);

        completarcomprabtntxt.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        completarcomprabtntxt.setForeground(new java.awt.Color(255, 255, 255));
        completarcomprabtntxt.setText("   COMPLETAR COMPRA");
        completarcomprabtntxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                completarcomprabtntxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                completarcomprabtntxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                completarcomprabtntxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout completarcomprabtnLayout = new javax.swing.GroupLayout(completarcomprabtn);
        completarcomprabtn.setLayout(completarcomprabtnLayout);
        completarcomprabtnLayout.setHorizontalGroup(
            completarcomprabtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(completarcomprabtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );
        completarcomprabtnLayout.setVerticalGroup(
            completarcomprabtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(completarcomprabtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volverbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(labelResumenDeCompra))
                            .addComponent(panelresultados, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(completarcomprabtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volverbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelResumenDeCompra)
                .addGap(35, 35, 35)
                .addComponent(panelresultados, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(completarcomprabtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void completarcomprabtntxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completarcomprabtntxtMouseEntered
        completarcomprabtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_completarcomprabtntxtMouseEntered

    private void completarcomprabtntxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completarcomprabtntxtMouseExited
        completarcomprabtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_completarcomprabtntxtMouseExited

    private void completarcomprabtntxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completarcomprabtntxtMouseClicked
        venta_final ventaFinal = new venta_final(control, user);
        ventaFinal.setVisible(true);
        ventaFinal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_completarcomprabtntxtMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private components.PanelRound completarcomprabtn;
    private javax.swing.JLabel completarcomprabtntxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitBtnTxt;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel labelResumenDeCompra;
    private javax.swing.JPanel panelresultados;
    private javax.swing.JScrollPane scrolltxtresumen_compra;
    private javax.swing.JTextArea txtresumen_compra;
    private javax.swing.JPanel volverbutton;
    // End of variables declaration//GEN-END:variables
}
