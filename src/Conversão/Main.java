/*
 * Classe criada especificamente para que possamos entender o assunto
 * Convers�o Impl�cita e Convers�o Expl�cita. 
 */

package Convers�o;

public class Main {
	public static void main (String [] args) {

		// vari�veis int e float de f�cil entendimento.
		// numerof, que � float, recebe a soma dele mesmo + int.
		// Aqui estamos fazendo uma CONVERS�O IMPL�CITA. 
		// Exemplo:
		// REAL que recebe INTEIRO. A convers�o � poss�vel e se chama IMPL�CITA. 
		int numero = 10;
		float numerof = 10.1f;
		numerof = numerof + numero;
		System.out.println(numerof);
		
		
		// vari�vel float criada, de f�cil entendimento.
		// vari�vel int criada. Recebe a parte inteira da vari�vel float. (int) determina isso.
		// Aqui temos uma convers�o EXPL�CITA, pois temos:
		// INTEIRO que recebe PARTE REAL de um n�mero. Fizemos isso expl�citamente, por isso o nome. 
		float numeroF = 100.1000009f;
		int numeroA = (int) numeroF;
		System.out.println(numeroA);
		
		// isso n�o poderia ser feito,...ou seja, uma vari�vel do tipo inteiro...
		// recebendo um valor de ponto flutuante. 
		// numero = numerof + numero;		

	}
}
