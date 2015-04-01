package com.andestic.matricula.servicio.impl;

import com.andestic.matricula.assembler.AuthorizationAssembler;
import com.andestic.matricula.dao.imp.AutenticacionDaoImpl;
import com.andestic.matricula.dao.imp.AuthorizationDaoImpl;
import com.andestic.matricula.resource.Privilegio;
import com.andestic.matricula.resource.Usuario;
import com.andestic.matricula.servicio.interfac.IAuthorizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by marcos.jara on 26-03-2015.
 */
@Service
public class AuthorizationServiceImpl implements IAuthorizationService {
    private final Logger logger = LoggerFactory.getLogger(AuthorizationServiceImpl.class);
    @Autowired
    private AutenticacionDaoImpl autenticacionDaoImpl;
    @Autowired
    private AuthorizationDaoImpl authorizationDaoImpl;

    @Override
    @Transactional
    public Usuario findByLogin(String identificador) {
        logger.debug("AuthorizationServiceImpl - findByLogin: "+identificador);
        return AuthorizationAssembler.toResourceUsuario(autenticacionDaoImpl.findByLogin(identificador));
    }

    @Override
    @Transactional
    public ArrayList<Privilegio> getPrivileges(HashMap<String, String> params) {
        return AuthorizationAssembler.toResourcePrivileges(authorizationDaoImpl.getPrivileges(params));
    }
}
