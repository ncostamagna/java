package com.bolsadeideas.springboot.di.app.models.service;

//import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
// generamos una clase de configuracion, donde configuramos todo.
// podemos usar eso o directamente @Component
public class MiServicioComplejo implements IServicio{

	@Override
	public String operacion() {
		return "ejecutando algún proceso importante complicado...";
	}
	
}
