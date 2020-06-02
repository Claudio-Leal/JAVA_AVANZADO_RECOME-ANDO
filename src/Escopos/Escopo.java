/*
 * A ideia aqui � s� de dar "nomes aos bois". 
 * O bloco que temos abaixo se chama Escopo da classe.
 * Neste exemplo, temos:
 * Escopo da classe. 
 * Escopo de cada m�todo 3. 
 * Escopo do bloco do for.  
 */


package Escopos;

//--------------------------------In�cio do escopo
public class Escopo {
	
	// Atributos (vari�veis)
	int numero;
	String nome;
	boolean booleano;
	
	// M�todo 1
	public void metodo1 ( ) {		
	}
	
	// M�todo 2
	public void metodo2 ( ) {		
	}	
	
	
	// M�todo 3
	// estamos retornando para o m�todo o valor de "dado". 
	int somar () {		
		// as vari�veis declaradas aqui s�o espec�ficas do m�todo somar,..
		// ou seja, est�o no escopo do m�todo somar.
		// n�o poder�o ser acessadas "de fora" do m�todo. 
		int dado = 0;
		return dado;
		}
	
	
	// M�todo 4
	public void metodo4 () {
		for (int i = 0 ; i < 10 ; i++) {
			int h = 20;
			h = 90;
		}
		
		// atribui��o abaixo comentada porque a vari�vel h est� dentro do escopo...
		// do for do "metodo4",...ent�o n�o pode ser acessada de fora do escopo.		
		// h = 90 -- > foi posicionado dentro do escopo do for. 
	}	
}
//--------------------------------Fim do escopo
