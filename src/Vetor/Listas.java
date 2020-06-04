/*
 * Tratando de listas. 
 * Tamb�m permite agrupar elementos. � parecido com o vetor, mas com
 * caracter�sticas pr�prias. 
 * Podemos dizer que se trata de um vetor melhorado. 
 * O ArrayList � din�mico, isto quer dizer que n�o possui um limite, ou seja,
 * podemos incluir quantos itens quisermos, modificarmos, etc. 
 * Din�mico: se eu agregar um valor, o array vai mudar, etc. 
 * 
 * Neste exemplo, n�o h� muita diferen�a entre o que fizemos para o vetor. 
 * Mas li que num ArrayList, � poss�vel criar elementos de diversos tipos,...e ilimitados,
 * se assim desejarmos.
 * 
 * Pelo que entendi, tamb�m, parece que o vetor possui um limite,...mas vamos ver isso mais adiante.  
 */


package Vetor;

import java.util.ArrayList;
// import java.util.Collection;

public class Listas {
	public static void main (String [] args) {		
		
		// Cria��o da lista "array" do tipo string.
		// Neste exemplo, resolvemos criar um array do tipo String,...mas como podemos ver abaixo, 
		// � poss�vel criar Collection. 
		ArrayList<String> array = new ArrayList<String>();
		
		//---------------------------------------
		// Abaixo, mais tr�s tipos de array que podemos fazer. 
		// Vou coment�-los, pois foram apenas mostrados pelo professor. 
		// Est�o com erros que vou aprender a resolver com o tempo.
		// As possibilidades aqui s�o:
		// Um Array vazio.
		// Um array para n�meros inteiros. 
		// Um array para a utiliza��o da interface Collection (me parece que esta � uma das...
		// grandes diferen�as para o vetor. 
		
					// ArrayList();
					// ArrayList(int capacidade);
					// ArrayList(Collection c);
		//---------------------------------------		
				
		// Adi��o de itens na lista. 
		array.add ("A");
		array.add ("B");
		array.add ("C");
		array.add ("D");
		array.add ("E");
		array.add ("F");
		array.add ("G");
		
		//  Manipula��o dos itens da lista. 
		array.remove("A");
		array.set(0, "2");
		System.out.println(array.indexOf("2"));
	}
}
