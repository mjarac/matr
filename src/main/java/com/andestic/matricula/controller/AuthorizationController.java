package com.andestic.matricula.controller;

import com.andestic.matricula.resource.Privilegio;
import com.andestic.matricula.resource.Usuario;
import com.andestic.matricula.servicio.interfac.IAuthorizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by marcos.jara on 26-03-2015.
 */
@Controller
public class AuthorizationController {
    private final Logger logger = LoggerFactory.getLogger(AuthorizationController.class);

    @Autowired
    private IAuthorizationService authorizationServiceImpl;

    public Usuario findByLogin(String identificador){
        logger.debug("AuthorizationController - findByLogin: "+identificador);
        return authorizationServiceImpl.findByLogin(identificador);
    }

    public ArrayList<Privilegio> getPrivileges(HashMap<String, String> params){
        return authorizationServiceImpl.getPrivileges(params);
    }
}
