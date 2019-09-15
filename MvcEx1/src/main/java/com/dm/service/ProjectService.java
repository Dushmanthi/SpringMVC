package com.dm.service;
import java.util.List;
import com.dm.model.Project;

public interface ProjectService {
	
		public abstract Project add(Project project);
		public List<Project> getAllProject();
	
}
