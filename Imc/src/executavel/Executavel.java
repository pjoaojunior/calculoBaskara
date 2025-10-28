package executavel;

import javax.swing.JOptionPane;

import classes.Imc;



public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int continuar = 0;
		do {
			Imc imc = new Imc();

			double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "digite seu peso. "));
			double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "digite sua altura. "));

			imc.setPeso(peso);
			imc.setAltura(altura);

			imc.calcImc(peso, altura);
			imc.seuImc();

			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar? ");

		} while (continuar == 0);

		JOptionPane.showMessageDialog(null, "Fim do Programa.");
	}

}