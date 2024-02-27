package loja.model;

public class ProdutoRacao extends Produto {

	private String marcaDoProduto; // mais uma característica da regra de negócio

	public ProdutoRacao(int id, int tipo, String nome, float preço, String marcaDoProduto) {
		super(id, tipo, nome, preço);
		this.marcaDoProduto = marcaDoProduto;
	}

	// get e set : uso em outras classes e permite as variações
	public String getMarcaDoProduto() {
		return marcaDoProduto;
	}

	public void setMarcaDoProduto(String marcaDoProduto) {
		this.marcaDoProduto = marcaDoProduto;
	}

	@Override // indicando que o Método foi sobrescrito. Esta anotação é opcional.
	public void visualizar() {
		super.visualizar();
		System.out.println("Marca do produto: " + this.marcaDoProduto);
	}

}
