/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.iterator.listas.modelo;

import java.util.UUID;

public class Produtor implements Cliente {

	private final String id = UUID.randomUUID().toString();

	private final String nome;

	private final String cpf;

	public Produtor(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("Nome: ").append(this.nome).append(", Cpf: ").append(this.cpf).toString();
		// return ToStringBuilder.reflectionToString(this);
	}

}
