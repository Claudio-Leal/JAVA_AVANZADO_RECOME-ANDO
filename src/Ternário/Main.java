package Ternário;

public class Main {
	
	public static void main (String [] args) {		
	// IF comum:
		int numero = 20;
		String letras = "letras";
		
		if (numero < 21) {
			letras = "Sim!";
		}else {
			letras = "Não!";
		}	
		System.out.println(letras);
	//---------------------
		
		
	//TERNÁRIO:
		letras = (numero < 21 ? "Sim!" : "Não!");
		System.out.println(letras);		
	}		
}
