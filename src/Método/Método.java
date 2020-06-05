/*
 * Outros m�todos importantes em Java:
 * charAT.
 * getChars.
 * substring. 
 */

package M�todo;

public class M�todo {
	
	public static void main (String [] args) {
		
		String cadeia = "Esta � a cadeia que ser� avaliada!";
		
		
		
		//Buscando a posi��o de um caracter na string:
		System.out.println("Caracter da posi��o zero: " + cadeia.charAt(0));
		
		
		
		// Pegando uma cadeia "parte de caracteres" de uma outra cadeia. 
		// Par�metro getchar:
		// 1� par�metro: posi��o do primeiro caracter que iremos pegar da string.
		// 2� par�metro: n�mero de caracteres que vamos copiar da string. 
		// 3� par�metro: destino do array. 
		// 4� par�metro: in�cio do deslocamento (posi��o) no array de destino.		
		char [] destino = new char [20];
		cadeia.getChars (0, 5, destino, 0);
		System.out.println(destino);
		
		
		// Pegando uma parte da cadeia passando apenas dois par�metros,...
		// utiliza��o de substring. Cria uma substring, de uma string. 
		System.out.println(cadeia.substring(9,15));
		
		// Pegando uma parte da cadeia passando apenas um par�metro,...
		// utiliza��o de substring. toda a cadeia a partir da posi��o indicada ser� buscada.  
				System.out.println(cadeia.substring(9));
	}
}
