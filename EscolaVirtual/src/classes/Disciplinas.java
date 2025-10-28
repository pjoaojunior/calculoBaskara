package classes;

import java.util.ArrayList;

public class Disciplinas {
	protected String nomeDisciplina;
	protected double nota;
	protected Professor professor;
	public ArrayList<Double> notas = new ArrayList<Double>();
	public ArrayList<Double> frequencias = new ArrayList<Double>();
	protected double mediaFrequencia; 
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public ArrayList<Double> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}
	public ArrayList<Double> getFrequencias() {
		return frequencias;
	}
	public void setFrequencias(ArrayList<Double> frequencias) {
		this.frequencias = frequencias;
	}
	
	public Disciplinas() {
		super();
	}
	
	
	
}
