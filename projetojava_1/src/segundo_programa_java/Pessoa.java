package segundo_programa_java;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String genero;
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected int getIdade() {
		return idade;
	}
	protected void setIdade(int idade) {
		this.idade = idade;
	}
	protected String getDataNascimento() {
		return dataNascimento;
	}
	protected void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	protected String getGenero() {
		return genero;
	}
	protected void setGenero(String genero) {
		this.genero = genero;
	}
	public Pessoa() {
		super();
	}
	
	
}
