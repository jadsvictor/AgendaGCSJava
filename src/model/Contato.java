package model;

public class Contato {
	
	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	private int idade;
	
	public Contato(){

	}
	
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone
				+ ", endereco=" + endereco + ", email=" + email + ", idade="
				+ idade + "]";
	}



	public Contato(String nome, String telefone, String endereco, String email,
			int idade) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	

}
