package com.ssh.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/7/11.
 */
public interface  Repository <T,PK extends Serializable> {
    T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T entity);

    void saveOrUpdate(T entity);

    void delete(PK id);

    void flush();
}
