/*
 * Cria��o do quarto arquivo, desta vez, uma classe. 
 * Aqui, utilizaremos mais um conceito de heran�a, ou seja, a utiliza��o 
 * da palavra chave implements, que permitir� a implementa��o 
 * dos m�todos criados, por�m n�o implementados, na interface origem. 
 * Faremos a implementa��o das intefaces EstadioConcerto e EstadioFutebol.
 * Quando cliquei em "adicionar m�todos n�o implementados", todos os m�todos foram adicionados automaticamente
 * com a utiliza��o de @Override. 
 * Como j� vimos antes, @Override serve para "sobrepor".  
 */

package Exemplo;

// Note que estamos tratando aqui de uma classe. 
// A palavra chave implements faz uma refer�ncia �s classes EstadioConcerto e EstadioFutebol. 
// Note que aqui, a implementa��o fez refer�ncia apenas � EstadioConcerto e EstadioFutebol. 
// Mas porque os m�todos definidos em "Estadio" aparecem aqui tamb�m?
// "EstadioConcerto e EstadioFutebol" referenciam "Estadio" atrav�s de extends, por isso estes
// m�todos foram inseridos aqui automaticamente. 
// No total s�o 9 m�todos,...e todos est�o aqui.
public class EstadioMundial implements EstadioConcerto, EstadioFutebol {

	
	// Originalmente, todos os m�todos foram inseridos sem implementa��o (com o bloco de c�digos vazio).
	@Override
	public void abrirEstadio() {
		// TODO Auto-generated method stub
		// Apenas como exemplo, uma sa�de de impress�o:
		System.out.println("Teste!!!");
	
		
	}

	@Override
	public void fecharEstadio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepararCampo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cuidarCampo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void regarCampo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepararCenario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepararAudio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepararLuzes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepararCameras() {
		// TODO Auto-generated method stub
		
	}

}
