package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class BodegaRepoImpl implements IBodegaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bodega);
	}

}
