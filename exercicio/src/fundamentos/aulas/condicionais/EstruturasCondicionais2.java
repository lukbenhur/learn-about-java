package fundamentos.aulas.condicionais;

import javax.swing.JOptionPane;

public class EstruturasCondicionais2 {
	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Informe um número: ");
		
		int valor = Integer.parseInt(numero);
		
		if(valor%2 == 0) {
			System.out.println("O numero digitado é par");
		}else {
			System.out.println("O numero digitado é impar.");
		}
	}
}
