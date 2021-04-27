package exercicio;

public class Main {
	public static void main(String[] args) throws Exception {
				
		//Obtendo o carrinho de compras e estoque
		Estoque estoque = Estoque.getEstoque();
		CarrinhoCompras carro = CarrinhoCompras.getCarro();
		
		//Adicionando 2 alfaces ao carrinho de compras
		Produto alface = estoque.obterProduto("alface");
		Item alfaces = new Item(alface, 2);
		carro.adicionaItem(alfaces);
		
		//Adicionando 1 arroz ao carrinho de compras
		Produto arroz = estoque.obterProduto("arroz");
		carro.adicionaItem(new Item(arroz, 1));
		
		//Finalizando as compras		
		carro.fecharCompra();	
		
	}
}
