package Lixo;

public class Classe {
	public static void main (String [] args) {		

		//------------------------------INÍCIO
		// Super classe Object criando um objeto chamado "objeto". 
		// = new Object (), instanciando a super classe Object, criando um ojbeto. 
		// Podemos dizer que assim "se cria um objeto".
		Object objetoInicial = new Object();
		
		// Igualando a null, estaremos liberando espaço na memória para o objeto declarado.
		// Podemos dizer que assim "se libera um objeto". 
		// Este é justamente um recurso chamado "coleta de lixo", ou seja, de "liberação de memória", para que 
		objetoInicial = null;
		//------------------------------FIM		
		
		
		
		//------------------------------INÍCIO
		// Aqui também temos a criação de um objeto, chamado "objeto2", com a utilização da classe Main.
		// Aqui se cria um objeto.
		Main objetoFinal = new Main();
		
		// Aqui se libera um objeto. 
		// System.gc () chama o método finalize,...mas não mostra. 
		// São as características da "limpeza de lixo" do java. 
		// Mas ele imprime a palavra final existente no método finalize. 
		objetoFinal = null;
		System.gc();
		//------------------------------FIM
		
	}

}
