package com.sean.dao.impl;

import com.sean.dao.UserDao;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 22:23
 */
public class UserDaoImpl2 implements UserDao {
    @Override
    public String getUserNameById(Integer id) {
        return "xishi2";
    }

    @Override
    public String toString() {
        return "UserDaoImpl2";
    }
}
