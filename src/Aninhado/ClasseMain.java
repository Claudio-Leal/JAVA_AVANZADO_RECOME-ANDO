/*
 * O c�digo abaixo possui a inten��o de mostrar a estrutura de classes aninhadas. 
 * N�o � um c�digo que "executar�" algo, exatamente. Mas a ideia aqui � mostrar como a classe
 * aninhada funciona e como ela pode ser utilizada em outras partes da aplica��o e dentro da 
 * pr�pria classe. 
 */


package Aninhado;

//################ CLASSE PRINCIPAL - IN�CIO ################

// Declara��o padr�o de uma classe. 
// public: poder� ser chamada de qualquer parte da aplica��o.
// class: identifica que se trata de uma classe. 
// ClasseMain: nome da classe, que combina com o nome do arquivo.
public class ClasseMain {	
	
	// Objetos da classe. Tr�s tipos: int, String e Aninhada.
	// Aninhada: classe criada posteriormente. 
	int numero;
	String outrodado;
	Aninhada classeAninhada;
	
	public ClasseMain (int numero, String nome, String outrodado) {
	
	// utiliza��o do ojbeto criado acima. Est� instanciando a classe aninhada. 
	classeAninhada = new Aninhada ();
} 
	
	//---------classe Aninhada - in�cio---------
	// Classe aninhada: uma classe dentro de outra classe. Chama-se aninhada justamente por causa disso.
	// Ela n�o est� identificada com public, ent�o n�o pode ser chamada de qualquer parte da aplica��o.
	class Aninhada {
		String dado1ClasseAninhada;
		String dado2ClasseAninhada;
		// Dentro da classe aninhada, Temos este construtor que possui o mesmo nome. Retorna void.		
		public void Aninhada () {
		}
	}
	//---------classe Aninhada - fim---------
}
//################ CLASSE PRINCIPAL - FIM ################