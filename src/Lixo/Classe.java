package Lixo;

public class Classe {
	public static void main (String [] args) {		

		//------------------------------INÍCIO
		// Super classe Object criando um objeto chamado "objeto". 
		// = new Object (), instanciando a super classe Object, criando um ojbeto. 
		// Podemos dizer que assim "se cria um objeto".
		Object objeto1 = new Object();
		
		// Igualando a null, estaremos liberando espaço na memória para o objeto declarado.
		// Podemos dizer que assim "se libera um objeto". 
		// Este é justamente um recurso chamado "coleta de lixo", ou seja, de "liberação de memória", para que 
		objeto1 = null;
		//------------------------------FIM
		
		
		
		
		
		//------------------------------INÍCIO
		// Aqui também temos a criação de um objeto, chamado "objeto2", com a utilização da classe Main.
		// Aqui se cria um objeto.
		Main objeto2 = new Main();
		
		// Aqui se libera um objeto. 
		objeto2 = null;
		System.gc();
		//------------------------------FIM
		
	}

}
