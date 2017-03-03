package br.edu.fatec;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

/*
 Managed Bean -> é um componente gerenciado pelo JSF que serve para controlar o comportamento das páginas, 
 os eventos, ou seja, podemos gerenciar campos de texto, botões, etc, tudo a partir do managed bean
 
 BACKING BEANS -> é um tipo especial de managed beans. Com backing beans é possível acessar diretamente 
 os componentes da página, então é possível alterar alguns atributos desses componentes diretamente. 
 Por exemplo, podemos desabilitar um componente, mudar a cor dele, incluir componentes diretamente na 
 página.
 */

@ManagedBean
public class TesteBackingBean {
	//o objeto <h:inputText /> é na verdade um objeto da classe HtmlInputText. Então quando o componente
	//<h:inputText /> é carregado na memório ele é representado por um objeto da classe HtmlInputText
	private HtmlInputText campo; //com backing beans podemos acessar diretamente esse objeto

	
	//Já o componente <h:commandButton /> é representado por um objeto da classe HtmlCommandButton
	private HtmlCommandButton botao;

	
	public void testar(){
		if(this.campo.isDisabled()){
			this.campo.setDisabled(false);
			this.botao.setStyle(""); 
		}else{
			this.campo.setDisabled(true);
			this.botao.setStyle("background-color: red; color:white");
		}
	}
	
	
	public HtmlInputText getCampo() {
		return campo;
	}

	public void setCampo(HtmlInputText campo) {
		this.campo = campo;
	}

	public HtmlCommandButton getBotao() {
		return botao;
	}

	public void setBotao(HtmlCommandButton botao) {
		this.botao = botao;
	}
	
	
}
