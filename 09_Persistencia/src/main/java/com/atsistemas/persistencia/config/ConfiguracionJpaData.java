package com.atsistemas.persistencia.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

//@Configuration
@ComponentScan({"com.atsistemas.persistencia.core.servicios"})
@PropertySource("classpath:database.properties")
@EnableJpaRepositories(basePackages="com.atsistemas.persistencia.core.persistencia.data.jpa")
public class ConfiguracionJpaData {

	
	@Bean
	@Autowired
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds) {
		LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
		//Origen de datos
		lcemfb.setDataSource(ds);
		//Proveedor de JPA
		lcemfb.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		//Entidades
		lcemfb.setPackagesToScan("com.atsistemas.persistencia.core.entidades");
		//Otras propiedades
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.format_sql", "true");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create");
		
		lcemfb.setJpaProperties(hibernateProperties);
		return lcemfb;
	}
	
	//@Bean
	@Autowired
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
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
