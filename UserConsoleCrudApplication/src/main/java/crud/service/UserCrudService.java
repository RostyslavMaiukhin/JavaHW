package crud.service;

import crud.persistence.entity.User;

import java.util.List;


public interface UserCrudService {

    void create(User user);

    void update(User user);

    void delete(String id);

    User findById(String id);

    List<User> findAll();
}

