/*
 * Provoca��o de um erro, utilizando a exce��o criada manualmente - MyException - 
 * para tratar este erro. 
 */


public class Main {

	public static void main(String[] args) {
		try {
			/*
			 * try: as instru��es deste bloco TENTAR�O ser executadas. 
			 * throw: significa lan�ar, atirar,...etc. 
			 * throw � um statement (declara��o), ele manda a exce��o ser lan�ada. 
			 * Este m�todo lan�a uma exce��o mas n�o exige que ela seja tratada por seus chamadores. 
			 * Ele transfere o controle do fluxo para os m�todos chamadores. 
			 * Ele usa o que se chama unckecked exception, ou seja, 
			 * uma exce��o � lan�ada mas nada obriga ela ser tratada.			 
			 * No caso, throw est� criando uma inst�ncia da classe MyException. 
			 */
			
			System.out.println("Provocando o erro!!");
			throw new MyException();			
			/*
			 * Abaixo, o tratamento da exce��o em catch.
			 * Modificamos o par�metro padr�o "Exception e" para "MyException e",...
			 * ou seja, ao inv�s de utilizar "Exception",...que � interno, utilizaremos a nossa pr�pria exce��o.
			 * No caso, temos o CONSTRUCUTOR METHOD, funcionando como tipo de dado, declarando a vari�vel "e".
			 * exceptionError � o m�todo declarado dentro da classe MyException.
			 */
		} catch (MyException e) {
			System.out.println(e.exceptionError());	
		}	
	}
}


/*
 * De uma forma geral, o c�digo � simples,....pois com o debug, vi que as linhas 22...
 * e 23 foram executadas,...foi o try em a��o. Depois o catch tamb�m foi executado,...
 * imprimindo a exce��o "criada" na classe MyException. Segundo o curso, isso serve para..
 * que possamos nos prevenir,..criar exce��es � uma ferramente importante para que o programador
 * consiga se prevenir de situa��es complexas.  
 */
