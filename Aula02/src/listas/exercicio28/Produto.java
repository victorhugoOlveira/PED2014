package listas.exercicio28;

public class Produto {
	
	public String nome;
	public double valor;
	
	public double valorFrete () {
		return ((this.valor / 100) * 3.5);
	}
	
	public double valorComissao () {
		return ((this.valor / 100) * 5);
	}
	
	public double valorFinal () {
		return this.valor + this.valorFrete() + valorComissao();
	}
}
