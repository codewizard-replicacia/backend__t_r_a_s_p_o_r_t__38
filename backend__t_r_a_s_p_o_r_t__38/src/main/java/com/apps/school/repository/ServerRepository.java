package com.apps.school.repository;


import com.apps.school.model.Server;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ServerRepository extends SimpleJpaRepository<Server, String> {
    private final EntityManager em;
    public ServerRepository(EntityManager em) {
        super(Server.class, em);
        this.em = em;
    }
    @Override
    public List<Server> findAll() {
        return em.createNativeQuery("Select * from \"school_transport\".\"Server\"", Server.class).getResultList();
    }
}