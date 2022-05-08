package dioMe;

import java.util.Scanner;

public class Metodos {
	public static void main(String[] args) {
		char operacao;
		double x,y;
		Scanner dado = new Scanner(System.in);
		System.out.println("realize as operaçoes basicas, qual operaçao voce deseja executar?");
		operacao = dado.next().charAt(0);
		System.out.println("digite o primeiro numero");
		x = dado.nextDouble();
		System.out.println("digite o segundo numero");
		y = dado.nextDouble();
		dado.close();
		
		Operac.operac(operacao, x, y);
		
}	
}