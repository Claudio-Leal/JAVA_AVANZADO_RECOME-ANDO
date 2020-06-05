/*
 * M�todo de compara��o compareTo:
 * 
 * 
 * Retornos:
 * the value 0 if this Byte is equal to the argument Byte; 
 * a value less than 0 if this Byte is numerically less than the argument Byte; 
 * and a value greater than 0 if this Byte is numerically greater than the argument Byte (signed comparison).
 * 
 * 
 * Os valores a serem impressos nas situa��es 1 e 2 depende do que est� definido no c�digo ASCII.
 */


package Comparar;

public class Comparar {
	
	public static void main (String [] args) {
		
		String stringA = "Ol�";
		String stringB = "Ol�1";
		
		int resultado1 = stringA.compareTo(stringB);
		// Bytes de stringA � menor do que StringB. Retornar� um valor menor que zero. 
		System.out.println("Resultado menor que zero: " + resultado1);
		
		
		
		System.out.println("----------------------------------------------------");
		
		
		
		String stringC = "Ol�1";
		String stringD = "Ol�";
		
		int resultado2 = stringC.compareTo(stringD);
		// Bytes de stringC � maior do que StringD. Retornar� um valor maior que zero. 
		System.out.println("Resultado maior que zero: " + resultado2);
		
		
		System.out.println("----------------------------------------------------");
		
		
		String stringF = "Ol�";
		String stringG = "Ol�";
		
		int resultado3 = stringF.compareTo(stringG);
		// Bytes de stringC � igual ao de StringD. Retornar� zero. 
		System.out.println("Resultado igual a zero: " + resultado3);	
		
	}
}
