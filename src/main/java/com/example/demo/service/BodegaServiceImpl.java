package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Bodega;
import com.example.demo.repository.IBodegaRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Service
public class BodegaServiceImpl implements IBodegaService {

	@Autowired
	private IBodegaRepo bodegaRepo;

	@Override
	public void ingresar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.bodegaRepo.ingresar(bodega);
	}

}
