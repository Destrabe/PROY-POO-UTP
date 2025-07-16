
package logica;

public class SesionDeCompra {
    
    //Datos temporales que se mantienen mientras la dure la sesion
    private static String nombres;
    private static String apellidos;
    private static String dni;
    private static String direccion;
    private static String telefono;
    private static String email;

    //Limpiar sesion al finalizar compra
    public static void cerrarSesion(){
        nombres=null;
        apellidos=null;
        dni=null;
        direccion=null;
        telefono=null;
        email=null;
    }

    public static String getNombres() {
        return nombres;
    }

    public static void setNombres(String aNombres) {
        nombres = aNombres;
    }

    public static String getApellidos() {
        return apellidos;
    }

    public static void setApellidos(String aApellidos) {
        apellidos = aApellidos;
    }

    public static String getDni() {
        return dni;
    }

    public static void setDni(String aDni) {
        dni = aDni;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String aDireccion) {
        direccion = aDireccion;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String aTelefono) {
        telefono = aTelefono;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String aEmail) {
        email = aEmail;
    }
}
