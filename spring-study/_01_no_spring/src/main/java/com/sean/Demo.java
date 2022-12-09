package com.sean;

import com.sean.service.UserService;
import com.sean.service.impl.UserServiceImpl;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 18:38
 */
public class Demo {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.showUser();
    }
}
