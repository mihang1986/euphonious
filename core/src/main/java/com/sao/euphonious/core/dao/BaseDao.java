package com.sao.euphonious.core.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;

/**
 * Created by navia on 2015/2/5.
 */
public abstract class BaseDao {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    protected final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
