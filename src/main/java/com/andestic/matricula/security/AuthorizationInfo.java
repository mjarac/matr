package com.andestic.matricula.security;

import com.andestic.matricula.resource.Agrupacion;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import java.util.Map;

/**
 * Created by marcos.jara on 25-03-2015.
 */
public class AuthorizationInfo extends SimpleAuthorizationInfo{
    private Map<Agrupacion, String> objetosOrganismosPermisos;

    public AuthorizationInfo() {}

    public Map<Agrupacion, String> getObjetosOrganismosPermisos()
        {
            return this.objetosOrganismosPermisos;
        }

    public void setObjetosOrganismosPermisos(Map<Agrupacion, String> objetosOrganismosPermisos){
        this.objetosOrganismosPermisos = objetosOrganismosPermisos;
    }
}
