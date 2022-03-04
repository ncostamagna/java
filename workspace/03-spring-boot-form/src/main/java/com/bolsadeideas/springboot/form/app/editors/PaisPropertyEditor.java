package com.bolsadeideas.springboot.form.app.editors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bolsadeideas.springboot.form.app.services.PaisService;

@Component
public class PaisPropertyEditor extends PropertyEditorSupport {

	@Autowired
	private PaisService service;

	@Override
	public void setAsText(String idString) throws IllegalArgumentException {

		try {
			Integer id = Integer.parseInt(idString);
			this.setValue(service.obtenerPorId(id));
		} catch (NumberFormatException e) {
			setValue(null);
		}

	}

}
