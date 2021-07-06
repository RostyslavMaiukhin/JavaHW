package crud.service;

import crud.config.ObjectFactory;
import crud.persistence.dao.UserDao;
import crud.persistence.entity.User;
import crud.service.UserCrudService;

import java.util.List;

public class UserCrudServiceImpl implements UserCrudService {

    private final UserDao userDao = ObjectFactory.getInstance().getImplClass(UserDao.class);

    public void create(User user) {
        if (!userDao.existByEmail(user.getEmail())) {
            userDao.create(user);
        }
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(String id) {
        userDao.delete(id);
    }

    public User findById(String id) {
        return userDao.findById(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}