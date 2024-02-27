package loja;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.util.CoresLoja;
import loja.controller.LojaController;
import loja.model.Produto;
import loja.model.ProdutoBanho;
import loja.model.ProdutoRacao;

public class Menu {

	public static void main(String[] args) {

		LojaController produto = new LojaController();
		
		Scanner leia = new Scanner(System.in);

		ProdutoBanho Banho1 = new ProdutoBanho (produto.gerarNumero(),1, "Banho&Tosa", 80.0f, "PetzDog");
		produto.cadastrar(Banho1);
		ProdutoRacao Racao2 = new ProdutoRacao (produto.gerarNumero(),2, "Natural One", 80.0f, "Premier");
		produto.cadastrar(Racao2);
		
		int opcao = 0;

		while (true) {
			System.out.println(CoresLoja.TEXT_PURPLE_BOLD_BRIGHT + CoresLoja.ANSI_WHITE_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                PETSHOP MERGULHÃO                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Consultar produto por ID             ");
			System.out.println("            4 - Atualizar produto                    ");
			System.out.println("            5 - Deletar produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + CoresLoja.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println(CoresLoja.TEXT_BLACK_BOLD + "\n PetShop Mergulhão - A felicidade do seu filhão!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(CoresLoja.TEXT_BLACK_BOLD + "Criar produto\n\n");

				keyPress();
				break;
			case 2:
				System.out.println(CoresLoja.TEXT_BLACK_BOLD + "Listar todas os produtos\n\n");
				produto.listarTodos();
				keyPress();
				break;
			case 3:
				System.out.println(CoresLoja.TEXT_BLACK_BOLD + "Consultar produto por ID\n\n");

				keyPress();
				break;
			case 4:
				System.out.println(CoresLoja.TEXT_BLACK_BOLD + "Atualizar produto\n\n");

				keyPress();
				break;
			case 5:
				System.out.println(CoresLoja.TEXT_BLACK_BOLD + "Deletar produto\n\n");

				keyPress();
				break;

			default:
				System.out.println(CoresLoja.TEXT_BLACK_BOLD + "\nOpção Inválida!\n");

				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Ellen Silva ");
		System.out.println("Generation Brasil - ellen_caroline_17@hotmail.com");
		System.out.println("https://github.com/ellencaroline16");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println(CoresLoja.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
