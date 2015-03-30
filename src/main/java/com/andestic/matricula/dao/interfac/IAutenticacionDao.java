package com.andestic.matricula.dao.interfac;


import java.util.List;

/**
 * Created by marcos.jara on 26-03-2015.
 */
public interface IAutenticacionDao {
    public List<Object[]> findByLogin(String identificador);
}
