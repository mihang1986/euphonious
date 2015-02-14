package com.sao.euphonious.service;

import com.sao.euphonious.core.dao.IStudentDao;
import com.sao.euphonious.core.entity.Student;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by navia on 2015/2/14.
 */
@Transactional
public class StudentService implements IStudentService{

    @Resource(name = "studentDao")
    private IStudentDao studentDao;

    public void addStudent(Student s){
        studentDao.create(s);
    }

}
