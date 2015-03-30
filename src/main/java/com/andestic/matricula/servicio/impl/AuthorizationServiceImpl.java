package com.andestic.matricula.servicio.impl;

import com.andestic.matricula.assembler.AuthorizationAssembler;
import com.andestic.matricula.dao.imp.AutenticacionDaoImpl;
import com.andestic.matricula.dao.imp.AuthorizationDaoImpl;
import com.andestic.matricula.resource.Privilegio;
import com.andestic.matricula.resource.Usuario;
import com.andestic.matricula.servicio.interfac.IAuthorizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by marcos.jara on 26-03-2015.
 */
public class AuthorizationServiceImpl implements IAuthorizationService {
    private final Logger logger = LoggerFactory.getLogger(AuthorizationServiceImpl.class);
    private AutenticacionDaoImpl autenticacionDao;
    private AuthorizationDaoImpl authorizationDao;

    @Override
    public Usuario findByLogin(String identificador) {
        logger.debug("AuthorizationServiceImpl - findByLogin: "+identificador);
        return AuthorizationAssembler.toResourceUsuario(autenticacionDao.findByLogin(identificador));
    }

    @Override
    public ArrayList<Privilegio> getPrivileges(HashMap<String, String> params) {
        return AuthorizationAssembler.toResourcePrivileges(authorizationDao.getPrivileges(params));
    }

    public AutenticacionDaoImpl getAutenticacionDao() {
        return autenticacionDao;
    }

    public void setAutenticacionDao(AutenticacionDaoImpl autenticacionDao) {
        this.autenticacionDao = autenticacionDao;
    }

    public AuthorizationDaoImpl getAuthorizationDao() { return authorizationDao; }

    public void setAuthorizationDao(AuthorizationDaoImpl authorizationDao) { this.authorizationDao = authorizationDao; }
}
