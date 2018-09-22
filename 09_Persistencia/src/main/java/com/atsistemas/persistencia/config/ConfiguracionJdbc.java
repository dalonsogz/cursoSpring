package com.atsistemas.persistencia.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

//@Configuration
@ComponentScan("com.atsistemas.persistencia.core.persistencia.jdbc")
@PropertySource("classpath:database.properties")
public class ConfiguracionJdbc {
	
	@Bean
	@Autowired
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
	}
	
	@Bean
	public DataSource miDataSource(
			@Value("${database.url}") String url,
			@Value("${database.user}") String user,
			@Value("${database.password}") String password
			) {
		BasicDataSource ds = new BasicDataSource();
		
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(password);
		
		return ds;
	}
	
}
