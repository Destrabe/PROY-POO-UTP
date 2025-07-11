
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import logica.rol;
import persistencia.exceptions.NonexistentEntityException;

public class controladoraPersistenciaLogin {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    rolJpaController rolJpa = new rolJpaController();

    public List<Usuario> traerUsuarios() {
       
        List<Usuario> listaUsuario = usuJpa.findUsuarioEntities();
        return listaUsuario;
    }

    public List<rol> traerRoles() {
        return rolJpa.findrolEntities();
         
    }

    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }

    public void borrarUsuario(int id_usuario) {
        try {
            usuJpa.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladoraPersistenciaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id_usuario) {
        return usuJpa.findUsuario(id_usuario);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(controladoraPersistenciaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}