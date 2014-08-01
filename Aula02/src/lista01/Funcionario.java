package lista01;

public class Funcionario {
	
	String nome;
	double salario;
	double vendas;
	double percentualSobreVendas;

	double calculaComSalario () {
		return ((this.vendas / 100) * this.percentualSobreVendas);
	}
	
	double calculaSalarioFinal () {
		return this.calculaComSalario() + this.salario;
	}
	
}
