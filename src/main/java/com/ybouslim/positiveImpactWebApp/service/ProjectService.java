package com.ybouslim.positiveImpactWebApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybouslim.positiveImpactWebApp.model.Project;
import com.ybouslim.positiveImpactWebApp.repository.ProjectProxy;

import lombok.Data;

@Data
@Service
public class ProjectService {
	
	 @Autowired
	 private ProjectProxy proxy;

	 public Project getProject(final Long idProject) {
		 return proxy.getProject(idProject);
	 }	

	 public Iterable<Project> getProjects() {
		 return proxy.getProjects();
	 }
}
