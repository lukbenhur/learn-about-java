package fundamentos.aulas.collections;

import java.util.Objects;

public class Usuarios {
	String nome;


	public Usuarios(String nome) {
		this.nome = nome;
	}

	public int hashCode() {
		return Objects.hash(nome);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return Objects.equals(nome, other.nome);
	}
	
	public String toString() {	
		return "Meu nome é " + this.nome +".";
	}
}
