/*
 * ...e � no bloco do objeto "anonima" que a defini��o desta a��o,
 * ou seja, um simples clique de um bot�o, etc., ser� definido.
 * importante frisar que este c�digo n�o foi executado. � apenas conceitual. 
 * E o corpo da classe anonima tamb�m n�o foi definido.  
 


package An�nima;
public class An�nima {
	int numero;
	String dadoString;
	
	public static void main (String [] args) {
		// Apenas para registrar: esta � a sintaxe normalmente utilizada para...
		// cria��o de objetos. 
		// Object objeto = new Object();
		
		// Utiliza��o da interface Caminhar para criar o objeto anonima.
		Caminhar anonima = new Caminhar() {

			// Corpo do ojbeto � inserido automaticamente.
			// O interessante � que ele j� busca o m�todo "avan�ar", existente...
			// dentro da interface Caminhar, para que possamos implement�-lo. 
			@Override
			public void avan�ar() {
				// TODO Auto-generated method stub				
			}
		};		
	}
}
*/
