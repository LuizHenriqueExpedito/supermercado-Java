package clienteTeste;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;


import supermercadoAlvorada.ProdutosAlvorada; // Erro estava em não importar esse supermercado.
import supermercadoMaristela.ProdutosMaristela;
import supermercadoUnissul.ProdutosUnissul;




public class Teste2 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int entradaUsuario;
		double preco = -1;
		String produto = "";
		double menorPreco = 0;
		String ondeComprar = "";
		
		ProdutosAlvorada folhetoAlvorada = new ProdutosAlvorada();
		ProdutosMaristela folhetoMaristela = new ProdutosMaristela();
		ProdutosUnissul folhetoUnissul = new ProdutosUnissul();
		
		System.out.println ("\n ------ Locale Atual: " + Locale.getDefault());
		
		
		// Menu - Switch-case.
		// Selecionar qual loja irá adicionar os produtos-preços.

		System.out.println ("\n Atualizar o Folheto de Promoção:");
		System.out.println (" Para atualizar...\n");
		System.out.println ("[ Alvorada = Digite 1] - [ Maristela = Digite 2 ] - [ Unissul = Digite 3 ]" );
		System.out.println ("[ Digite 4 = Para Começar uma Lista de Compras.");
		System.out.println ();
		System.out.print ("Escolha: ");	
		entradaUsuario = sc.nextInt();
		

		
		while (entradaUsuario != 4) {
				
			System.out.println ("Escolha do Usuário: " + entradaUsuario + "\n"); // Código está parando aqui**
			
			switch (entradaUsuario) {
			case 1: 
				System.out.println ("ALVORADA\n");
				// HashMap Alvorada recebe os produtos recebidos na linha de comando;
				System.out.println ("                   _________________________________________________________________");
				System.out.println ("		            |-INSTRUÇÕES PARA O CLIENTE!                   |");
				System.out.println ("                            | 1°_Digite o nome do produto, e tecle 'Enter' |");
				System.out.println ("                            | 2°_Digite o preço do produto, e tecle 'Enter'|");
				System.out.println ("                            | 3°_Escreva 'zero' para terminar!             |");
				System.out.println ("                   _________________________________________________________________");
				System.out.println ();
				sc.nextLine(); // Limpeza de Buffer.
				produto = "";
				while (true) {
					System.out.print ("Produto: ");
					produto = sc.nextLine();
					
					if (produto.equalsIgnoreCase("zero")) {
						break;
					}
					
					System.out.print ("Preço: ");
					preco = sc.nextDouble();
					sc.nextLine();
					
					
					folhetoAlvorada.insereProduto(produto, preco);
					
					}
						//Fiz Ajuste aqui, para ter um método que mostra todos os produtos do estoque.
						System.out.println ("\nJornal de Ofertas do Supermercado Alvorada!\n");
				  		  folhetoAlvorada.imprimirLista();
				  		System.out.println ();
					break;
						
						
			case 2:
				
				System.out.println ("MARISTELA\n");
				sc.nextLine();
						// HashMap Maristela, recebe os produtos recebidos na linha de comando;
				 System.out.println ("Digite o nome do produto e tecle 'Enter' para confirmar!");
			     System.out.println ("Em seguida, Digite o preço do produto inserido e tecle 'Enter'");
				 System.out.println ("Ao terminar de atualizar o Jornal de Ofertas, Escreva 'zero' para terminar");
						
				produto = "";
				while (true) {
					System.out.print("Produto: ");
					produto = sc.nextLine();
							
					if (produto.equalsIgnoreCase("zero")) {
					break;
					}
					
					System.out.print ("Preço: ");
					preco = sc.nextDouble();
					sc.nextLine();
							
					folhetoMaristela.insereProduto(produto, preco);
							
					}
					System.out.println ("\nJornal de Ofertas do SUpermercado Maristela!\n");
					folhetoMaristela.imprimirLista();
					System.out.println ();
					break;
						
			case 3: 
				
				System.out.println ("UNISSUL\n");
				sc.nextLine();
						// HashMap Unissul, recebe os produtos do jornal digitados na linha de comando;
				  System.out.println ("Digite o nome do produto e tecle 'Enter' para confirmar!");
			      System.out.println ("Em seguida, Digite o preço do produto inserido e tecle 'Enter'");
				  System.out.println ("Ao terminar de atualizar o Jornal de Ofertas, Escreva 'zero' para terminar");
						
				  produto = "";
				while (true) {
					System.out.print ("Produto: ");
					produto = sc.nextLine();
							
					if (produto.equalsIgnoreCase("zero")) {
					break;
					}
					
					System.out.print("Preço: ");
					preco = sc.nextDouble();
					sc.nextLine();
							
					folhetoUnissul.insereProduto(produto, preco);
						
					}
				
					System.out.println ("Folheto de Ofertas Supermercado Unissul!\n");
					folhetoUnissul.imprimirLista();
					System.out.println ();
					break;
					

					case 4: 
						// Caso o usuário quiser interronper o porgrama.
					break;
					}
			
			
			System.out.println ("\nRealmente terminou a atualização de preços?");
			System.out.println ("Digite \"4\" para trocar de menu e fazer uma lista de compras.\n");
			System.out.println ("Ou continue a atualizar preços:");
			System.out.println ("[ Digite 1 = Alvorada ] - [ Digite 2 = Maristela ] - [ Digite 3 = Unissul ]" );
			System.out.print("Escolha: ");
			entradaUsuario = sc.nextInt();
		
				
			//CASE 5: Opicional.
			// Automatizar com um construtor para -->
			// CRIAR UM NOVO SUPERMERCADO QUE AINDA NÃO ESTÁ PRÉ-DEFINIDO AQUI, ( EXEMPLO,  MartMinas! ou EPA)
			
					
			
		}
		// 25/07/25 - Coloquei a segunda parte do código para ver se vai funcionar. 
		//Pedir uma lista de produtos.
				System.out.println ("\nFaça sua lista de Compras: ");
				System.out.println ("Digite um produto e digite 'Enter' para adicioná-lo á lista!");
				System.out.println ("Digite 'zero' para fechar o programa!");
				
				ArrayList<String> listaDesejada = new ArrayList<String>();
				String produtoLista = "";

				sc.nextLine();
				while (!produtoLista.equalsIgnoreCase("zero")) {
					
					System.out.print ("Produto: ");
					produtoLista = sc.nextLine(); 
					
					
					if  (!produtoLista.equalsIgnoreCase("zero")) {
						listaDesejada.add(produtoLista);
					}
							
					System.out.println ("Lista digitada:");
					
					/*for (String item : listaDesejada) {
						System.out.println (item);
						*/
						// Futuramente Aqui dá para otimizar, ou com "Math.min, ou com List/ ArrayList + HashMap.  Collections.Min
						if (folhetoAlvorada.existeProduto(produtoLista) && folhetoMaristela.existeProduto(produtoLista) 
								&& folhetoUnissul.existeProduto(produtoLista)) {
									double precoAlvorada = folhetoAlvorada.consultaPreco(produtoLista);
									double precoMaristela = folhetoMaristela.consultaPreco(produtoLista);
									double precoUnissul = folhetoUnissul.consultaPreco(produtoLista);
							
									if (precoAlvorada < precoMaristela && precoAlvorada < precoUnissul) {
										menorPreco = precoAlvorada;
										ondeComprar = "Alvorada";
										
								}else if (precoMaristela < precoAlvorada && precoMaristela < precoUnissul) {
										menorPreco = precoMaristela;
										ondeComprar = "Maristela";
										
									}else {
										menorPreco = precoUnissul;
										ondeComprar = "Unissul";
									}
						
									System.out.println ("Dica de compra para o produto: " + produtoLista + " - Valor R$ " + menorPreco + " Loja: " + ondeComprar);
									
									
									
								}else {
									System.out.println ("Fim do Programa.");
									//System.out.println ("Chave inválida. Verifique se não houve erro de digitação.");
									// Preciso adicionar um exception Error ou um TRy e Catch.
								}
							

		sc.close();
					}
				}
	

		}


		
		