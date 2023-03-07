package com.example.demo.service;

import com.example.demo.modelo.Producto;

public interface IProductoService {
	public void ingresar(Producto producto);

	public Producto buscarcodi(String codigo);

	public void actualizar(Producto producto);
}
