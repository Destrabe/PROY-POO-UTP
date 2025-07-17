
package IGU;

import java.awt.Color;
import javax.swing.JOptionPane;
import logica.CarritoDeCompras;
import logica.CarritoGlobal;
import logica.Compra;
import logica.SesionDeCompra;
import logica.Usuario;
import logica.controladoraLogicaLogin;
import persistencia.CompraJpaController;

/**
 *
 * @author Valentino
 */
public class registrar_datos extends javax.swing.JFrame {
    int xMouse, yMouse;
    
    private String producto;
    private double precio;
    controladoraLogicaLogin control;
    Usuario user;
    private CarritoDeCompras carrito= CarritoGlobal.getCarrito();

    public registrar_datos(CarritoDeCompras carrito,controladoraLogicaLogin control, Usuario user) {
        initComponents();
        if (SesionDeCompra.getNombres()!= null) {
            txtNombres.setText(SesionDeCompra.getNombres());
            txtApellidos.setText(SesionDeCompra.getApellidos());
            txtDNI.setText(SesionDeCompra.getDni());
            txtDireccion.setText(SesionDeCompra.getDireccion());
            txtTelefono.setText(SesionDeCompra.getTelefono());
            txtEmail.setText(SesionDeCompra.getEmail());
        }
        this.setSize(900, 550);
        this.carrito = carrito;
        this.control = control;
        this.user = user;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        labelRegistrarDatos = new javax.swing.JLabel();
        labelNombres = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        labelDNI = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelReferencia = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        header1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitBtnTxt = new javax.swing.JLabel();
        guardarbtn = new components.PanelRound();
        guardarbtntxt = new javax.swing.JLabel();
        limpiarbtn = new components.PanelRound();
        limpiarbtntxt = new javax.swing.JLabel();
        volverBtn = new components.PanelRound();
        volverBtnTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        labelRegistrarDatos.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        labelRegistrarDatos.setForeground(new java.awt.Color(0, 0, 0));
        labelRegistrarDatos.setText("REGISTRAR DATOS");

        labelNombres.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labelNombres.setForeground(new java.awt.Color(0, 0, 0));
        labelNombres.setText("NOMBRES:");

        labelApellidos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labelApellidos.setForeground(new java.awt.Color(0, 0, 0));
        labelApellidos.setText("APELLIDOS:");

        labelDNI.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labelDNI.setForeground(new java.awt.Color(0, 0, 0));
        labelDNI.setText("DNI:");

        labelDireccion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labelDireccion.setForeground(new java.awt.Color(0, 0, 0));
        labelDireccion.setText("DIRECCION:");

        labelTelefono.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(0, 0, 0));
        labelTelefono.setText("TELEFONO:");

        labelReferencia.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        labelReferencia.setForeground(new java.awt.Color(0, 0, 0));
        labelReferencia.setText("EMAIL:");

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
        exitBtnTxt.setFont(new java.awt.Font("Dubai Light", 1, 20)); // NOI18N
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

        guardarbtn.setBackground(new java.awt.Color(45, 62, 85));
        guardarbtn.setRoundBottomLeft(20);
        guardarbtn.setRoundBottomRight(20);
        guardarbtn.setRoundTopLeft(20);
        guardarbtn.setRoundTopRight(20);

        guardarbtntxt.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        guardarbtntxt.setForeground(new java.awt.Color(255, 255, 255));
        guardarbtntxt.setText("      GUARDAR");
        guardarbtntxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarbtntxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarbtntxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarbtntxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout guardarbtnLayout = new javax.swing.GroupLayout(guardarbtn);
        guardarbtn.setLayout(guardarbtnLayout);
        guardarbtnLayout.setHorizontalGroup(
            guardarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guardarbtntxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );
        guardarbtnLayout.setVerticalGroup(
            guardarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guardarbtntxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        limpiarbtn.setBackground(new java.awt.Color(45, 62, 85));
        limpiarbtn.setRoundBottomLeft(20);
        limpiarbtn.setRoundBottomRight(20);
        limpiarbtn.setRoundTopLeft(20);
        limpiarbtn.setRoundTopRight(20);

        limpiarbtntxt.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        limpiarbtntxt.setForeground(new java.awt.Color(255, 255, 255));
        limpiarbtntxt.setText("        LIMPIAR");
        limpiarbtntxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarbtntxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                limpiarbtntxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                limpiarbtntxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout limpiarbtnLayout = new javax.swing.GroupLayout(limpiarbtn);
        limpiarbtn.setLayout(limpiarbtnLayout);
        limpiarbtnLayout.setHorizontalGroup(
            limpiarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(limpiarbtntxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );
        limpiarbtnLayout.setVerticalGroup(
            limpiarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(limpiarbtntxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        volverBtn.setBackground(new java.awt.Color(30, 41, 59));
        volverBtn.setRoundBottomLeft(25);
        volverBtn.setRoundBottomRight(25);
        volverBtn.setRoundTopLeft(25);
        volverBtn.setRoundTopRight(25);

        volverBtnTxt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        volverBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        volverBtnTxt.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\assets\\backIcon.png")); // NOI18N
        volverBtnTxt.setText("Volver");
        volverBtnTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 13, 1, 1));
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
            .addComponent(volverBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        volverBtnLayout.setVerticalGroup(
            volverBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(volverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(labelRegistrarDatos))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(labelNombres)
                .addGap(11, 11, 11)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelApellidos)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(labelDNI))
                    .addComponent(labelDireccion))
                .addGap(2, 2, 2)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTelefono)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelReferencia)))
                .addGap(6, 6, 6)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(limpiarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(labelRegistrarDatos)))
                .addGap(50, 50, 50)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelNombres))
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelApellidos)
                        .addGap(21, 21, 21)
                        .addComponent(labelDNI)
                        .addGap(21, 21, 21)
                        .addComponent(labelDireccion))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelTelefono)
                        .addGap(21, 21, 21)
                        .addComponent(labelReferencia))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limpiarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void limpiarbtntxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarbtntxtMouseEntered
        limpiarbtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_limpiarbtntxtMouseEntered

    private void limpiarbtntxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarbtntxtMouseExited
        limpiarbtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_limpiarbtntxtMouseExited

    private void limpiarbtntxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarbtntxtMouseClicked
        txtApellidos.setText("");
        txtDNI.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        txtNombres.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_limpiarbtntxtMouseClicked

    private void guardarbtntxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarbtntxtMouseEntered
        guardarbtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_guardarbtntxtMouseEntered

    private void guardarbtntxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarbtntxtMouseExited
        guardarbtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_guardarbtntxtMouseExited

    private void guardarbtntxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarbtntxtMouseClicked
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String dni = txtDNI.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String email = txtEmail.getText();
        
        //guardamos los datos en la sesion
        SesionDeCompra.setNombres(nombres);
        SesionDeCompra.setApellidos(apellidos);
        SesionDeCompra.setDni(dni);
        SesionDeCompra.setDireccion(direccion);
        SesionDeCompra.setTelefono(telefono);
        SesionDeCompra.setEmail(email);
        
        //validaciones basicas
        if (nombres.isEmpty() || dni.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombre y DNI son obligatorios");
            return;
        }

        if (carrito == null || carrito.getProductos().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El carrito esta vacio");
        }
        
        carrito.limpiarProductosInvalidos(); //limpia productos invalidos
        
        //Recorremos el carrito para registrar cada compra
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
            
            //creamos la compra
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
            //guardamos la compra
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
    }//GEN-LAST:event_guardarbtntxtMouseClicked

    private void volverBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBtnTxtMouseClicked
        tienda_usuario ver=new tienda_usuario(control, user);
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
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitBtnTxt;
    private components.PanelRound guardarbtn;
    private javax.swing.JLabel guardarbtntxt;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombres;
    private javax.swing.JLabel labelReferencia;
    private javax.swing.JLabel labelRegistrarDatos;
    private javax.swing.JLabel labelTelefono;
    private components.PanelRound limpiarbtn;
    private javax.swing.JLabel limpiarbtntxt;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private components.PanelRound volverBtn;
    private javax.swing.JLabel volverBtnTxt;
    // End of variables declaration//GEN-END:variables
}
