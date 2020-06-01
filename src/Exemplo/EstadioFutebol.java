/*
 * Cria��o da terceira interface. 
 * Conceito de heran�a tamb�m utilizado nesta interface, fazendo refer�ncia
 * � interface Estadio. 
 */

package Exemplo;

//INTERFACE HERDANDO OS RECURSOS DA INTERFACE Estadio
public interface EstadioFutebol extends Estadio{
	
	// M�TODOS (SEM BLOCO)
	public void prepararCampo ();
	public void cuidarCampo ();
	public void regarCampo ();
}

