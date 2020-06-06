package Metodo_Generico;

// Declaração da classe. 
public class Classe_G <TUDO> {
	TUDO objeto;
	
	// Declaração do método construtor. 
	public Classe_G (TUDO algo) {
	objeto = algo;		
	}
		
	// Declaração do método. 
	public void tipoClasse () {
	System.out.println("O tipo de dado é: " + objeto.getClass().getName() + "!");
	}
		
	// Declaração do método genérico com o tipo de dado TUDO.
	// Não há retorno, mas a declaração é um pouco diferente do que temos visto ultimamente. 
	// <> identifica que se trata de um método genérico. 
	// Nesta declaração, estamos dizendo que vamos trabalhar com uma string.
	// O nome do método é metodoGenerico.
	// Nos argumentos, estamos passando como parâmetro o objeto coisa, declarado com o tipo de dado TUDO. 
	
	public static <TUDO> String metodoGenerico (TUDO coisa) {
		// Temos aqui:
		// Variável dado declarada com o tipo String.
		// dado recebendo o objeto coisa, convertido para String. 
		// Como se trata de um método, pode ter retorno. E o que retorna para o método...
		// é o conteúdo da variável dado. 
		String dado;
		dado = coisa.toString();
		return dado;
	}		
}