
package logica;

import java.util.List;
import persistencia.controladoraPersistenciaLogin;


public class controladoraLogicaLogin {
    controladoraPersistenciaLogin controlPersis;
    
    public controladoraLogicaLogin(){
        controlPersis = new controladoraPersistenciaLogin();
    }
    
    
public String validarUsuarios(String usuario, String contrasenia) {
    String mensaje = "";
    List<Usuario> listaUsuarios = controlPersis.traerUsuarios();

    System.out.println("---- Lista de usuarios en BD ----");
    for (Usuario usu : listaUsuarios) {
    System.out.println("Usuario: [" + usu.getNombreUsuario() + "] | Contraseña: [" + usu.getContrasenia() + "]");
    }

    for (Usuario usu : listaUsuarios) {
        if (usu.getNombreUsuario().trim().equals(usuario.trim())) {
            if (usu.getContrasenia().trim().equals(contrasenia.trim())) {
                mensaje = "Usuario y contraseña correctos. Bienvenido/a!";
            } else {
                mensaje = "Contraseña incorrecta";
            }
            return mensaje;
        }
    }

    mensaje = "Usuario no encontrado";
    return mensaje;
}


}
