package fundamentos.aulas.condicionais;

import java.util.Scanner;

public class EstruturasCondicionais {
	public static void main(String[] args) {
		double nota;
		String convertNota;
		//String aprovado;
		Scanner dado = new Scanner(System.in);

		System.out.println("Digite a nota do aluno: ");
		convertNota = dado.next().replace(",",".");
		nota = Double.parseDouble(convertNota);
		
		// aprovado = (nota >=7)?"aprovado":"reprovado"; usando operador ternario para
		// fazer uma condicional, nao e tao adequado.
		// System.out.println(aprovado);

		if (nota >= 7 && nota <= 10) { 						// operador IF recebe expreções que retornam true//false executando o bloco de codigo a seguir;
			System.out.println("Parabéns, aluno aprovado!");
		}else if(nota < 7 && nota >= 4.5) {
			System.out.println("O aluno está de recuperação.");
		}else if (nota >= 0 && nota < 4.5) {
			System.out.println("Aluno está reprovado");
		}
		dado.close();
	}
}
