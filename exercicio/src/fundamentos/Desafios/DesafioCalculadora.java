package fundamentos.Desafios;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * ler dois numeros e ler a opera�ao que o usuario quer e apresentar o resultado
 */
public class DesafioCalculadora {
	public static void main(String[] args) {
		double num1,num2,resultadoFinal;
		String operacao;
		Scanner dado = new Scanner(System.in);
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro numero:").replace(",","."));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo numero:").replace(",","."));
		
		System.out.println("Qual a opera��o que voc� deseja fazer?");
		operacao = dado.next();
		
		resultadoFinal = "%".equals(operacao)? num1 % num2 : 0;
		resultadoFinal = "*".equals(operacao)? num1 * num2 : resultadoFinal;
		resultadoFinal = "/".equals(operacao)? num1 / num2 : resultadoFinal;
		resultadoFinal = "-".equals(operacao)? num1 - num2 : resultadoFinal;
		resultadoFinal = "+".equals(operacao)? num1 + num2 : resultadoFinal;
		System.out.printf("%.2f %s %.2f = %.2f",num1,operacao,num2,resultadoFinal);
		dado.close();
		
	}
}
	