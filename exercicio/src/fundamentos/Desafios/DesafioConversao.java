package fundamentos.Desafios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		String sal1,sal2,sal3;
		double media,soma;
		Scanner dado = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.##");
		System.out.println("Digite o primeiro sal?rio: ");
		sal1 = dado.nextLine().replace(",",".");
		System.out.println("Digite o segundo sal?rio: ");
		sal2 = dado.nextLine().replace(",",".");
		System.out.println("Digite o terceiro sal?rio: ");
		sal3 = dado.nextLine().replace(",",".");
		dado.close();
		double salario1 = Double.parseDouble(sal1);
		double salario2 = Double.parseDouble(sal2);
		double salario3 = Double.parseDouble(sal3);
		
		soma = salario1 + salario2 + salario3;
		media = soma / 3;
		System.out.println("A media dos salarios do funcionario ? de: R$"+format.format(media));
	}
}
