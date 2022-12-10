package com.sean.dao.impl;

import com.sean.dao.UserDao;
import com.sean.domain.User;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 22:21
 */
public class UserDaoImpl1 implements UserDao {
    @Override
    public String getUserNameById(Integer id) {
        return "xishi1";
    }

    @Override
    public User getUserById(Integer id) {
        return new User(1, "beijing1", 44);
    }

    @Override
    public String toString() {
        return "xishi1";
    }
}
