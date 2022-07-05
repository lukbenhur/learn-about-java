package fundamentos.aulas.collections;

/*
 * É unidimensional 
 * É estático , isso quer dizer que quando em sua declaração deverá ser especificado seu tipo e tamanho previamente
 * É homogenio em seus dados 
 * Possui uma estrutura indexada (os elementos estao identificados por indices - iniciando-se pelo indice 0)
 * array é um objeto possuindo metodos e atributos;;
 */
public class Arrays {

	public static void main(String[] args) {
		// declaração de array
		double[] notas = new double[5];// exemplo de uma declaracao de array com tamanho fixado em 5
		//double notas[] = new double[5];// exemplo de uma declaracao de array com tamanho fixado em 5 é aceitavel
		System.out.println(notas.length); //mostra o tamnho do array

		notas[2] = 3;

		System.out.println(notas); // dessa forma vai imprimir no console o caminho do espaço de memoria onde o
									// array ta referenciando
		System.out.println(notas[0]); //imprime o elemento do array no indice 0
		System.out.println(notas[1]); //imprime o elemento do array no indice 1
		System.out.println(notas[2]); //imprime o elemento do array no indice 2
		System.out.println(notas[4]); //imprime o elemento do array no indice 2
		
		System.out.println(notas[5]); //imprime o elemento do array no indice 5 porem da erro pois o maior indice é o 4;; 0-1-2-3-4(tamanho 5)
	
	}
}
