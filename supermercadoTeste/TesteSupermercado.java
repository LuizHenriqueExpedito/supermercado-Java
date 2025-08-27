package supermercadoTeste;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import supermercadoConstrutor.ConstrutorSup;



public class TesteSupermercado {
	
	public static void main (String[] args) {
	String nomeMercado = "";
	double preco = -1;
	String escolha = "";
	
	Scanner sc = new Scanner(System.in);
	
	
	// Tabela para armazenar Supermercados!
	HashMap<String, ConstrutorSup> supermercados = new HashMap<>();
	
	System.out.println ("\n\"ADICIONE SUPERMERCADOS\"");
	System.out.println ();
	
	while (!escolha.equalsIgnoreCase("n")) {
		
		
		System.out.print ("Digite o nome do Supermercado: ");
		nomeMercado = sc.nextLine();
		System.out.println ();
		
		if (nomeMercado.equalsIgnoreCase ("zero")) break;
		
		supermercados.putIfAbsent(nomeMercado, new ConstrutorSup(nomeMercado));
		ConstrutorSup mercadoAtual = supermercados.get(nomeMercado);
		
		System.out.println ("Adicionando produtos para: \" "+ nomeMercado + "\"");
		System.out.println ();
		
		while (true) {
			
			try {

			System.out.println ("[ Digite o nome do produto + ENTER e o preço + ENTER ou \"zero\" para sair ]");
		
			System.out.print("Produto: ");
			String produto = sc.nextLine();

			if (produto.equalsIgnoreCase("zero")) break;
			
			System.out.print("Preço: ");
			String precoFiltro = sc.nextLine();
			
			
			// Aceitar vírgula ou ponto.
			precoFiltro = precoFiltro.replace("," , ".");
			preco = Double.parseDouble(precoFiltro);
			
			mercadoAtual.insereProduto(produto, preco);
			
			
			} catch (NumberFormatException e) {
				System.out.println ("Entrada inválida! Digite apenas números (ex: 19,99 ou 19.99)");
			}
		
		}
		
		
		// O primeiro loop while garante que nesse ponto, tenhamos um controle de prosseguir ou não.
		System.out.println (" \nDESEJA ADICIONAR OUTRO SUPERMERCADO? \"S\" ou \"N\"  ");
		escolha = sc.nextLine();
		
		
		// Imprimir uma lista com o nome de cada supermercado criado.
		System.out.println ("SUPERMERCADOS DISPONÍVEIS: ");
		System.out.println ();
		int i = 1;
		for (String nome : supermercados.keySet()) {
			System.out.println (i + "-" + nome);
			i++;			
		}
		System.out.println();

	}
	
	
	// Funcionalidade para remover supermercados.
	System.out.println ("Deseja remover algum supermercado? ");
	System.out.println ("Se sim, Digite o nome da loja...");
	System.out.println (" Se não, digite a letra \"N\" ");
	
	String remover = sc.nextLine();
	if (!remover.equalsIgnoreCase("n")) {
		ConstrutorSup.removerSupermercado(remover, supermercados);
		}
	
	
	
		// Sair do Loop e pedir para o cliente fazer uma lista de compras.
		System.out.println ("\nFaça sua lista de Compras: ");
		System.out.println ("Digite um produto e digite 'Enter' para adicioná-lo á lista!");
		System.out.println ("Digite 'zero' para encerrar o programa!");
		
		ArrayList<String> listaDesejada = new ArrayList<String>();
		String produtoLista = "";

		while (!produtoLista.equalsIgnoreCase("zero")) {
			
			System.out.print ("Produto: ");
			produtoLista = sc.nextLine(); 
			
			
			if  (!produtoLista.equalsIgnoreCase("zero")) {
				listaDesejada.add(produtoLista);
			}
					
			
		
			}
		System.out.println ("\nLISTA DIGITADA:");
		int j = 1;
		for (String nome : listaDesejada) {
		System.out.println (j + "°" + nome);
		j++;
		}
		System.out.println ();
		
		
        // Sugerir supermercado com o menor preço para cada produto!
		ConstrutorSup.ondeComprar(listaDesejada, supermercados);
		
		sc.close();

	}
	
	
	
 }
 	

		


		
		