/*
 * Implementa��o dos m�todos IndexOf e lastIndexOf.
 * Manipular string � sempre muito complicado. Por exemplo, em 
 * C++ � bem complexo. Em java, tudo se torna mais simples por conta dos m�todos...
 * existentes.  
 * 
 * --------------------------------------------------------
 * 
 * IndexOf: Returns the index of the first occurrence of the specified element in this list, 
 * searching forwards from index, or returns -1 if the element is not found.
 * Retorna o �ndice (posi��o) do elemento buscado. Caso n�o encontre, retorna -1. 
 * Par�metros: 
 * e - element to search for
 * index - index to start searching from 
 * 
 * --------------------------------------------------------
 * 	
 * lastIndexOf: Returns the index of the last occurrence of the specified element in this list, 
 * searching backwards from index, or returns -1 if the element is not found. 
 * More formally, returns the highest index i such that i <= index && Objects.equals(get(i), e), 
 * or -1 if there is no such index.
 * Parameters:
 * e - element to search for
 * index - index to start searching backwards from * 
 * 
 * --------------------------------------------------------	
 */


package Procurar;

public class Procurar {
	
	public static void main (String [] args) {
		
		String cadeiaA = "Ol� Jose, que tenhFa um bom dia!";
		// Inteiro porque buscamos o �ndice, e n�o o caracter ou a cadeia de caracteres. 
		int a;
		// (int) - posi��o do elemento buscado.
		// "f" - elemento buscado.
		// retornar� -1, pois o elemento 'f' n�o existe na cadeia. 
		a = cadeiaA.indexOf((int) 'f');		
		System.out.println("Buscar a posi��o de 'f': " + a);
		
		
		
		
		
		System.out.println("----------------------------------------------");
		
				
		
		
		String cadeiaB = "Ol� Jose, que tenhFa um bom dia!";		 
		int b;		 
		b = cadeiaB.indexOf((int) 'F');		
		// retornar� a posi��o de 'F', pois este sim existe na cadeia. 
		System.out.println("Buscar a posi��o de 'F': " + b);		
		
		
		
		
		
		System.out.println("----------------------------------------------");
		
		
		
		
		String cadeiaC = "Ol� Jose, que tenhFa um bom dia!";		 
		int c;		
		
		// com a inser��o do segundo par�metro, veremos que retornar� -1, 
		// porque agora vamos buscar a letra a partir da posi��o 19. 
		c = cadeiaC.indexOf((int) 'F', 19);		
		System.out.println("Buscar a posi��o de 'F' a partir da posi��o 19: " + c);
		
		
		
		
		System.out.println("----------------------------------------------");
		
		
		
		
		String cadeiaD = "Ol� Jose, que tenhFa um bom dia!";		 
		int d;
		// Neste caso, ir� encontrar, pois 'F' est� na posi��o 19, e estamos buscando a partir
		// da posi��o 17. 
		d = cadeiaD.indexOf((int) 'F', 17);		
		System.out.println("Buscar a posi��o de 'F' a partir da posi��o 17: " + d);
		
		
		
		
		System.out.println("----------------------------------------------");
		
		
		
		
		String cadeiaE = "Ol� Jose, que tenhFa um bom dia!";	 
		int e;
		int busca = 17;
		// Neste caso, ir� encontrar, pois 'F' est� na posi��o 19, e estamos buscando a partir
		// da posi��o 17. 
		// Neste exemplo, com a utiliza��o de uma vari�vel de busca. 
		e = cadeiaE.indexOf((int) 'F', busca);		
		System.out.println("Buscar a posi��o de 'F' a partir da posi��o 17: " + e);
		
		

		
		System.out.println("----------------------------------------------");
		
		
		
		String cadeiaF = "Estamos comendo uma sopa muito deliCiosa!";	 
		int f;		
		f = cadeiaF.lastIndexOf((int) 'E');
		// Importante registrar que lastIndexOf executar� de tr�s para frente, mas sempre retornar�
		// a posi��o da cadeia, contando do in�cio para o fim, a partir da posi��o 0. 
		System.out.println("Buscando a posi��o de 'E' a partir do final: " + f);
		
		
		
		System.out.println("----------------------------------------------");
		
		
		
		String cadeiaG = "Estamos comendo uma sopa muito deliCiosa!";	 
		int g;		
		g = cadeiaG.lastIndexOf("sopa");
		System.out.println("Buscando, a partir do final, a posi��o de onde inicia a palavra " + "sopa: " + g);
	}
}
