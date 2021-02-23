package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import javax.persistence.EntityManager;
import java.util.List;
@Service
//@Component
public class UserServiceImpl implements UserService{

    private EntityManager em;

    public UserServiceImpl(EntityManager em){
        this.em=em;
    }

    @Autowired
    private UserDao userDao;
    //UserDao userDao = new UserDaoImpl();
   // @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user, Long id) {
        userDao.update(user, id);
    }

    @Override
    public User read(Long id) {
        return userDao.read(id);
    }

    @Override
    public List<User> readAll() {
        return userDao.readAll();
    }
}

