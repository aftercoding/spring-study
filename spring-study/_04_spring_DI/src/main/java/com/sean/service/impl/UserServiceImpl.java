package com.sean.service.impl;

import com.sean.dao.UserDao;
import com.sean.service.UserService;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-09 18:27
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private int num;
    private String str;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl(UserDao userDao, int num, String str) {
        this.userDao = userDao;
        this.num = num;
        this.str = str;
    }

    public UserServiceImpl(){

    }

    @Override
    public void show() {
        userDao.show();
    }
}
