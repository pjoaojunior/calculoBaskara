package principal;

import classes.CalculoBaskara;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculoBaskara b = new CalculoBaskara();
		b.calculoBaskara(1, -3, 2);
		
		System.out.println("Delta: "+b.D);
		System.out.println("Raiz x1: "+b.x1);
		System.out.println("Raiz x2: "+b.x2);

	}

}
