package com.ybouslim.positiveImpactWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ybouslim.positiveImpactWebApp.model.DonorProject;
import com.ybouslim.positiveImpactWebApp.model.Project;
import com.ybouslim.positiveImpactWebApp.service.ProjectService;

import lombok.Data;

@Data
@Controller
public class DonorProjectController {

	@Autowired
	private ProjectService projectService;
	
	 @GetMapping("/donations")
	 public String donateForm(@RequestParam(name="project") String idProject, Model model) {
		 /*
		  * URL waited : /donations?project=id_project
		  * Redirect to donation form. 
		  * This form will create a new donation.
		  */
		 
		 Project project = projectService.getProject(Long.valueOf(idProject));
		 DonorProject donation = new DonorProject();
		 donation.setProject(project);
		 model.addAttribute("donation", donation);
		 
		 return "donate";
	 }
	 
	 @PostMapping("/donations")
	 public String donate(Model model) {
		 /*
		  * Redirect to donation form. 
		  * This form will create a new donation.
		  */
		 
		 DonorProject donation = new DonorProject();
		 model.addAttribute("donation", donation);
		 
		 return "donate";
	 }
	
}
