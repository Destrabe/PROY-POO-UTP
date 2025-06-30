
package persistencia;

import java.util.List;
import logica.Usuario;



public class controladoraPersistenciaLogin {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        
        List<Usuario> listaUsuario = usuarioJpa.findUsuarioEntities();
        return listaUsuario;
    }
    
}
