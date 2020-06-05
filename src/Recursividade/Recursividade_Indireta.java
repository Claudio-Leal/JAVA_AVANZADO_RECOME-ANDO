/*
 * RECURSIVIDADE INDIRETA:
 * MétodoA chama MétodoB.
 * MétodoB chama MétodoA. 
 * 
 * Condicionais e ciclos serão utilizados para evitar o loop infinito. 
 */


package Recursividade;

public class Recursividade_Indireta {
	
	
	// Criação do métodoA.
	// Declarado como estático. 
	// Não retorna nenhum valor. 
	// Passa char x, nos argumentos. 
	// O que ocorre aqui é:
	// Se x > 'A', o métodoB é chamado.
	// Não existe "se falso". 
	// x se tornou uma cadeia de caracteres, e o sout inserido...
	// aqui, faz a impressão de cada caracter.
	// colocando >= (diferente do professor), consegui contar de Z a A. 
	static void metodoA (char x) {
		if (x >= 'A') {
			metodoB (x);
			System.out.println(x);
		}
	}
	
	
	// Criação do métodoB. 
	// chama o método A, passando nos parâmetros o incremento de X. 
	// Após a chamada deste método, retorna para o método A e executa a impressão de X,...
	// decrementado (e não incrementado).
	// O 
	static void metodoB (char x) {
		metodoA(--x);
		}
	
		
	
	// Chamada do métodoA, passando a letra Z nos parâmetros. 
	public static void main(String[] args) {
		metodoA ('Z');
	}

}
