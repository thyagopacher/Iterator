/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.iterator.listas.definicao.agregadores;

import br.com.padroes.iterator.listas.definicao.iteradores.ProdutorIterator;

public interface ProdutorAggregator {

	ProdutorIterator getProdutorIterator();

}
