/*
 * Tratando de vetores.
 * Vetor � um tipo de dado,...que cria dados que poder�o ser utilizados
 * em outras partes da aplica��o.
 * 
 * Vetores podem ter qualquer tipo: inteiro, cadeia de caracteres, char, etc. 
 */

package Vetor;

import java.util.Vector;

public class Main {
	
	public static void main (String [] args) {
		
		//------M�TODOS DE CRIA��O DE VETORES (3 FORMAS POSS�VEIS)------		
		//Tr�s formas para a cria��o de vetores:
		
		//1�: Cria��o do vetor v1, vazio. 
		Vector v1 = new Vector();
		
		//2�: Cria��o do vetor v2, tamanho 10. 
		Vector v2 = new Vector (10);
		
		//3�: Cria��o do vetor v3, a partir de v2. 
		Vector v3 = new Vector (v2);		
		//--------------------------------------------------------------		


		
		
		
		//--------VETOR PODE SER INT, DOUBLE, STRING, CHAR, ETC.--------		
		//Vetor string vector criado:
		Vector<String> vector = new Vector<String>();		
		//--------------------------------------------------------------
			
		
		
		
		
		//-------------------MANIPULA��O DOS VETORES-------------------		
		// Inser��o de elementos.
		vector.addElement("Sequ�ncia 1");
		vector.addElement("Sequ�ncia 2");
		// Inser��o da cadeia AJ na posi��o 1. 
		vector.insertElementAt("AJ", 1);
		// Vetor foi declarado como String, ent�o a "inser��o" abaixo n�o ser� permitida,
		// pois � do tipo inteiro. 
		// vector.addElement(1);	
		//--------------------------------------------------------------
		
		
		
				
		//----------------IMPRESS�O DOS DADOS de "vector"---------------
		System.out.println(vector.get(2));
		System.out.println(vector.size());
		System.out.println(vector.elementAt(2));
		//--------------------------------------------------------------
		
		
		
		
		//----------------------REMO��O DE ELEMENTOS--------------------
		vector.removeElementAt(0);
		vector.removeElement("AJ");
		vector.removeAll(vector);
		//--------------------------------------------------------------
		
		
		
		
		//---------------------------OPERA��ES-------------------------
		//Retorna true se o vetor contiver "AJ".
		System.out.println(vector.contains("AJ"));
		//Retorna a posi��o se for encontrado "AJ" no vetor. 
		System.out.println(vector.indexOf("AJ"));
		//--------------------------------------------------------------
	}
}
