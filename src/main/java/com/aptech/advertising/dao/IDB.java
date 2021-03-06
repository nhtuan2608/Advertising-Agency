package com.aptech.advertising.dao;

import java.io.IOException;
import java.util.List;

public interface IDB<E,T,K,I> {
	T add (E e) throws IOException;
    T delete (K k) throws IOException;
    T update (E e) throws IOException;
    E find (K k) throws IOException;
    E checkAccount (K k,K l) throws IOException;
    E check(K k,I i,K m) throws IOException;
    List<E> findAll() throws IOException;
    List<E> findObject(K k) throws IOException;
}
