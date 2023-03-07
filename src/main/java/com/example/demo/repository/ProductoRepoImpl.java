package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto buscarcodi(String codigo) {
		TypedQuery<Producto> query = this.entityManager
				.createQuery("select p from Producto e where e.codigoBarras=:dato", Producto.class);
		query.setParameter("dato", codigo);
		return query.getSingleResult();
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

}
