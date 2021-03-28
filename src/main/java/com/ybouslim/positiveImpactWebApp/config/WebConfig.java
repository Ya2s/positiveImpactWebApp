package com.ybouslim.positiveImpactWebApp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nz.net.ultraq.thymeleaf.LayoutDialect;

/*
 * Cette classe est pour utiliser le "Layout Dialect" de Thymeleaf.
 * FIXME : Cependant pas sûr que ce soit la bonne façon de faire, en tout cas 
 * 		   ce n'est pas ce qu'invite à faire la documentation officielle.
 * La méthode provient de : https://igorski.co/layout-dialect-spring-boot-2/ (vu sur au moin un autre site peut-être)
 * 
 */

@Configuration
public class WebConfig {
	
	@Bean
	public LayoutDialect layoutDialect() {
	    return new LayoutDialect();
	}
	
}
