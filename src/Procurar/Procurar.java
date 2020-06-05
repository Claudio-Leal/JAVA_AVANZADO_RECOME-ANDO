/*
 * Implementação dos métodos IndexOf e lastIndexOf.
 * Manipular string é sempre muito complicado. Por exemplo, em 
 * C++ é bem complexo. Em java, tudo se torna mais simples por conta dos métodos...
 * existentes.  
 * 
 * --------------------------------------------------------
 * 
 * IndexOf: Returns the index of the first occurrence of the specified element in this list, 
 * searching forwards from index, or returns -1 if the element is not found.
 * Retorna o índice (posição) do elemento buscado. Caso não encontre, retorna -1. 
 * Parâmetros: 
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
		
		String cadeiaA = "Olá Jose, que tenhFa um bom dia!";
		// Inteiro porque buscamos o índice, e não o caracter ou a cadeia de caracteres. 
		int a;
		// (int) - posição do elemento buscado.
		// "f" - elemento buscado.
		// retornará -1, pois o elemento 'f' não existe na cadeia. 
		a = cadeiaA.indexOf((int) 'f');		
		System.out.println("Buscar a posição de 'f': " + a);
		
		
		
		
		
		System.out.println("----------------------------------------------");
		
				
		
		
		String cadeiaB = "Olá Jose, que tenhFa um bom dia!";		 
		int b;		 
		b = cadeiaB.indexOf((int) 'F');		
		// retornará a posição de 'F', pois este sim existe na cadeia. 
		System.out.println("Buscar a posição de 'F': " + b);		
		
		
		
		
		
		System.out.println("----------------------------------------------");
		
		
		
		
		String cadeiaC = "Olá Jose, que tenhFa um bom dia!";		 
		int c;		
		
		// com a inserção do segundo parâmetro, veremos que retornará -1, 
		// porque agora vamos buscar a letra a partir da posição 19. 
		c = cadeiaC.indexOf((int) 'F', 19);		
		System.out.println("Buscar a posição de 'F' a partir da posição 19: " + c);
		
		
		
		
		System.out.println("----------------------------------------------");
		
		
		
		
		String cadeiaD = "Olá Jose, que tenhFa um bom dia!";		 
		int d;
		// Neste caso, irá encontrar, pois 'F' está na posição 19, e estamos buscando a partir
		// da posição 17. 
		d = cadeiaD.indexOf((int) 'F', 17);		
		System.out.println("Buscar a posição de 'F' a partir da posição 17: " + d);
		
		
		
		
		System.out.println("----------------------------------------------");
		
		
		
		
		String cadeiaE = "Olá Jose, que tenhFa um bom dia!";	 
		int e;
		int busca = 17;
		// Neste caso, irá encontrar, pois 'F' está na posição 19, e estamos buscando a partir
		// da posição 17. 
		// Neste exemplo, com a utilização de uma variável de busca. 
		e = cadeiaE.indexOf((int) 'F', busca);		
		System.out.println("Buscar a posição de 'F' a partir da posição 17: " + e);
		
		

		
		System.out.println("----------------------------------------------");
		
		
		
		String cadeiaF = "Estamos comendo uma sopa muito deliCiosa!";	 
		int f;		
		f = cadeiaF.lastIndexOf((int) 'E');
		// Importante registrar que lastIndexOf executará de trás para frente, mas sempre retornará
		// a posição da cadeia, contando do início para o fim, a partir da posição 0. 
		System.out.println("Buscando a posição de 'E' a partir do final: " + f);
		
		
		
		System.out.println("----------------------------------------------");
		
		
		
		String cadeiaG = "Estamos comendo uma sopa muito deliCiosa!";	 
		int g;		
		g = cadeiaG.lastIndexOf("sopa");
		System.out.println("Buscando, a partir do final, a posição de onde inicia a palavra " + "sopa: " + g);
	}
}
