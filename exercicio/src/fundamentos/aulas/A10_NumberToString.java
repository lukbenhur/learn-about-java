package fundamentos.aulas;

import javax.swing.JOptionPane;

public class A10_NumberToString {
	public static void main(String[] args) {
		//converter variavel do tipo numero para tipo string
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:").replace(",",".");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:").replace(",",".");
		//System.out.println(valor2 + valor2); o metodo showInputDialog retorna uma sting sendo impossivel realizar operaçao matematica;
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		double soma = num1 + num2;
		double media = (num1 + num2) / 2;
		System.out.println("A media é: " + media + " e a soma é: " + soma);
		
		
		
	}
}
