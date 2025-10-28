package cursojava.executavel;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		System.out.println("Ola Mundo!");
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite: ");
		String dado = ler.nextLine();
		System.out.println(dado);
		ler.close();
		
		String dado2 = JOptionPane.showInputDialog(null, "Escreva algo");
		JOptionPane.showMessageDialog(null, dado2);
		
		
		
		
	}
}
