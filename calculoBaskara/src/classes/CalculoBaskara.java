package classes;

public class CalculoBaskara {
	public double D;
	public double x1;
	public double x2;

	public double getD() {
		return D;
	}
	public void setD(double d) {
		D = d;
	}
	public double getX1() {
		return x1;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public double getX2() {
		return x2;
	}
	public void setX2(double x2) {
		this.x2 = x2;
	}
	
	public CalculoBaskara() {
		super();
	}
	
	public void calculoBaskara(int a, int b, int c) {
		D = Math.pow(b, 2) - (4*a*c);
		x1 = x2 = Double.NaN; // Not a Number
		if(D < 0) {
			System.out.println("Não exixtem raizes reais!");
		}else {
		x1 = (-b + Math.sqrt(D))/(2*a);
		x2 = (+b + Math.sqrt(D))/(2*a);
		}
	}
	

}
