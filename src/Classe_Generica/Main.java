package Classe_Generica;

public class Main {

	public static void main(String[] args) {
		// Classe gen�rica sendo instanciada. 
		// Estamos passando o tipo inteiro e o valor 1. 
		Classe_Generica<Integer> objetoA = new Classe_Generica<Integer>(1);				
		// Classe objetoA chamando o objeto tipoClasse da Classe_Generica. 
		objetoA.tipoClasse();
		
		
		System.out.println("---------------------------------------------------");
		
		
		// Passando string:
		Classe_Generica<String> objetoB = new Classe_Generica<String>("Cl�udio");				
		// Classe objetoA chamando o objeto tipoClasse da Classe_Generica. 
		objetoB.tipoClasse();
		
		
	}
}
