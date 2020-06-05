/*
 * Método de comparação compareTo:
 * 
 * 
 * Retornos:
 * the value 0 if this Byte is equal to the argument Byte; 
 * a value less than 0 if this Byte is numerically less than the argument Byte; 
 * and a value greater than 0 if this Byte is numerically greater than the argument Byte (signed comparison).
 * 
 * 
 * Os valores a serem impressos nas situações 1 e 2 depende do que está definido no código ASCII.
 */


package Comparar;

public class Comparar {
	
	public static void main (String [] args) {
		
		String stringA = "Olá";
		String stringB = "Olá1";
		
		int resultado1 = stringA.compareTo(stringB);
		// Bytes de stringA é menor do que StringB. Retornará um valor menor que zero. 
		System.out.println("Resultado menor que zero: " + resultado1);
		
		
		
		System.out.println("----------------------------------------------------");
		
		
		
		String stringC = "Olá1";
		String stringD = "Olá";
		
		int resultado2 = stringC.compareTo(stringD);
		// Bytes de stringC é maior do que StringD. Retornará um valor maior que zero. 
		System.out.println("Resultado maior que zero: " + resultado2);
		
		
		System.out.println("----------------------------------------------------");
		
		
		String stringF = "Olá";
		String stringG = "Olá";
		
		int resultado3 = stringF.compareTo(stringG);
		// Bytes de stringC é igual ao de StringD. Retornará zero. 
		System.out.println("Resultado igual a zero: " + resultado3);	
		
	}
}
