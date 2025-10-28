package principal;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Professor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá Mundo!!!!");
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(JOptionPane.showInputDialog("Digite seu nome."));
		aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade.")));
		aluno1.verificaIdade(aluno1.getIdade()); 
		
		for(int i = 0; i <4; i++) {
			double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a "+ (1+i)+"ª"+"nota do aluno"));
			double frequencia = Double.parseDouble(JOptionPane.showInputDialog("Digite a "+ (1+i)+"ª"+"frequencia do aluno"));
			aluno1.adcionarNotas(nota);
			aluno1.adcionarFrequencia(frequencia);
			
			alunos.add(aluno1);
		}
		
		aluno1.imprimeMedia();
		aluno1.calculaFrequancia();
		//System.out.println(aluno1.toString());
	    aluno1.verificaAprovacao();
	    
	    	    
	    
	}

}
