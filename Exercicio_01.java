package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int soma = X + Y;
		
		System.out.println("SOMA = " + soma);

	}

}
