package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	private static Estoque estoque = new Estoque();
	private List<Produto> produtos = new ArrayList<Produto>();
	
	private Estoque() {	
		produtos.add(new Produto("Arroz", 30));
		produtos.add(new Produto("Alface", 2));		
	}
	
	public Produto obterProduto(String nome) throws Exception {
		for (Produto p: produtos) {
			if (p.getNome().equalsIgnoreCase(nome)) return p;
		}		
		throw new Exception ("Produto não encontrado");
	}
	
	public static Estoque getEstoque() {
		return estoque;
	}

}
