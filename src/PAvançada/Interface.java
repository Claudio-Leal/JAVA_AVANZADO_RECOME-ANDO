/*
 * Nela consta:
 * A palavra INTERFACE é que determina que este "arquivo" se trata de uma interface. 
 */

package PAvançada;

public interface Interface {
	// INTERFACE: possui método com classe não implementada. 
	public void metodo ();
}
	
	/*
	 *
	 * 
	 * Acima, temos método "sem bloco", ou seja, sem {}.
	 * public: poderá ser chamada de qualquer parte da aplicação.
	 * void: retorna vazio. 
	 * (): parâmetros,...argumentos, sem nenhum parâmetro definido. 
	 * Trata-se de um MÉTODO SEM CÓDIGO. 
	 * se observarmos a classe, nela consta um sout para imprimir a letra A. 
	 * Esta possibilidade não existe aqui, já que estamos trabalhando um MÉTODO SEM CÓDIGO.
	 * 
	 * Se tentarmos a declaração abaixo, não vai funcionar,...o sistema apresentará erro,
	 * pois aqui se trata de uma interface. 
	 * 
	 *  public void metodo () {		
	 }
	 *
	 *
	 * A regra é: se estivermos tratando de uma INTERFACE, os métodos não
	 * poderão ser implementados. 
	 *
	 */
