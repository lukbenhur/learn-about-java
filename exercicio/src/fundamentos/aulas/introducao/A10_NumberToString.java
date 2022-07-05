package fundamentos.aulas.introducao;

import javax.swing.JOptionPane;

public class A10_NumberToString {
	public static void main(String[] args) {
		//converter variavel do tipo numero para tipo string
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n�mero:").replace(",",".");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo n�mero:").replace(",",".");
		//System.out.println(valor2 + valor2); o metodo showInputDialog retorna uma sting sendo impossivel realizar opera�ao matematica;
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		double soma = num1 + num2;
		double media = (num1 + num2) / 2;
		System.out.println("A media �: " + media + " e a soma �: " + soma);
		
		
		
	}
}
