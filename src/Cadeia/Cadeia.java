/*
 * Convers�o de valores para string � algo complexo em java e 
 * em outras linguagens de programa��o. Conheceremos recursos mais complexos, 
 * mas a regra geral � a cria��o de uma vari�vel que receber� o valor a ser convertido.
 * 
 * Os passos s�o os seguintes:
 * 
 * Temos a declara��o de qualquer tipo:
 * int numero = 10;
 * 
 * Temos que utilizar uma outra vari�vel para armazenar a string "10". Ent�o criamos a vari�vel:
 * String numeroString;
 * 
 * Para efetuar a convers�o, vamos utilizar a classe String, combinada 
 * com o m�todo valueOf. Ent�o teremos:
 * 
 * String.valueOf (vari�vel que precisa ser convertida). 
 * 
 * Por fim, temos:
 * int numero = 10;
 * String numeroString = String.valueOf (numero); 
 */


package Cadeia;

public class Cadeia {
	public static void main (String [] args) {
		int numInteiro = 10;
		String numInteiroString = String.valueOf(numInteiro);
		System.out.println("Inteiro: " + numInteiro);
		System.out.println("Inteiro (string): " + numInteiroString);
		
		System.out.println("--------------------------------------------------------");
		
		Float numFloat = 10.5f;
		String numFloatString = String.valueOf(numFloat);
		System.out.println("Float: " + numFloat);
		System.out.println("Float (string): " + numFloatString);	
		
		System.out.println("--------------------------------------------------------");
		
		Double numDouble = 10.8d;
		String numDooubleString = String.valueOf(numDouble);
		System.out.println("Double: " + numDouble);
		System.out.println("Double (string): " + numDooubleString);
		
		System.out.println("--------------------------------------------------------");
		
		long numLong = 100000000;
		String numLongString = String.valueOf(numLong);
		System.out.println("Long: " + numLong);
		System.out.println("Long (string): " + numLongString);
		
		System.out.println("--------------------------------------------------------");
		
		boolean numBoolean = true;
		String numBooleanString = String.valueOf(numBoolean);
		System.out.println("Boolean: " + numBoolean);
		System.out.println("Boolean (string): " + numBooleanString);
	}
}
