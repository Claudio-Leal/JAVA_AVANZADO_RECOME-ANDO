/*
 * Classes de membros internos. 
 */


package Aninhado;

//################ CLASSE PRINCIPAL - INÍCIO ################

// Declaração padrão de uma classe. 
// public: poderá ser chamada de qualquer parte da aplicação.
// class: identifica que se trata de uma classe. 
// ClasseMain: nome da classe, que combina com o nome do arquivo.
public class ClasseMain {	
	
	// Objetos da classe. Três tipos: int, String e Aninhada.
	// Aninhada: classe criada posteriormente. 
	int numero;
	String outrodado;
	Aninhada classeAninhada;
	
	public ClasseMain (int numero, String nome, String outrodado) {
	classeAninhada = new Aninhada ();
} 
	
	//---------classe Aninhada - início---------
	// Classe aninhada: uma classe dentro de outra classe. Chama-se aninhada justamente por causa disso.
	// Ela não está identificada com public, então não pode ser chamada de qualquer parte da aplicação.
	class Aninhada {
		String dado1ClasseAninhada;
		String dado2ClasseAninhada;
		public void Aninhada () {			
		}
	}
	//---------classe Aninhada - fim---------
}
//################ CLASSE PRINCIPAL - FIM ################