package com.techm.selectquery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.techm.selectquery")
public class MyConfig {
	
	
	@Bean
	public JdbcTemplate getJdbcTemplate()
	{
		return new JdbcTemplate(getDataSource());
	}
	
	@Bean
	public DriverManagerDataSource getDataSource()
	{
		
		
		DriverManagerDataSource  ds=  new DriverManagerDataSource();
		
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("system");
		
		return ds;
	}
	

}
