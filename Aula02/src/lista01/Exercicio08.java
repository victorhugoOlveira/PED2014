package lista01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite o Salário do Funcionário: ");
		double salario = in.nextDouble();

		System.out.println("Digite o o tempo de serviço na empresa: ");
		int anos = in.nextInt();

		System.out.println("Digite a quantidade de filhos: ");
		int quantidadeFilhos = in.nextInt();

		double valoUmPorcento = (salario / 100);
		int qntAumentoACadaCincoAnos = (anos / 5);

		double valorFinal = 0;
		valorFinal += (valoUmPorcento * qntAumentoACadaCincoAnos)
				   + (valoUmPorcento * anos)
				   + ((valoUmPorcento * 3) * quantidadeFilhos);

	}

}
