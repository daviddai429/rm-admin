package com.gorilla.rm.rmcommon.base.service;

import java.util.List;

public interface BaseService<T> {

    public List<T> findAll();

    public T findOneById(Long id);

    public T update(T t);
}
