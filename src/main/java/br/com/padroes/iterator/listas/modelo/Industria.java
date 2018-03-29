/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.iterator.listas.modelo;

import java.util.UUID;

public class Industria implements Cliente {

	private final String id = UUID.randomUUID().toString();

	private final String nome;

	private final String cnpj;

	public Industria(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("Nome: ").append(this.nome).append(", Cnpj: ").append(this.cnpj).toString();
//		return ToStringBuilder.reflectionToString(this);
	}

}
