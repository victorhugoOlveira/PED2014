package listas.exercicio28List;

import static org.junit.Assert.*;
import listas.exercicio28.Produto;

import org.junit.Test;

public class TestExercicio28List {

	@Test
	public void testCalculoValorProdutoMenor() {
		
		Produto produto = new Produto();
		produto.nome = "Cerveja";
		produto.valor = 5.5;
		
		//Valor do Produto -> R$ 5.5 
		//Valor de Acrescimo de frete -> R$ 0.1925
		//Valor de comissão - > 0.284625 
		//Valor final -> 5.977125
		
		assertEquals(5.977125, produto.valorFinal(), 0.0001);
	}
	
	@Test
	public void testCalculoValorProdutoMaior() {
		
		Produto produto = new Produto();
		produto.nome = "Cerveja";
		produto.valor = 700.0;
		
		//Valor do Produto -> R$ 700.0 
		//Valor de Acrescimo de frete -> R$ 24.5
		//Valor de comissão - > 36.225 
		//Valor final -> 760.725
		
		assertEquals(760.725, produto.valorFinal(), 0.0001);
	}
	
	@Test
	public void testaCalculoFreteProduto () {
		Produto produto = new Produto();
		produto.nome = "Cerveja";
		produto.valor = 500.0;
		
		//Valor do Produto -> R$ 500.0 
		//Valor de Acrescimo de frete -> R$ 17,50
		
		assertEquals(17.50, produto.valorFrete(), 0.000001);
	}
	
	@Test
	public void testaCalculoComissaoProduto () {
		Produto produto = new Produto();
		produto.nome = "Cerveja";
		produto.valor = 8400.50;
		
		//Valor do Produto -> R$ 8400.50 
		//Valor com Frete -> R$ 294.0175
		//Valor de Acrescimo de frete -> R$ 434.7
		
		assertEquals(434.725875, produto.valorComissao(), 0.00001);
	}

}
