package classes;

public class Professor extends Pessoa{
	private String registro;
	private String categoria;
	private double salarioBase;

	

	public String getRegistro() {
		return registro;
	}



	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public double getSalarioBase() {
		return salarioBase;
	}



	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}



	public double salario(double aumento) {
		double aumentosalario = this.getSalarioBase() + aumento;
		return aumentosalario;
	}



}
