// Classes de mebros internos.


package Aninhado;

 
public class ClasseMain {
	int numero;
	String outrodado;
	Aninhada classeAninhada;
	
	public ClasseMain (int numero, String nome, String outrodado) {
	classeAninhada = new Aninhada ();
}
 
	class Aninhada {
		String dado1ClasseAninhada;
		String dado2ClasseAninhada;
		public void Aninhada () {			
		}
	}
}
