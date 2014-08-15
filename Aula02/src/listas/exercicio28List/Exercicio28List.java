package listas.exercicio28List;

import java.util.ArrayList;
import listas.exercicio28.Produto;
import util.UtilPed;

public class Exercicio28List {

	public static void main (String[] args) {
		
		ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		UtilPed uped = new UtilPed();
		
		boolean receberMaisProdutos = true;

		while (receberMaisProdutos) {
			Produto produto = new Produto();
			
			UtilPed.out("Digite o Nome do Produto: ");
			produto.nome = UtilPed.in.next();
			UtilPed.out("Digite o Valor: ");
			produto.valor = UtilPed.in.nextDouble();
			
			listaDeProdutos.add(produto);
			
			if (produto.valor < 1)
				receberMaisProdutos = false;
			
		}
		
		Produto prodParaAlteracao = listaDeProdutos.get(0);
		prodParaAlteracao.nome = "Nome alterado";
		
		listaDeProdutos.get(1).nome = "Nome alterado 2";
		
		for (Produto produtoDoFor : listaDeProdutos) {
			UtilPed.out("Produto: " + produtoDoFor.nome);
			UtilPed.out("* Valor do Produto: " + produtoDoFor.valor);
			UtilPed.out("* Valor do Frete: " + produtoDoFor.valorFrete());
			UtilPed.out("* Valor da Comissão: " + produtoDoFor.valorComissao());
			UtilPed.out("* Valor FINAL: " + produtoDoFor.valorFinal());
			UtilPed.out(" ---------------------------- ");
		}
		
		UtilPed.out("** Saindo do Programa **");
	}
}
