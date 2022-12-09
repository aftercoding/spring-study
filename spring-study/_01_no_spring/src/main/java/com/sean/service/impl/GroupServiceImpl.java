package com.sean.service.impl;

import com.sean.dao.UserDao;
import com.sean.dao.impl.UserDaoImpl1;
import com.sean.service.GroupService;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 20:38
 */
public class GroupServiceImpl implements GroupService {
    UserDao userDao = new UserDaoImpl1();
    @Override
    public void showUser() {
        System.out.println(userDao.getUserById(1));
    }

    @Override
    public void showUser2() {
        System.out.println(userDao.getUserById(1));
    }

    @Override
    public void showUser3() {
        System.out.println(userDao.getUserNameById(1));
    }
}
