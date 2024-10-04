package PrimoFibonacci;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		int y = 1;
		int z = 1;
		int v = 1;
		System.out.println("insira o numero de vezes para executar a sequencia: ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			int soma = x + y + z + v;
			x = y;
			y = z;
			z = v;
			v = soma;
			System.out.println(x + " + " + y + " + " + z + " + " + v + " = " + soma);
		}
		sc.close();
	}
}
