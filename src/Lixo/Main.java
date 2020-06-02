package Lixo;

public class Main {
	
	int numero;
	
	// Construtor
	public Main ( ) {
		System.out.println("Construtor");
	}
	
	// Método
	protected void finalize () {
		System.out.println("Final");
	}
}
