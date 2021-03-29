package com.ybouslim.positiveImpactWebApp.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Donor {

	private Long id;
	
	private String lastName;
	
	private String firstName;
	
	private Date birthDate;	//FIXME : cf Trello
	
	private String mail;
	
	private String password;
	
	private String phoneNumber;
	
}
