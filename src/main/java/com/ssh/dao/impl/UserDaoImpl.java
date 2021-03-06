package com.ssh.dao.impl;

import com.ssh.dao.UserDao;
import com.ssh.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/7/11.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession () {
        return this.sessionFactory.openSession();
    }

    @Override
    public User load(Integer id) {
        return (User) getCurrentSession().load(User.class,id);
    }

    @Override
    public User get(Integer id) {
        return (User) getCurrentSession().get(User.class,id);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void persist(User entity) {
          getCurrentSession().persist(entity);
    }

    @Override
    public Integer save(User entity) {
        return (Integer) getCurrentSession().save(entity);
    }

    @Override
    public void saveOrUpdate(User entity) {
          getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(Integer id) {
          User user =load(id);
          getCurrentSession().delete(user);
    }

    @Override
    public void flush() {
          getCurrentSession().flush();
    }
}
