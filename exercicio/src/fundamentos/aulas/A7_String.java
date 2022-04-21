package fundamentos.aulas;

public class A7_String {
	public static void main(String[] args) {
		String frase = "Olá mundo";
		System.out.println("Olá Mundo!!!".toUpperCase());// posso usar os metodos no valor literal ou armazenar numa variavel e trabalhar com a variavel;;
			
		System.out.println(frase.charAt(5)); //mostra o char no indice 5
		System.out.println(frase.concat(" Cruel!!!")); // concatena ao final
		System.out.println(frase.equals("Olá mundo")); //equipara as duas frases (é CaseSensitive)
		System.out.println(frase.equals("olá mundo")); // """"
		System.out.println(frase.equalsIgnoreCase("olá mundo")); //equipara ignorando letras maiusculas e minusculas
		System.out.println(frase.contains("mun")); //contem a sequencia mun na frase
		System.out.println(frase.toLowerCase().startsWith("olá")); //a frase começa com (parametro)?
		System.out.println(frase.toLowerCase().endsWith("mundo")); // a frase termina com (parametro)?
		System.out.println(frase.length()); //retorna o tamanho da minha string(espaço conta como caracter)
		
		var name = "lucas"; // por inferencia a variavel name se torna do tipo string e nao podera receber outro tipo posteriomente;;
		var lastName = "acacio"; 
		var age = 25;
		var wage = 3200.58;
		
		System.out.println("nome: " + name +"\nSobrenome: " + lastName + "\nidade: "+ age +"\nsalario: " + wage);
		System.out.printf("O senhor %s %s tem %d anos de idade e ganha R$ %.2f por mês",name,lastName,age,wage);
		/* %s - string
		 * %d - numero inteiro
		 * %f - numero flutuante
		 * %n = \n
		 * as variaveis vao substituir os indices formatadores no texto;;
		 */
		
	}
}
