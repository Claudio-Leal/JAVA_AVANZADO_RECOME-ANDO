/*
 * Inicialmente, vamos colocar todos os elementos comuns de uma classe.
 * Primeira regra: a palavra ABSTRACT ter� que aparecer na declara��o da classe. 
 * Se a palavra ABSTRACT n�o existir, estaremos tratando de uma classe comum.
 * No fim do c�digo, vamos criar um novo M�TODO ABSTRATO chamado CORRER, que tamb�m n�o ter� bloco de c�digo.
 * Se a palavra abstract n�o existir, o sistema aponta um erro. 
 * Classe abstrata precisa ter pelo menos um m�todo sem implementa��o. Se tivermos mais de um m�todo,
 * pelo menos um deles n�o poder� ter implementa��o. 
 * Em outras palavras, ao menos um m�todo precisa estar "vazio", sen�o n�o se trata de uma classe abstrata.   
 */
package PAvan�ada;

// CLASSE ABSTRATA
public abstract class ClasseAbstrata {
	// ATRIBUTO
	int numeros;	
	// CONSTRUTOR
	public ClasseAbstrata () {	
	}
	// M�TODO ABSTRATO (SEM BLOCO)
	public abstract void correr ();
}