package listas.exercicio28;

public class Produto {
	
	public String nome;
	public double valor;
	
	public Double valorFrete () {
		return ((this.valor / 100) * 3.5);
	}
	
	public Double valorComissao () {
		return ((this.valor / 100) * 5);
	}
	
	public Double valorFinal () {
		return this.valor + this.valorFrete() + valorComissao();
	}
}
