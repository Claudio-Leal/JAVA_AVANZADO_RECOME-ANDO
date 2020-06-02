/*
 * Classe criada especificamente para que possamos entender o assunto
 * Conversão Implícita e Conversão Explícita. 
 */

package Conversão;

public class Main {
	public static void main (String [] args) {

		// variáveis int e float de fácil entendimento.
		// numerof, que é float, recebe a soma dele mesmo + int.
		// Aqui estamos fazendo uma CONVERSÃO IMPLÍCITA. 
		// Exemplo:
		// REAL que recebe INTEIRO. A conversão é possível e se chama IMPLÍCITA. 
		int numero = 10;
		float numerof = 10.1f;
		numerof = numerof + numero;
		System.out.println(numerof);
		
		
		// variável float criada, de fácil entendimento.
		// variável int criada. Recebe a parte inteira da variável float. (int) determina isso.
		// Aqui temos uma conversão EXPLÍCITA, pois temos:
		// INTEIRO que recebe PARTE REAL de um número. Fizemos isso explícitamente, por isso o nome. 
		float numeroF = 100.1000009f;
		int numeroA = (int) numeroF;
		System.out.println(numeroA);
		
		// isso não poderia ser feito,...ou seja, uma variável do tipo inteiro...
		// recebendo um valor de ponto flutuante. 
		// numero = numerof + numero;		

	}
}
