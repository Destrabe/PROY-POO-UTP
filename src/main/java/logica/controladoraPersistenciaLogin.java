
package logica;

import java.util.List;
import persistencia.usuarioJpaController;

public class controladoraPersistenciaLogin {
    usuarioJpaController usuarioJpa = new usuarioJpaController();

    public List<usuario> traerUsuarios() {
        return usuarioJpa.findusuarioEntities();
    }
    
}
