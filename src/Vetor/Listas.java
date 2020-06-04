/*
 * Tratando de listas. 
 * Também permite agrupar elementos. É parecido com o vetor, mas com
 * características próprias. 
 * Podemos dizer que se trata de um vetor melhorado. 
 * O ArrayList é dinâmico, isto quer dizer que não possui um limite, ou seja,
 * podemos incluir quantos itens quisermos, modificarmos, etc. 
 * Dinâmico: se eu agregar um valor, o array vai mudar, etc. 
 * 
 * Neste exemplo, não há muita diferença entre o que fizemos para o vetor. 
 * Mas li que num ArrayList, é possível criar elementos de diversos tipos,...e ilimitados,
 * se assim desejarmos.
 * 
 * Pelo que entendi, também, parece que o vetor possui um limite,...mas vamos ver isso mais adiante.  
 */


package Vetor;

import java.util.ArrayList;
// import java.util.Collection;

public class Listas {
	public static void main (String [] args) {		
		
		// Criação da lista "array" do tipo string.
		// Neste exemplo, resolvemos criar um array do tipo String,...mas como podemos ver abaixo, 
		// é possível criar Collection. 
		ArrayList<String> array = new ArrayList<String>();
		
		//---------------------------------------
		// Abaixo, mais três tipos de array que podemos fazer. 
		// Vou comentá-los, pois foram apenas mostrados pelo professor. 
		// Estão com erros que vou aprender a resolver com o tempo.
		// As possibilidades aqui são:
		// Um Array vazio.
		// Um array para números inteiros. 
		// Um array para a utilização da interface Collection (me parece que esta é uma das...
		// grandes diferenças para o vetor. 
		
					// ArrayList();
					// ArrayList(int capacidade);
					// ArrayList(Collection c);
		//---------------------------------------		
				
		// Adição de itens na lista. 
		array.add ("A");
		array.add ("B");
		array.add ("C");
		array.add ("D");
		array.add ("E");
		array.add ("F");
		array.add ("G");
		
		//  Manipulação dos itens da lista. 
		array.remove("A");
		array.set(0, "2");
		System.out.println(array.indexOf("2"));
	}
}
