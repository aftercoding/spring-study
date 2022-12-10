package com.sean;

import com.sean.dao.StudentDao;
import com.sean.domain.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-09 16:44
 */
public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = (StudentDao) app.getBean("studentDao");
        Student student = studentDao.getStudentById(1);
        System.out.println(student);
        Student student1 = (Student) app.getBean("student2");
        System.out.println(student1);

    }
}
