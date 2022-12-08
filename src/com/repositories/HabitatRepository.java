/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repositories;

import com.POJOS.Habitat;
import javax.persistence.EntityManager;

/**
 *
 * @author mig_2
 */
public class HabitatRepository extends RepositoryBase<Habitat>{
    
    public HabitatRepository(EntityManager entityManager) {
        super(entityManager);
    }
    
}
