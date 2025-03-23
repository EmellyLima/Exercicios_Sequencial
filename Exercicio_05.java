package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner hd = new Scanner(System.in);
		
		int pc = hd.nextInt();
		int qtd = hd.nextInt();
		double valor = hd.nextDouble();
		
		int peca = hd.nextInt();
		int quantidade =  hd.nextInt();
		double preco = hd.nextDouble();
		
		double pg = qtd * valor;
		double pagar = quantidade * preco;
		double total = pg + pagar;
		
		System.out.printf(" VALOR A PAGAR: R$ %.2f%n", total);
		

	}

}
