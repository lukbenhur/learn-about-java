package fundamentos.aulas.collections;
/*
 * equal e hashCode andam junto na implementacao de igualdade de objetos
 */
public class Equals {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "caneta";
		
		Produto p2 = new Produto();
		p2.nome = "caneta";
		System.out.println(p1 == p2); // compara os enderecos de memoria
		System.out.println(p1.equals(p2));	// por default tem o mesmo comportamento do "==" retorna um boolean
		
		System.out.println(p1.hashCode()); // retorna um valor int 
		System.out.println(p2.hashCode()); // retorna um valor int 
		
	}
}



class  Produto{
	String nome = "";
}