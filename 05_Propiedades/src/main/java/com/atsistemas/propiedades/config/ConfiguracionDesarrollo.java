package com.atsistemas.propiedades.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("desarrollo")
@PropertySource("classpath:config/database_desarrollo.properties")
public class ConfiguracionDesarrollo {

}
