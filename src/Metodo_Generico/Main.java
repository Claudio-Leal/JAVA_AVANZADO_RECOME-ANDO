/*
 * M�todo gen�rico � "derivado" do conceito de classe gen�rica.
 * Permite que o tipo de dado do m�todo seja definido de acordo com os valores que est�o sendo passados.
 * Veja exemplos abaixo. 
 */

package Metodo_Generico;

public class Main {
	
	public static void main(String[] args) {
	
	// Instanciando a classe Classe_G; passando inteiro e string; chamando o m�todo tipoClasse.
	// Lembrando que tipoClasse n�o � um m�todo gen�rico. 
	Classe_G<Integer> objetoA = new Classe_G<Integer>(1);
	objetoA.tipoClasse();	
	Classe_G<String> objetoB = new Classe_G<String>("Cl�udio");
	objetoB.tipoClasse();
	
	
	// Chamada de objetos gen�ricos.
	// Podemos ver que objetoA foi instanciado como inteiro, mas estamos conseguindo passar string. 
	System.out.println(objetoA.metodoGenerico("Ol�!"));
	// Podemos ver que objetoB foi instanciado como string, mas estamos conseguindo passar inteiro, string e outros tipos sem problemas.
	System.out.println(objetoB.metodoGenerico(100000f + "!"));
	System.out.println(objetoB.metodoGenerico(100000d + "!"));
	System.out.println(objetoB.metodoGenerico(10000000 + "!"));
	System.out.println(objetoB.metodoGenerico(10 + "!"));
	}
}
