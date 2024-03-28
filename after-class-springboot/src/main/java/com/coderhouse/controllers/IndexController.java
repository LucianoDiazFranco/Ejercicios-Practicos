package com.coderhouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")       //si el usuario entra ala carpeta raiz
	public String index() {
		return "index";    // se retorna el index(nombre de la pagina)
	}
	@GetMapping("/productos")       //si el usuario entra ala carpeta raiz
	public String productos() {
		return "productos";    // se retorna el producto(nombre de la pagina)
	}
}
