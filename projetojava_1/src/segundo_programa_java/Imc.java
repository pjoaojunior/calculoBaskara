package segundo_programa_java;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Imc {
	double peso;
	double altura;
	double valorImc;

	public Imc() {
	}

	public Imc(double peso, double altura, double imc) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.valorImc = imc;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getValorImc() {
		return valorImc;
	}

	public void setValorImc(double valorImc) {
		this.valorImc = valorImc;
	}

	public void calcImc(double peso, double altura) {
		System.out.println(peso);
		System.out.println(altura);
		this.valorImc = peso / (altura * altura);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("seu IMC é: " + formatador.format(valorImc));

	}

	public void seuImc() {
		DecimalFormat formatador = new DecimalFormat("0.00");
		if (this.valorImc <= 18.5) {
			JOptionPane.showMessageDialog(null, "Seu IMC é: " + formatador.format(this.getValorImc())
					+ " ,e você está abaixo do peso ideal para a sua altura");
		}
		if ((this.valorImc >= 18.6) && (this.valorImc <= 24.9)) {
			JOptionPane.showMessageDialog(null, "Seu IMC é: " + formatador.format(this.getValorImc())
					+ " ,você está no peso ideal para a sua altura");
		}
		if ((this.valorImc >= 25) && (this.valorImc <= 29.9)) {
			JOptionPane.showMessageDialog(null,
					"Seu IMC é: " + formatador.format(this.getValorImc()) + " ,você está levemente acima do peso");
		}
		if ((this.valorImc >= 30) && (this.valorImc <= 34.9)) {
			JOptionPane.showMessageDialog(null,
					"Seu IMC é: " + formatador.format(this.getValorImc()) + " ,você está com obesidade Grau I");
		}
		if ((this.valorImc >= 35) && (this.valorImc <= 39.9)) {
			JOptionPane.showMessageDialog(null, "Seu IMC é: " + formatador.format(this.getValorImc())
					+ " ,você está com obesidade Grau II, do tipo severa");
		}
		if (this.valorImc >= 40) {
			JOptionPane.showMessageDialog(null, "Seu IMC é: " + formatador.format(this.getValorImc())
					+ " ,você está com obesidade Grau III do tipo mórbida");
		}

	}
}
