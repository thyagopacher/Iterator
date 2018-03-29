/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.iterator.listas.definicao.iteradores;

import java.util.ArrayList;
import java.util.List;

import br.com.padroes.iterator.listas.definicao.ListaClientes;
import br.com.padroes.iterator.listas.definicao.iteradores.excecoes.IteradorNaoInicializadoException;
import br.com.padroes.iterator.listas.definicao.iteradores.excecoes.IteradorNaoTemMaisElementosException;
import br.com.padroes.iterator.listas.modelo.Cliente;
import br.com.padroes.iterator.listas.modelo.Produtor;

public class ProdutorIteratorImpl implements ProdutorIterator {

	private final List<Produtor> produtores;

	private int contador = -1;

	public ProdutorIteratorImpl(ListaClientes clientes) {
		this.produtores = new ArrayList<>();
		for (Cliente c : clientes) {
			if (c instanceof Produtor) {
				produtores.add((Produtor) c);
			}
		}

//		 this.produtores.iterator().next()
		// clientes.stream().filter(Produtor.class::isInstance).map(Produtor.class::cast).collect(Collectors.toList());
	}

	@Override
	public void primeiro() {
		this.contador = 0;
	}

	@Override
	public void proximo() {
		this.contador++;
	}

	@Override
	public boolean isFinalizado() {
		return contador >= this.produtores.size();
	}

	@Override
	public Produtor getAtual() {
		if (contador == -1) {
			throw new IteradorNaoInicializadoException();
		}
		
		try {
			return this.produtores.get(contador);
		} catch (IndexOutOfBoundsException e) {
			throw new IteradorNaoTemMaisElementosException();
		}
	}

}
