package listas.exercicio28;

import java.util.Scanner;
import util.UtilPed;

public class Exercicio28 {

	public static void main (String[] args) {
		
		boolean receberMaisProdutos = true;

		while (receberMaisProdutos) {
			Produto produto = new Produto();
			
			UtilPed.out("Digite o Nome do Produto: ");
			produto.nome = UtilPed.in.next();
			UtilPed.out("Digite o Valor: ");
			produto.valor = UtilPed.in.nextDouble();
			
			UtilPed.out("Produto " + produto.nome + " é: ");
			UtilPed.out("* Valor do Produto: " + produto.valor);
			UtilPed.out("* Valor do Frete: " + produto.valorFrete());
			UtilPed.out("* Valor da Comissão: " + produto.valorComissao());
			UtilPed.out("* Valor FINAL: " + produto.valorFinal());
			
			if (produto.valor < 1)
				receberMaisProdutos = false;
			
		}
		
		UtilPed.out("** Saindo do Programa **");
		
	}
}
