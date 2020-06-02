/*
 * A ideia aqui é só de dar "nomes aos bois". 
 * O bloco que temos abaixo se chama Escopo da classe.
 * Neste exemplo, temos:
 * Escopo da classe. 
 * Escopo de cada método 3. 
 * Escopo do bloco do for.  
 */


package Escopos;

//--------------------------------Início do escopo
public class Escopo {
	
	// Atributos (variáveis)
	int numero;
	String nome;
	boolean booleano;
	
	// Método 1
	public void metodo1 ( ) {		
	}
	
	// Método 2
	public void metodo2 ( ) {		
	}	
	
	
	// Método 3
	// estamos retornando para o método o valor de "dado". 
	int somar () {		
		// as variáveis declaradas aqui são específicas do método somar,..
		// ou seja, estão no escopo do método somar.
		// não poderão ser acessadas "de fora" do método. 
		int dado = 0;
		return dado;
		}
	
	
	// Método 4
	public void metodo4 () {
		for (int i = 0 ; i < 10 ; i++) {
			int h = 20;
			h = 90;
		}
		
		// atribuição abaixo comentada porque a variável h está dentro do escopo...
		// do for do "metodo4",...então não pode ser acessada de fora do escopo.		
		// h = 90 -- > foi posicionado dentro do escopo do for. 
	}	
}
//--------------------------------Fim do escopo
