
package IGU;

import components.TextPrompt;
import java.awt.Color;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import logica.Usuario;
import logica.controladoraLogicaLogin;
import logica.rol;

/**
 *
 * @author Marco
 */

public class agregarUsuarios extends javax.swing.JFrame {

    int xMouse, yMouse;
    controladoraLogicaLogin control;
    Usuario user;
    
    public agregarUsuarios(controladoraLogicaLogin control,Usuario user) {
    initComponents();
    this.control = control;
    this.user = user;
    this.setSize(900, 550);
    this.setLocationRelativeTo(null);
    TextPrompt userTextField = new TextPrompt("Crea tu nombre de usuario",userTxt);
    TextPrompt passTextField = new TextPrompt("Crea tu contraseña",passTxt);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        principal = new javax.swing.JPanel();
        texto01 = new javax.swing.JLabel();
        texto02 = new javax.swing.JLabel();
        texto03 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitBtnTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        rolCmb = new javax.swing.JComboBox<>();
        rolTxt = new javax.swing.JLabel();
        volverBtn = new components.PanelRound();
        volverBtnTxt = new javax.swing.JLabel();
        header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principal.setBackground(new java.awt.Color(30, 41, 59));

        texto01.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        texto01.setForeground(new java.awt.Color(255, 255, 255));
        texto01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto01.setText("Registrar Nuevo Usuario");

        texto02.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        texto02.setForeground(new java.awt.Color(255, 255, 255));
        texto02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto02.setText("Agrega un nuevo usuario al sistema");

        texto03.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        texto03.setForeground(new java.awt.Color(255, 255, 255));
        texto03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto03.setText("Asigna acceso a un colaborador");

        exitBtn.setBackground(new java.awt.Color(30, 41, 59));

        exitBtnTxt.setFont(new java.awt.Font("Dubai Light", 1, 20)); // NOI18N
        exitBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\marco\\Documents\\NetBeansProjects\\PROY-POO\\src\\main\\resources\\assets\\logo_temporal.png")); // NOI18N

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(texto03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(texto02, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(texto01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(texto02)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(texto03)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        background.add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 360, 550));

        loginPnl.setBackground(new java.awt.Color(255, 255, 255));

        loginLabel.setBackground(new java.awt.Color(0, 0, 0));
        loginLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(0, 0, 0));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("AGREGAR USUARIO");

        usuarioLabel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(0, 0, 0));
        usuarioLabel.setText("USUARIO");

        userTxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(0, 0, 0));
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

        passTxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        passTxt.setForeground(new java.awt.Color(0, 0, 0));
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
        IngresarBtnTxt.setText("REGISTRARSE");
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
            .addComponent(IngresarBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        rolCmb.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        rolTxt.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rolTxt.setForeground(new java.awt.Color(0, 0, 0));
        rolTxt.setText("ROL");

        javax.swing.GroupLayout loginPnlLayout = new javax.swing.GroupLayout(loginPnl);
        loginPnl.setLayout(loginPnlLayout);
        loginPnlLayout.setHorizontalGroup(
            loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rolCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(loginPnlLayout.createSequentialGroup()
                        .addGroup(loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usuarioLabel)
                                .addComponent(passLabel)
                                .addComponent(userTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                                .addComponent(separatorUsuario)
                                .addComponent(passTxt)
                                .addComponent(separatorPass, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(rolTxt))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPnlLayout.createSequentialGroup()
                .addGap(0, 140, Short.MAX_VALUE)
                .addComponent(IngresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        loginPnlLayout.setVerticalGroup(
            loginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPnlLayout.createSequentialGroup()
                .addComponent(loginLabel)
                .addGap(14, 14, 14)
                .addComponent(usuarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rolTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rolCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(IngresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        background.add(loginPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

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

        background.add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 49, -1, -1));

        header.setBackground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed

    }//GEN-LAST:event_userTxtMousePressed

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed

    }//GEN-LAST:event_passTxtMousePressed

    private void IngresarBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarBtnTxtMouseClicked
        String usuario = userTxt.getText();
        String contra = passTxt.getText();
        String rol = (String) rolCmb.getSelectedItem();
        
        control.crearUsuario(usuario,contra,rol);
        
        mostrarMensaje("Usuario creado correctamente", "Info", "Creación exitosa");
    }//GEN-LAST:event_IngresarBtnTxtMouseClicked

    public void mostrarMensaje (String mensaje, String tipo, String titulo) {
       JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
   
   }
    private void IngresarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarBtnTxtMouseEntered
        IngresarBtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_IngresarBtnTxtMouseEntered

    private void IngresarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarBtnTxtMouseExited
        IngresarBtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_IngresarBtnTxtMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        rolCmb.removeAllItems(); 
        List<rol> listaRoles = control.traerRoles();
    
        if (listaRoles != null) {
            System.out.println("Cargando roles...");
                for (rol r : listaRoles) {
                    System.out.println("Agregado: " + r.getNombreRol());
                    rolCmb.addItem(r.getNombreRol());
                }
        } else {
            System.out.println("No se encontraron roles.");
        }
    }//GEN-LAST:event_formWindowOpened

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y- yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void volverBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBtnTxtMouseClicked
        verUsuarios ver=new verUsuarios(control,user);
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

    private void exitBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnTxtMouseClicked

    private void exitBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseEntered
        exitBtn.setBackground(new Color(232,17,35,255));
        exitBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitBtnTxtMouseEntered

    private void exitBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnTxtMouseExited
        exitBtn.setBackground(new Color(30,41,59));
        exitBtnTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitBtnTxtMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.PanelRound IngresarBtn;
    private javax.swing.JLabel IngresarBtnTxt;
    private javax.swing.JPanel background;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitBtnTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPnl;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JPanel principal;
    private javax.swing.JComboBox<String> rolCmb;
    private javax.swing.JLabel rolTxt;
    private javax.swing.JSeparator separatorPass;
    private javax.swing.JSeparator separatorUsuario;
    private javax.swing.JLabel texto01;
    private javax.swing.JLabel texto02;
    private javax.swing.JLabel texto03;
    private javax.swing.JTextField userTxt;
    private javax.swing.JLabel usuarioLabel;
    private components.PanelRound volverBtn;
    private javax.swing.JLabel volverBtnTxt;
    // End of variables declaration//GEN-END:variables

}
