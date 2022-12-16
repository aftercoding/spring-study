package com.sean;

import com.sean.service.UserService;
import com.sean.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-10 23:13
 */
public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService) app.getBean("userService");
        UserService userService = new UserServiceImpl();
        userService.show();
    }
}
