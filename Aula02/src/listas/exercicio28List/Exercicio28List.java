package listas.exercicio28List;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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
		
			UtilPed.out("Deseja incluir mais Produtos ?  Se sim, tecle 's': ");
			receberMaisProdutos = UtilPed.in.next().equalsIgnoreCase("s");
		}
		
		boolean removerMaisProdutos = false;
		UtilPed.out("Deseja remover produtos ? Se sim, tecle 's': ");
		
		//if (UtilPed.in.next().equalsIgnoreCase("s"))
		//	removerMaisProdutos = true;
		
		//if (UtilPed.in.next().equalsIgnoreCase("s") == true)
		//	removerMaisProdutos = true;
		
		removerMaisProdutos = UtilPed.in.next().equalsIgnoreCase("s");
		
		while (removerMaisProdutos) {
			
			UtilPed.out(" --- Lista de Produtos --- ");
			for (Produto produtoRemover : listaDeProdutos) {
				UtilPed.out(listaDeProdutos.indexOf(produtoRemover) + " - " + produtoRemover.nome);
			}
			
			UtilPed.out("Digite a posição do Produto que deseja remover: ");
			int posRemover = UtilPed.in.nextInt();
			
			listaDeProdutos.remove(posRemover);
			
			UtilPed.out("Deseja remover mais Produtos ? Se sim, tecle 's': ");
			removerMaisProdutos = UtilPed.in.next().equalsIgnoreCase("s");
		}
		
		for (Produto produtoDoFor : listaDeProdutos) {
			UtilPed.out("Produto: " + produtoDoFor.nome);
			UtilPed.out("* Valor do Produto: " + produtoDoFor.valor);
			UtilPed.out("* Valor do Frete: " + produtoDoFor.valorFrete());
			UtilPed.out("* Valor da Comissão: " + produtoDoFor.valorComissao());
			UtilPed.out("* Valor FINAL: " + produtoDoFor.valorFinal());
			UtilPed.out(" ---------------------------- ");
		}
		
		UtilPed.out("** Saindo do Programa **");
		
		JOptionPane.showMessageDialog(null, "Obrigado, volte sempre !! =D", "Obrigado", 2);
		
	}
}
