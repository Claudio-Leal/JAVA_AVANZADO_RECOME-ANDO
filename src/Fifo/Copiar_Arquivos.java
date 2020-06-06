/*
 * Conceitos de FIFO, para c�pia ou duplica��o de arquivos. 
 * Para estas tarefas, geralmente, utilizamos classes que fazem refer�ncia a uma classe principal que se
 * chama Streams. Aqui n�o vamos utilizar a classe principal, mas sim as derivada, que se chamam:
 * 
 * 
 * FILEINPUTSTREAM:
 * FileInputStream: A FileInputStream obtains input bytes from a file in a file system.  
 * What files are available depends on the host environment. 
 * FileInputStream: um FileInputStream obt�m bytes de entrada de um arquivo em um sistema de arquivos.
 * Quais arquivos est�o dispon�veis dependem do ambiente do host.
 * 
 * FILEOUTPUTSTREAM:
 * FileOutputStream: Um fluxo de sa�da de arquivo � um fluxo de sa�da para gravar dados em um Arquivo ou em um FileDescriptor. 
 * A disponibilidade ou a cria��o de um arquivo depende ou n�o da plataforma subjacente. 
 * Algumas plataformas, em particular, permitem que um arquivo seja aberto para grava��o por apenas um FileOutputStream (ou outro objeto de grava��o de arquivo) por vez. Em tais situa��es, 
 * os construtores nesta classe falhar�o se o arquivo envolvido j� estiver aberto.  
 */


/*
 * Nesta vers�o, teremos try/cath inseridos, pois como estamos tratando da cria��o, leitura, etc. de arquivos,...
 * tratar as exce��es � de extrema import�ncia. Para facilitar, vou retirar os coment�rios que fiz no push anterior.
 * 
 */


package Fifo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copiar_Arquivos {	
	
	FileInputStream fi;
	FileOutputStream fo;	
	
	public byte [] b;
	
	public File arquivoEntrada;
	public File arquivoSaida;
	
	
	// Manualmente, fizemos o try/catch aqui, mas desta vez, com catch previsto.
	// Utiliza��o de System.err.println.
	// Tamb�m inclu�mos o System.exit para tratar a sa�da....
	// o zero que est� sendo passado identifica que estamos manipulando de alguma maneira. 
	public Copiar_Arquivos (String [] args) {
	if (args.length == 2) {
		try {
			arquivoEntrada = new File(args [0]);
			arquivoSaida = new File(args [1]);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
	// Inserimos um else, caso o bloco anterior n�o tenha nenhuma sa�da prevista. 
	} else {
		System.out.println("Teremos o original!");
	}
	}
			
	// N�o � necess�rio "catchar" nada.
	
	public void duplicar () {
		// Inclus�o deste sout para vermos o tempo de execu��o em milisegundos. 
		System.out.println("Iniciamos" + System.currentTimeMillis());
		try {
			fi = new FileInputStream(arquivoEntrada);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		try {
			fo = new FileOutputStream(arquivoSaida);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		b = new byte [(int) arquivoEntrada.length()];
		// Inclus�o de outro sout para vermos que j� est� pronto!
		System.out.println("Pronto!" + System.currentTimeMillis());
		try {
			fi.read(b);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		// Outro "controlador" para sabermos que terminamos de ler. 
		System.out.println("Terminamos de ler!" + System.currentTimeMillis());
		try {
			fo.write(b);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		try {
			fi.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		try {
			fo.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		// Outro "controlador" para sabermos que terminamos de ler. 
		System.out.println("Encerramos a escrita!" + System.currentTimeMillis());
				
	}	
	// Argumentos foram declarados em "Run Configurations". 
	public static void main (String [] args) {
		Copiar_Arquivos cp = new Copiar_Arquivos(args);
		cp.duplicar();
}
}