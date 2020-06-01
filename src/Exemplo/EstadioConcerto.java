/*
 * Criação de uuma outra interface, dentro do mesmo pacote exemplo.
 * O conceito de herança é possível entre interfaces, por isso a utilização de extends,
 * de maneira que todos os recursos da interface Estadio estarão disponíveis aqui.
 * Após, estamos criando os métodos desta interface.  
 */


package Exemplo;

// INTERFACE HERDANDO OS RECURSOS DA INTERFACE Estadio
public interface EstadioConcerto extends Estadio {
	
	// MÉTODOS (SEM BLOCO)
	public void prepararCenario();
	public void prepararAudio();
	public void prepararLuzes();
	public void prepararCameras();
}
