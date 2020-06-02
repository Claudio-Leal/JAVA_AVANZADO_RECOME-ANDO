/*
 * Classe Lampada foi criada para exemplificar a situação de classes aninhadas. 
 * A ideia é mostrar a LAMPADA como classe principal,...e seus componentes, como foco, etc.,
 * como classes aninhadas.
 * O booleano servirá para definirmos TRUE para aceso e FALSE para apagado.  
 */

package Aninhado;

//################ CLASSE PRINCIPAL - INÍCIO ################
public class Lampada {
	// membros (objetos).
	boolean statusLampada;	
	
	
	// construtor (não tem retorno). 
	// quando a lâmpada for criada, estará sempre acesa, ou seja, true. 
	public Lampada () {
		statusLampada = true;
	}
	
	// método (possui retorno, mas vazio). 
	public void mudarFoco () {		
	}
	
	//---------classe Aninhada - início---------
	public class Foco {
		
		// criação de um construtor dentro da classe aninhada.
		// nos argumentos, passaremos o parâmetro dados, do tipo inteiro. 
		public Foco (int dados) {			
		}
	}
	//---------classe Aninhada - fim---------
}
//################ CLASSE PRINCIPAL - FIM ################