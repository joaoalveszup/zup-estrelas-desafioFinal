package GerenciadorDeEstoque;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalListaGerenciadorProdutos {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int option;

		System.out.println("Bem vindo ao sistema de gerenciador dos nossos produtos");
		System.out.println("Escolhe entre as op�oes para comecar");
		option = 0;
		do {
			System.out.println("1 - Produtos Alimenticios");

			System.out.println("2 - Produtos Limpeza");

			System.out.println("3 - Encerrar o dia");
			option = in.nextInt();

			switch (option) {
			case 1:
				mostraMenuDeProdutosAlimenticios();
				break;
			case 2:
				mostraMenuDeProdutosDeLimpeza();
				break;
			default:
				System.out.println("opcao invalida");
			}
		} while (option != 3);

		System.out.println("Obrigado e bom descanso");
	}

	private static void mostraMenuDeProdutosDeLimpeza() {
		EstoqueLimpeza estoqueLimpeza = new EstoqueLimpeza();
		int submenuLimpeza = 0;
		do {
			System.out.println("1 - Cadastrar produtos");
			System.out.println("2 - Remover produtos");
			System.out.println("3 - Listar produtos");
			System.out.println("4 - Alterar pre�o dos produtos");
			System.out.println("5- Grava na lista ");
			System.out.println("6 - Quantidade de produtos");
			System.out.println("7 - Altera preco produto");
			System.out.println("8 - Voltar ao menu anterior");
			


		}while(submenuLimpeza >= 8);
		System.out.println("Obrigado e bom descanso");
	}

	private static void mostraMenuDeProdutosAlimenticios() {
		EstoqueAlimenticio produtAlimenticio = new EstoqueAlimenticio();
		int subMenuAlimenticio = 0;
		do {
			
			System.out.println("1 - Cadastrar produtos");
			System.out.println("2 - Remover produtos");
			System.out.println("3 - Listar produtos");
			System.out.println("4 - Alterar pre�o dos produtos");
			System.out.println("5- Grava na lista ");
			System.out.println("6 - Quantidade de produtos");
			System.out.println("7 - Altera preco produto");
			System.out.println("8 - Voltar ao menu anterior");
		}while(subMenuAlimenticio >= 8);
		
	}

}

/* Programa Principal
Ofere�a ao seu usu�rio a op��o de navega��o por um menu onde ele pode decidir se quer trabalhar com o menu de produtos aliment�cios ou de limpeza ou encerrar o dia.
Nos submenus de produtos aliment�cios e de limpeza de ofere�a op��es para utilizar todos os seus m�todos e ofere�a ao usu�rio as intera��es necess�rias (ler do teclado as informa��es num caso de cadastro por exemplo) e a op��o de retornar ao menu anterior.

- Por fim voc� dever� pensar numa funcionalidade legal para o estoque e implement�-la. Seja criativo e justifique a cria��o da sua funcionalidade num coment�rio � cima do m�todo que corresponder� � essa funcionalidade.*/
