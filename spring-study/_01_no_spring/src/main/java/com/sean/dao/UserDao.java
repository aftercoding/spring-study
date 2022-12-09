package com.sean.dao;

import com.sean.domain.User;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 18:39
 */
public interface UserDao {
    String getUserNameById(int id);
    User getUserById(int id);
}
