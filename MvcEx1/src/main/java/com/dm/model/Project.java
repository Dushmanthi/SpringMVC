package com.dm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="project")

public class Project {
		
		@Column(name="projectName")
		private String projectName;
		
		@Column(name="description")
		private String description;
		
		public Project(String projectName , String description) {
			super();
			this.projectName = projectName;
			this.description = description;
		}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
