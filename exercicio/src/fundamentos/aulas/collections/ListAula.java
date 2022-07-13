package fundamentos.aulas.collections;

import java.util.ArrayList;
import java.util.List;

/*
 * é ordenada , e indexada ,aceita repeticao
 */
public class ListAula {
	public static void main(String[] args) {
		List<Usuarios> lista = new ArrayList<>();
		Usuarios u1 = new Usuarios("Ana");
		lista.add(u1);
		lista.add(new Usuarios("Ana")); //aceita repetição
		lista.add(new Usuarios("Lucia"));
		lista.add(new Usuarios("Souza"));
		lista.add(new Usuarios("Acacio"));
		
		System.out.println(lista.get(3)); //pega o elemento pelo indice
		System.out.println(lista.remove(2)); //retorna o elemento excluido
		System.out.println(lista.remove(new Usuarios("Acacio"))); //retorna um valor booleano
		System.out.println();
		System.out.println("Tem?" + lista.contains(new Usuarios("Ana")));
		System.out.println();
		
		
		for (Usuarios usuarios : lista) {
			System.out.println(usuarios);
		}
		
	}
}
