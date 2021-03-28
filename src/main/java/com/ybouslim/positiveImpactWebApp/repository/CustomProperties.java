package com.ybouslim.positiveImpactWebApp.repository;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "com.ybouslim.positiveimpactwebapp") //Camel/kebab case ou avec underscore
@Data
public class CustomProperties {

	private String apiUrl; 
}
