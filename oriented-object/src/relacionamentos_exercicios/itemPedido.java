package relacionamentos_exercicios;

public class itemPedido {
	private int quantidade;
	private Produto product ;
	
	itemPedido(int quantidade, Produto p) {
		this.quantidade = quantidade;
		this.product = p;
	}
	
	public double subTotal() {
		return quantidade * product.getValue();
	}

}
