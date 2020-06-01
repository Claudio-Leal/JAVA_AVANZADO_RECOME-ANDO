/* 
 * A palavra INTERFACE é que determina que este "objeto" se trata de uma interface. 
 */
package PAvançada;

// INTERFACE
public interface Interface {	 
	//  MÉTODO (SEM BLOCO)
	public void metodo ();
}
	
	/*	 
	 * Acima, temos método "sem bloco, ou seja sem código", ou seja, sem {}.
	 * Para que seja uma interface, o método não pode ter código. Se observarmos a classe, 
	 * o método possui um SOUT imprime a letra A. Se fizermos o mesmo aqui, erros serão mostrados.	 
	 * Em outras palavras, a regra é: se estivermos tratando de uma INTERFACE, os métodos não poderão ser implementados.	 
	 */
