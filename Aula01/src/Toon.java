
public class Toon {
	
	String nick;
	String team;
	
	int x = 0;
	int y = 0;
	
	int life = 100;
	int roundsJogados;
	int quantidadeMortes; 
	int quantidadeKills;
	
	public void andar (int paraX, int paraY) {
		x = paraX;
		y = paraY;
		
		System.out.println("Opa, andei para " + x + ", " + y);	
	}
	
	public void atirar () {
		
	}
	
	public void pular () {
		
	}
	
	public void morrer () {
		
	}
	

}
