package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.config.PersistenceJPAConfig;
import web.model.User;
import javax.persistence.*;
import java.util.List;
@Component
//@Transactional
public class UserDaoImpl implements UserDao{
    @Autowired
private PersistenceJPAConfig jpaConfig;
//    @PersistenceUnit//@PersistenceContext(unitName = "entityManagerFactory")
//    private EntityManagerFactory emf;
//    EntityManagerFactory emf = (EntityManagerFactory) jpaConfig.entityManagerFactory();

    @Override
    public void save(User user) {
        EntityManager em = jpaConfig.entityManagerFactory().getObject().createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
         em.getTransaction().rollback();
    }
    @Override
    public void delete(Long id) {
        EntityManager em = jpaConfig.entityManagerFactory().getObject().createEntityManager();//EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        em.remove(user);
        em.getTransaction().commit();
        em.getTransaction().rollback();
    }

    @Override
    public void update(User userNew, Long idOld) {
        EntityManager em = jpaConfig.entityManagerFactory().getObject().createEntityManager(); //EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //User userOld = em.find(User.class, idOld);
//        em.remove(idOld);
        User user = new User();
        user.setId(idOld);
        user.setName(userNew.getName());
        user.setAge(userNew.getAge());
        user.setEmail(userNew.getEmail());
        em.merge(user);
        em.getTransaction().commit();
        em.getTransaction().rollback();
    }

    @Override
    public User read(Long id) {
        EntityManager em = jpaConfig.entityManagerFactory().getObject().createEntityManager();//emf.createEntityManager();//        EntityManager em = entityManagerFactory.getEntityManagerFactory().createEntityManager();
        //em.getTransaction().begin();
        return (em.find(User.class, id));
        //em.getTransaction().commit();
        //em.getTransaction().rollback();
    }

    @Override
    public List<User> readAll() {
        EntityManager em = jpaConfig.entityManagerFactory().getObject().createEntityManager();//EntityManager em = emf.createEntityManager();//EntityManager em = entityManagerFactory.getEntityManagerFactory().createEntityManager();
        //TypedQuery <User> query = (TypedQuery) em.createQuery("FROM User");
          return null;//query.getResultList();
        //return null;
    }
}

