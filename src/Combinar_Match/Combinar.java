/*
regionMatches servem para fazer compara��o de "partes" da string.
Podemos pensar em uma busca, como no e-finance, de parte da string.
 
Retorna booleano.
 
boolean ignoreCase
int toffset
String other
int ooffset
int len


N�o � um assunto muito simples, pois n�o se pode testar toda a avalia��o feita. 
Mas os coment�rios abaixo ser�o suficientes para relembrar o assunto, caso necess�rio. 
*/ 



package Combinar_Match;

public class Combinar {
	
	public static void main (String [] args) {        
		
		String cadeiaString = "Esta � a cadeia que vamos comparar!";
		// 1� par�metro: Vamos considerar min�sculas e mai�sculas?		
		// 2� par�metro: Qual posi��o (�ndice) da string cadeiaString vamos avaliar: 0, 1, 2, etc.? 
		// 3� par�metro: Qual � a cadeia que queremos comparar?
		// 4� par�metro: A partir de que posi��o da string cadeiaString vamos avaliar: 0, 1, 2, etc.? Normalmente, se coloca 0.
		// 5� par�metro: Quantos caracteres ser�o comparados?
		
		
		// Avaliar mai�sculas e min�sculas; 
		// Caracter da posi��o 0 da String cadeiaString;
		// Comparando "Esta" com cadeiaString;
		// A partir da posi��o 0 da String cadeiaString;
		// 2 caracteres sendo avaliados;
		boolean resultadoA = cadeiaString.regionMatches(true, 6, "Esta", 0, 2);		
		System.out.println ("O resultado precisa ser true: " + resultadoA);
		
		// N�o avaliar mai�sculas e min�sculas; 
		// Caracter da posi��o 0;
		// Comparando "ESTA" com cadeiaString; 
		// A partir da posi��o 0;
		// 2 caracteres sendo avaliados;				
		boolean resultadoB = cadeiaString.regionMatches(true, 6, "ESTA", 0, 2);		
		System.out.println ("O resultado precisa ser false: " + resultadoB);
		
		
		
		
		 System.out.println("--------------------------------------------------------");
		
		
		 String Str1 = new String("Welcome to Tutorialspoint.com");
		 String Str2 = new String("Tutorials");
		 String Str3 = new String("TUTORIALS");

		 System.out.print("Return Value :" );
		 System.out.println(Str1.regionMatches(11, Str2, 0, 9));
		 // neste casso foi comparato do caracter 11 do Str1 com a Str2 apartir do caracter 0, 
		 // foram comparados 9 caracteres

		 System.out.print("Return Value :" );
		 System.out.println(Str1.regionMatches(11, Str3, 0, 9));
		 // neste casso foi comparato do caracter 11 do Str1 com a Str3 apartir do caracter 0, 
		 // foram comparados 9 caracteres, neste casso retorna false, 
		 // pois levasse em conta se os caracteres s�o maiusculos ou minusculos

		 System.out.print("Return Value :" );
		 System.out.println(Str1.regionMatches(true, 11, Str3, 0, 9));
		 // neste casso foi comparato do caracter 11 do Str1 com a Str3 apartir do caracter 0, 
		 // foram comparados 9 caracteres, neste caso true pois ignorase se os caracteres... 
		 // s�o maiusculos ou minusculos		
	}
}
