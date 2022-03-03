package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// redirect, redirige, cambia la url
	// forward, no cambia la URL, lo hace interno, rutas internas del proyecto
	@GetMapping("/")
	public String home() {
		return "forward:/app/index";
	}
}
