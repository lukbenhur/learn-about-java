package fundamentos.Desafios;

/*
 * fazer uma arvore com # sem usar valor numerico para controlar o laço
 */
public class DesafioFor {
	public static void main(String[] args) {
		String valor = "#";
		
		for(boolean a = true; a == true ;) {
			System.out.println(valor);
			valor += "#";
			if(valor.equalsIgnoreCase("######")) {
				a = false;
			}
		}
	}
}
