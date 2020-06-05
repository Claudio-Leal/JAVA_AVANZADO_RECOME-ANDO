/*
 * RECURSIVIDADE DIRETA:
 * Quando um método chama a si próprio.
 * Um loop infinito não ocorre, pois isso só é possível fazer estabelecendo condições com if, etc. 
 * Enviando agora para o branch correto. 
 */


package Recursividade;

// Classe Recursividade_Direta declarada. 
public class Recursividade_Direta {

// Método fatorial declarado.
// Retorna long. 
// Como parâmetro, passa a variável "n" que é um inteiro. 
	static long fatorial (int n) {		
		
		 if (n <= 1) {
			 return 1;
		 } else {
			 // Utilização do método fatorial dentro do próprio método. 
			 // Como temos uma condição, ou seja, só vai entrar aqui se n => 2, 
			 // é possível a RECURSIVIDADE DIRETA. 
			 long resultado = n * fatorial (n-1);
			 return resultado;
		 }
	}		 


	public static void main (String [] args) {
	int n = 5;
	System.out.println("Este é o fatorial de " + n + ": " + fatorial(n) + ".");
	}
}

