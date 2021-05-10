package hu.iit.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.iit.mybatis.dao.UserDao;
import hu.iit.mybatis.model.User;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() { this.userDao = new UserDao(); }

    @Override
    public User getUser(Integer id) {
        return this.userDao.get(id);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userDao.getAll();
    }

    @Override
    public void createUser(User user) {
        this.userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        this.userDao.update(user);
    }

    @Override
    public void deleteUser(Integer id) {
        this.userDao.delete(id);
    }
}
