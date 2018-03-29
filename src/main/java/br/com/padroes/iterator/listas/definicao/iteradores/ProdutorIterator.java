/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.iterator.listas.definicao.iteradores;

import br.com.padroes.iterator.listas.modelo.Produtor;

public interface ProdutorIterator {

	void primeiro();

	void proximo();

	boolean isFinalizado();

	Produtor getAtual();

}
