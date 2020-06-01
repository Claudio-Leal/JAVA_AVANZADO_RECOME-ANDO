/*
 * Inicialmente, vamos colocar todos os elementos comuns de uma classe.
 * Primeira regra: a palavra ABSTRACT terá que aparecer na declaração da classe. 
 * Se a palavra ABSTRACT não existir, estaremos tratando de uma classe comum.
 * No fim do código, vamos criar um novo MÉTODO ABSTRATO chamado CORRER, que também não terá bloco de código.
 * Se a palavra abstract não existir, o sistema aponta um erro. 
 * Classe abstrata precisa ter pelo menos um método sem implementação. Se tivermos mais de um método,
 * pelo menos um deles não poderá ter implementação. 
 * Em outras palavras, ao menos um método precisa estar "vazio", senão não se trata de uma classe abstrata.   
 */
package PAvançada;

// CLASSE ABSTRATA
public abstract class ClasseAbstrata {
	// ATRIBUTO
	int numeros;	
	// CONSTRUTOR
	public ClasseAbstrata () {	
	}
	// MÉTODO ABSTRATO (SEM BLOCO)
	public abstract void correr ();
}