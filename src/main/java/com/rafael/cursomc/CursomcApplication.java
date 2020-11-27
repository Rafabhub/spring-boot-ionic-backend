package com.rafael.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafael.cursomc.domain.Categoria;
import com.rafael.cursomc.domain.Cidade;
import com.rafael.cursomc.domain.Cliente;
import com.rafael.cursomc.domain.Endereco;
import com.rafael.cursomc.domain.Estado;
import com.rafael.cursomc.domain.ItemPedido;
import com.rafael.cursomc.domain.Pagamento;
import com.rafael.cursomc.domain.PagamentoComBoleto;
import com.rafael.cursomc.domain.PagamentoComCartao;
import com.rafael.cursomc.domain.Pedido;
import com.rafael.cursomc.domain.Produto;
import com.rafael.cursomc.domain.enums.EstadoPagamento;
import com.rafael.cursomc.domain.enums.TipoCliente;
import com.rafael.cursomc.repositories.CategoriaRepository;
import com.rafael.cursomc.repositories.CidadeRepository;
import com.rafael.cursomc.repositories.ClienteRepository;
import com.rafael.cursomc.repositories.EnderecoRepository;
import com.rafael.cursomc.repositories.EstadoRepository;
import com.rafael.cursomc.repositories.ItemPedidoRepository;
import com.rafael.cursomc.repositories.PagamentoRepository;
import com.rafael.cursomc.repositories.PedidoRepository;
import com.rafael.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

	
}

