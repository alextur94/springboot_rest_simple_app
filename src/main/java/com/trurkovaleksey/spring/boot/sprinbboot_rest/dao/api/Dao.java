package com.trurkovaleksey.spring.boot.sprinbboot_rest.dao.api;

import java.util.List;

public interface Dao<T, K> {
    List<T> gelAll();
    void saveOrUpdate(T entity);
    T getByID(K id);
    void deleteById(K id);
}
