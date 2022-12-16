package com.sean.dao.impl;

import com.sean.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-15 21:52
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void show() {
        System.out.println("query database...............");
    }
}
