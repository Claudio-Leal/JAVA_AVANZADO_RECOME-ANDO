/*
 * Informa��es importantes sobre as instru��es break e continue. 
 */


package Break;

public class Principal {

	public static void main(String[] args) {
		int numero = 0;
		while (numero < 20) {			
			System.out.println(numero);
			
			// Bloco para interromper a instru��o: break. 
			if (numero == 10) {
				break;
			}
			// Posi��o correta para a instru��o de incremento. 
			numero ++;
		}
	}
}
