/*
 * Para que esta classe se torne um thread, é necessário utilizar um extends trheads.
 * Uma boa prática: atributos da classe thread precisam ser privados.  
 */


package Thread;

// Declaração da classe thread. 
public class Lavanderia extends Thread{
	
	// Declaração dos atributos.
	// Como dito, é importante que estejam declarados como privados. 
	// Geralmente temos mais de um atributo, pois esta é a ideia do thread...
	// vários processos sendo executados de uma única vez. 
	private String nome;
	private int tempo;
	
	
	// Declaração do método construtor com dois parâmetros:
	// String e Inteiro.	
	public Lavanderia (String n, int t) {
		nome = n;
		tempo = t;
	}
	
	
	// Sempre teremos o metodo "correr" abaixo, pois sem ele o thread não se justifica.
	// Os objetos declarados dentro deste método deverão terminar com .start,...
	// Isso identifica que os processos podem iniciar automaticamente. 
	// Quando se trabalha com "run", é comum a utilização de try / catch.
	// Se vamos manejar threads dentro deles, é sempre bom utilizar try/catch para tratar...
	// as exceções. 
	public void run () {
		try {
			// Faz com que o encadeamento atualmente em execução seja suspenso... 
			// (interrompa temporariamente a execução) pelo número especificado de milissegundos, 
			// sujeito à precisão e exatidão dos cronômetros e planejadores do sistema. O encadeamento não perde... 
			// a propriedade de nenhum monitor.
			// No caso abaixo, estamos especificando tempo. 
			// Não sabemos exatamente o que será armazenado nesta variável,..vai depender da execução. 
			sleep(tempo);
			
		} catch (InterruptedException e) {
			// A exceção que precisa ser passada é de interrupção, por isso mudamos. 
			// Não é necessário "catchar" nada, pois já sabemos que não existirão erros. 
		}
		// Com a mensagem abaixo, encerramos a declaração de um trhead. 
		System.out.println("Terminamos!");
	}	
}
