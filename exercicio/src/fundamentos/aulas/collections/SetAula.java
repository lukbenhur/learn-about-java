package fundamentos.aulas.collections;
/*
 * Set por padrao nao garante a ordem de inclusao (salvo se voce implementar um TreeSet) , nao é indexado , e nao aceita repeticao
 */
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetAula {
	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<>();
		lista.add("Lucas");
		lista.add("Ben-hur");
		lista.add("Souza");
		lista.add("Acacio");
		//System.out.println(lista.size());
		for(String nome : lista) {
			System.out.println(nome);
		}
		System.out.println();
		SortedSet<String> lista2 = new TreeSet<>(); //tem uma ordem de insercao que e a ordem natural das primeiras letras
		lista2.add("Lucas");
		lista2.add("Ben-Hur");
		lista2.add("Souza");
		lista2.add("Acacio");
		
		for(String nome1 : lista2) {
			System.out.println(nome1);
		}
	}
}
