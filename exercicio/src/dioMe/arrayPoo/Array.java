package dioMe.arrayPoo;
/*
 * Array e um tipo de lista onde armazena dados seja "unidimensional(vetores)",
 * ou multidimensional(matriz), porém os dados armazenados e de um mesmo tipo.
 */
// a primeira possição do array esta no indice 0
public class Array {
	public static void main(String[] args) {
		
		int[] meuArray = {1,2,3,4,5,8};
		System.out.print("Vetor:");
		int count = 0;
		
		while(count < meuArray.length) {
			
			System.out.print(meuArray[count] + " ");
			count++;
		}
		
		System.out.print("\nVetor:"); //ordem inversa
		for(int i = (meuArray.length - 1); i >= 0 ; i--) {
			System.out.print(meuArray[i] + " ");
		}
		
		
	}
}
