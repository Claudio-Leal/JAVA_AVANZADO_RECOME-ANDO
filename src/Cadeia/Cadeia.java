/*
 * Conversão de valores para string é algo complexo em java e 
 * em outras linguagens de programação. Conheceremos recursos mais complexos, 
 * mas a regra geral é a criação de uma variável que receberá o valor a ser convertido.
 * 
 * Os passos são os seguintes:
 * 
 * Temos a declaração de qualquer tipo:
 * int numero = 10;
 * 
 * Temos que utilizar uma outra variável para armazenar a string "10". Então criamos a variável:
 * String numeroString;
 * 
 * Para efetuar a conversão, vamos utilizar a classe String, combinada 
 * com o método valueOf. Então teremos:
 * 
 * String.valueOf (variável que precisa ser convertida). 
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
