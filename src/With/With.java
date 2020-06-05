/*
 * Instru��es startWith e endWith:
 * 
 * Serve para determinar se uma string come�a ou termina com uma sequ�ncia de caracteres.
 * N�o sei se � atrav�s de m�todos como estes, mas me parece que "buscas" nos sistemas
 * poderiam ser feitas desta forma. 
 * 
 * Estes dois m�todos tamb�m retornos booleanos. 
 *  
 */

package With;

public class With {

	public static void main(String[] args) {
		
		String nomeA = "Cl�udio Concei��o Leal";		
		boolean resultadoStart = false;
		boolean resultadoEnd = false;
		
		resultadoStart = nomeA.startsWith("C");
		System.out.println("Resultado Start: " + resultadoStart);
	    resultadoEnd = nomeA.endsWith("l");	
	    System.out.println("Resultado End: " + resultadoEnd);
	    
	    System.out.println("-------------------------------------");
	    
	    resultadoStart = nomeA.startsWith("A");
		System.out.println("Resultado Start: " + resultadoStart);
	    resultadoEnd = nomeA.endsWith("B");	
	    System.out.println("Resultado End: " + resultadoEnd);
	    
	    System.out.println("-------------------------------------");
	    
	    String buscaString = "J";
	    resultadoStart = nomeA.startsWith(buscaString);
		System.out.println("Resultado Start: " + resultadoStart);
	    resultadoEnd = nomeA.endsWith(buscaString);	
	    System.out.println("Resultado End: " + resultadoEnd);
	    
	}
}
