package com.apps.school.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.school.model.BuildTool;
import com.apps.school.model.FrontendApp;
import com.apps.school.model.Architecture;
import com.apps.school.model.Server;
import com.apps.school.model.PackageManagement;
import com.apps.school.model.FrontendScreen;
import com.apps.school.model.Project;
import com.apps.school.model.complex.BasicDetails;
import com.apps.school.model.complex.AdvancedDetails;

@Entity(name = "FrontendAppMetaTags")
@Table(schema = "\"school_transport\"", name = "\"FrontendAppMetaTags\"")
@Data
public class FrontendAppMetaTags{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"AppId\"")
	private Long appId;

    
    @Column(name = "\"MetaTags\"")
    private Long metaTags;
}