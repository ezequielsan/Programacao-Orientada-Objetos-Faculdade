package relacionamentos_clube;

public class Socio {
	private String nome;
	
	Socio(String nome) {
		setNome(nome);
	}
	
	public void setNome(String nome) { 
		if(nome == null || nome.length() == 0) 
			throw new RuntimeException("Nome n?o pode ser nulo ou vazio");
		else 
			this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String toString() {
		return this.nome;
	}
	
}
