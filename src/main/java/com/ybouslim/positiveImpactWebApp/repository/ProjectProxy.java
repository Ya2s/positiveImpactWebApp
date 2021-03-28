package com.ybouslim.positiveImpactWebApp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ybouslim.positiveImpactWebApp.model.Project;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ProjectProxy {
	
	@Autowired
	private CustomProperties props;


	 public Iterable<Project> getProjects() {
		 String baseApiUrl = props.getApiUrl();
		 String getProjectsUrl = baseApiUrl + "/projects";
		 
		 RestTemplate restTemplate = new RestTemplate();
		 ResponseEntity<Iterable<Project>> response = restTemplate.exchange(
				 getProjectsUrl,
				 HttpMethod.GET,
				 null,
				 new ParameterizedTypeReference<Iterable<Project>>() {}
				 );
		 
		 
		 log.debug("Get projects call " + response.getStatusCode().toString());
	        
		 return response.getBody();
	 }
	 
	 
	 
	 public Project getProject(Long idProject) { 
		 
		 String baseApiUrl = props.getApiUrl();
		 String getProjectUrl = baseApiUrl + "/projects/"+idProject;
		 
		 RestTemplate restTemplate = new RestTemplate();

		 ResponseEntity<Project> response = restTemplate.exchange(
				 getProjectUrl,
				 HttpMethod.GET,
				 null,
				 Project.class
				 );
		 		 
		 log.debug("project call " + response.getStatusCode().toString());
	        
		 return response.getBody();
		 
	 }
	 
	 
	 
}
