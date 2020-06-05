/*
 * Utilizando os métodos equals e equalsIgnoreCase. 
 * 
 * As comparações com equals possui como retornos:
 * true, se forem iguais.
 * false, se forem diferentes. 
 * 
 * Utilizei variáveis declaradas como boolean para facilitar o entendimento. 
 */


package Igual;

public class Igual {

	public static void main(String[] args) {
		
		String nomeA = "Cláudio";
		String nomeB = "Cláudio";
		boolean resultado = false;
		if (nomeA.equals("Cláudio")) {
			System.out.println("Igual!");			
		} else {
			System.out.println("Diferente!");
		}
		resultado = nomeA.equals("Cláudio");
		System.out.println("O método está retornando: " + resultado + "!");
		
		
		
		System.out.println("-------------------------------------------");
		
		
		
		if (nomeA.equals(nomeB)) {
			System.out.println("Igual!");
		} else {
			System.out.println("Diferente!");
		}
		resultado = nomeA.equals(nomeB);
		System.out.println("O método está retornando: " + resultado + "!");		
		
		
		
		System.out.println("-------------------------------------------");
		
		
		
		if (nomeA.equalsIgnoreCase("cláudio")) {
			System.out.println("Igual!");
		} else {
			System.out.println("Diferente!");			
		}
		resultado = nomeA.equalsIgnoreCase("cláudio");
		System.out.println("O método está retornando: " + resultado + "!");
		
		
		
		System.out.println("-------------------------------------------");
		
		
		
		if (nomeA.equalsIgnoreCase("cláudio leal")) {
			System.out.println("Igual!");
		} else {
			System.out.println("Diferente!");			
		}
		resultado = nomeA.equalsIgnoreCase("cláudio leal");
		System.out.println("O método está retornando: " + resultado + "!");
	}
}
