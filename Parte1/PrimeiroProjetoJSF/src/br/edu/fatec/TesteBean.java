package br.edu.fatec;

import javax.faces.bean.ManagedBean;

/* 
1)A páginha "xhtml" é a view e é responsável por exibir informações, já no "ManagedBean" colocamos o 
comportamento da tela, por exemplo, quando clicar num botão o que queremos que a aconteça, esse "Bean" 
serve como um canal entre a interface gráfica e o backend da aplicação. O "ManagedBean" funciona como um 
controlador, ele não deve executar regras de negócio ou acessar banco de dados, ele deve pegar uma 
requisição e mandar pra regra de negócios. Pro JSF enxergar essa classe como um "ManagedBean", pro JSF 
gerenciar esse classe "Bean", ou seja, os objetos que vão ser instanciados dela, usamos @ManagedBean  
*/

@ManagedBean
public class TesteBean {
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
