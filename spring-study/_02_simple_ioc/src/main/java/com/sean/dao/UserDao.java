package com.sean.dao;

import com.sean.domain.User;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 22:20
 */
public interface UserDao {
    public String getUserNameById(Integer id);
    public User getUserById(Integer id);
}
