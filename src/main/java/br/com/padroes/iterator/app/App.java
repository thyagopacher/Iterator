package br.com.padroes.iterator.app;

import br.com.padroes.iterator.listas.definicao.ListaClientes;
import br.com.padroes.iterator.listas.definicao.iteradores.IndustriaIterator;
import br.com.padroes.iterator.listas.definicao.iteradores.ProdutorIterator;
import br.com.padroes.iterator.listas.modelo.Industria;
import br.com.padroes.iterator.listas.modelo.Produtor;

public class App {

	public static void main(String[] args) {
		
		final ListaClientes clientes = new ListaClientes();
		clientes.add(new Produtor("João", "111.111.111-11"));
		clientes.add(new Produtor("Jonas", "111.111.111-12"));
		clientes.add(new Industria("Curral das Galinhas", "000.000.0001/12"));
		
		System.out.println("Produtores");
		final ProdutorIterator pIt = clientes.getProdutorIterator();
		pIt.primeiro();
		while(!pIt.isFinalizado()){
			System.out.println(pIt.getAtual().toString());
			pIt.proximo();
		}
		
		System.out.println("Industrias");
		final IndustriaIterator iIt = clientes.getIndustriaIterator();
		iIt.primeiro();
		while(!iIt.isFinalizado()){
			System.out.println(iIt.getAtual().toString());
			iIt.proximo();
		};

	}

}
