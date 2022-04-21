package fundamentos.aulas;

import java.util.Date;
import java.util.Scanner;

public class A6_Import {
	public static void main(String[] args) {
		Date x;
		x = new Date();
		System.out.println(x);
		//////////////////////
		Date u = new Date();
		System.out.println(u);
		////////////////////// 
		int z;
		Scanner dado;
		dado = new Scanner(System.in);
		z = dado.nextInt();
		System.out.println(z);
		////////////////////////
		int y;
		Scanner dado1 = new Scanner(System.in);
		y = dado1.nextInt();
		System.out.println(y);
		dado.close();
		dado1.close();
	}
}
