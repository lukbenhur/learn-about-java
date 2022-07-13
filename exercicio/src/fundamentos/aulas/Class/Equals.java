package fundamentos.aulas.Class;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "pedro Silva";
		u1.email = "Pedro.silva@ezemail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "pedro Silva";
		u2.email = "Pedro.silva@ezemail.com";
		
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2)); //metodo equals implementado na classe Usuario
		System.out.println(u2.equals(u1)); // nao tem a implementacao default
		//System.out.println(u1.equals(new Date())); //retorna false pois a instancia date nao e da classe usuario
		
		String u = "lucas";
		String u3 = new String("lucas");
		
		System.out.println(u == u3);
		System.out.println(u.equals(u3));
			
	}
}
