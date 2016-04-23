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
	
	private Enum estadocivil;
	
	public  Cliente(){
		this(0, null,  null, null,null);
	}
	
//	Construtor do metodo cliente
	
	public Cliente(int id, String nome, String endereco, String telefone, Enum estadocivil){
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.estadocivil = estadocivil;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Enum getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(Enum estadocivil) {
		this.estadocivil = estadocivil;
	}
}
