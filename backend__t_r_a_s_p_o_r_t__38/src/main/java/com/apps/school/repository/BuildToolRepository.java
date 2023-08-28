package com.apps.school.repository;


import com.apps.school.model.BuildTool;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class BuildToolRepository extends SimpleJpaRepository<BuildTool, String> {
    private final EntityManager em;
    public BuildToolRepository(EntityManager em) {
        super(BuildTool.class, em);
        this.em = em;
    }
    @Override
    public List<BuildTool> findAll() {
        return em.createNativeQuery("Select * from \"school_transport\".\"BuildTool\"", BuildTool.class).getResultList();
    }
}