package lista01;

	import java.util.Scanner;

public class Exercicio08Objeto {

	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos calculos deseja fazer ? ");
		int quantidadeDeCalculos = entrada.nextInt();
		
		
		for (int cont = 0; cont < quantidadeDeCalculos; cont++) {
		
			FuncionarioExe08 func = new FuncionarioExe08();
			
			System.out.println("Digite o Salário do Funcionário: ");
			func.salario = entrada.nextDouble();

			System.out.println("Digite o o tempo de serviço na empresa: ");
			func.quantidadeDeAnosTrabalhados = entrada.nextInt();

			System.out.println("Digite a quantidade de filhos: ");
			func.quantidadeDeFilhos = entrada.nextInt();
			
			System.out.println("Salário final do Funcionário: " + func.calculaSalarioFinal());
			
		}
		
		
		
	}
	
}
