package Tern�rio;

public class Main {
	
	public static void main (String [] args) {		
	// IF comum:
		int numero = 20;
		String letras = "letras";
		
		if (numero < 21) {
			letras = "Sim!";
		}else {
			letras = "N�o!";
		}	
		System.out.println(letras);
	//---------------------
		
		
	//TERN�RIO:
		letras = (numero < 21 ? "Sim!" : "N�o!");
		System.out.println(letras);		
	}		
}
