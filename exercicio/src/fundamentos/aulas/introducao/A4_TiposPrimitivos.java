package fundamentos.aulas.introducao;

public class A4_TiposPrimitivos {
	
	public static void main(String[] args) {
		//dados numericos inteiros
		byte a = 127; //o byte vai de -128 a 127
		short b = 30000; //vai de 0 a 65.535
		int c = 2_000_000_000; // pouca mais de -2b ate +2b
		long d = 3000000000L; //se passar o limite do inte tenho q mostra explifcitamente que e do tipo long usando L no final do numero;
		//dados numericos flutuantes
		float e = 3.12F; //preciso usar o F no final 
		double f = 3.12;
		//dados l�gicos
		boolean g = true; //false
		//caracteres
		char h = 'B'; //mostrado em aspa simples e so uma letra
		
		String i = "Lucas"; // a String n�o � um tipo primitivo;;
		System.out.println(i);
		System.out.println(h); 
	}
}
