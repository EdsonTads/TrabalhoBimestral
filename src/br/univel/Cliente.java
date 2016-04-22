package br.univel;

import Anotacoes.Coluna;
import Anotacoes.Tabela;

public class Cliente {

	@Coluna(pk=true, nome="cadid")
	private int id;
	
	@Coluna(nome="cadnome", tamanho=150)
	private String nome;
	
	public Cliente(int id, String nome){
		super();
		this.id = id;
		this.nome = nome;
		
	}
}
