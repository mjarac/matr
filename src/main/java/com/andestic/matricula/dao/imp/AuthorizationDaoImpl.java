package com.andestic.matricula.dao.imp;

import com.andestic.matricula.dao.interfac.IAuthorizationDao;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by marcos.jara on 27-03-2015.
 */
@Repository
public class AuthorizationDaoImpl implements IAuthorizationDao {
    private final Logger logger = LoggerFactory.getLogger(AuthorizationDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    @Override
    public List<Object[]> getPrivileges(HashMap<String, String> params) {

        return sessionFactory.getCurrentSession().createSQLQuery("SELECT a.codigo, a.dominio, a.nombre AS nombre_facultad, a.tipo, per.nombre AS nombre_permiso,  per.descripcion\n" +
                "        FROM aut_usuario u\n" +
                "        left join aut_privilegio pri on (pri.usuario_id = u.id)\n" +
                "        left join aut_agrupacion a on (pri.agrupacion_id = a.id)\n" +
                "        left join aut_rol r on (pri.rol_id = r.id)\n" +
                "        left join aut_rol_permiso rp on (r.id = rp.rol_id)\n" +
                "        left join aut_permiso per on (rp.permiso_id = per.id)\n" +
                "        left join aut_modulo m on (per.modulo_id = m.id)\n" +
                "        where u.identificador = '"+params.get("username")+"'\n" +
                "        and m.clave = '"+params.get("moduleKey")+"'\n" +
                "        and u.activo = 1\n" +
                "        and a.activa = 1\n" +
                "        and r.activo = 1\n" +
                "        and per.activo = 1\n" +
                "        and m.activo = 1").addScalar("codigo", Hibernate.STRING)
                .addScalar("dominio", Hibernate.STRING)
                .addScalar("nombre_facultad", Hibernate.STRING)
                .addScalar("tipo", Hibernate.STRING)
                .addScalar("nombre_permiso",Hibernate.STRING)
                .addScalar("descripcion", Hibernate.STRING).list();
    }
}
