
package logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Producto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    
    @ManyToOne
    @JoinColumn(name= "categoriaid")
    
    private Categoria categoria;

    public Producto() {
    }

    public Producto(String nombre, Double precio, Categoria categoria) {        
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    

    
    
    
    
}
