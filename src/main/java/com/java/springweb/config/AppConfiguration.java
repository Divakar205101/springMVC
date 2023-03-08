package com.java.springweb.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc
@Configuration
@ComponentScan("com.java.springweb.")
public class AppConfiguration {

	@Bean
	public ModelMapper getModelMapper() {
		
		return new ModelMapper();
	}
	
	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {
		LocalSessionFactoryBean sessionFactoryBean =new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(getdatasource());
		sessionFactoryBean.setPackagesToScan("com.java.springweb.entity");
		sessionFactoryBean.setHibernateProperties(getConnectionProperties());
		return sessionFactoryBean;
	}
	
	@Bean
	public DataSource getdatasource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Divakar@123");
		
		return ds;
	}
	
	 public static Properties getConnectionProperties() {
		    Properties properties=new Properties(); 
		    properties.setProperty("hibernate.show_sql", "true");
			properties.setProperty("hibernate.hbm2ddl.auto", "update");
			
		 return properties;
	 }
	 
	 }

