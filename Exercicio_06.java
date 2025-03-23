package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner fk = new Scanner(System.in);
		
		double A = fk.nextDouble();
		double B = fk.nextDouble();
		double C = fk.nextDouble();
		
		double triangulo = ((A * C) / 2.0);
		double circulo = (Math.pow(C, 2.0) * 3.14159);
		double trapezio = (((A + B) * C) / 2.0);
		double quadrado = Math.pow(B, 2.0);
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
	}

}
