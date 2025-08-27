package supermercadoConstrutor;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class ConstrutorSup {
	private String nome;
	private HashMap <String, Double> jornalOfertas;
	
	public ConstrutorSup(String nome) {
		this.nome = nome;
		this.jornalOfertas = new HashMap<>();
	}
	
	public boolean existeProduto(String nome) {
		return jornalOfertas.containsKey(nome);
	}
	
	public  void insereProduto (String produto, double preco) {
		jornalOfertas.put(produto, preco);
	}
	
	public double consultarPreco (String produto) {
		return jornalOfertas.getOrDefault(produto, -1.0);
	}
	
	public static void removerSupermercado (String nome, HashMap<String, ConstrutorSup> supermercados) {
		if (supermercados.containsKey(nome)) {
			supermercados.remove(nome);
			System.out.println ("#Supermercado \"" + nome + "\" removido!");
		} else {
			System.out.println ("Supermercado não encontrado.");
		}
	}
	
	
	
	
	public static void ondeComprar (ArrayList<String> listaDesejada, HashMap<String, ConstrutorSup> supermercados) {
		for (String produto: listaDesejada) {
			double menorPreco = Double.MAX_VALUE;
			String qualSup = null;
			
			for (Map.Entry<String, ConstrutorSup> atual : supermercados.entrySet()) {
				String nomeLoja = atual.getKey();
				ConstrutorSup loja = atual.getValue();
				
				double preco = loja.consultarPreco(produto);
				if (preco>= 0 && preco < menorPreco) {
					menorPreco = preco;
					qualSup = nomeLoja;
				}
			}
			
			if (qualSup != null) {
				System.out.println (produto + " -> Onde Comprar -> " + qualSup + " \"R$ " + menorPreco +"\" ");
				
			} else {
				System.out.println (produto + " -> Em falta nos estoques!");
			}
		}
	}
	
	public void imprimirLista() {
		for (Map.Entry <String, Double> entrada : jornalOfertas.entrySet()){
			System.out.println ("Produto: " + entrada.getKey() + " R$ " + entrada.getValue());
		}
	}
}
