package model;


import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EstudianteDao {
    private static final Logger log = Logger.getLogger(EstudianteDao.class);
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("UAGRM");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public boolean save(EstudianteEntity estudiante) {
        boolean save = false;
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            em.persist(estudiante);
            em.getTransaction().commit();
            em.close();
            save = true;
        } catch (Exception e) {
            log.error("El registro ya existe " + e.getMessage());
        }

        return save;
    }


}
