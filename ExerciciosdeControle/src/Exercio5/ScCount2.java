package Exercio5;

import java.util.Scanner;

public class ScCount2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int num = 0;

			System.out.println("Digite um número de 1 a 10: ");
			num = sc.nextInt();

			switch (num) {
			case 1: {
				System.out.println("Um");
				break;
			} 

			case 2: {
				System.out.println("Dois");
				break;
			}
			case 3: {
				System.out.println("Três");
				break;
			}
			case 4: {
				System.out.println("Quatro");
				break;
			}
			case 5: {
				System.out.println("Cinco");
				break;
			}
			case 6: {
				System.out.println("Seis");
				break;
			}
			case 7: {
				System.out.println("Sete");
				break;
			}
			case 8: {
				System.out.println("Oito");
				break;
			}

			case 9: {
				System.out.println("Nove");
				break;
			}
			case 10:
				System.out.println("Dez");
				break;

			}
		}

	}
}