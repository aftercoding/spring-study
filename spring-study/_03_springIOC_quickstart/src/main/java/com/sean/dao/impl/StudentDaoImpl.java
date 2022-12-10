package com.sean.dao.impl;

import com.sean.dao.StudentDao;
import com.sean.domain.Student;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-09 16:43
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public Student getStudentById(Integer id) {
        return new Student(1, "sean", 19);
    }
}
