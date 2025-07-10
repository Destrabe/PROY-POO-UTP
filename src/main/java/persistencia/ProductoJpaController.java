package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import logica.Producto;

public class ProductoJpaController implements Serializable {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("loginPU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(Producto producto) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void editar(Producto producto) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(producto);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al editar el producto: " + e.getMessage());
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(int id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Producto producto = em.find(Producto.class, id);
            if (producto != null) {
                em.remove(producto);
            } else {
                throw new Exception("Producto no encontrado");
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Producto buscarPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> listarTodos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Producto> query = em.createQuery("SELECT p FROM Producto p", Producto.class);
            return query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
