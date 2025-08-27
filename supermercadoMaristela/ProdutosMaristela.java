package supermercadoMaristela;
import java.util.HashMap;
import java.util.Map;

public class ProdutosMaristela {
	
	// Produtos pré estabelecidos.
	HashMap < String, Double> jornalOfertas;
	
	public boolean existeProduto(String nome) {
		return jornalOfertas.containsKey(nome);
	}
	
	public void insereProduto(String nome, Double preco) {
		// Não retorna nada, apenas altera um valor dentro do método.
		// Executa uma ação, semelhante ao método 'SET'.
		jornalOfertas.put(nome, preco);
		
		}
	
	public void removeProduto (String nome) {
		jornalOfertas.remove(nome);
	}
	
	// Aqui não altera nenhum dado, apenas 'lê' e retorna. Semelhante ao método 'GET' do set/get.
	public double consultaPreco (String nome) {
		return jornalOfertas.get(nome);
	}
	
	public void imprimirLista() {
		for (Map.Entry < String, Double > entrada : jornalOfertas.entrySet()){
			System.out.println ("Produto: " + entrada.getKey() + "R$ " + entrada.getValue());
			
		}
	}
	
	
	public ProdutosMaristela () {
		jornalOfertas = new HashMap<String, Double>();
		
	}

}
