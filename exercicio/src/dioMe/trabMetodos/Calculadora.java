package dioMe.trabMetodos;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		char operacao;
		double x,y;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("realize as opera�oes basicas, qual opera�ao voce deseja executar?");
		operacao = dado.next().charAt(0);
		
		System.out.println("digite o primeiro numero");
		x = dado.nextDouble();
		
		System.out.println("digite o segundo numero");
		y = dado.nextDouble();
		dado.close();
		
		Operac.operac(operacao, x, y);
		
}	
}