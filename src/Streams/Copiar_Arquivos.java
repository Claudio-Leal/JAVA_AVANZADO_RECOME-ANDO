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


package Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copiar_Arquivos {	
	// Vejam: FIFO.
	FileInputStream fi;
	FileOutputStream fo;	
	
	// A classe Byte agrupa um valor do tipo primitivo byte em um objeto. 
	// Um objeto do tipo Byte contém um único campo cujo tipo é byte.
	// Este objeto vai permitir o armazenamento dos dados que vamos utilizar por bytes. 
	// [] Lembrando que um array foi criado. 
	public byte [] b;
	
	// Classe que permite a criação de arquivos. 
	// An abstract representation of file and directory pathnames.
	// Uma representação abstrata de nomes de caminho de arquivos e diretórios.
	public File arquivoEntrada;
	public File arquivoSaida;
	
	
	// Declaração de um método construtor Copiar_Arquivos. 
	// public: poderá ser chamado de qualquer local da aplicação.
	// Nos argumentos, serão recebidos os valores de args. 
	// Dentro do método, foi inserido um teste: se o tamanho do array args for igual a 2, 
	// as variáveis arquivoEntrada e arquivoSaida serão instanciadas com novos arquivos, cada um com as suas 
	// posições:
	// 0 = Entrada. 
	// 1 = Saída.
	// O teste evita um erro: se existirem 3 argumentos, não executaremos o método,...somente se tiver mos 1 ou 2. 
	public Copiar_Arquivos (String [] args) {
	if (args.length == 2) {
		arquivoEntrada = new File(args [0]);
		arquivoSaida = new File(args [1]);
	}
	}
	public static void main (String [] args) {
}
}