package com.bolsadeideas.springboot.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

// importamos la configuracion de los textos

@Configuration
@PropertySources({
	@PropertySource("classpath:textos.properties") // ubicacion del archivo
})
public class TextosPropertiesConfig {

}
