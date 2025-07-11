package logica;

import java.util.List;
import javax.swing.JOptionPane;
import persistencia.controladoraPersistenciaLogin;

public class controladoraLogicaLogin {
    
    private controladoraPersistenciaLogin controlPersis;

    public controladoraLogicaLogin() {
        controlPersis = new controladoraPersistenciaLogin();
    }
    
    public Usuario validarUsuarios(String usuario, String contrasenia) {
        Usuario user = null;
        boolean usuarioEncontrado = false;
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        System.out.println("---- Lista de usuarios en BD ----");
        for (Usuario usu : listaUsuarios) {
            String nombreRol = (usu.getUnRol() != null)
                ? usu.getUnRol().getNombreRol()
                : "SIN ROL";
            System.out.printf(
                "Usuario: [%s] | Contraseña: [%s] | Rol: [%s]%n",
                usu.getNombreUsuario(),
                usu.getContrasenia(),
                nombreRol
            );
        }
        
        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().trim().equals(usuario.trim())) {
                usuarioEncontrado = true;
                if (usu.getContrasenia().trim().equals(contrasenia.trim())) {
                    user = usu;
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Contraseña incorrecta",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                return user; 
            }
        }
        
        if (!usuarioEncontrado) {
            JOptionPane.showMessageDialog(
                null,
                "Usuario no encontrado",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
        return null;
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public List<rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void crearUsuario(String usuario, String contra, String rolRecibido) {
        Usuario usu = new Usuario();
        usu.setNombreUsuario(usuario);
        usu.setContrasenia(contra);
        
        rol rolEncontrado = this.traerRol(rolRecibido);
        if (rolEncontrado != null) {
            usu.setUnRol(rolEncontrado);
        }
     
        int id = this.buscarUltimaIdUsuarios();
        usu.setId(id + 1);
        
        controlPersis.crearUsuario(usu);
    }

    private rol traerRol(String rolRecibido) {
        for (rol r : controlPersis.traerRoles()) {
            if (r.getNombreRol().equals(rolRecibido)) {
                return r;
            }
        }
        return null;
    }

    private int buscarUltimaIdUsuarios() {
        List<Usuario> listaUsuarios = this.traerUsuarios();
        if (listaUsuarios.isEmpty()) {
            return 0;
        }
        Usuario ultimo = listaUsuarios.get(listaUsuarios.size() - 1);
        return ultimo.getId();
    }

    public void borrarUsuario(int id_usuario) {
        controlPersis.borrarUsuario(id_usuario);
    }

    public Usuario traerUsuario(int id_usuario) {
        return controlPersis.traerUsuario(id_usuario);
    }

    public void editarUsuario(Usuario usu, String usuario, String contra, String rolRecibido) {
        usu.setNombreUsuario(usuario);
        usu.setContrasenia(contra);
        
        rol rolEncontrado = this.traerRol(rolRecibido);
        if (rolEncontrado != null) {
            usu.setUnRol(rolEncontrado);
        }
        controlPersis.editarUsuario(usu);
    }
}
