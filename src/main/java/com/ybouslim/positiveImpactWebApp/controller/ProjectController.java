package com.ybouslim.positiveImpactWebApp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ybouslim.positiveImpactWebApp.model.Project;
import com.ybouslim.positiveImpactWebApp.service.ProjectService;

import lombok.Data;


@Data
@Controller
public class ProjectController {

	@Autowired
	private ProjectService service;
	
	 @GetMapping("/")
	 public String home(Model model) {
		 		 
		 Iterable<Project> listProjects = service.getProjects();
		 model.addAttribute("projects", listProjects);
		 
		 return "home";
	 }
	 
	 @GetMapping("/projects/{id}")
	 public String getProject(@PathVariable("id") final Long idProject, Model model){
		 Project project = service.getProject(idProject);
		 model.addAttribute("project", project);
		 return "project";
	 }
	 
	 

	
}
