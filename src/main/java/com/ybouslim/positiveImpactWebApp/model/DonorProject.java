package com.ybouslim.positiveImpactWebApp.model;

import lombok.Data;

@Data
public class DonorProject {
	
	private Long id;
	
	private Donor donor;
	
	private Project project;
		
	private Integer valueEuro;
	
	private String message;
	
}
