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
			
//			opção de resolução 01
//			String resposta = UtilPed.in.next();
//			if (resposta.equalsIgnoreCase("s")) {
//				receberMaisProdutos = true;
//			}
			
//			opção de resolução 02
//			String resposta = UtilPed.in.next();
//			receberMaisProdutos = resposta.equalsIgnoreCase("s");
			
//			opção de resolução 03
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
		
		String saida = "";
		
		for (Produto produtoDoFor : listaDeProdutos) {
			saida += "Produto: " + produtoDoFor.nome + "\n";
			saida += "* Valor do Produto: " + produtoDoFor.valor + "\n";
			saida += "* Valor do Frete: " + produtoDoFor.valorFrete() + "\n";
			saida += "* Valor da Comissão: " + produtoDoFor.valorComissao() + "\n";
			saida += "* Valor FINAL: " + produtoDoFor.valorFinal() + "\n";
			saida += " ---------------------------- " + "\n";
		}
		
		UtilPed.out("** Saindo do Programa **");
		
		JOptionPane.showMessageDialog(null, saida + " \n \n Obrigado, volte sempre !! =D", "Obrigado", 2);
		
	}
}
