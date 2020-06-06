package Metodo_Generico;

// Declara��o da classe. 
public class Classe_G <TUDO> {
	TUDO objeto;
	
	// Declara��o do m�todo construtor. 
	public Classe_G (TUDO algo) {
	objeto = algo;		
	}
		
	// Declara��o do m�todo. 
	public void tipoClasse () {
	System.out.println("O tipo de dado �: " + objeto.getClass().getName() + "!");
	}
		
	// Declara��o do m�todo gen�rico com o tipo de dado TUDO.
	// N�o h� retorno, mas a declara��o � um pouco diferente do que temos visto ultimamente. 
	// <> identifica que se trata de um m�todo gen�rico. 
	// Nesta declara��o, estamos dizendo que vamos trabalhar com uma string.
	// O nome do m�todo � metodoGenerico.
	// Nos argumentos, estamos passando como par�metro o objeto coisa, declarado com o tipo de dado TUDO. 
	
	public static <TUDO> String metodoGenerico (TUDO coisa) {
		// Temos aqui:
		// Vari�vel dado declarada com o tipo String.
		// dado recebendo o objeto coisa, convertido para String. 
		// Como se trata de um m�todo, pode ter retorno. E o que retorna para o m�todo...
		// � o conte�do da vari�vel dado. 
		String dado;
		dado = coisa.toString();
		return dado;
	}		
}