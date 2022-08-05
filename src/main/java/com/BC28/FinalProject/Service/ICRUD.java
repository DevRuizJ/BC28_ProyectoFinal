package com.BC28.FinalProject.Service;

import java.util.List;

public interface ICRUD<T, V> {

	T register(T obj);
	T modify(T obj);
	List<T> list();
	T listById(V id);
	boolean delete(V id);
}
