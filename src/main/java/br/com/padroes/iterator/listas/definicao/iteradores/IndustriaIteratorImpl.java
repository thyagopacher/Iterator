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
import br.com.padroes.iterator.listas.modelo.Industria;

public class IndustriaIteratorImpl implements IndustriaIterator {

	private final List<Industria> industrias;

	private int contador = -1;

	public IndustriaIteratorImpl(ListaClientes clientes) {
		this.industrias = new ArrayList<>();
		for (Cliente c : clientes) {
			if (c instanceof Industria) {
				industrias.add((Industria) c);
			}
		}
		// this.industrias =
		// clientes.stream().filter(Industria.class::isInstance).map(Industria.class::cast).collect(Collectors.toList());
	}

	@Override
	public void primeiro() {
		this.contador = 0;
	}

	@Override
	public void proximo() {
		contador++;
	}

	@Override
	public boolean isFinalizado() {
		return contador >= this.industrias.size();
	}

	@Override
	public Industria getAtual() {
		if (contador == -1) {
			throw new IteradorNaoInicializadoException();
		}

		try {
			return this.industrias.get(contador);
		} catch (IndexOutOfBoundsException e) {
			throw new IteradorNaoTemMaisElementosException();
		}
	}

}
