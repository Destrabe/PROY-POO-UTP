
package IGU;

import java.awt.Color;
import javax.swing.JOptionPane;
import logica.CarritoDeCompras;
import logica.CarritoGlobal;
import logica.Compra;
import logica.Usuario;
import logica.controladoraLogicaLogin;
import persistencia.CompraJpaController;

/**
 *
 * @author Valentino
 */
public class registrar_datos extends javax.swing.JFrame {
    
    
    private String producto;
    private double precio;
    controladoraLogicaLogin control;
    Usuario user;
    private CarritoDeCompras carrito= CarritoGlobal.getCarrito();

    public registrar_datos(CarritoDeCompras carrito,controladoraLogicaLogin control, Usuario user) {
        initComponents();
        this.carrito = carrito;
        this.control = control;
        this.user = user;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        volverbutton = new javax.swing.JPanel();
        volverbuttontxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelNombres = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        labelDNI = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelReferencia = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volverbutton.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(volverbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\logo\\logo_temporal.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("REGISTRAR DATOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        labelNombres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelNombres.setForeground(new java.awt.Color(0, 0, 0));
        labelNombres.setText("NOMBRES:");
        jPanel1.add(labelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        labelApellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelApellidos.setForeground(new java.awt.Color(0, 0, 0));
        labelApellidos.setText("APELLIDOS:");
        jPanel1.add(labelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        labelDNI.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDNI.setForeground(new java.awt.Color(0, 0, 0));
        labelDNI.setText("DNI:");
        jPanel1.add(labelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        labelDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDireccion.setForeground(new java.awt.Color(0, 0, 0));
        labelDireccion.setText("DIRECCION:");
        jPanel1.add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        labelTelefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(0, 0, 0));
        labelTelefono.setText("TELEFONO:");
        jPanel1.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        labelReferencia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelReferencia.setForeground(new java.awt.Color(0, 0, 0));
        labelReferencia.setText("EMAIL:");
        jPanel1.add(labelReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 400, 30));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 400, 30));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 400, 30));

        btnLimpiar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\assets\\limpiar.png")); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 210, 80));

        btnGuardar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\assets\\guardar.png")); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setIconTextGap(8);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 210, 80));
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 400, 30));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 400, 30));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 400, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverbuttontxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseClicked
        resumen_de_compra resumenCompra = new resumen_de_compra(control,user);
        resumenCompra.setVisible(true);
        resumenCompra.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volverbuttontxtMouseClicked

    private void volverbuttontxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseEntered
        volverbutton.setBackground(new Color(232, 17, 35, 255));
        volverbuttontxt.setForeground(Color.white);
    }//GEN-LAST:event_volverbuttontxtMouseEntered

    private void volverbuttontxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverbuttontxtMouseExited
        volverbutton.setBackground(Color.white);
        volverbuttontxt.setForeground(Color.black);
    }//GEN-LAST:event_volverbuttontxtMouseExited

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtApellidos.setText("");
        txtDNI.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        txtNombres.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String dni = txtDNI.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String email = txtEmail.getText();

        if (nombres.isEmpty() || dni.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombre y DNI son obligatorios");
            return;
        }

        if (carrito == null || carrito.getProductos().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El carrito esta vacio");
        }
        carrito.limpiarProductosInvalidos();
        for (String p : carrito.getProductos().keySet()) {
            int cantidad = carrito.getCantidad(p);
            double precio = carrito.getPrecio(p);
            System.out.println(p + " - Cantidad: " + cantidad + " - Precio: " + precio);
        }
        
        for (String nombreProducto : carrito.getProductos().keySet()) {
            int cantidad = carrito.getCantidad(nombreProducto);
            double precio = carrito.getPrecio(nombreProducto);
            
            System.out.println("Validando: " + nombreProducto + " | Cantidad: "+ cantidad + " | Precio: "+precio);
            
            if (nombreProducto == null || nombreProducto.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Se encontro un producto sin nombre. Compra no registrada");
                continue;
            }
            
            if (cantidad<= 0 || precio <= 0.0) {
                JOptionPane.showMessageDialog(null, "Producto con cantidad o precio invalido: " + nombreProducto);
                continue;
            }
            
            if (cantidad>0 && precio>0.0){
            Compra compra = new Compra(
                    nombreProducto, 
                    precio,
                    nombres, 
                    apellidos, 
                    dni, 
                    direccion, 
                    telefono, 
                    email, 
                    cantidad
            );
                try {
                    new CompraJpaController().crear(compra);
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al guardar: "+e.getMessage());
                }
            }
        }
        carrito.limpiarProductosInvalidos();
        resumen_de_compra resumen = new resumen_de_compra(control,user);
        resumen.setVisible(true);
        resumen.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombres;
    private javax.swing.JLabel labelReferencia;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JPanel volverbutton;
    private javax.swing.JLabel volverbuttontxt;
    // End of variables declaration//GEN-END:variables
}
