/*
 * Informa��es importantes sobre as instru��es break e continue: 
 * A instru��o break interrompe a itera��o, ou seja, apenas um ciclo ocorreu.
 * A instru��o continue "simplesmente" diz,..continue a executar o ciclo. 
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
//----------------------------------------------------------BREAK IN�CIO		
		// Com as instru��es para parar. 
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
//----------------------------------------------------------BREAK FIM
*/
 
