/*
 * Exemplo perfeito de matriz muldimensional (no caso), bidimensional.
 * Criei v�rios artif�cios para facilitar o entendimento, ent�o se executarmos o debug, vamos ver exatamente o que ocorre
 * durante a itera��o. 
 */

package PAvan�ada;

public class Exemplo {

	public static void main(String[] args) {
		
		
		
		
		//--------------------------------------ARRAY IN�CIO
		// Array bidimensional com 3 filas e 4 colunas. 
		int [] [] arrayInteiros = {
			{10, 90, 92, 45},
			{16, 20, 9, 12},
			{40, 32, 11, 49},			
		};
		//--------------------------------------ARRAY FIM
		
		
		
		
		//--------------------------------------VARI�VEIS IN�CIO
		// �ndices:
		int li = 0;
		int cj = 0;
		// valor a ser buscado. Apenas um exemplo: 16.
		int buscando = 16;
		// booleano para sabermos quando o valor foi encontrado. 
		boolean encontrado = false;
		// vari�vel celula criada para armazenar o valor encontrado em (i x j).
		int celula = 0;
		//--------------------------------------VARI�VEIS FIM
		
		
		
		
		//--------------------------------------BLOCO DE BUSCA IN�CIO
		// r�tulo (etiqueta). Sempre utilizar a palavra que queremos, seguida de ":",...n�o podendo ser reservada.
		buscar:	
			// enquanto i < tamanho do arrayInteiros, incrementa i. 
			for (li = 0; li < arrayInteiros[li].length ; li++) {
				// enquanto j < tamanho do arrayInteiros, incrementa j.// 
				for (cj = 0 ; cj < arrayInteiros[li].length ; cj++) {
					
					// armazena a "c�lula" na vari�vel celula e depois a imprime na tela. 
					celula = arrayInteiros[li][cj];
					System.out.println("Valor encontrado: " + celula + ".");
					
					// compara se dentro do array existe o valor 16. 
					// caso positivo, encontrado recebe true e buscar � "brecado".					
					if (arrayInteiros[li][cj] == buscando) {
						encontrado = true;
						System.out.println("buscando " + buscando + ", " + "encontrado " + arrayInteiros[li][cj] + "! Varredura finalizada.");
						break buscar;
					// enquanto n�o encontra, o valor atribu�do � buscando (16) continua sendo impresso. 
					} else {						
						System.out.println("buscando " + buscando + ", " + "encontrado " + arrayInteiros[li][cj] + ".");
					}
				}
			}
		//--------------------------------------BLOCO DE BUSCA FIM
	}
}
