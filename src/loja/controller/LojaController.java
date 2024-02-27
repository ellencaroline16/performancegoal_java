package loja.controller;
import java.util.ArrayList;

import loja.model.Produto;
import loja.repository.LojaRepository;

public class LojaController implements LojaRepository { // crio os métodos para que o menu funcione
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int id) { // irá ler o ID 
		var produto = buscarNaCollection(id); // faz a identificação se o produto existe ou não, não preciso fazer no procurarPorNumero
		if (produto != null) {
		produto.visualizar(); // tudo o que for diferente de nulo, irá visualizar o produto	
		} else { 
			System.out.println("O produto de " + id + " não existe!");
		}
		
	}

	@Override
	public void listarTodos() {
		for (var produto: listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
	listaProdutos.add (produto);
		System.out.println("O produto: " + produto.getNome() + " foi criado com sucesso! ");
		
	}

	@Override
	public void atualizar(Produto produto) {
		var buscarProduto = buscarNaCollection(produto.getId()); // descubro o numero do produto
		if (buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto),produto); // método que me permite atualizar o produto e busca o que quero editar
			System.out.println("O produto" + produto.getId() + "foi alterado com sucesso!");
			
		} else {
			System.out.println("O produto de " + produto.getId() + " não foi encontrado!");
		}
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(id);
		if (produto != null ) { // remove o produto da lista
			
			if (listaProdutos.remove(produto)){
				System.out.println("O produto" + id + "foi deletado com sucesso!");
			} else {
				System.out.println("Falha ao deletar o produto com a id: " + id);
			}
		} else {
			System.out.println("O produto de id " + id + "não foi encontrado!");
		}
		
	}

public int gerarNumero() {
	return ++ numero;
}

// método que me ajudara com os que estão acima

public Produto buscarNaCollection(int numero) { // percorre cada prod. na array e pesquisa se o nº que o usuário digitou, se existe
		for (var produto : listaProdutos) {
			if (produto.getId() == numero ) {
				return produto;
			}
		}
		return null;
}

}
