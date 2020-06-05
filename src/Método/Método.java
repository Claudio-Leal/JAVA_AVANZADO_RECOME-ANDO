/*
 * Outros métodos importantes em Java:
 * charAT.
 * getChars.
 * substring. 
 */

package Método;

public class Método {
	
	public static void main (String [] args) {
		
		String cadeia = "Esta é a cadeia que será avaliada!";
		
		
		
		//Buscando a posição de um caracter na string:
		System.out.println("Caracter da posição zero: " + cadeia.charAt(0));
		
		
		
		// Pegando uma cadeia "parte de caracteres" de uma outra cadeia. 
		// Parâmetro getchar:
		// 1º parâmetro: posição do primeiro caracter que iremos pegar da string.
		// 2º parâmetro: número de caracteres que vamos copiar da string. 
		// 3º parâmetro: destino do array. 
		// 4º parâmetro: início do deslocamento (posição) no array de destino.		
		char [] destino = new char [20];
		cadeia.getChars (0, 5, destino, 0);
		System.out.println(destino);
		
		
		// Pegando uma parte da cadeia passando apenas dois parâmetros,...
		// utilização de substring. Cria uma substring, de uma string. 
		System.out.println(cadeia.substring(9,15));
		
		// Pegando uma parte da cadeia passando apenas um parâmetro,...
		// utilização de substring. toda a cadeia a partir da posição indicada será buscada.  
				System.out.println(cadeia.substring(9));
	}
}
