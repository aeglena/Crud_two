package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    void delete(Long id);
    void update(User user, Long id);
    User read(Long id);
    List<User> readAll();
}

