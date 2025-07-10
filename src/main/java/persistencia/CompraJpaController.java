
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import logica.Compra;

public class CompraJpaController implements Serializable{
        
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("loginPU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(Compra compra) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(compra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void editar(Compra compra) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(compra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(Long id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Compra compra = em.find(Compra.class, id);
            if (compra != null) {
                em.remove(compra);
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Compra buscarPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Compra.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Compra> listarTodos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Compra> query = em.createQuery("SELECT c FROM Compra c", Compra.class);
            return query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
