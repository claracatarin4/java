package Exercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffClass {
	
public static void main(String[] args) throws IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String firstword = "";
		String secondword = "";
		String thirdword = "";
		
		System.out.println("Digite a primeira palavra: ");
		firstword = sc.readLine();
		System.out.println("A palavra um é: "+firstword);
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Digite a segunda palavra: ");
		secondword = sc.readLine();
		System.out.println("A palavra dois é: "+secondword);
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Digite a terceira palavra: ");
		thirdword = sc.readLine();
		System.out.println("A palavra três é: "+thirdword);
		System.out.println("------------------------------------------------------------------");
		
		System.out.println(" "+firstword+ " " +secondword+ " " +thirdword+"");
	}
}
