package Exercicio_Pousada;

public class Clientes {
	private String nome = new String();
	private String email;
	
	
	public Clientes(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public String toString() {
		return nome + ", email: " + email;
	}
	
	
}
