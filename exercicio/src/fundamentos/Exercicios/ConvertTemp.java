package fundamentos.Exercicios;

import java.util.Scanner;

/*
	 * 	Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
	 */
public class ConvertTemp {
	public static void main(String[] args) {
		double fahr=0,celc=0,convercao,temp;
		String setTemp;
		Scanner dado = new Scanner(System.in);
			
		System.out.println("Qual a unidade da temperatura que voce deseja mudar se Celcius(C) se Fahrenheit(F)?");
		setTemp = dado.next();
		//next = nexline.trim
		System.out.println("Qual a temperatura que voce deseja converter?");
		temp = dado.nextDouble();
		
		temp = (setTemp.equalsIgnoreCase("F")) ? (fahr = temp) : (celc = temp);
		
		final double F_FAHR = (9*celc + 160 ) / 5;
		final double F_CELC = (5*fahr - 160) / 9 ;
		
		convercao = (setTemp.equalsIgnoreCase("C")) ? F_FAHR : F_CELC;

		
		System.out.printf("A temperatura %.2f %s convertida fica %.2f",temp,setTemp,convercao);
				
		
		dado.close();
	}
}
