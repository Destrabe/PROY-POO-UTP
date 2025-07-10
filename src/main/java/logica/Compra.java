
package logica;
    import java.io.Serializable;
    import javax.persistence.*;
@Entity
public class Compra implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombreproducto;
    private Double precioproducto;
    private String nombres;
    private String apellidos;
    private String dni;
    private String direccion;
    private String telefono;
    private String email;
    private int cantidad;

    public Compra() {
    }

    public Compra(String nombreproducto, Double precioproducto, String nombres, String apellidos, String dni, String direccion, String telefono, String email, int cantidad) {
        this.nombreproducto = nombreproducto;
        this.precioproducto = precioproducto;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.cantidad = cantidad;
    }

    

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public Double getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(Double precioproducto) {
        this.precioproducto = precioproducto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
