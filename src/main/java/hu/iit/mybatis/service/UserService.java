package hu.iit.mybatis.service;

import java.util.List;

import hu.iit.mybatis.model.User;

public interface UserService {

    User getUser(Integer id);

    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);
}
