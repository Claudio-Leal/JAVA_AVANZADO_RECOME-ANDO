/*
 * Informações importantes sobre as instruções break e continue: 
 * A instrução break interrompe a iteração, ou seja, apenas um ciclo ocorreu.
 * A instrução continue "simplesmente" diz,..continue a executar o ciclo. 
 */


package Break;

public class Principal {

	public static void main(String[] args) {
		int i;
		
		// Break
		for (i = 0 ; i < 10 ; i++) {
			System.out.println("1");
			System.out.println("2");
			break;
		}
		// Continue
		for (i = 0 ; i < 10 ; i++) {
			System.out.println("3");
			System.out.println("4");
			continue;
		}		
	}
}
		

		
		

		
		
		

/*
//----------------------------------------------------------BREAK INÍCIO		
		// Com as instruções para parar. 
		int numero = 0;
		while (numero < 20) {			
			System.out.println(numero);
			
			// Bloco para interromper a instrução: break. 
			if (numero == 10) {
				break;
			}
			// Posição correta para a instrução de incremento. 
			numero ++;
		}
//----------------------------------------------------------BREAK FIM
*/
 
