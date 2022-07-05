package fundamentos.aulas.introducao;

public class A3_Inferencias {
	public static void main(String[] args) {
		/* capacidade do java que eu posso declarar uma variavel usando a palavra reservada VAR
		 * sem especificar o tipo de dado que eu vou colocar na variavel , por�m o ao decalrar a variavel
		 * tenho que atribuir um valor a ela, e o java por meio de inferencia especifica que dado 
		 * sera guardado naquele espa�o que nao poder� mudar;;
		 */
		double a = 12.9;
		System.out.println(a);
		
		var b = 12.3; //fica implicito ao java que esse var guarda sempre numeros float//double
		System.out.println(b);
		b=13; //o numero inteiro 13 sera convertido em float (13.0)
		System.out.println(b);
		//b = "lucas"; //impossivel colocar uma string numa variavel que por inferencia especificou o tipo como sendo double//float
		System.out.println(b); //error de type , o java nao consegue converter uma string em double;;
	} 
}
