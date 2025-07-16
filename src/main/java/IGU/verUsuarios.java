
package IGU;

import java.awt.Color;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Usuario;
import logica.controladoraLogicaLogin;

/**
 *
 * @author Marco
 */
public class verUsuarios extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    controladoraLogicaLogin control;
    Usuario user;

    public verUsuarios(controladoraLogicaLogin control,Usuario user) {
        initComponents();
        this.setSize(900, 550);
        this.setLocationRelativeTo(null);
        this.control = control;
        this.user = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitBtnTxt = new javax.swing.JLabel();
        principal = new javax.swing.JPanel();
        volverBtn = new javax.swing.JPanel();
        volverBtnTxt = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JPanel();
        deleteBtnTxt = new javax.swing.JLabel();
        editBtn = new javax.swing.JPanel();
        editBtnTxt = new javax.swing.JLabel();
        addBtn = new javax.swing.JPanel();
        addBtnTxt = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JPanel();
        refreshBtnTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        tituloTabla = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

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
        background.setForeground(new java.awt.Color(0, 0, 0));

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
            .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        principal.setBackground(new java.awt.Color(255, 255, 255));

        volverBtn.setBackground(new java.awt.Color(30, 41, 59));

        volverBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volverBtnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/homeIcon.png"))); // NOI18N
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
            .addComponent(volverBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        volverBtnLayout.setVerticalGroup(
            volverBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        deleteBtn.setBackground(new java.awt.Color(30, 41, 59));

        deleteBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteBtnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deleteIcon.png"))); // NOI18N
        deleteBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout deleteBtnLayout = new javax.swing.GroupLayout(deleteBtn);
        deleteBtn.setLayout(deleteBtnLayout);
        deleteBtnLayout.setHorizontalGroup(
            deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deleteBtnLayout.setVerticalGroup(
            deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        editBtn.setBackground(new java.awt.Color(30, 41, 59));

        editBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editBtnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editIcon.png"))); // NOI18N
        editBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout editBtnLayout = new javax.swing.GroupLayout(editBtn);
        editBtn.setLayout(editBtnLayout);
        editBtnLayout.setHorizontalGroup(
            editBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editBtnLayout.setVerticalGroup(
            editBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        addBtn.setBackground(new java.awt.Color(30, 41, 59));

        addBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBtnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addIcon.png"))); // NOI18N
        addBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout addBtnLayout = new javax.swing.GroupLayout(addBtn);
        addBtn.setLayout(addBtnLayout);
        addBtnLayout.setHorizontalGroup(
            addBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        addBtnLayout.setVerticalGroup(
            addBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        refreshBtn.setBackground(new java.awt.Color(30, 41, 59));

        refreshBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refreshBtnTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/refreshIcon.png"))); // NOI18N
        refreshBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout refreshBtnLayout = new javax.swing.GroupLayout(refreshBtn);
        refreshBtn.setLayout(refreshBtnLayout);
        refreshBtnLayout.setHorizontalGroup(
            refreshBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(refreshBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        refreshBtnLayout.setVerticalGroup(
            refreshBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(refreshBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        tituloTabla.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        tituloTabla.setForeground(new java.awt.Color(0, 0, 0));
        tituloTabla.setText("Usuarios");

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(tituloTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(volverBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(volverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        titulo.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Visualización de Usuarios");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void volverBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBtnTxtMouseClicked
        principalAdmin princUser = new principalAdmin(control,user);
               princUser.setVisible(true);
               princUser.setLocationRelativeTo(null);
               this.dispose();
    }//GEN-LAST:event_volverBtnTxtMouseClicked

    private void volverBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBtnTxtMouseEntered
        volverBtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_volverBtnTxtMouseEntered

    private void volverBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBtnTxtMouseExited
        volverBtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_volverBtnTxtMouseExited

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    
    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y- yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void deleteBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnTxtMouseEntered
        deleteBtn.setBackground(new Color(232,17,35,255));
    }//GEN-LAST:event_deleteBtnTxtMouseEntered

    private void deleteBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnTxtMouseExited
        deleteBtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_deleteBtnTxtMouseExited

    private void editBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnTxtMouseEntered
        editBtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_editBtnTxtMouseEntered

    private void editBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnTxtMouseExited
        editBtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_editBtnTxtMouseExited

    private void addBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnTxtMouseEntered
        addBtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_addBtnTxtMouseEntered

    private void addBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnTxtMouseExited
        addBtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_addBtnTxtMouseExited

    private void refreshBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnTxtMouseEntered
        refreshBtn.setBackground(new Color(70, 95, 125));
    }//GEN-LAST:event_refreshBtnTxtMouseEntered

    private void refreshBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnTxtMouseExited
        refreshBtn.setBackground(new Color(45,62,85));
    }//GEN-LAST:event_refreshBtnTxtMouseExited

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

    private void refreshBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnTxtMouseClicked
        cargarTabla();
    }//GEN-LAST:event_refreshBtnTxtMouseClicked

    private void addBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnTxtMouseClicked
        agregarUsuarios add = new agregarUsuarios(control,user);
        add.setVisible(true);
        add.setLocationRelativeTo(add);
        this.dispose();
    }//GEN-LAST:event_addBtnTxtMouseClicked

    private void deleteBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnTxtMouseClicked
        if (tablaUsuarios.getRowCount() > 0) {
            
        if (tablaUsuarios.getSelectedRow() != -1) {
            
            int confirmacion = JOptionPane.showConfirmDialog(this, 
                "¿Estás seguro de que deseas eliminar este usuario?", 
                "Confirmar eliminación", 
                JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                int id_usuario = Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)));

                control.borrarUsuario(id_usuario);
                
                mostrarMensaje("Se borró el usuario correctamente", "Info", "Eliminación Correcta");

                cargarTabla();
            }
        } else {
            mostrarMensaje("No seleccionaste ningún registro", "Error", "Error al borrar");
        }
    } else {
        mostrarMensaje("La tabla está vacía", "Error", "Error al borrar");
    }
    }//GEN-LAST:event_deleteBtnTxtMouseClicked

    private void editBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnTxtMouseClicked
        if (tablaUsuarios.getRowCount() > 0) {
            if (tablaUsuarios.getSelectedRow()!=-1) {
                
                int id_usuario = Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(),0)));
           
                editarUsuario pantallaEdic = new editarUsuario(this,control,id_usuario);
                pantallaEdic.setVisible(true);
                pantallaEdic.setLocationRelativeTo(null);  
                this.dispose();
                
                
            }
            else {
                mostrarMensaje ("No selecciono ningún registro", "Error", "Error al editar");
            }
        
        }
        else {
            mostrarMensaje ("La tabla está vacía", "Error", "Error al editar");
        }
    }//GEN-LAST:event_editBtnTxtMouseClicked

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
    
    public void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){
           @Override
           public boolean isCellEditable (int row, int column){
               return false;
           }
        };
        String titulos[] = { "Id", "Usuario","Contraseña","Rol"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Data
        List<Usuario> listaUsuarios = control.traerUsuarios();
        
        if (listaUsuarios!=null) {
            listaUsuarios.sort((u1,u2)->Integer.compare(
                    u1.getId(),
                    u2.getId()));
            for (Usuario usu : listaUsuarios) {
                Object[] objeto = {
                    usu.getId(),
                    usu.getNombreUsuario(),
                    usu.getContrasenia(),
                    usu.getUnRol().getNombreRol()
                };
                modeloTabla.addRow(objeto);
            }
        }
        tablaUsuarios.setModel(modeloTabla);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addBtn;
    private javax.swing.JLabel addBtnTxt;
    private javax.swing.JPanel background;
    private javax.swing.JPanel deleteBtn;
    private javax.swing.JLabel deleteBtnTxt;
    private javax.swing.JPanel editBtn;
    private javax.swing.JLabel editBtnTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitBtnTxt;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel principal;
    private javax.swing.JPanel refreshBtn;
    private javax.swing.JLabel refreshBtnTxt;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloTabla;
    private javax.swing.JPanel volverBtn;
    private javax.swing.JLabel volverBtnTxt;
    // End of variables declaration//GEN-END:variables

}
