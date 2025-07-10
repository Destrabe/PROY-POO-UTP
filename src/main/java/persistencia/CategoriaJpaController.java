package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import logica.Categoria;

public class CategoriaJpaController implements Serializable {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("loginPU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(Categoria categoria) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(categoria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void editar(Categoria categoria) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(categoria);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al editar la categoria: " + e.getMessage());
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(Long id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Categoria categoria = em.find(Categoria.class, id);
            if (categoria != null) {
                em.remove(categoria);
            } else {
                throw new Exception("Categoria no encontrada");
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Categoria buscarPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Categoria.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Categoria> listarTodos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Categoria> query = em.createQuery("SELECT c FROM Categoria c", Categoria.class);
            return query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
