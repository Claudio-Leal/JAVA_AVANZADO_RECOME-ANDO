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


package Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copiar_Arquivos {	
	// Vejam: FIFO.
	FileInputStream fi;
	FileOutputStream fo;	
	
	// A classe Byte agrupa um valor do tipo primitivo byte em um objeto. 
	// Um objeto do tipo Byte cont�m um �nico campo cujo tipo � byte.
	// Este objeto vai permitir o armazenamento dos dados que vamos utilizar por bytes. 
	// [] Lembrando que um array foi criado. 
	public byte [] b;
	
	// Classe que permite a cria��o de arquivos. 
	// An abstract representation of file and directory pathnames.
	// Uma representa��o abstrata de nomes de caminho de arquivos e diret�rios.
	public File arquivoEntrada;
	public File arquivoSaida;
	
	
	// Declara��o de um m�todo construtor Copiar_Arquivos. 
	// public: poder� ser chamado de qualquer local da aplica��o.
	// Nos argumentos, ser�o recebidos os valores de args. 
	// Dentro do m�todo, foi inserido um teste: se o tamanho do array args for igual a 2, 
	// as vari�veis arquivoEntrada e arquivoSaida ser�o instanciadas com novos arquivos, cada um com as suas 
	// posi��es:
	// 0 = Entrada. 
	// 1 = Sa�da.
	// O teste evita um erro: se existirem 3 argumentos, n�o executaremos o m�todo,...somente se tiver mos 1 ou 2. 
	public Copiar_Arquivos (String [] args) {
	if (args.length == 2) {
		arquivoEntrada = new File(args [0]);
		arquivoSaida = new File(args [1]);
	}
	}
	public static void main (String [] args) {
}
}