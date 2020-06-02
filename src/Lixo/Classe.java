package Lixo;

public class Classe {
	public static void main (String [] args) {		
		// Super classe Object criando um objeto chamado "objeto". 
		// = new Object (), instanciando a super classe Object, criando um ojbeto. 
		// Podemos dizer que assim "se cria um objeto".
		Object objeto = new Object();
		
		// Igualando a null, estaremos liberando espaço na memória para o objeto declarado.
		// Podemos dizer que assim "se libera um objeto". 
		objeto = null;
		
		Main objeto2 = new Main();
		
		
		objeto2 = null;
		System.gc();
	}

}
