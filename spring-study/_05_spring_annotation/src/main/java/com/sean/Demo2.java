package com.sean;

import com.sean.config.ApplicationConfig;
import com.sean.service.UserService;
import com.sean.service.impl.UserServiceImpl;
import lombok.val;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-10 23:13
 */
public class Demo2 {
    public static void main(String[] args) {
        //创建注解容器
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        val userService = app.getBean("userService");
        System.out.println(userService);
    }
}
