
/*
 * Abaixo, a classe Minha exce��o criada, sendo extendida para a classe "interna",...
 * Exception. Com isso, j� vimos que todos os m�todos da classe Exception ser�o carregados aqui.
 * Estrutura desta classe:
 * public: poder� ser chamada de qualquer local da aplica��o.
 * class: indica��o de que a declara��o � uma classe.
 * extends: extende os m�todos da classe "Exception" a esta classe.
 * Exption: classe "interna que guarda m�todos de exce��o.
 * Esta � a estrutura b�sica da cria��o de uma exce��o. Faremos um teste...
 * chamando a partir da classe main (que estou criando agora).
 */


public class MyException extends Exception{
	
	/*
	 * Declara��o de um CONSTRUCTOR METHOD: public: poder� ser chamado de qualquer
	 * local da aplica��o. MyException: nome do CONSTRUCTOR METHOD.
	 */
	public MyException () {		
		
	}
	
	/*
	 * Declara��o de METODOS: Aqui � realmente um m�todo. public: poder� ser chamado
	 * de qualquer local da aplica��o. String: tipo do retorno. exceptionError: nome
	 * do M�TODO. repare que este m�todo est� fora do bloco do CONSTRUCTOR METHOD.
	 */
	
	public String exceptionError () {
		return "Error x!!";		
	}
}
