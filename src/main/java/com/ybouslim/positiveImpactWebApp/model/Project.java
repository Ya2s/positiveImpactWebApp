package com.ybouslim.positiveImpactWebApp.model;

import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
public class Project {

	private Long id;

	private String title;
	
	private String description;
	
	private String country;
	
	private String city;
	
	private Integer requiredDonationValue;
		
	private List<ProjectCategory> categories;
	
	private Set<DonorProject> donations;
	
	private Integer donationsTotal;
}
