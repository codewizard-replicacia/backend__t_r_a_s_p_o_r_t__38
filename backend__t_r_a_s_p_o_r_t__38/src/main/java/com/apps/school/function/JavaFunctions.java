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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.apps.school.repository.PackageManagementRepository;
import com.apps.school.repository.ProjectRepository;
import com.apps.school.repository.ArchitectureRepository;
import com.apps.school.repository.ServerRepository;
import com.apps.school.repository.FrontendScreenRepository;
import com.apps.school.repository.BuildToolRepository;
import com.apps.school.repository.FrontendAppRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
