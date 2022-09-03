package br.com.faesa;

public class Cliente {

	int senhaGeral = 0;
	int geradorDeSenha = 1;
	int senha;
	String nome;
	
	public Cliente (String nome) {
		nome = this.nome;
		
		
	}
	
	public void proximo () {
		if (this.senhaGeral < 999) {
			this.senhaGeral++;
		} else {
			this.senhaGeral = 1;
		}
	}
	
	
	
	public String getNome() {
		return nome;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public int getSenhaGeral() {
		return senhaGeral;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
