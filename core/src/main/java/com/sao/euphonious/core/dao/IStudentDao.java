package com.sao.euphonious.core.dao;

import com.sao.euphonious.core.dao.util.IOperations;
import com.sao.euphonious.core.entity.Student;

import java.util.List;

/**
 * Created by navia on 2015/2/5.
 */
public interface IStudentDao extends IOperations<Student> {
    public List<Student> findByAll();
}
