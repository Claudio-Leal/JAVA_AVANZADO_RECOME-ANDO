package PAvançada;

public class Exemplo {

	public static void main(String[] args) {
		
		
		
		
		//--------------------------------------ARRAY INÍCIO
		// Array bidimensional com 3 filas e 4 colunas. 
		int [] [] arrayInteiros = {
			{10, 90, 92, 45},
			{16, 20, 9, 12},
			{40, 32, 11, 49},			
		};
		//--------------------------------------ARRAY FIM
		
		
		
		
		//--------------------------------------VARIÁVEIS INÍCIO
		// índices:
		int i;
		int j = 0;
		// valor a ser buscado. Apenas um exemplo: 16.
		int buscando = 16;
		// booleano para sabermos quando o valor foi encontrado. 
		boolean encontrado = false;
		//--------------------------------------VARIÁVEIS FIM
		
		
		
		
		//--------------------------------------BLOCO DE BUSCA INÍCIO
		// rótulo (etiqueta). Sempre utilizar a palavra que queremos, seguida de ":",...não podendo ser reservada.
		buscar:	
		
			for (i = 0 ; i < arrayInteiros[i].length ; i++) {
				for (j = 0 ; j < arrayInteiros[i].length ; j++) {
					if (arrayInteiros[i][j] == buscando) {
						encontrado = true;
						break buscar;
					} else {
						System.out.println(buscando);
					}
				}
			}
		//--------------------------------------BLOCO DE BUSCA FIM
	}
}
