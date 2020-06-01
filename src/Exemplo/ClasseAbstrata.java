/*
 * Cria��o de uma classe abstrata para entendermos a intera��o da mesma com 
 * a CLASSE e INTERFACES criadas. 
 */


package Exemplo;

// Declara��o da classe abstrata, com a utiliza��o do termo "abstract".
// Recurso de heran�a utilizado, de forma que tudo que h� em "Est�dioMundial", poder� ser utilizado aqui. 


// Linha abaixo comentada propositalmente. Retiramos a implementa��o. Retiramos o extends...
// e criamos a extens�o para esta classe abstrata l� na classe EstadioMundial. 
// public abstract class ClasseAbstrata extends EstadioMundial implements EstadioConcerto{
public abstract class ClasseAbstrata{
	
	// M�todo abstrato criado. 
	public abstract void metodo ();
}
