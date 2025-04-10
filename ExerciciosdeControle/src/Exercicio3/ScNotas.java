package Exercicio3;

import java.util.Scanner;

public class ScNotas {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			String nome = "";
			double nota1 = 0;
			double nota2= 0;
			double nota3= 0;
			
			
			System.out.println("Digite o nome do Aluno: ");
			nome = sc.next();
			
			System.out.println("Digite a primeira nota: ");
			nota1 = sc.nextDouble();
			
			System.out.println("Digite a segunda nota: ");
			nota2 = sc.nextDouble();
			
			System.out.println("Digite a terceira nota: ");
			nota3 = sc.nextDouble();
			
			double media = (nota1 + nota2 + nota3)/3;

				
			System.out.println("A média do aluno(a) " +nome+ " é igual a: "  +media+ " ");
			
			if (media> 6.0) {
			System.out.println("Aprovado!");
			} else if (media < 6.0){
			System.out.println("Reprovado!");
}
		}	
  }
}


