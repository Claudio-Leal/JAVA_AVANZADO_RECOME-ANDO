/*
 * Classes genéricas não passam tipos, etc. São úteis quando precisamos chamar uma classe...
 * e não sabemos (previamente) que tipo de dado vamos passar. 
 * A declaração exige a inclusão de <>. É isso que vai dizer que estamos tratando de uma 
 * classe genérica.
 * 
 * A classe genérica receberá o dado, tratará e definirá o tipo, e fará o encaminhamento de acordo
 * com o tipo de dado que identificar.
 * 
 * Esta classe será chamada pela classe Main. 
 */


package Classe_Generica;

// Classe genérica de nome TUDO,...porque a intenção é passar qualquer coisa. 
public class Classe_Generica <TUDO> {

	// Indicação (declaração) de que a classe TUDO receberá um objeto.
	// O tipo de dado é "TUDO",...ou seja, qualquer coisa que for passado nos parâmetros.	
	TUDO objeto;
	
	// Declaração de um MÉTODO CONSTRUTOR.
	// Nos parâmetros, estamos passando um dado genérico,...definimos o objeto algo.
	// algo representará "qualquer coisa" que será passado na chamada do método construtor. 
	public Classe_Generica (TUDO algo) {
		// objeto (variável) "objeto" recebendo o valor de "algo". 
		objeto = algo;		
	}
		
	// Declaração de um método, para descobrirmos qual é o tipo de dado do objeto.
	// Utilização dos métodos getClass e getName para buscar o nome do tipo de dado. 
	public void tipoClasse () {
		System.out.println("O tipo de dado é: " + objeto.getClass().getName() + "!");
	}
		
}