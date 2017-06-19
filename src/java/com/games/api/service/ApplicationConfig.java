/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.games.api.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author briansarsany
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.games.api.service.BishopFacadeREST.class);
        resources.add(com.games.api.service.BoardFacadeREST.class);
        resources.add(com.games.api.service.GameFacadeREST.class);
        resources.add(com.games.api.service.KingFacadeREST.class);
        resources.add(com.games.api.service.KnightFacadeREST.class);
        resources.add(com.games.api.service.PieceFacadeREST.class);
        resources.add(com.games.api.service.PlayerFacadeREST.class);
        resources.add(com.games.api.service.QueenFacadeREST.class);
        resources.add(com.games.api.service.RookFacadeREST.class);
        resources.add(com.games.api.service.SpotFacadeREST.class);
    }
    
}
