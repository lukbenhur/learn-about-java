package dioMe;
/*
 * 3 metodos "iguais" com mesmo nome porem distintos pois a assinatura deles e distinta :> ass = nome + parametro;
 */
public class Area {

	public static double area(double lado) {
		return lado * lado;

	}
	
	public static double area(double B ,double a) {
		return B * a;

	}
	
	public static double area(double B ,double b, double a) {
		return ((B + b )* a) / 2;

	}
}
