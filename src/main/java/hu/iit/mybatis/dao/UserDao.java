package hu.iit.mybatis.dao;

import hu.iit.mybatis.model.User;
import hu.iit.mybatis.session.SessionFactory;

import java.util.List;

public class UserDao {
    private SessionFactory sessionFactory;

    public UserDao() { sessionFactory = new SessionFactory(); }

    public void save(User user) {
        var session = this.sessionFactory.getSqlSessionFactory().openSession();
        session.insert("User.insertUser", user);
        session.commit();
        session.close();
    }

    public void update(User user) {
        var session = this.sessionFactory.getSqlSessionFactory().openSession();
        session.update("User.updateUser", user);
        session.commit();
        session.close();
    }

    public void delete(Integer id) {
        var session = this.sessionFactory.getSqlSessionFactory().openSession();
        session.delete("User.deleteUser", id);
        session.commit();
        session.close();
    }

    public User get(Integer id) {
        var session = this.sessionFactory.getSqlSessionFactory().openSession();
        User user = session.selectOne("User.selectUser", id);
        session.close();

        return user;
    }

    public List<User> getAll() {
        var session = this.sessionFactory.getSqlSessionFactory().openSession();
        List<User> users = session.selectList("User.selectAllUser");
        session.close();

        return users;
    }
}
