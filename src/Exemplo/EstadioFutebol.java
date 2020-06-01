/*
 * Criação da terceira interface. 
 * Conceito de herança também utilizado nesta interface, fazendo referência
 * à interface Estadio. 
 */

package Exemplo;

//INTERFACE HERDANDO OS RECURSOS DA INTERFACE Estadio
public interface EstadioFutebol extends Estadio{
	
	// MÉTODOS (SEM BLOCO)
	public void prepararCampo ();
	public void cuidarCampo ();
	public void regarCampo ();
}

