package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double A = sc.nextDouble();
		
		double area = 3.14159 * Math.pow(A, 2.0);
		
		System.out.printf("A= %.4f%n", area);
		
	}

}
