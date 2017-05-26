package view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import model.Produto;

/*
 ESCOPO DE APLICAÇÃO
 Quando nós não definimos qual é o escopo do managed bean, o escopo padrão é o "request" que o tempo
 que dura uma requisição. Já no escopo de aplicação, a primeira vez que o managed bean "ProdutoBean" é
 usado, criamos uma instância para esse managed bean e então essa mesma instância de "ProdutoBean" conti
 nua sendo usada durante toda a vida da aplicação. Portanto enquanto o TomCat estiver rodando o objeto
 "ProdutoBean" vai ser o mesmo.
 */

@ManagedBean
@ApplicationScoped
public class ProdutoBean {
	private List<Produto> produtos;
	private Produto produto;
	
	
	public ProdutoBean(){
		this.produtos = new ArrayList();
		this.produto = new Produto();
	}
	
	
	public void incluir(){
		this.produtos.add(this.produto);
		this.produto = new Produto();
	}
	
	
	public Produto getProduto(){
		return produto;
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
	
}
