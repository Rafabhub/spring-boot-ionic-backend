package com.rafael.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.cursomc.domain.Cliente;
import com.rafael.cursomc.repositories.ClienteRepository;
import com.rafael.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto Nao encontrado! ID: " + id 
					+ ", Tipo:" + Cliente.class.getName());
		}
		return obj;
	}
	
	
}
