package com.lanou.dao.impl;

import com.lanou.dao.UserDao;
import com.lanou.domain.User;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dllo on 17/10/25.
 */
public class UserDaoImpl3 extends HibernateDaoSupport implements UserDao {
    @Override
    public boolean login(String name, String psw) {
        User user = new User(name,psw);
        Object[]params = {name,psw};
      List<User> users = (List<User>) getHibernateTemplate().find("from User where loginName=? and password=?",params);
        return users.size()>0;
    }

    /**
     * 通过主键id获得某个对象
     * @param id 主键id
     * @return
     */
    public User get(Serializable id){
        Session session = currentSession();
        User user = (User) session.get(User.class,id);
        return user;
    }
}
