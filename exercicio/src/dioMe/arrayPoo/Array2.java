package dioMe.arrayPoo;

/*
 * programa ler um vetor de 6 (ou mais) caracteres e diga quantas consoantes foram lidar
 * imprima as consoantes;
 */
public class Array2 {
	private static char undefined;

	public static void main(String[] args) {
		char[] consoante = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','t','q','z','x','r','u'};
		char[] consoantes = new char[20];
		int consoant=0,count=0,i = 0;
	
		while (count < consoante.length) {

			switch (consoante[count]) {
			case 'a':
				break;
			case 'e':
				break;
			case 'i':
				break;
			case 'o':
				break;
			case 'u':
				break;
			default:
				consoant++;
				consoantes[i] = consoante[count];
				i++;
			}

			count++;
		}
		System.out.println("numero de consoantes encontradas: " + consoant);

		for (int counter = 0; counter < consoantes.length; counter++) {
			if (consoantes[counter] != undefined) {
				System.out.print("\n consoantes econtrada: " + consoantes[counter]);
			}
		}
	}
}