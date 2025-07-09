
package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;
import logica.rol;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author marco
 */
public class rolJpaController implements Serializable {

    public rolJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public rolJpaController() {
        emf = Persistence.createEntityManagerFactory("loginPU");
    }
    
    public void create(rol rol) {
        if (rol.getListaUsuarios() == null) {
            rol.setListaUsuarios(new ArrayList<Usuario>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Usuario> attachedListaUsuarios = new ArrayList<Usuario>();
            for (Usuario listaUsuariosUsuarioToAttach : rol.getListaUsuarios()) {
                listaUsuariosUsuarioToAttach = em.getReference(listaUsuariosUsuarioToAttach.getClass(), listaUsuariosUsuarioToAttach.getId());
                attachedListaUsuarios.add(listaUsuariosUsuarioToAttach);
            }
            rol.setListaUsuarios(attachedListaUsuarios);
            em.persist(rol);
            for (Usuario listaUsuariosUsuario : rol.getListaUsuarios()) {
                rol oldUnRolOfListaUsuariosUsuario = listaUsuariosUsuario.getUnRol();
                listaUsuariosUsuario.setUnRol(rol);
                listaUsuariosUsuario = em.merge(listaUsuariosUsuario);
                if (oldUnRolOfListaUsuariosUsuario != null) {
                    oldUnRolOfListaUsuariosUsuario.getListaUsuarios().remove(listaUsuariosUsuario);
                    oldUnRolOfListaUsuariosUsuario = em.merge(oldUnRolOfListaUsuariosUsuario);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(rol rol) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            rol persistentrol = em.find(rol.class, rol.getId());
            List<Usuario> listaUsuariosOld = persistentrol.getListaUsuarios();
            List<Usuario> listaUsuariosNew = rol.getListaUsuarios();
            List<Usuario> attachedListaUsuariosNew = new ArrayList<Usuario>();
            for (Usuario listaUsuariosNewUsuarioToAttach : listaUsuariosNew) {
                listaUsuariosNewUsuarioToAttach = em.getReference(listaUsuariosNewUsuarioToAttach.getClass(), listaUsuariosNewUsuarioToAttach.getId());
                attachedListaUsuariosNew.add(listaUsuariosNewUsuarioToAttach);
            }
            listaUsuariosNew = attachedListaUsuariosNew;
            rol.setListaUsuarios(listaUsuariosNew);
            rol = em.merge(rol);
            for (Usuario listaUsuariosOldUsuario : listaUsuariosOld) {
                if (!listaUsuariosNew.contains(listaUsuariosOldUsuario)) {
                    listaUsuariosOldUsuario.setUnRol(null);
                    listaUsuariosOldUsuario = em.merge(listaUsuariosOldUsuario);
                }
            }
            for (Usuario listaUsuariosNewUsuario : listaUsuariosNew) {
                if (!listaUsuariosOld.contains(listaUsuariosNewUsuario)) {
                    rol oldUnRolOfListaUsuariosNewUsuario = listaUsuariosNewUsuario.getUnRol();
                    listaUsuariosNewUsuario.setUnRol(rol);
                    listaUsuariosNewUsuario = em.merge(listaUsuariosNewUsuario);
                    if (oldUnRolOfListaUsuariosNewUsuario != null && !oldUnRolOfListaUsuariosNewUsuario.equals(rol)) {
                        oldUnRolOfListaUsuariosNewUsuario.getListaUsuarios().remove(listaUsuariosNewUsuario);
                        oldUnRolOfListaUsuariosNewUsuario = em.merge(oldUnRolOfListaUsuariosNewUsuario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = rol.getId();
                if (findrol(id) == null) {
                    throw new NonexistentEntityException("The rol with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            rol rol;
            try {
                rol = em.getReference(rol.class, id);
                rol.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The rol with id " + id + " no longer exists.", enfe);
            }
            List<Usuario> listaUsuarios = rol.getListaUsuarios();
            for (Usuario listaUsuariosUsuario : listaUsuarios) {
                listaUsuariosUsuario.setUnRol(null);
                listaUsuariosUsuario = em.merge(listaUsuariosUsuario);
            }
            em.remove(rol);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<rol> findrolEntities() {
        return findrolEntities(true, -1, -1);
    }

    public List<rol> findrolEntities(int maxResults, int firstResult) {
        return findrolEntities(false, maxResults, firstResult);
    }

    private List<rol> findrolEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(rol.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public rol findrol(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(rol.class, id);
        } finally {
            em.close();
        }
    }

    public int getrolCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<rol> rt = cq.from(rol.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
