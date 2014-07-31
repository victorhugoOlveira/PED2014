package lista01;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor de seu salário: ");
		double salario = in.nextDouble();
		
		System.out.println("Digite o % de aumento de salário: ");
		double aumento = in.nextDouble();
		
		double novoSalarioDoFuncionario = (salario + ((salario / 100) * aumento));
		
		System.out.println("O novo salário do Funcionário é " + novoSalarioDoFuncionario);
		
		
		
		
	}

}
