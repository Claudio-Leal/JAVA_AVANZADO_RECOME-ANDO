/*
 * Nela consta:
 * A palavra INTERFACE � que determina que este "arquivo" se trata de uma interface. 
 */

package PAvan�ada;

public interface Interface {
	// INTERFACE: possui m�todo com classe n�o implementada. 
	public void metodo ();
}
	
	/*
	 *
	 * 
	 * Acima, temos m�todo "sem bloco", ou seja, sem {}.
	 * public: poder� ser chamada de qualquer parte da aplica��o.
	 * void: retorna vazio. 
	 * (): par�metros,...argumentos, sem nenhum par�metro definido. 
	 * Trata-se de um M�TODO SEM C�DIGO. 
	 * se observarmos a classe, nela consta um sout para imprimir a letra A. 
	 * Esta possibilidade n�o existe aqui, j� que estamos trabalhando um M�TODO SEM C�DIGO.
	 * 
	 * Se tentarmos a declara��o abaixo, n�o vai funcionar,...o sistema apresentar� erro,
	 * pois aqui se trata de uma interface. 
	 * 
	 *  public void metodo () {		
	 }
	 *
	 *
	 * A regra �: se estivermos tratando de uma INTERFACE, os m�todos n�o
	 * poder�o ser implementados. 
	 *
	 */
