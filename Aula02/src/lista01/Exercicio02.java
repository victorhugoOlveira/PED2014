package lista01;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o nome do Vendedor: ");
		String nome = in.next();
		
		System.out.println("Digite seu salário: ");
		double salario = in.nextDouble();
		
		System.out.println("Digite seu total de vendas: ");
		double vendas = in.nextDouble();
		
		System.out.println("Digite seu percentual sobre as vendas: ");
		double percentualSobreVendas = in.nextDouble();
		
		System.out.println("O nome do funcionário é: " + nome);
		System.out.println("O salário base é " + salario + ". ");
		System.out.println("O valor total de vendas é " + vendas + ". ");
		
		double com = ((vendas / 100) * percentualSobreVendas);
		double salarioTotal = salario + com;
		
		System.out.println("O valor total do salário do funcionário é R$ " + (salarioTotal) + ". ");
		
		
	}

}
