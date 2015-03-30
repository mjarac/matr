package com.andestic.matricula.servicio.interfac;

import com.andestic.matricula.resource.Privilegio;
import com.andestic.matricula.resource.Usuario;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by marcos.jara on 26-03-2015.
 */
public interface IAuthorizationService {
    public Usuario findByLogin(String identificador);
    public ArrayList<Privilegio> getPrivileges(HashMap<String, String> params);
}
