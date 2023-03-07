package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Producto;
import com.example.demo.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoControler {

	@Autowired
	private IProductoService iProductoService;

	@GetMapping("/funciones")
	public String paginaNuevaPersona(Producto producto) {
		return "vistaSecundaria";
	}

	@PostMapping("/insertar")
	public String insertarPersona(Producto producto) {
		this.iProductoService.ingresar(producto);
		return "redirect:/bodegas/funciones";

	}
}
