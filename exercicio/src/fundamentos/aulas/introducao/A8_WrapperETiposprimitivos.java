package fundamentos.aulas.introducao;

import java.util.Scanner;

public class A8_WrapperETiposprimitivos {
	public static void main(String[] args) {
		/*tudo no Java e baseado em Classes//Objetos e tipos primitivos;
		 * 			Scanner dado = new Screen(System.in); instanciando o objeto para entradas de dados ; e importanto 
		 * 	Wrapper capacidade de "envolver" tipos primitivos em classes e usar metodos 
		 */
		
		//tipos primitivos
		byte x = 123;
		short y = 1000;
		int z = 1000000000;
		long w = 10000000000L;
		float a = 123.34F;
		double k = 1233.333;
		boolean p = true;//false
		char j = 'B'; //so recebe um character e entre aspa simples;;
		
		
		//tipos primitivos com Wrapper
		Byte b = 123;
		Short s = 1234;
		Integer i = 123456;
		Long l = 12345678L;
		Float f = 123.123F;
		Double d = 123.1234;
		Boolean bo = true;
		Character c = 'C';
	
		System.out.println(bo.toString().toUpperCase()); //pego o valor da variavel bo (boobleano) transformo em uma string e tranformo p caixa alta
		//System.out.println(b.toString() * 10); //impussivel fazer opera��o pois embora a variavel b seja number quando se usa o metodo tostring a transforma em string.
		System.out.println(b * 10);
	}
}
