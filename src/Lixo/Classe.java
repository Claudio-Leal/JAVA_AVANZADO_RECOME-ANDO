package Lixo;

public class Classe {
	public static void main (String [] args) {		

		//------------------------------IN�CIO
		// Super classe Object criando um objeto chamado "objeto". 
		// = new Object (), instanciando a super classe Object, criando um ojbeto. 
		// Podemos dizer que assim "se cria um objeto".
		Object objetoInicial = new Object();
		
		// Igualando a null, estaremos liberando espa�o na mem�ria para o objeto declarado.
		// Podemos dizer que assim "se libera um objeto". 
		// Este � justamente um recurso chamado "coleta de lixo", ou seja, de "libera��o de mem�ria", para que 
		objetoInicial = null;
		//------------------------------FIM		
		
		
		
		//------------------------------IN�CIO
		// Aqui tamb�m temos a cria��o de um objeto, chamado "objeto2", com a utiliza��o da classe Main.
		// Aqui se cria um objeto.
		Main objetoFinal = new Main();
		
		// Aqui se libera um objeto. 
		// System.gc () chama o m�todo finalize,...mas n�o mostra. 
		// S�o as caracter�sticas da "limpeza de lixo" do java. 
		// Mas ele imprime a palavra final existente no m�todo finalize. 
		objetoFinal = null;
		System.gc();
		//------------------------------FIM
		
	}

}
