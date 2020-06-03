/*
 * Instruções instanceof permite permite descobrirmos de qual instância é um objeto.
 * Internamente, "funções" existem para identificar se um número possui o formato esperado,
 * ou seja, se estamos tratando de um inteiro, flutuante, etc. 
 * Vamos utilizar estes com instanceof para mostrar que podemos descobrir qual o formato
 * destes números usando este recurso. Ou seja, o que vamos fazer é descobrir "de qual instância"
 * pertencem estes números.   
 */

package Instruções;

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
