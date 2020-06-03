/*
 * Registros apenas para fixar a sintaxe do enum.
 * Conforme já registrado anteriormente, enum serve para criar objetos "fixos",...
 * impedindo que o usuário tenha que registrar uma string, por exemplo, por muitas
 * vezes e cometer erros de digitação.  
 * O construtor aqui deve ser privado,...já registrei isso também,..para
 * que não seja acessado de qualquer parte da aplicação.
 * Pelo Intellij, utilizei o surround with get / set. Aqui também é possível pelo que vi,
 * basta configurar os templates. Lembro que peguei as variáveis declaradas e simplesmente
 * fiz surround with get / set. 
 */

package Enum;

// Declaração da classe Dias (enum)
public enum Dias {
	// Declaração dos objetos. Basta enumerá-los. Não são strings,...
	// estes itens farão parte da programação Java, e poderão ser acessados. 
	segunda, terça, quarta, quinta, sexta, sábado, domingo;
	
	// Declaração de duas variáveis String.
	String clima;
	String climaP;
	
	
	//-----------------MÉTODO CONSTRUTOR PRIVADO INÍCIO	 
	private Dias () {
		this.clima = "Ensolarado";
	}
	//-----------------MÉTODO CONSTRUTOR PRIVADO INÍCIO
	

	
	
	//-----------------MÉTODOS INÍCIO (INCLUI GET / SET)
	private void previsao (String clima) {
		this.clima = clima;
	}
	public String getClima () {
		return clima;
	}	
	public void setClima (String clima) {
		this.clima = clima;
	}
	//-----------------MÉTODOS FIM (INCLUI GET / SET)
	
	
	public static void main (String [] args) {
		// Aqui podemos fazer testes de acesso aos enums.
		Dias dia = Dias.domingo;
		Dias dia2 = Dias.segunda;
		
		System.out.println(dia.name());
		System.out.println(dia.toString());
		System.out.println(dia.ordinal());
		System.out.println(dia.compareTo(dia2));
		System.out.println(dia.values());
		
	}
}
