package lista01;

public class FuncionarioExe08 {
	
	double salario;
	int quantidadeDeAnosTrabalhados;
	int quantidadeDeFilhos;
	
	int porcentagemDeAumentoParaCadaCincoAnos () {
		return this.quantidadeDeAnosTrabalhados / 5;
	}
	
	int porcentagemDeAumentoParaCadaAnoTrabalhado () { 
		return this.quantidadeDeAnosTrabalhados;
	}
	
	int porcentagemDeAumentoParaCadaFilho () {
		return this.quantidadeDeFilhos * 3;
	}
	
	double valorDeUmPorCentoDoSalario () {
		return this.salario / 100;
	}
	
	double calculaSalarioFinal () {
		double salarioFinal = this.salario;
		salarioFinal += this.valorDeUmPorCentoDoSalario() * this.porcentagemDeAumentoParaCadaAnoTrabalhado();
		salarioFinal += this.valorDeUmPorCentoDoSalario() * this.porcentagemDeAumentoParaCadaCincoAnos();
		salarioFinal += this.valorDeUmPorCentoDoSalario() * this.porcentagemDeAumentoParaCadaFilho();
		
		return salarioFinal;
	}

}
