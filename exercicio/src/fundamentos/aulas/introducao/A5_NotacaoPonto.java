package fundamentos.aulas.introducao;

public class A5_NotacaoPonto {

	public static void main(String[] args) {

		String nome = "X � bonit�o";
			nome = nome.replace("X", "Lucas");
			nome = nome.toUpperCase();
			nome = nome.concat("!!!:D");
		System.out.println(nome);

		String nome1 = "X � bonit�o".replace("X","Lucas").concat("!!!:C").toUpperCase(); //posso quebrar linha antes ou depois do ponto;;
		System.out.println(nome1);
		
		
		//tipos primitivos nao receber metodos com o operador ".";
		
		System.out.println("lucas"); //esse comando de saida quebra linha;
		System.out.print("lucas"); // esse comando nao quebra linha , o cursos fica logo ao lado; 
	}	
}
