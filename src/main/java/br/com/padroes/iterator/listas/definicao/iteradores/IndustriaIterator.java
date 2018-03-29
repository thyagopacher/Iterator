/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.iterator.listas.definicao.iteradores;

import br.com.padroes.iterator.listas.modelo.Industria;

public interface IndustriaIterator {

	void primeiro();

	void proximo();

	boolean isFinalizado();

	Industria getAtual();

}
