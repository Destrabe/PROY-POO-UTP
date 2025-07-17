
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
        this.setLocationRelativeTo(null);
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
        botones = new javax.swing.JPanel();
        productosbtn = new components.PanelRound();
        productosbtntxt = new javax.swing.JLabel();
        cerrarsesionbtn = new components.PanelRound();
        cerrarsesionbtntxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        sistemadeventasusuariolabel.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        sistemadeventasusuariolabel.setForeground(new java.awt.Color(0, 0, 0));
        sistemadeventasusuariolabel.setText("SISTEMA DE VENTAS");

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

        botones.setBackground(new java.awt.Color(255, 255, 255));

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
            .addComponent(productosbtntxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        productosbtnLayout.setVerticalGroup(
            productosbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productosbtntxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

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
            .addComponent(cerrarsesionbtntxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        cerrarsesionbtnLayout.setVerticalGroup(
            cerrarsesionbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarsesionbtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productosbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarsesionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(productosbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(cerrarsesionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\assets\\logo_temporal.png")); // NOI18N

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(136, 136, 136))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sistemadeventasusuariolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sistemadeventasusuariolabel)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(161, 161, 161))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel botones;
    private components.PanelRound cerrarsesionbtn;
    private javax.swing.JLabel cerrarsesionbtntxt;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitBtnTxt;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel1;
    private components.PanelRound productosbtn;
    private javax.swing.JLabel productosbtntxt;
    private javax.swing.JLabel sistemadeventasusuariolabel;
    // End of variables declaration//GEN-END:variables
}
