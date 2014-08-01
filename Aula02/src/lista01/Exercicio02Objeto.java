package lista01;

import java.util.Scanner;

public class Exercicio02Objeto {
	
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Digite o nome do Vendedor: ");
		func.nome = in.next();
		
		System.out.println("Digite seu salário: ");
		func.salario = in.nextDouble();
		
		System.out.println("Digite seu total de vendas: ");
		func.vendas = in.nextDouble();
		
		System.out.println("Digite seu percentual sobre as vendas: ");
		func.percentualSobreVendas = in.nextDouble();
		
		System.out.println("O nome do funcionário é: " + func.nome);
		System.out.println("O salário base é " + func.salario + ". ");
		System.out.println("O valor total de vendas é " + func.vendas + ". ");
		
		double com = func.calculaComSalario();
		double salarioTotal = func.calculaSalarioFinal();
		
		System.out.println("O valor total do salário do funcionário é R$ " + (salarioTotal) + ". ");
		
	}
	
}
