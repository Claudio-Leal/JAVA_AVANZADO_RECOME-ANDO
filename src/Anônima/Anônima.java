/*
 * ...e é no bloco do objeto "anonima" que a definição desta ação,
 * ou seja, um simples clique de um botão, etc., será definido.
 * importante frisar que este código não foi executado. É apenas conceitual. 
 * E o corpo da classe anonima também não foi definido.  
 


package Anônima;
public class Anônima {
	int numero;
	String dadoString;
	
	public static void main (String [] args) {
		// Apenas para registrar: esta é a sintaxe normalmente utilizada para...
		// criação de objetos. 
		// Object objeto = new Object();
		
		// Utilização da interface Caminhar para criar o objeto anonima.
		Caminhar anonima = new Caminhar() {

			// Corpo do ojbeto é inserido automaticamente.
			// O interessante é que ele já busca o método "avançar", existente...
			// dentro da interface Caminhar, para que possamos implementá-lo. 
			@Override
			public void avançar() {
				// TODO Auto-generated method stub				
			}
		};		
	}
}
*/
