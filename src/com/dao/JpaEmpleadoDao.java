/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelos.Empleado;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

/**
 *
 * @author Toled
 */
public class JpaEmpleadoDao implements Dao<Empleado> {
//    private EntityManager entityManager;

    // standard constructors
    @Override
    public Optional<Empleado> get(long id) {
//        return Optional.ofNullable(entityManager.find(Empleado.class, id));
        return null;
    }

    @Override
    public List<Empleado> getAll() {
//        Query query = entityManager.createQuery("SELECT e FROM User e");
//        return query.getResultList();
        return null;
    }

    @Override
    public void save(Empleado user) {
//        executeInsideTransaction(entityManager -> entityManager.persist(user));
    }

    @Override
    public void update(Empleado user, String[] params) {
        user.setNombre(Objects.requireNonNull(params[0], "Name cannot be null"));
        user.setDireccion(Objects.requireNonNull(params[1], "Email cannot be null"));
//        executeInsideTransaction(entityManager -> entityManager.merge(user));
    }

    @Override
    public void delete(Empleado user) {
//        executeInsideTransaction(entityManager -> entityManager.remove(user));
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
//        EntityTransaction tx = entityManager.getTransaction();
//        try {
//            tx.begin();
//            action.accept(entityManager);
//            tx.commit(); 
//        }
//        catch (RuntimeException e) {
//            tx.rollback();
//            throw e;
//        }
    }

    private static class EntityManager {

        // Borrar
        public EntityManager() {
        }
    }

}
