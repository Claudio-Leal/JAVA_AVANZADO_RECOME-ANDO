/*
 * Criação do quarto arquivo, desta vez, uma classe. 
 * Aqui, utilizaremos mais um conceito de herança, ou seja, a utilização 
 * da palavra chave implements, que permitirá a implementação 
 * dos métodos criados, porém não implementados, na interface origem. 
 * Faremos a implementação das intefaces EstadioConcerto e EstadioFutebol.
 * Quando cliquei em "adicionar métodos não implementados", todos os métodos foram adicionados automaticamente
 * com a utilização de @Override. 
 * Como já vimos antes, @Override serve para "sobrepor".  
 */

package Exemplo;

// Note que estamos tratando aqui de uma classe. 
// A palavra chave implements faz uma referência às classes EstadioConcerto e EstadioFutebol. 
// Note que aqui, a implementação fez referência apenas à EstadioConcerto e EstadioFutebol. 
// Mas porque os métodos definidos em "Estadio" aparecem aqui também?
// "EstadioConcerto e EstadioFutebol" referenciam "Estadio" através de extends, por isso estes
// métodos foram inseridos aqui automaticamente. 
// No total são 9 métodos,...e todos estão aqui.
public class EstadioMundial implements EstadioConcerto, EstadioFutebol {

	
	// Originalmente, todos os métodos foram inseridos sem implementação (com o bloco de códigos vazio).
	@Override
	public void abrirEstadio() {
		// TODO Auto-generated method stub
		// Apenas como exemplo, uma saíde de impressão:
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
