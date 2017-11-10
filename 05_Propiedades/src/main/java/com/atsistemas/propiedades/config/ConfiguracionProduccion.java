package com.atsistemas.propiedades.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("produccion")
@PropertySource("classpath:config/database_produccion.properties")
public class ConfiguracionProduccion {

}
