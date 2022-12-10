package com.sean.dao.impl;

import com.sean.dao.UserDao;
import com.sean.domain.User;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 22:23
 */
public class UserDaoImpl2 implements UserDao {
    @Override
    public String getUserNameById(Integer id) {
        return "lisi1";
    }
    public User getUserById(Integer id) {
        return new User(1, "beijing2", 26);
    }

    @Override
    public String toString() {
        return "UserDaoImpl2";
    }
}
