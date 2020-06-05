/*
 * RECURSIVIDADE INDIRETA:
 * M�todoA chama M�todoB.
 * M�todoB chama M�todoA. 
 * 
 * Condicionais e ciclos ser�o utilizados para evitar o loop infinito. 
 */


package Recursividade;

public class Recursividade_Indireta {
	
	
	// Cria��o do m�todoA.
	// Declarado como est�tico. 
	// N�o retorna nenhum valor. 
	// Passa char x, nos argumentos. 
	// O que ocorre aqui �:
	// Se x > 'A', o m�todoB � chamado.
	// N�o existe "se falso". 
	// x se tornou uma cadeia de caracteres, e o sout inserido...
	// aqui, faz a impress�o de cada caracter.
	// colocando >= (diferente do professor), consegui contar de Z a A. 
	static void metodoA (char x) {
		if (x >= 'A') {
			metodoB (x);
			System.out.println(x);
		}
	}
	
	
	// Cria��o do m�todoB. 
	// chama o m�todo A, passando nos par�metros o incremento de X. 
	// Ap�s a chamada deste m�todo, retorna para o m�todo A e executa a impress�o de X,...
	// decrementado (e n�o incrementado).
	// O 
	static void metodoB (char x) {
		metodoA(--x);
		}
	
		
	
	// Chamada do m�todoA, passando a letra Z nos par�metros. 
	public static void main(String[] args) {
		metodoA ('Z');
	}

}
