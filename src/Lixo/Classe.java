package Lixo;

public class Classe {
	public static void main (String [] args) {		

		//------------------------------IN�CIO
		// Super classe Object criando um objeto chamado "objeto". 
		// = new Object (), instanciando a super classe Object, criando um ojbeto. 
		// Podemos dizer que assim "se cria um objeto".
		Object objeto1 = new Object();
		
		// Igualando a null, estaremos liberando espa�o na mem�ria para o objeto declarado.
		// Podemos dizer que assim "se libera um objeto". 
		// Este � justamente um recurso chamado "coleta de lixo", ou seja, de "libera��o de mem�ria", para que 
		objeto1 = null;
		//------------------------------FIM
		
		
		
		
		
		//------------------------------IN�CIO
		// Aqui tamb�m temos a cria��o de um objeto, chamado "objeto2", com a utiliza��o da classe Main.
		// Aqui se cria um objeto.
		Main objeto2 = new Main();
		
		// Aqui se libera um objeto. 
		objeto2 = null;
		System.gc();
		//------------------------------FIM
		
	}

}
