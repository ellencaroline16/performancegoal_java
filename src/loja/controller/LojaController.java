package loja.controller;
import loja.model.Produto;
import loja.repository.LojaRepository;

public class LojaController implements LojaRepository {

	@Override
	public void procurarPorNumero(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrar(Produto produto) {
	listaProdutos.add (produto);
		System.out.println("O produto: " + produto.getNome() + "foi criado com sucesso! ");
		
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
