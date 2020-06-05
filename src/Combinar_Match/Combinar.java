/*
regionMatches servem para fazer comparação de "partes" da string.
Podemos pensar em uma busca, como no e-finance, de parte da string.
 
Retorna booleano.
 
boolean ignoreCase
int toffset
String other
int ooffset
int len


Não é um assunto muito simples, pois não se pode testar toda a avaliação feita. 
Mas os comentários abaixo serão suficientes para relembrar o assunto, caso necessário. 
*/ 



package Combinar_Match;

public class Combinar {
	
	public static void main (String [] args) {        
		
		String cadeiaString = "Esta é a cadeia que vamos comparar!";
		// 1º parâmetro: Vamos considerar minúsculas e maiúsculas?		
		// 2º parâmetro: Qual posição (índice) da string cadeiaString vamos avaliar: 0, 1, 2, etc.? 
		// 3º parâmetro: Qual é a cadeia que queremos comparar?
		// 4º parâmetro: A partir de que posição da string cadeiaString vamos avaliar: 0, 1, 2, etc.? Normalmente, se coloca 0.
		// 5º parâmetro: Quantos caracteres serão comparados?
		
		
		// Avaliar maiúsculas e minúsculas; 
		// Caracter da posição 0 da String cadeiaString;
		// Comparando "Esta" com cadeiaString;
		// A partir da posição 0 da String cadeiaString;
		// 2 caracteres sendo avaliados;
		boolean resultadoA = cadeiaString.regionMatches(true, 6, "Esta", 0, 2);		
		System.out.println ("O resultado precisa ser true: " + resultadoA);
		
		// Não avaliar maiúsculas e minúsculas; 
		// Caracter da posição 0;
		// Comparando "ESTA" com cadeiaString; 
		// A partir da posição 0;
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
		 // pois levasse em conta se os caracteres são maiusculos ou minusculos

		 System.out.print("Return Value :" );
		 System.out.println(Str1.regionMatches(true, 11, Str3, 0, 9));
		 // neste casso foi comparato do caracter 11 do Str1 com a Str3 apartir do caracter 0, 
		 // foram comparados 9 caracteres, neste caso true pois ignorase se os caracteres... 
		 // são maiusculos ou minusculos		
	}
}
