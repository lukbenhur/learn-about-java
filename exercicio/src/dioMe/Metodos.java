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
		operac(operacao, x, y);
		
	}

	public static void operac(char operacao,double x ,double y) {

		switch (operacao) {
		
		case '/': 
			double v = Operacoes.div(x,y);
			System.out.println(v);
			break;
		
		case '*': 
			double kv = Operacoes.mult(x,y);
			System.out.println(kv);
			break;
		
		case '-': 
			double lv = Operacoes.sub(x,y);
			System.out.println(lv);
			break;
		
		case '+': 
			double tv = Operacoes.soma(x,y);
			System.out.println(tv);
			break;

		default:
			System.out.println("operaçao invalida  " + operacao);
		}
		
		
	}
}