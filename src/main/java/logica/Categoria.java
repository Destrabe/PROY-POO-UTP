
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria implements Serializable{    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long categoriaid;
    private String nombrecategoria;

    public Categoria() {
    }

    public Categoria(Long categoriaid, String nombrecategoria) {
        this.categoriaid = categoriaid;
        this.nombrecategoria = nombrecategoria;
    }

    public Long getCategoriaid() {
        return categoriaid;
    }

    public void setCategoriaid(Long categoriaid) {
        this.categoriaid = categoriaid;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }   
}
