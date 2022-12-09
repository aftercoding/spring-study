package com.sean.dao.impl;

import com.sean.dao.UserDao;
import com.sean.domain.User;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 18:40
 */
public class UserDaoImpl1 implements UserDao {
    @Override
    public String getUserNameById(int id) {
        return "lissi1";
    }

    @Override
    public User getUserById(int id) {
        return new User(1, "beijing", 27);
    }
}
