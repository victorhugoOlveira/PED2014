package exercicio.exe40;

import java.util.ArrayList;
import java.util.Random;

public class Principal {

	public static void main (String[] args) {
		
		int qntPessoasAmostra = 900;
		
		Principal programaPrincipal = new Principal();
		ArrayList<Pessoa> pessoas = programaPrincipal.popularArrayValorExato(qntPessoasAmostra);
		
		int qntPessoasMais60 = programaPrincipal.numeroPessoasPorIdade(pessoas, 60);
		int qntPessoasMais30 = programaPrincipal.numeroPessoasPorIdade(pessoas, 30);
		
		double perc60 = programaPrincipal.calculaPorcentagem(qntPessoasAmostra, qntPessoasMais60);
		double perc30 = programaPrincipal.calculaPorcentagem(qntPessoasAmostra, qntPessoasMais30);
		
		System.out.println("A porcentagem de pessoas com mais de 60 anos é " + perc60);
		System.out.println("A porcentagem de pessoas com mais de 30 anos é " + perc30);
		
	}
	
	public double calculaPorcentagem (int qntAmostra, int qntPessoas) {
		return ((double) qntPessoas / qntAmostra) * 100; 
	}
	
	public ArrayList<Pessoa> popularArrayValorRandom (int qnt) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Random r = new Random();
		
		for (int i = 0; i < qnt; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.idade = r.nextInt(100);	
			
			pessoas.add(pessoa);
		}
		
		return pessoas;
	}
	
	public ArrayList<Pessoa> popularArrayValorExato (int qnt) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Random r = new Random();
		
		for (int i = 0; i < qnt; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.idade = i;
			
			pessoas.add(pessoa);
		}
		
		return pessoas;
	}
	
	public int numeroPessoasPorIdade (ArrayList<Pessoa> pessoas, int idade) {
		int qntPessoas = 0;
		for (Pessoa p : pessoas) {
			if (p.idade > idade)
				qntPessoas++;
		}
		return qntPessoas;
	}
	
}
