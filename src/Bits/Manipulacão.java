/*
 * Classe apenas para registrar a manipulação de valores aritméticos e lógicos. 
 * Alguns destes operadores permitirão o trabalho a nível binário (0 / 1).
 */

package Bits;

public class Manipulacão {
	public static void main (String [] args) {
		
		int NUMEROA = 20;
		System.out.println("Decimal: " + NUMEROA);
		System.out.println("Binário: " + Integer.toBinaryString(NUMEROA));
		
		System.out.println("-------------------------------------");
		
		int NUMEROB = NUMEROA << 3;
		System.out.println("Decimal: " + NUMEROA);
		System.out.println("Binário (decimal + três casas): " + Integer.toBinaryString(NUMEROB));
		System.out.println("Decimal (decimal + três casas): " + NUMEROB);
		
		System.out.println("-------------------------------------");
		
		int numeroD = NUMEROA >> 3;		
		System.out.println("Decimal: " + NUMEROA);
		System.out.println("Binário (decimal - três casas): " + Integer.toBinaryString(numeroD));
		System.out.println("Decimal (decimal - três casas): " + numeroD);
		
		System.out.println("-------------------------------------");
		
		int numeroE = -1 >>> 0;
		int numeroF = -1 >>> 1;
		int numeroG = -1 >>> 2;
		System.out.println("Operador de deslocamento: " + numeroE);
		System.out.println("Operador de deslocamento: " + numeroF);
		System.out.println("Operador de deslocamento: " + numeroG);
		
		System.out.println("-------------------------------------");
		
		// Operadores bit a bit:
		// & - Bitwise AND operator: returns bit by bit AND of input values.
		// | - Bitwise OR operator: returns bit by bit OR of input values.
		// ^ - Bitwise XOR operator: returns bit by bit XOR of input values.
		// ~ - Bitwise Complement Operator: This is a unary operator which returns the one’s compliment...
		//     representation of the input value, i.e. with all bits inversed.		
		int NUMEROH = 10;
		int NUMEROI = 10;
		int AND = NUMEROH & NUMEROI;
		int OR =  NUMEROH | NUMEROI;
		int XOR = NUMEROH ^ NUMEROI;
		int NOT = ~NUMEROH;
		System.out.println("OPERADOR AND: " + AND);
		System.out.println("OPERADOR OR: " + OR);
		System.out.println("OPERADOR XOR: " + XOR);
		System.out.println("OPERADOR NOT: " + NOT);
	}
}
