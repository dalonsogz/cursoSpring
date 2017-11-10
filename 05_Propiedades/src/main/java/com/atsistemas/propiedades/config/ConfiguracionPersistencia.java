package com.atsistemas.propiedades.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.atsistemas.propiedades.core.persistencia")
public class ConfiguracionPersistencia {

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
