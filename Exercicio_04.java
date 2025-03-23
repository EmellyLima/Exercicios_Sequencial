package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner lc = new Scanner(System.in);
		
		int ID = lc.nextInt();
		int horas = lc.nextInt();
		double valor = lc.nextDouble();
		
		double salario = horas * valor;
		
		System.out.println("NUMBER: " + ID);
		System.out.printf("SALARY= R$ %.2f%n", salario);
		
	}

}
