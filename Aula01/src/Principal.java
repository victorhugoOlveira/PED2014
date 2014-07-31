import java.util.Scanner;


public class Principal {
	

	public static void main (String[] args) {

		// Aqui instancio a Classe que consegue 
		// ler o que é digitado no console
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
        String nome = in.next();
        
        System.out.println("Digite seu CPF: ");
        String cpf = in.next();
        
        System.out.println("Digite seu SEXO: \n 1 para Homem \n 2 para Mulher ");
        int sexo = in.nextInt();
        
        System.out.println("Digite um valor: ");
        int quantidade = in.nextInt();
        
        if (sexo == 1) {
        	System.out.println("Você é Homem =S ... ");
        } else {
        	System.out.println("Você é Mulher =D ... ");
        }
        	
        switch (sexo) {
			case 1:
				System.out.println("Você é Homem =S (2) ... ");
			break;
			
			case 2:
				System.out.println("Você é Mulher =D (2) ... ");
			break;
		}
        
        for (int i = 0; i < quantidade; i++) {
			System.out.println("Repetição " + i + " de " + quantidade);
		}
        
        int cont = 0;
        while (cont < quantidade) {
        	System.out.println("Repetição (2) " + cont + " de " + quantidade);
			cont++;
		}
		
	}
}
