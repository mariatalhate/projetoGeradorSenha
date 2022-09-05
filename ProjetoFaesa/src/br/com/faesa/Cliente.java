package br.com.faesa;

public class Cliente {

	int geradorDeSenha = 1;
	int senha;
	String nome;
	
	public Cliente (String nome) {
		this.nome = nome;
		this.senha = this.geradorDeSenha;
		this.geradorDeSenha++;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
