package loja.model;

public abstract class  Produto {

	// variáveis - características de uma conta
	private int id;
	private int tipo;
	private String nome;
	private float preco;

	// classe: forma de bolo | objetos: os tipos de receitas que posso criar a
	// partir da forma
	// método construtor = as regras de negócios

	// tudo isso aqui é característica da minha forma de bolo

	public Produto(int id, int tipo, String nome, float preço) {
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preço;
	}

	// get e set : uso em outras classes e permite as variações

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreço() {
		return preco;
	}

	public void setPreço(float preço) {
		this.preco = preço;
	}

	public void visualizar() { // não retorna, só executa

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Produto Ração";
			break;
		case 2:
			tipo = "Produto Banho";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("ID do Produto: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Tipo do produto: " + tipo);
		System.out.println("Preço: " + this.preco);

	}

}
