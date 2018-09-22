package com.atsistemas.compras.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@ComponentScan({"com.atsistemas.compras.servicios"})
@PropertySource("classpath:database.properties")
@EnableJpaRepositories(basePackages="com.atsistemas.compras.persistencia.data.jpa")
public class ConfiguracionJpaData {

	@Value("${database.url}") String url;
	@Value("${database.username}") String user;
	@Value("${database.password}") String password;

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
		//Origen de datos
		lcemfb.setDataSource(getDataSource());
		//Proveedor de JPA
		lcemfb.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		//Entidades
		lcemfb.setPackagesToScan("com.atsistemas.compras.entidades");
		//Otras propiedades
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.format_sql", "true");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		lcemfb.setJpaProperties(hibernateProperties);
		return lcemfb;
	}
	
	@Bean
	public DataSource getDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(password);
		return ds;
	}
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
	    JpaTransactionManager transactionManager = new JpaTransactionManager();
	    transactionManager.setEntityManagerFactory(entityManagerFactory);
	    return transactionManager;
	}
	
}
