package com.example.demo.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;
import com.example.demo.repository.IInventarioRepo;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepo iInventarioRepo;
	@Autowired
	private IProductoService iProductoService;

	@Override
	public void generar(Inventario inventario) {
		// TODO Auto-generated method stub
		Random r = null;
		for (int i = 0; i < inventario.getCantidad(); i++) {
			inventario.setCodigoBarrasIndividual(inventario.getCodigoBarras() + "" + r.nextDouble() * 100);
			this.iInventarioRepo.ingresar(inventario);
		}
		Producto producto = this.iProductoService.buscarcodi(inventario.getCodigoBarras());
		producto.setStock(inventario.getCantidad());
		this.iProductoService.actualizar(producto);
	}

}
