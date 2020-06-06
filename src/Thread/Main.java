/*
 * CONCEITO DE TRHEAD (CONCORRÊNCIA):
 * EM ESPANHOL: HILOS.
 * 
 * Thread é a tarefa que um determinado programa realiza. 
 * Fio de execução, também conhecido como linha ou encadeamento de execução, 
 * é uma forma de um processo dividir a si mesmo em duas ou mais tarefas...
 * que podem ser executadas concorrencialmente.
 * 
 * Para exemplificar, vamos instanciar objetos com a utilização da classe Lavanderia.
 * 
 * Trata-se de uma lavanderia de carros.   
 */


package Thread;

public class Main {

	public static void main(String[] args) {
		// Declarações feitas com a utilização do thread Lavanderia. 
		Lavanderia l1;
		Lavanderia l2;
		Lavanderia l3;
		
		// Chamada do método construtor.
		l1 = new Lavanderia("Compacto", 10*1000);
		l2 = new Lavanderia("Caminhonete", 30*1000);
		l3 = new Lavanderia("Van", 20*1000);
		
		
		// Os objetos declarados deverão terminar com .start,...
		// isso identifica que os processos podem iniciar automaticamente...
		// e em paralelo.
		// Causes this thread to begin execution; 
		// the Java Virtual Machinecalls the run method of this thread.		
		l1.start();
		l2.start();
		l3.start();
	}
}
