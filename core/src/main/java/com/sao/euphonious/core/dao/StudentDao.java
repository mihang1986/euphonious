package com.sao.euphonious.core.dao;

import com.sao.euphonious.core.entity.Student;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by navia on 2015/2/5.
 */

@Repository
public class StudentDao extends BaseDao implements IStudentDao{
    @Override
    public List<Student> findByAll() {
        return getCurrentSession().createQuery("from Student").list();
    }
}
