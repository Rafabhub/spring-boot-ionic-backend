package com.rafael.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.cursomc.domain.Pedido;
import com.rafael.cursomc.repositories.PedidoRepository;
import com.rafael.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto Nao encontrado! ID: " + id 
					+ ", Tipo:" + Pedido.class.getName());
		}
		return obj;
	}
	
	
}
