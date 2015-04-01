package com.andestic.matricula.dao.imp;

import com.andestic.matricula.dao.interfac.IAutenticacionDao;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by marcos.jara on 26-03-2015.
 */
@Repository
public class AutenticacionDaoImpl implements IAutenticacionDao{
    private final Logger logger = LoggerFactory.getLogger(AutenticacionDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    @Override
    public List<Object[]> findByLogin(String identificador) {
        logger.debug("findByLogin DAO: "+identificador);

        return sessionFactory.getCurrentSession().createSQLQuery("SELECT aut_usuario.id, aut_usuario.activo, aut_usuario.apellido_materno, aut_usuario.apellido_paterno, aut_usuario.identificador,\n" +
                    "aut_usuario.nombres,\n" +
                    "aut_usuario.rut \n" +
                    "FROM authorization.aut_usuario WHERE rut = :identificador").setParameter("identificador",identificador).list();


    }
}
