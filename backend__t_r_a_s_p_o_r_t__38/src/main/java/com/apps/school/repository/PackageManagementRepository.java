package com.apps.school.repository;


import com.apps.school.model.PackageManagement;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PackageManagementRepository extends SimpleJpaRepository<PackageManagement, String> {
    private final EntityManager em;
    public PackageManagementRepository(EntityManager em) {
        super(PackageManagement.class, em);
        this.em = em;
    }
    @Override
    public List<PackageManagement> findAll() {
        return em.createNativeQuery("Select * from \"school_transport\".\"PackageManagement\"", PackageManagement.class).getResultList();
    }
}