/*
 * RECURSIVIDADE DIRETA:
 * Quando um m�todo chama a si pr�prio.
 * Um loop infinito n�o ocorre, pois isso s� � poss�vel fazer estabelecendo condi��es com if, etc. 
 * Enviando agora para o branch correto. 
 */


package Recursividade;

// Classe Recursividade_Direta declarada. 
public class Recursividade_Direta {

// M�todo fatorial declarado.
// Retorna long. 
// Como par�metro, passa a vari�vel "n" que � um inteiro. 
	static long fatorial (int n) {		
		
		 if (n <= 1) {
			 return 1;
		 } else {
			 // Utiliza��o do m�todo fatorial dentro do pr�prio m�todo. 
			 // Como temos uma condi��o, ou seja, s� vai entrar aqui se n => 2, 
			 // � poss�vel a RECURSIVIDADE DIRETA. 
			 long resultado = n * fatorial (n-1);
			 return resultado;
		 }
	}		 


	public static void main (String [] args) {
	int n = 5;
	System.out.println("Este � o fatorial de " + n + ": " + fatorial(n) + ".");
	}
}

