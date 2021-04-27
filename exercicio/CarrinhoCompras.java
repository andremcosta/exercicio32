package exercicio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	
	private static CarrinhoCompras carro = new CarrinhoCompras();
	private List<Item> itens = new ArrayList<Item>();
	
	private CarrinhoCompras() {	
	}
	
	public static CarrinhoCompras getCarro() {
		return carro;
	}

	public void adicionaItem(Item i) {
		this.itens.add(i);		
	}	
	
	public void fecharCompra() {
		double valor = 0;
		for (Item i: itens) {
			valor += i.getProduto().getPreco() * i.getQuantidade();
		}
		System.out.println("Compra terminada. Valor total: " + valor ); 
		itens.clear();
	}

}
