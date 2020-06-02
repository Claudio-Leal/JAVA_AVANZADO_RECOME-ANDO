/*
 * Exemplo perfeito de matriz muldimensional (no caso), bidimensional.
 * Criei vários artifícios para facilitar o entendimento, então se executarmos o debug, vamos ver exatamente o que ocorre
 * durante a iteração.
 * Este com algumas inserções utilizadas pelo professor.  
 * O propósito aqui é mostrar a interrupção (break) da etiqueta chamada "buscar". 
 * Aproveitamos para ver diversas situações, mas é importante registrar que o "else" colocado no fim do código
 * nunca será executado. Não existe nenhuma instrução que faça isso. O arquivo Exemplo mostra melhor isso. 
 */

package PAvançada;

public class Exemplo2 {

	public static void main(String[] args) {
		
		
		
		
		//--------------------------------------ARRAY INÍCIO
		// Array bidimensional com 3 filas e 4 colunas. 
		int [] [] arrayInteiros = {
			{10, 90, 92, 45},
			{16, 20, 9, 12},
			{40, 32, 11, 49},			
		};
		//--------------------------------------ARRAY FIM
		
		
		
		
		//--------------------------------------VARIÁVEIS INÍCIO
		// índices:
		int li = 0;
		int cj = 0;
		// valor a ser buscado. Apenas um exemplo: 16.
		int buscando = 16;
		// booleano para sabermos quando o valor foi encontrado. 
		boolean encontrado = false;
		// variável celula criada para armazenar o valor encontrado em (i x j).
		int celula = 0;
		//--------------------------------------VARIÁVEIS FIM
		
		
		
		
		//--------------------------------------BLOCO DE BUSCA INÍCIO
		// rótulo (etiqueta). Sempre utilizar a palavra que queremos, seguida de ":",...não podendo ser reservada.
		buscar:	
			// enquanto i < tamanho do arrayInteiros, incrementa i. 
			for (li = 0; li < arrayInteiros[li].length ; li++) {
				// enquanto j < tamanho do arrayInteiros, incrementa j.// 
				for (cj = 0 ; cj < arrayInteiros[li].length ; cj++) {
					
					// armazena a "célula" na variável celula e depois a imprime na tela. 
					celula = arrayInteiros[li][cj];
					System.out.println("O valor encontrado foi " + celula + ", nas posições " + li + "x" + cj + ".");
					
					// compara se dentro do array existe o valor 16. 
					// caso positivo, encontrado recebe true e buscar é "brecado".					
					if (arrayInteiros[li][cj] == buscando) {
						encontrado = true;						
						break buscar;					 
					};							
				}
			}
			//-----------------------------BLOCO DE BUSCA FIM
				
				if (encontrado) {
					System.out.println("Buscando " + buscando + ", " + "encontrado " + arrayInteiros[li][cj] + "! Varredura finalizada.");
				}	else {						
					System.out.println("Buscando " + buscando + ", " + "encontrado " + arrayInteiros[li][cj] + ".\n");
				}
	}		
}

