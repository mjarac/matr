package com.andestic.matricula.controller;

import com.andestic.matricula.resource.Privilegio;
import com.andestic.matricula.resource.Usuario;
import com.andestic.matricula.servicio.impl.AuthorizationServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by marcos.jara on 26-03-2015.
 */
public class AuthorizationController {
    private final Logger logger = LoggerFactory.getLogger(AuthorizationController.class);

    private AuthorizationServiceImpl authorizationService;

    public Usuario findByLogin(String identificador){
        logger.debug("AuthorizationController - findByLogin: "+identificador);
        return authorizationService.findByLogin(identificador);
    }

    public ArrayList<Privilegio> getPrivileges(HashMap<String, String> params){
        return authorizationService.getPrivileges(params);
    }

    public AuthorizationServiceImpl getAuthorizationService() {
        return authorizationService;
    }

    public void setAuthorizationService(AuthorizationServiceImpl authorizationService) {
        this.authorizationService = authorizationService;
    }
}
