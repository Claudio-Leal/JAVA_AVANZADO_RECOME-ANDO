/*
 * Classe Lampada foi criada para exemplificar a situa��o de classes aninhadas. 
 * A ideia � mostrar a LAMPADA como classe principal,...e seus componentes, como foco, etc.,
 * como classes aninhadas.
 * O booleano servir� para definirmos TRUE para aceso e FALSE para apagado.  
 */

package Aninhado;

//################ CLASSE PRINCIPAL - IN�CIO ################
public class Lampada {
	// membros (objetos).
	boolean statusLampada;	
	
	
	// construtor (n�o tem retorno). 
	// quando a l�mpada for criada, estar� sempre acesa, ou seja, true. 
	public Lampada () {
		statusLampada = true;
	}
	
	// m�todo (possui retorno, mas vazio). 
	public void mudarFoco () {		
	}
	
	//---------classe Aninhada - in�cio---------
	public class Foco {
		
		// cria��o de um construtor dentro da classe aninhada.
		// nos argumentos, passaremos o par�metro dados, do tipo inteiro. 
		public Foco (int dados) {			
		}
	}
	//---------classe Aninhada - fim---------
}
//################ CLASSE PRINCIPAL - FIM ################