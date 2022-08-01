package com.BC28.FinalProject.Service;

import java.util.List;

public interface ICRUD<T, V> {

    T create(T obj);
    List<T> findAll();
    T findId(V obj);
    T update(T obj);
    boolean delete(V obj);

}
