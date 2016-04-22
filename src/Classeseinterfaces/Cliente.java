package Classeseinterfaces;

import Anotacoes.Coluna;
import Anotacoes.Tabela;

public class Cliente {

	@Coluna(pk=true, nome="cadid")
	private int id;
	
	@Coluna(nome="cadnome")
	private String nome;
	
	private String endereco;
	
	private String telefone;
	
	private String 
	public Cliente(int id, String nome){
		super();
		this.id = id;
		this.nome = nome;
		
	}
}
