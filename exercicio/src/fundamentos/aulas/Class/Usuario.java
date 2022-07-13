package fundamentos.aulas.Class;

public class Usuario {
	String nome;
	String email;

	public boolean equals(Object objeto) {

		if (objeto instanceof Usuario) { //verifica se o objeto passado como parametro e uma instancia de usuario

			Usuario outro = (Usuario) objeto;

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual;
		}else {
			return false;
		}

	}

}