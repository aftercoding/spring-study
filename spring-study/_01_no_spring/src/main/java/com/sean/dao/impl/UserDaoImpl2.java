package com.sean.dao.impl;

import com.sean.dao.UserDao;
import com.sean.domain.User;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 18:42
 */
public class UserDaoImpl2 implements UserDao {

    @Override
    public String getUserNameById(int id) {
        return "lissi2";
    }

    @Override
    public User getUserById(int id) {
        return new User(2, "beijing2", 37);
    }
}
