package fundamentos.Desafios;

import java.util.Scanner;

public class DiaSemana {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Qual o dia da semana que você deseja?");
		String dia = dado.nextLine();
		//mais adequado usar o switch
		if(dia.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		}else if(dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		}else if(dia.equalsIgnoreCase("terca")) {
			System.out.println(3);
		}else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		}else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		}else if(dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		}else if(dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		}
		dado.close();
	}
}
