package com.sean.service.impl;

import com.sean.dao.UserDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.sean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-10 23:26
 */
@Service("userService")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void show() {
//        System.out.println("hello world");
        userDao.show();
    }
}
