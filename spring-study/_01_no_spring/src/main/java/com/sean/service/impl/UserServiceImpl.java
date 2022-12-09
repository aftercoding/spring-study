package com.sean.service.impl;

import com.sean.dao.UserDao;
import com.sean.dao.impl.UserDaoImpl1;
import com.sean.dao.impl.UserDaoImpl2;
import com.sean.service.UserService;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 20:12
 */
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl2();
    @Override
    public void showUser() {
        System.out.println(userDao.getUserById(1));
    }

    @Override
    public void showUser2() {
        System.out.println(userDao.getUserNameById(1));
    }

    @Override
    public void showUser3() {
        System.out.println(userDao.getUserNameById(1));
    }
}
