package crud.persistence.dao;

import java.util.List;

import crud.persistence.entity.User;

public interface UserDao {

    void create(User user);
    void update(User user);
    void delete(String id);
    User findById(String id);
    boolean existByEmail(String email);
    List<User> findAll();
}