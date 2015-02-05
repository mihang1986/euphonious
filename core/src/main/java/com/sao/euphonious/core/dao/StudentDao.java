package com.sao.euphonious.core.dao;

import com.sao.euphonious.core.dao.util.BaseDao;
import com.sao.euphonious.core.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by navia on 2015/2/5.
 */

@Repository
public class StudentDao extends BaseDao<Student> implements IStudentDao{
    @Override
    public List<Student> findByAll() {
        return getCurrentSession().createQuery("from Student").list();
    }
}
