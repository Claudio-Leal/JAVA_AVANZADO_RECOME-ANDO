/*
 * Provocação de um erro, utilizando a exceção criada manualmente - MyException - 
 * para tratar este erro. 
 */


public class Main {

	public static void main(String[] args) {
		try {
			/*
			 * try: as instruções deste bloco TENTARÃO ser executadas. 
			 * throw: significa lançar, atirar,...etc. 
			 * throw é um statement (declaração), ele manda a exceção ser lançada. 
			 * Este método lança uma exceção mas não exige que ela seja tratada por seus chamadores. 
			 * Ele transfere o controle do fluxo para os métodos chamadores. 
			 * Ele usa o que se chama unckecked exception, ou seja, 
			 * uma exceção é lançada mas nada obriga ela ser tratada.			 
			 * No caso, throw está criando uma instância da classe MyException. 
			 */
			
			System.out.println("Provocando o erro!!");
			throw new MyException();			
			/*
			 * Abaixo, o tratamento da exceção em catch.
			 * Modificamos o parâmetro padrão "Exception e" para "MyException e",...
			 * ou seja, ao invês de utilizar "Exception",...que é interno, utilizaremos a nossa própria exceção.
			 * No caso, temos o CONSTRUCUTOR METHOD, funcionando como tipo de dado, declarando a variável "e".
			 * exceptionError é o método declarado dentro da classe MyException.
			 */
		} catch (MyException e) {
			System.out.println(e.exceptionError());	
		}	
	}
}


/*
 * De uma forma geral, o código é simples,....pois com o debug, vi que as linhas 22...
 * e 23 foram executadas,...foi o try em ação. Depois o catch também foi executado,...
 * imprimindo a exceção "criada" na classe MyException. Segundo o curso, isso serve para..
 * que possamos nos prevenir,..criar exceções é uma ferramente importante para que o programador
 * consiga se prevenir de situações complexas.  
 */
