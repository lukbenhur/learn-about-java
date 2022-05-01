package fundamentos.Exercicios;


import java.util.Scanner;

/*
 * Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
 * Menor que 18,5 kg/m2	Magreza
	18,5 a 24,9 kg/m2	Normal
	25 a 29,9 kg/m2	Sobrepeso
	30 a 34,9 kg/m2	Obesidade grau I
	35 a 39,9 kg/m2	Obesidade grau II
	Maior que 40 kg/m2	Obesidade grau III
 */
public class IMC {
	
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double peso,altura;
		final Double IMC;
		String nome,situacao;
		
		System.out.println("Qual seu nome?");
		nome = dado.nextLine();
		System.out.println("Qual sua altura?");
		altura = dado.nextDouble();
		System.out.println("Qual o seu peso?");
		peso = dado.nextDouble();
		
		IMC = (peso / (altura*altura));
		/*
		 * implement conditional* without using if/else , for training .
		 */
		situacao = (IMC < 18.5) ? "Magro" : "0" ;
		situacao = (18.5 <= IMC && IMC<= 24.9) ? "normal" : situacao;
		situacao = (25.0 <= IMC && IMC<= 29.9) ? "com Sobrepeso" : situacao;
		situacao = (30 <= IMC && IMC<= 34.9) ? "com Obesidade grau I" : situacao;
		situacao = (35 <= IMC && IMC <= 39.9) ? "com Obesidade grau II" : situacao;
		situacao = (IMC > 40) ? "com Obesidade grau III" : situacao;
		
		System.out.printf("%s, o seu indice de massa corporal é: %.2f, Você esta %s.",nome,IMC,situacao);
		dado.close();
	}
}
