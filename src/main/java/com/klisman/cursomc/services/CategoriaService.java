package com.klisman.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klisman.cursomc.domain.Categoria;
import com.klisman.cursomc.repositories.CategoriaRepository;
import com.klisman.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		
		if(obj == null) {
			
			throw new ObjectNotFoundException("Objeto nao encontrado! id:" + id
			+ ", tipo: "+ Categoria.class.getName());
		}
		
		return obj;
		
		
	}
}
