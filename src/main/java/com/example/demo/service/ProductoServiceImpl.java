package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Producto;
import com.example.demo.repository.IProductoRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepo iProductoRepo;

	@Override
	public void ingresar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepo.ingresar(producto);
	}

	@Override
	public Producto buscarcodi(String codigo) {
		// TODO Auto-generated method stub
		return this.iProductoRepo.buscarcodi(codigo);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepo.actualizar(producto);
	}

}
