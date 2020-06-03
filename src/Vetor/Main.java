/*
 * Tratando de vetores.
 * Vetor é um tipo de dado,...que cria dados que poderão ser utilizados
 * em outras partes da aplicação.
 * 
 * Vetores podem ter qualquer tipo: inteiro, cadeia de caracteres, char, etc. 
 */

package Vetor;

import java.util.Vector;

public class Main {
	
	public static void main (String [] args) {
		
		//------MÉTODOS DE CRIAÇÃO DE VETORES (3 FORMAS POSSÍVEIS)------		
		//Três formas para a criação de vetores:
		
		//1º: Criação do vetor v1, vazio. 
		Vector v1 = new Vector();
		
		//2º: Criação do vetor v2, tamanho 10. 
		Vector v2 = new Vector (10);
		
		//3º: Criação do vetor v3, a partir de v2. 
		Vector v3 = new Vector (v2);		
		//--------------------------------------------------------------		


		
		
		
		//--------VETOR PODE SER INT, DOUBLE, STRING, CHAR, ETC.--------		
		//Vetor string vector criado:
		Vector<String> vector = new Vector<String>();		
		//--------------------------------------------------------------
			
		
		
		
		
		//-------------------MANIPULAÇÃO DOS VETORES-------------------		
		// Inserção de elementos.
		vector.addElement("Sequência 1");
		vector.addElement("Sequência 2");
		// Inserção da cadeia AJ na posição 1. 
		vector.insertElementAt("AJ", 1);
		// Vetor foi declarado como String, então a "inserção" abaixo não será permitida,
		// pois é do tipo inteiro. 
		// vector.addElement(1);	
		//--------------------------------------------------------------
		
		
		
				
		//----------------IMPRESSÃO DOS DADOS de "vector"---------------
		System.out.println(vector.get(2));
		System.out.println(vector.size());
		System.out.println(vector.elementAt(2));
		//--------------------------------------------------------------
		
		
		
		
		//----------------------REMOÇÃO DE ELEMENTOS--------------------
		vector.removeElementAt(0);
		vector.removeElement("AJ");
		vector.removeAll(vector);
		//--------------------------------------------------------------
		
		
		
		
		//---------------------------OPERAÇÕES-------------------------
		//Retorna true se o vetor contiver "AJ".
		System.out.println(vector.contains("AJ"));
		//Retorna a posição se for encontrado "AJ" no vetor. 
		System.out.println(vector.indexOf("AJ"));
		//--------------------------------------------------------------
	}
}
