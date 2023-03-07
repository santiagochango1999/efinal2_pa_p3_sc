package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.service.IBodegaService;

@Controller
@RequestMapping("/bodegas")
public class BodegaControler {

	@Autowired
	private IBodegaService bodegaService;

	@GetMapping("/funciones")
	public String paginaNuevaPersona(Bodega bodega) {
		return "vistaPrimaria";
	}

	@PostMapping("/insertar")
	public String insertarPersona(Bodega bodega) {
		this.bodegaService.ingresar(bodega);
		return "redirect:/bodegas/funciones";

	}

}
