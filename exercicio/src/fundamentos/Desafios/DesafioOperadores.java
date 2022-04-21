package fundamentos.Desafios;

public class DesafioOperadores {
	public static void main(String[] args) {
		boolean trab1,trab2,sorvete;
		trab1 = false;
		trab2 = false;
		sorvete = false;
		
		if(trab1 && trab2) {
			System.out.println("vamos comprar uma TV de 50 polegadas! e vamos tomar sorvete!!");
			sorvete = true;
		}else if (trab1 ^ trab2) {
			System.out.println("Vamos comprar a TV de 32 polegas e vamos tomar sorvete!!");
			sorvete = true;
		}else {
			System.out.println("Infelizmente os jobs nao deram certo e nao vamos tomar sorvete");
			sorvete = false;
		}
		
		if (sorvete) {
			System.out.println("Parabens pelo sorvete");
		}
	}

	
}
