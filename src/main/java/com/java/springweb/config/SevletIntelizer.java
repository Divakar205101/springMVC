package com.java.springweb.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SevletIntelizer  implements WebApplicationInitializer{

	@SuppressWarnings("resource")
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		
		AnnotationConfigWebApplicationContext applicationContext = 
				new AnnotationConfigWebApplicationContext();
		applicationContext.register(AppConfiguration.class);
		
		
		
		DispatcherServlet servlet = new DispatcherServlet(applicationContext);
		Dynamic context = servletContext.addServlet("dispatcherServlet", servlet);
		context.addMapping("/");
		context.setLoadOnStartup(1);
	}

	

}
