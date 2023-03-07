package com.example.demo.repository;

import com.example.demo.modelo.Producto;

public interface IProductoRepo {
	public void ingresar(Producto producto);

	public Producto buscarcodi(String codigo);

	public void actualizar(Producto producto);

}
