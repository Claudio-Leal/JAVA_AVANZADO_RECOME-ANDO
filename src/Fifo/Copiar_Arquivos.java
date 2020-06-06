/*
 * Conceitos de FIFO, para cópia ou duplicação de arquivos. 
 * Para estas tarefas, geralmente, utilizamos classes que fazem referência a uma classe principal que se
 * chama Streams. Aqui não vamos utilizar a classe principal, mas sim as derivada, que se chamam:
 * 
 * 
 * FILEINPUTSTREAM:
 * FileInputStream: A FileInputStream obtains input bytes from a file in a file system.  
 * What files are available depends on the host environment. 
 * FileInputStream: um FileInputStream obtém bytes de entrada de um arquivo em um sistema de arquivos.
 * Quais arquivos estão disponíveis dependem do ambiente do host.
 * 
 * FILEOUTPUTSTREAM:
 * FileOutputStream: Um fluxo de saída de arquivo é um fluxo de saída para gravar dados em um Arquivo ou em um FileDescriptor. 
 * A disponibilidade ou a criação de um arquivo depende ou não da plataforma subjacente. 
 * Algumas plataformas, em particular, permitem que um arquivo seja aberto para gravação por apenas um FileOutputStream (ou outro objeto de gravação de arquivo) por vez. Em tais situações, 
 * os construtores nesta classe falharão se o arquivo envolvido já estiver aberto.  
 */


/*
 * Nesta versão, teremos try/cath inseridos, pois como estamos tratando da criação, leitura, etc. de arquivos,...
 * tratar as exceções é de extrema importância. Para facilitar, vou retirar os comentários que fiz no push anterior.
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
	// Utilização de System.err.println.
	// Também incluímos o System.exit para tratar a saída....
	// o zero que está sendo passado identifica que estamos manipulando de alguma maneira. 
	public Copiar_Arquivos (String [] args) {
	if (args.length == 2) {
		try {
			arquivoEntrada = new File(args [0]);
			arquivoSaida = new File(args [1]);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
	// Inserimos um else, caso o bloco anterior não tenha nenhuma saída prevista. 
	} else {
		System.out.println("Teremos o original!");
	}
	}
			
	// Não é necessário "catchar" nada.
	
	public void duplicar () {
		// Inclusão deste sout para vermos o tempo de execução em milisegundos. 
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
		// Inclusão de outro sout para vermos que já está pronto!
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