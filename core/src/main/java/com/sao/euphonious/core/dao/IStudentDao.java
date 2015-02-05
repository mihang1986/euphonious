package com.sao.euphonious.core.dao;

import com.sao.euphonious.core.entity.Student;

import java.util.List;

/**
 * Created by navia on 2015/2/5.
 */
public interface IStudentDao {
    public List<Student> findByAll();
}
