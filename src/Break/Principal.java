/*
 * Informações importantes sobre as instruções break e continue. 
 */


package Break;

public class Principal {

	public static void main(String[] args) {
		int numero = 0;
		while (numero < 20) {
			numero ++;
			System.out.println(numero);
			
			// Bloco para interromper a instrução: break. 
			if (numero == 10) {
				break;
			}
		}
	}
}
