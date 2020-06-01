/*
 * Criação de uma classe abstrata para entendermos a interação da mesma com 
 * a CLASSE e INTERFACES criadas. 
 */


package Exemplo;

// Declaração da classe abstrata, com a utilização do termo "abstract".
// Recurso de herança utilizado, de forma que tudo que há em "EstádioMundial", poderá ser utilizado aqui. 
public abstract class ClasseAbstrata extends EstadioMundial implements EstadioConcerto{
	
	// Método abstrato criado. 
	public abstract void metodo ();
}
