
package persistencia;

import java.util.List;
import logica.controladoraPersistenciaLogin;
import logica.usuario;

public class controladoraLogicaLogin {
    controladoraPersistenciaLogin controlPersis;
    
    public controladoraLogicaLogin(){
        controlPersis = new controladoraPersistenciaLogin();
    }
    
    
    public String validarUsuarios(String usuario, String contrasenia) {
        String mensaje="";
        List<usuario> listaUsuarios = controlPersis.traerUsuarios();

    for (usuario usu : listaUsuarios) {
        if (usu.getNombreUsuario().equals(usuario)) {
            if (usu.getContrasenia().equals(contrasenia)) {
                return "Usuario y contraseña correctos. Bienvenido/a!";
            } else {
                return "Contraseña incorrecta";
            }
        }
    }

    return "Usuario incorrecto";
}

}
