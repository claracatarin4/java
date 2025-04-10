package Exercicio1;

import java.util.Scanner;


public class ExScanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira palavra: ");
		String firstword1 = sc.next();
		System.out.println("A palavra um é: "+firstword1);
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Digite a segunda palavra: ");
		String secondword2 = sc.next();
		System.out.println("A palavra um é: "+secondword2);
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Digite a terceira palavra: ");
		String thirdword3 = sc.next();
		System.out.println("A palavra um é: "+thirdword3);
		System.out.println("------------------------------------------------------------------");
		sc.close();
		
		System.out.println(" "+firstword1+ " " +secondword2+ " " +thirdword3+"");
	}
}
