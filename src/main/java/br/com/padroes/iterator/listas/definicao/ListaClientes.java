/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.iterator.listas.definicao;

import java.util.ArrayList;

import br.com.padroes.iterator.listas.definicao.agregadores.IndustriaAggregator;
import br.com.padroes.iterator.listas.definicao.agregadores.ProdutorAggregator;
import br.com.padroes.iterator.listas.definicao.iteradores.IndustriaIterator;
import br.com.padroes.iterator.listas.definicao.iteradores.IndustriaIteratorImpl;
import br.com.padroes.iterator.listas.definicao.iteradores.ProdutorIterator;
import br.com.padroes.iterator.listas.definicao.iteradores.ProdutorIteratorImpl;
import br.com.padroes.iterator.listas.modelo.Cliente;

public class ListaClientes extends ArrayList<Cliente> implements IndustriaAggregator, ProdutorAggregator {

	private static final long serialVersionUID = 1L;

	@Override
	public ProdutorIterator getProdutorIterator() {
		return new ProdutorIteratorImpl(this);
	}

	@Override
	public IndustriaIterator getIndustriaIterator() {
		return new IndustriaIteratorImpl(this);
	}

}
