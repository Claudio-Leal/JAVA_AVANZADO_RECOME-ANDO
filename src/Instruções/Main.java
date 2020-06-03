/*
 * Instru��es instanceof permite permite descobrirmos de qual inst�ncia � um objeto.
 * Internamente, "fun��es" existem para identificar se um n�mero possui o formato esperado,
 * ou seja, se estamos tratando de um inteiro, flutuante, etc. 
 * Vamos utilizar estes com instanceof para mostrar que podemos descobrir qual o formato
 * destes n�meros usando este recurso. Ou seja, o que vamos fazer � descobrir "de qual inst�ncia"
 * pertencem estes n�meros.   
 */

package Instru��es;

public class Main {
	
	public static void main (String [] args) {
		Number numero = 20;
		
		if (numero instanceof Integer) {
			System.out.println("Inteiro!");		
		} else if (numero instanceof Double) {
			System.out.println("Double!");
		} else {
			System.out.println("Flutuante!");
		}		
	}

}
