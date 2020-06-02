/*
 * Classe main criada. Chamará os recursos da classe Lampada. 
 * Esta classe também foi criada para exemplificar a relação da classe principal com a classe Lampada
 * e sua classe aninhada chamada Foco.   
 */

package Aninhado;

public class Main {	
	public static void main (String [] args) {
		// Classe "Lampada" que se tornou um tipo de dado.
		// Objeto ou variável "lampada" criada por este tipo de dado.
		// Objeto "lampada" recebe uma instância da classe Lampada. 
		Lampada lampada = new Lampada();
		
		// chamada do objeto "lampada".		
		// lampada.statusLampada;
		
		// chamada da classe Lampada, que me permite inserir a classe aninhada.
		// criação de um objeto chamado "foco", utilizando classe e classe aninhada.
		// Importante: o objeto "lampada" foi criado aqui, na classe Main. 
		// O que ocorre é que este objeto utiliza o método .new para instanciar a...
		// classe aninhada Foco, passando para ela o valor 10, aguardado pela variável int dados.
		Lampada.Foco foco = lampada.new Foco(10);
	}
}
