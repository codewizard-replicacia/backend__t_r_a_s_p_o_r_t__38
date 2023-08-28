package com.apps.school.function;

import com.apps.school.model.BuildTool;
import com.apps.school.model.FrontendApp;
import com.apps.school.model.Architecture;
import com.apps.school.model.Server;
import com.apps.school.model.PackageManagement;
import com.apps.school.model.FrontendScreen;
import com.apps.school.model.Project;




import com.apps.school.model.complex.BasicDetails;
import com.apps.school.model.complex.AdvancedDetails;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  