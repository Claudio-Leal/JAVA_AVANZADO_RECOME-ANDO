/*
 * Cria��o de uuma outra interface, dentro do mesmo pacote exemplo.
 * O conceito de heran�a � poss�vel entre interfaces, por isso a utiliza��o de extends,
 * de maneira que todos os recursos da interface Estadio estar�o dispon�veis aqui.
 * Ap�s, estamos criando os m�todos desta interface.  
 */


package Exemplo;

// INTERFACE HERDANDO OS RECURSOS DA INTERFACE Estadio
public interface EstadioConcerto extends Estadio {
	
	// M�TODOS (SEM BLOCO)
	public void prepararCenario();
	public void prepararAudio();
	public void prepararLuzes();
	public void prepararCameras();
}
