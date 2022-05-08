package dioMe;

public class Operac {
	
	public static void operac(char operacao,double x ,double y) {

		switch (operacao) {
		
		case '/': 
			double v = Operacoes.div(x,y);
			System.out.println(v);
			break;
		
		case '*': 
			double kv = Operacoes.mult(x,y);
			System.out.println(kv);
			break;
		
		case '-': 
			double lv = Operacoes.sub(x,y);
			System.out.println(lv);
			break;
		
		case '+': 
			double tv = Operacoes.soma(x,y);
			System.out.println(tv);
			break;

		default:
			System.out.println("operaçao invalida  " + operacao);
		}
	}
}