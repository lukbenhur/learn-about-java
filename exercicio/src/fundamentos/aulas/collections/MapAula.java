package fundamentos.aulas.collections;

import java.util.HashMap;
import java.util.Map;

public class MapAula {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Lucas");
		usuarios.put(2, "Rafael");
		usuarios.put(20, "Ricardo");
		usuarios.put(66, "Ana");
		
		System.out.println(usuarios);
	}
}
