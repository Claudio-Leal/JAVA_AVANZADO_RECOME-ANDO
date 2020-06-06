/*
 * Classes gen�ricas n�o passam tipos, etc. S�o �teis quando precisamos chamar uma classe...
 * e n�o sabemos (previamente) que tipo de dado vamos passar. 
 * A declara��o exige a inclus�o de <>. � isso que vai dizer que estamos tratando de uma 
 * classe gen�rica.
 * 
 * A classe gen�rica receber� o dado, tratar� e definir� o tipo, e far� o encaminhamento de acordo
 * com o tipo de dado que identificar.
 * 
 * Esta classe ser� chamada pela classe Main. 
 */


package Classe_Generica;

// Classe gen�rica de nome TUDO,...porque a inten��o � passar qualquer coisa. 
public class Classe_Generica <TUDO> {

	// Indica��o (declara��o) de que a classe TUDO receber� um objeto.
	// O tipo de dado � "TUDO",...ou seja, qualquer coisa que for passado nos par�metros.	
	TUDO objeto;
	
	// Declara��o de um M�TODO CONSTRUTOR.
	// Nos par�metros, estamos passando um dado gen�rico,...definimos o objeto algo.
	// algo representar� "qualquer coisa" que ser� passado na chamada do m�todo construtor. 
	public Classe_Generica (TUDO algo) {
		// objeto (vari�vel) "objeto" recebendo o valor de "algo". 
		objeto = algo;		
	}
		
	// Declara��o de um m�todo, para descobrirmos qual � o tipo de dado do objeto.
	// Utiliza��o dos m�todos getClass e getName para buscar o nome do tipo de dado. 
	public void tipoClasse () {
		System.out.println("O tipo de dado �: " + objeto.getClass().getName() + "!");
	}
		
}