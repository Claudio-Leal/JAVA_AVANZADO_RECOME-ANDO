/*
 * Criação de uma classe abstrata para entendermos a interação da mesma com 
 * a CLASSE e INTERFACES criadas. 
 */


package Exemplo;

// Declaração da classe abstrata, com a utilização do termo "abstract".
// Recurso de herança utilizado, de forma que tudo que há em "EstádioMundial", poderá ser utilizado aqui. 


// Linha abaixo comentada propositalmente. Retiramos a implementação. Retiramos o extends...
// e criamos a extensão para esta classe abstrata lá na classe EstadioMundial. 
// public abstract class ClasseAbstrata extends EstadioMundial implements EstadioConcerto{
public abstract class ClasseAbstrata{
	
	// Método abstrato criado. 
	public abstract void metodo ();
}
