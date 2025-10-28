package classes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
	public int matricula;
	public double media;
	public Disciplinas disciplina;
	
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public Aluno() {
		super();
	}

	/*
	 * public Aluno(double notas) { this.notas = new ArrayList<>(); }
	 */

	public void verificaIdade(int idade) { 
	  switch (idade) {
	  case 5:
	     JOptionPane.showMessageDialog(null,"O aluno não pode se matricular no Ensino Fundametal.");
	  break;
	  
	  case 6:
	   JOptionPane.showMessageDialog(null,"O aluno pode ser matriculado no Ensino Fundametal , 1º ano");
	   break;
	  
	  case 7:
	   JOptionPane.showMessageDialog(null,"O aluno pode ser matriculado no Ensino Fundametal , 2º ano");
	   break;
	  
	  case 8:
	   JOptionPane.showMessageDialog(null,"O aluno pode ser matriculado no Ensino Fundametal , 3º ano");
	   break; 
	   
	  case 9:
	   JOptionPane.showMessageDialog(null,"O aluno pode ser matriculado no Ensino Fundametal , 4º ano");
	   break;
	   
	  case 10:
	   JOptionPane.showMessageDialog(null,"O aluno pode ser matriculado no Ensino Fundametal , 5º ano"); 
	  break;
	  
	  case 11:
	   JOptionPane.showMessageDialog(null,"O aluno pode ser matriculado no Ensino Fundamental (Anos Finais, 6º ano)");
	  break;
	  
	  case 12:
	   JOptionPane.showMessageDialog(null,"O aluno pode ser matriculado no Ensino Fundamental, anos Finais, 7º ano"); 
	  break;
	  
	  case 13:
	   JOptionPane.showMessageDialog(null,"O aluno pode ser matriculado no Ensino Fundamental, anos Finais, 8º ano");
	  break; 
	   
	  case 14:
	   JOptionPane.showMessageDialog(null,"O aluno pode ser matriculado no Ensino Fundamental, anos Finais, 9º ano");
	  break; 
	   
	  case 15:
	   JOptionPane.showMessageDialog(null,"O aluno pode ser matriculado no Ensino Medio , 1º ano"); 
	   break; 
	   
	  case 16:
	   JOptionPane.showMessageDialog(null,"O aluno pode ser matriculado no Ensino Médio , 2º ano");
	  break;
	   
	  case 17:
	   JOptionPane.showMessageDialog(null,"O aluno pode ser matriculado no Ensino Médio , 3º ano");
	  break;
 }
	  }

	public void adcionarNotas(double nota) {
		disciplina.notas.add(nota);

	}

	public void adcionarFrequencia(double frequencia) {
		disciplina.frequencias.add(frequencia);
	}

	public double calculaFrequancia() {
		if (disciplina.frequencias.isEmpty()) {
			return 0.0;
		} else {
			double freq = 0.0;
			for (double f : disciplina.frequencias) {
				freq += f;
			}
			disciplina.mediaFrequencia = freq / disciplina.frequencias.size();
			return disciplina.mediaFrequencia;
		}
	}

	public double calculaMedia() {
		if (disciplina.notas.isEmpty()) {
			return 0.0;
		} else {
			double soma = 0;
			for (double n : disciplina.notas) {
				soma += n;
			}
			media = soma / disciplina.notas.size();
			return media;

		}
	}

	public void imprimeMedia() {
		System.out.println(media);
	}

	public void verificaAprovacao() {
		if ((disciplina.mediaFrequencia >= 75) && (media >= 8)) {
			System.out.println("Aluno Aprovado");
		} else {
			if ((disciplina.mediaFrequencia >= 75) && (media >= 4)) {
				System.out.println("Aluno pode realizar exame final");
			} else {
				System.out.println("Aluno Reprovado");
			}
		}
	}

	@Override
	public String toString() {
		return "Aluno Nome= "+this.getNome() + ";\n"
			 + "matricula=" + matricula +";"
			 + "Notas=" + disciplina.getNotas() + ";\n"
			 + "Media=" + media + "; \n"
			 + "Frequencia="+ disciplina.mediaFrequencia+";\n";
			 
	}

	

}
