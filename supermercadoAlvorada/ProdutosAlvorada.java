package supermercadoAlvorada;
import java.util.HashMap;
import java.util.Map;


public class ProdutosAlvorada {
	
	// Produtos pré-estabelecidos.
	HashMap<String, Double> jornalOfertas;
	
	public boolean existeProduto(String nome) {
		return jornalOfertas.containsKey(nome);
	}
	
	public void insereProduto (String nome, double preco) {
		jornalOfertas.put(nome, preco);
	}

	public void removeProduto(String nome) {
		jornalOfertas.remove(nome);
	}
	
	public double consultaPreco (String nome) {
		return jornalOfertas.get(nome);
	}
	
	public void imprimirLista () {
		for ( Map.Entry<String, Double> entrada: jornalOfertas.entrySet()) {
			System.out.println ("Produto: " + entrada.getKey()+ "- R$ "+ entrada.getValue());
		}
	}
	
	public ProdutosAlvorada() {
		jornalOfertas = new HashMap<String, Double>();
	}
}

