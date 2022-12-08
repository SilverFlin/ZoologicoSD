/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GUI;

import com.repositories.HabitatRepository;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author mig_2
 */
public class UnitOfWork {
    
    private static EntityManager entityManager;
    
    private static HabitatRepository habitatRepository;

    private static EntityManager getEntityManager() {
        return (entityManager != null) ? entityManager : (entityManager = Persistence.createEntityManagerFactory("zoologicoDSPU").createEntityManager());
    }
    
    public static HabitatRepository clientesRepository() {
        return (habitatRepository != null) ? habitatRepository : (habitatRepository = new HabitatRepository(getEntityManager()));
    }
    
}
