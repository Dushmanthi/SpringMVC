package com.dm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dm.dao.ProjectDao;
import com.dm.model.Project;

@Service
public class ProjectServiceImp implements ProjectService {
		
		@Autowired
	    private ProjectDao projectDao;

		public ProjectDao getProjectDao() {
			return projectDao;
		}

		public void setProjectDao(ProjectDao projectDao) {
			this.projectDao = projectDao;
		}

		public Project add(Project project) {
			// TODO Auto-generated method stub
			return projectDao.createProject(project);
		}

		public List<Project> getAllProject() {
			// TODO Auto-generated method stub
			return projectDao.getAllProject();
		}
		
}
