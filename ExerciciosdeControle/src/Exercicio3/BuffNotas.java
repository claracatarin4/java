package Exercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffNotas {
public static void main(String[] args) throws IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String nome = "";
		double nota1 = 0;
		double nota2= 0;
		double nota3= 0;
		
		
		System.out.println("Digite o nome do Aluno: ");
		nome = sc.readLine();
		
		System.out.println("Digite a primeira nota: ");
		nota1 = Double.parseDouble(sc.readLine());
		
		System.out.println("Digite a segunda nota: ");
		nota2 = Double.parseDouble(sc.readLine());
		
		System.out.println("Digite a terceira nota: ");
		nota3 = Double.parseDouble(sc.readLine());
		
		double media = (nota1 + nota2 + nota3)/3;

			
		System.out.println("A média do aluno(a) " +nome+ " é igual a: "  +media+ " ");
		
		if (media> 6.0) {
		System.out.println("Aprovado!");
	} else if (media < 6.0){
		System.out.println("Reprovado!");
	}	
  }
}
