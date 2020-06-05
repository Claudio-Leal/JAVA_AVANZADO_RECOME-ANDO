/*
 * Utilizando os m�todos equals e equalsIgnoreCase. 
 * 
 * As compara��es com equals possui como retornos:
 * true, se forem iguais.
 * false, se forem diferentes. 
 * 
 * Utilizei vari�veis declaradas como boolean para facilitar o entendimento. 
 */


package Igual;

public class Igual {

	public static void main(String[] args) {
		
		String nomeA = "Cl�udio";
		String nomeB = "Cl�udio";
		boolean resultado = false;
		if (nomeA.equals("Cl�udio")) {
			System.out.println("Igual!");			
		} else {
			System.out.println("Diferente!");
		}
		resultado = nomeA.equals("Cl�udio");
		System.out.println("O m�todo est� retornando: " + resultado + "!");
		
		
		
		System.out.println("-------------------------------------------");
		
		
		
		if (nomeA.equals(nomeB)) {
			System.out.println("Igual!");
		} else {
			System.out.println("Diferente!");
		}
		resultado = nomeA.equals(nomeB);
		System.out.println("O m�todo est� retornando: " + resultado + "!");		
		
		
		
		System.out.println("-------------------------------------------");
		
		
		
		if (nomeA.equalsIgnoreCase("cl�udio")) {
			System.out.println("Igual!");
		} else {
			System.out.println("Diferente!");			
		}
		resultado = nomeA.equalsIgnoreCase("cl�udio");
		System.out.println("O m�todo est� retornando: " + resultado + "!");
		
		
		
		System.out.println("-------------------------------------------");
		
		
		
		if (nomeA.equalsIgnoreCase("cl�udio leal")) {
			System.out.println("Igual!");
		} else {
			System.out.println("Diferente!");			
		}
		resultado = nomeA.equalsIgnoreCase("cl�udio leal");
		System.out.println("O m�todo est� retornando: " + resultado + "!");
	}
}
