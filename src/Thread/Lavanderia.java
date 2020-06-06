/*
 * Para que esta classe se torne um thread, � necess�rio utilizar um extends trheads.
 * Uma boa pr�tica: atributos da classe thread precisam ser privados.  
 */


package Thread;

// Declara��o da classe thread. 
public class Lavanderia extends Thread{
	
	// Declara��o dos atributos.
	// Como dito, � importante que estejam declarados como privados. 
	// Geralmente temos mais de um atributo, pois esta � a ideia do thread...
	// v�rios processos sendo executados de uma �nica vez. 
	private String nome;
	private int tempo;
	
	
	// Declara��o do m�todo construtor com dois par�metros:
	// String e Inteiro.	
	public Lavanderia (String n, int t) {
		nome = n;
		tempo = t;
	}
	
	
	// Sempre teremos o metodo "correr" abaixo, pois sem ele o thread n�o se justifica.
	// Os objetos declarados dentro deste m�todo dever�o terminar com .start,...
	// Isso identifica que os processos podem iniciar automaticamente. 
	// Quando se trabalha com "run", � comum a utiliza��o de try / catch.
	// Se vamos manejar threads dentro deles, � sempre bom utilizar try/catch para tratar...
	// as exce��es. 
	public void run () {
		try {
			// Faz com que o encadeamento atualmente em execu��o seja suspenso... 
			// (interrompa temporariamente a execu��o) pelo n�mero especificado de milissegundos, 
			// sujeito � precis�o e exatid�o dos cron�metros e planejadores do sistema. O encadeamento n�o perde... 
			// a propriedade de nenhum monitor.
			// No caso abaixo, estamos especificando tempo. 
			// N�o sabemos exatamente o que ser� armazenado nesta vari�vel,..vai depender da execu��o. 
			sleep(tempo);
			
		} catch (InterruptedException e) {
			// A exce��o que precisa ser passada � de interrup��o, por isso mudamos. 
			// N�o � necess�rio "catchar" nada, pois j� sabemos que n�o existir�o erros. 
		}
		// Com a mensagem abaixo, encerramos a declara��o de um trhead. 
		System.out.println("Terminamos!");
	}	
}
