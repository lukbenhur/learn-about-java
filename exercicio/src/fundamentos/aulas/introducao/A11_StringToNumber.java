package fundamentos.aulas.introducao;

import javax.swing.JOptionPane;

public class A11_StringToNumber {
	public static void main(String[] args) {
		
		String dado = JOptionPane.showInputDialog("Ol� Digite um numero").replace(",", ".");
		System.out.println(dado); //o dado aqui esta em formato string
		double x = Double.parseDouble(dado); // converte a saida do optionpane (que é do tipo string) em um tipo double.
		System.out.println(x/2); // a partir da conversao posso realizar opera�oes
		
		double y = Double.parseDouble(JOptionPane.showInputDialog("Olá digite um número:").replace(",", "."));
		//forma resumida de converter de maneira imediata a entrada do optionpane de string para double ,e caso o usuario entre com dado usando , fazer o replace mudando para ".";
		
		System.out.println(y);
		System.out.println(y/2);
	}
}
