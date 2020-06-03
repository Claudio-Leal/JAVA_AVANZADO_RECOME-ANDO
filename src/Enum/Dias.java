/*
 * Registros apenas para fixar a sintaxe do enum.
 * Conforme j� registrado anteriormente, enum serve para criar objetos "fixos",...
 * impedindo que o usu�rio tenha que registrar uma string, por exemplo, por muitas
 * vezes e cometer erros de digita��o.  
 * O construtor aqui deve ser privado,...j� registrei isso tamb�m,..para
 * que n�o seja acessado de qualquer parte da aplica��o.
 * Pelo Intellij, utilizei o surround with get / set. Aqui tamb�m � poss�vel pelo que vi,
 * basta configurar os templates. Lembro que peguei as vari�veis declaradas e simplesmente
 * fiz surround with get / set. 
 */

package Enum;

// Declara��o da classe Dias (enum)
public enum Dias {
	// Declara��o dos objetos. Basta enumer�-los. N�o s�o strings,...
	// estes itens far�o parte da programa��o Java, e poder�o ser acessados. 
	segunda, ter�a, quarta, quinta, sexta, s�bado, domingo;
	
	// Declara��o de duas vari�veis String.
	String clima;
	String climaP;
	
	
	//-----------------M�TODO CONSTRUTOR PRIVADO IN�CIO	 
	private Dias () {
		this.clima = "Ensolarado";
	}
	//-----------------M�TODO CONSTRUTOR PRIVADO IN�CIO
	

	
	
	//-----------------M�TODOS IN�CIO (INCLUI GET / SET)
	private void previsao (String clima) {
		this.clima = clima;
	}
	public String getClima () {
		return clima;
	}	
	public void setClima (String clima) {
		this.clima = clima;
	}
	//-----------------M�TODOS FIM (INCLUI GET / SET)
	
	
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
