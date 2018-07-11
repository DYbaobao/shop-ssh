package com.ssh.service.impl;

import com.ssh.dao.UserDao;
import com.ssh.entity.User;
import com.ssh.service.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/7/11.
 */
@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    private UserDao userDao;
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession () {
        return this.sessionFactory.openSession();
    }
    @Override
    public Integer saveUser(User user) {
        return null;
    }

    @Override
    public Integer saveUser() {
        Transaction transaction = getCurrentSession().beginTransaction();
        User user = new User();
        user.setUserName("dskslg");
        user.setAddress("北京");
        user.setEmail("rrrr@163.com");
        user.setPassword("123456");

        int num = 0;
        try {
             num = userDao.save(user);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return num;
    }
}
