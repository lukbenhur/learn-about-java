package fundamentos.aulas;

public class A9_ConversaoDeNumeros {
	public static void main(String[] args) {
		/*
		 * tipos primitivos numericos inteiros : byte,short,int,long = java adota o int como o literal padrao
		 * tipos primitivos numericos flutuante : float,double = java adota o double como o literal padrao
		 * 
		 * na transformaçao de um numero de tipo "menor" para um maior acontece implicitamente sem problema , mas um maior para um menor
		 * tem que ser explicita, pois ocorre perca de dados;;;; o mesmo acontece de int - float nao ha problema , mas de float para int
		 * tem que ser explicito pois ha perca de dados
		 */
	
		double x = 1; //conversao implicita do meu numero 1 (inteiro) para um do tipo double;
		int y = (int)1.99999; //conversao explicita usando (CAST)
		
		System.out.println(x);
		System.out.println(y);
		
		int c = 123;
		byte w = (byte)c;
		
		System.out.println(w);
	}
}
