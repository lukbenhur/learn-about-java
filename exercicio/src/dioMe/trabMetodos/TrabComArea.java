package dioMe.trabMetodos;

import java.util.Scanner;

/*
 * sobrecarga � a possibilidade de usar o mesmo metodo para funcionalidades distintas apenas mudando o parametro
 * por exp. o metodo SYSO println(); e um exemplo de sobrecarga pois ele mantem o mesmo nome e pode realizar funcionalidades disferentes
 */
/*
 * criar uma aplica�ao que calcula a area dos 3 quadrilateros
 * quadrado retangula e trapezio.
 * 
 * Atrapezio = B + b * h / 2
 * quadrado =  lado x lado
 * retangulo = base x altura
 */
public class TrabComArea {
	public static void main(String[] args) {
		String tipo;
		double B, b, a, lado,area;
		Scanner dado =  new Scanner(System.in);
		
		System.out.println("Qual o quadril�tero not�vel que voc� deseja calcular?");
		tipo = dado.nextLine().toLowerCase();
		
		switch (tipo) {
		case "quadrado":
			System.out.println("Qual o valor do lado do quadrado?");
			lado = dado.nextDouble();
			area = Area.area(lado);
			System.out.println(area);
			break;
			
		case "retangulo":
			System.out.println("qual o valor da base");
			B = dado.nextDouble();
			System.out.println("qual o valor da altura");
			a = dado.nextDouble();
			area = Area.area(B, a);
			System.out.println(area);
			break;
			
		case "trapezio":
			System.out.println("qual o valor da base maior?");
			B = dado.nextDouble();
			System.out.println("qual o valor da base menor?");
			b = dado.nextDouble();
			System.out.println("qual o valor da altura?");
			a = dado.nextDouble();
			area = Area.area(B, b, a);
			System.out.println(area);
			break;
			default:
				System.out.println("Realize uma operaçao valida!");
			
		}
		
		dado.close();
	}
}
