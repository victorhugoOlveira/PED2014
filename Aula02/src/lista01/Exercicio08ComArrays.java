package lista01;

import java.util.Scanner;

public class Exercicio08ComArrays {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Deseja calcular quantos Salários ? ");
		int qnt = in.nextInt();
		
		double salario[] = new double[qnt];
		int anos[] = new int[qnt];
		int quantidadeFilhos[] = new int[qnt];
		int qntAumentoACadaCincoAnos[] = new int[qnt];
		double valoUmPorcento[] = new double[qnt];

		for (int cont = 0; cont < qnt; cont++) {

			System.out.println("Digite o Salário do Funcionário: ");
			salario[cont] = in.nextDouble();

			System.out.println("Digite o o tempo de Serviço na Empresa: ");
			anos[cont] = in.nextInt();

			System.out.println("Digite a quantidade de Filhos: ");
			quantidadeFilhos[cont] = in.nextInt();

			valoUmPorcento[cont] = (salario[cont] / 100);
			qntAumentoACadaCincoAnos[cont] = (anos[cont] / 5);

			double valorFinal = salario[cont];
			valorFinal += (valoUmPorcento[cont] * qntAumentoACadaCincoAnos[cont])
					   + (valoUmPorcento[cont] * anos[cont])
					   + ((valoUmPorcento[cont] * 3) * quantidadeFilhos[cont]);
			
			System.out.println("O salário final do Funcionário é: " + valorFinal);
			System.out.println("O aumento foi de R$ " + ((salario[cont] - valorFinal)*-1) + ".");

		}

	}

}
