package fundamentos.Exercicios;

import java.util.Scanner;

public class B1_1_Exercices {
	
	public static void main(String[] args) {
		int n1,n2,n3,n4,soma;
		Scanner dado = new Scanner(System.in);
		n1 = dado.nextInt();
		n2 = dado.nextInt();
		n3 = dado.nextInt();
		n4 = dado.nextInt(); 
		soma = n1+n2+n3+n4;
		System.out.println(soma);
		
		dado.close();
	}
}
