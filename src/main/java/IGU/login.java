package IGU;

import java.awt.Color;
import javax.swing.JOptionPane;
import logica.Usuario;
import logica.controladoraLogicaLogin;

/**
 *
 * @author Marco
 */

public class login extends javax.swing.JFrame {
    
    controladoraLogicaLogin control;
    int xMouse, yMouse;
    
    public login() {
        initComponents();
        this.setSize(900, 550);
        this.setLocationRelativeTo(null);
        control = new controladoraLogicaLogin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        message01 = new javax.swing.JLabel();
        message02 = new javax.swing.JLabel();
        message03 = new javax.swing.JLabel();
        loginPnl = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        separatorUsuario = new javax.swing.JSeparator();
        passTxt = new javax.swing.JPasswordField();
        separatorPass = new javax.swing.JSeparator();
        IngresarBtn = new components.PanelRound();
        IngresarBtnTxt = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitBtnTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(30, 41, 59));

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\logo\\logo_temporal.png")); // NOI18N

        message01.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        message01.setForeground(new java.awt.Color(255, 255, 255));
        message01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message01.setText("PLATAFORMA DE VENTAS");

        message02.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        message02.setForeground(new java.awt.Color(255, 255, 255));
        message02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message02.setText("Tu herramienta de gestión comercial");

        message03.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        message03.setForeground(new java.awt.Color(255, 255, 255));
        message03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message03.setText("Optimiza tu proceso de ventas");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addComponent(message01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(message02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(message03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(message01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(message02)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(message03)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 550));

        loginPnl.setBackground(new java.awt.Color(255, 255, 255));

        loginLabel.setBackground(new java.awt.Color(0, 0, 0));
        loginLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(0, 0, 0));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("INICIAR SESION");

        usuarioLabel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(0, 0, 0));
        usuarioLabel.setText("USUARIO");

        userTxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setText("Ingrese su nombre de usuario");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });

        passLabel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(0, 0, 0));
        passLabel.setText("CONTRASEÑA");

        passTxt.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passTxt.setText("********");
        passTxt.setToolTipText("");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });

        IngresarBtn.setBackground(new java.awt.Color(45, 62, 85));
        IngresarBtn.setRoundBottomLeft(20);
        IngresarBtn.setRoundBottomRight(20);
        IngresarBtn.setRoundTopLeft(20);
        IngresarBtn.setRoundTopRight(20);

        IngresarBtnTxt.setBackground(new java.awt.Color(45, 62, 85));
        IngresarBtnTxt.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        IngresarBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        IngresarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IngresarBtnTxt.setText("INGRESAR");
        IngresarBtnTxt.setToolTipText("");
        IngresarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IngresarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IngresarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout IngresarBtnLayout = new javax.swing.GroupLayout(IngresarBtn);
        IngresarBtn.setLayout(IngresarBtnLayout);
        IngresarBtnLayout.setHorizontalGroup(
            IngresarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IngresarBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );
        IngresarBtnLayout.setVerticalGroup(
            IngresarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IngresarBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout loginPnlLayout = new javax.swing.GroupLayout(loginPnl);
        loginPnl.setLayout(loginPnlLayout);
        loginPnlLayout.setHorizontalGroup(
            loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPnlLayout.createSequentialGroup()
                .addGroup(loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginPnlLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                            .addComponent(usuarioLabel)
                            .addComponent(passLabel)
                            .addComponent(userTxt)
                            .addComponent(separatorUsuario)
                            .addComponent(passTxt)
                            .addComponent(separatorPass, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(loginPnlLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(IngresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPnlLayout.setVerticalGroup(
            loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPnlLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(loginLabel)
                .addGap(13, 13, 13)
                .addComponent(usuarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(IngresarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(loginPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 113, -1, -1));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitBtnTxt.setFont(new java.awt.Font("Dubai Light", 1, 20)); // NOI18N
        exitBtnTxt.setForeground(new java.awt.Color(0, 0, 0));
        exitBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBtnTxt.setText("X");
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
            .addComponent(exitBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 865, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

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
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
       if (userTxt.getText().equals("Ingrese su nombre de usuario")) {
        userTxt.setText("");
        userTxt.setForeground(Color.BLACK);
    }

    if (String.valueOf(passTxt.getPassword()).isEmpty()) {
        passTxt.setText("********");
        passTxt.setForeground(Color.GRAY);
    }
    }//GEN-LAST:event_userTxtMousePressed

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("********")) {
        passTxt.setText("");
        passTxt.setForeground(Color.BLACK);
    }

    if (userTxt.getText().isEmpty()) {
        userTxt.setText("Ingrese su nombre de usuario");
        userTxt.setForeground(Color.GRAY);
    }
    }//GEN-LAST:event_passTxtMousePressed

    private void IngresarBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarBtnTxtMouseClicked
        String usuario = userTxt.getText().trim();
        String contrasenia = passTxt.getText().trim();
        
        // Validación de campos vacíos
        if (usuario.isEmpty() && contrasenia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes completar ambos campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa un usuario.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (contrasenia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa una contraseña.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Usuario user= control.validarUsuarios(usuario,contrasenia);

        
        if(user!=null){
           String rol= user.getUnRol().getNombreRol();
           
           if(rol.equals("admin")){
               principalAdmin princAdmin = new principalAdmin(control,user);
               princAdmin.setVisible(true);
               princAdmin.setLocationRelativeTo(null);
               this.dispose();
           }if(rol.equals("user")){
               usuario_entrada princUser = new usuario_entrada(control,user);
               princUser.setVisible(true);
               princUser.setLocationRelativeTo(null);
               this.dispose();
           }
        }
    }//GEN-LAST:event_IngresarBtnTxtMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y- yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void IngresarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarBtnTxtMouseExited
        IngresarBtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_IngresarBtnTxtMouseExited

    private void IngresarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarBtnTxtMouseEntered
        IngresarBtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_IngresarBtnTxtMouseEntered

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.PanelRound IngresarBtn;
    private javax.swing.JLabel IngresarBtnTxt;
    private javax.swing.JPanel background;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitBtnTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPnl;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel message01;
    private javax.swing.JLabel message02;
    private javax.swing.JLabel message03;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JSeparator separatorPass;
    private javax.swing.JSeparator separatorUsuario;
    private javax.swing.JTextField userTxt;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
