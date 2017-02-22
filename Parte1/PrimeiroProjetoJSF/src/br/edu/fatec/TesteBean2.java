package br.edu.fatec;

public class TesteBean2 {
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public void maiusculo(){
		this.setNome(this.getNome().toUpperCase());
	}
	
	
}
