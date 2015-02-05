package com.sao.euphonious.core.dao.util;

import java.io.Serializable;
import java.util.List;

/**
 * Created by navia on 2015/2/5.
 */
public interface IOperations<T extends Serializable> {

    T findOne(final long id);

    List<T> findAll();

    void create(final T entity);

    T update(final T entity);

    void delete(final T entity);

    void deleteById(final long entityId);
}
