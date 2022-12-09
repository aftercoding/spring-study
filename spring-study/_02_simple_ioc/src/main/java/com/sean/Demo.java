package com.sean;

import com.sean.dao.UserDao;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 21:06
 */
public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        System.out.println(userDao);

    }
}
