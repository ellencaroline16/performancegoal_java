package loja.repository;
import loja.model.Produto;

public interface LojaRepository { // fornecerá a assinatura dos Métodos necessários para manipular os Objetos das
	// Classes ContaCorrente e ContaPoupanca, que posteriormente serão armazenados
	// em uma Collection.
	
	//CRUD do Produto
	
	public void procurarPorNumero(int id);;

	public void listarTodos();

	public void cadastrar(Produto produto);

	public void atualizar(Produto produto);

	public void deletar(int id);

}
