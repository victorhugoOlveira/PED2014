package exercicio.exe40;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ProgramaTest {

	@Test
	public void testaQuantidaPessoasGeradaExato() {
		int amostragem = 700;
		Principal p = new Principal();
		ArrayList<Pessoa> pessoas = p.popularArrayValorExato(amostragem);
		
		assertEquals(amostragem, pessoas.size());
	}
	
	@Test
	public void testaQuantidaPessoasGeradaRandom() {
		int amostragem = 700;
		Principal p = new Principal();
		ArrayList<Pessoa> pessoas = p.popularArrayValorRandom(amostragem);
		
		assertEquals(amostragem, pessoas.size());
	}
	
	

}
