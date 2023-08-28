package com.apps.school.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.apps.school.model.BuildTool;
import com.apps.school.model.FrontendApp;
import com.apps.school.model.Architecture;
import com.apps.school.model.Server;
import com.apps.school.model.PackageManagement;
import com.apps.school.model.FrontendScreen;
import com.apps.school.model.Project;
import com.apps.school.model.complex.BasicDetails;
import com.apps.school.model.complex.AdvancedDetails;
import com.apps.school.converter.DurationConverter;
import com.apps.school.converter.UUIDToByteConverter;
import com.apps.school.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Project")
@Table(name = "\"Project\"", schema =  "\"school_transport\"")
@Data
                        
public class Project {
	public Project () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"ProjectId\"", nullable = true )
  private Integer projectId;
	  
  @Column(name = "\"DateOfCreation\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date dateOfCreation;  
  
	  
  @Column(name = "\"Attribute3\"", nullable = true )
  private Long attribute3;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"ProjectFrontendApplication\"", referencedColumnName = "\"AppId\"", insertable = false, updatable = false)
	private FrontendApp frontendApplication;
	
	@Column(name = "\"ProjectFrontendApplication\"")
	private Long projectFrontendApplication;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Project [" 
  + "ProjectId= " + projectId  + ", " 
  + "DateOfCreation= " + dateOfCreation  + ", " 
  + "Attribute3= " + attribute3 
 + "]";
	}
	
}