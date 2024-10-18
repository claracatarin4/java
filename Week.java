package exercícios;
import java.util.Scanner;

public class Week {
	
	public int nweek;
	
	Scanner sc = new Scanner(System.in);
	
	public void Inweek() {
		
		System.out.println("insira um dia da semana:");
		nweek = sc.nextInt();
		
	}

	public void semana() {
		
		switch(nweek) {
		
			case 1 :
				System.out.println("domingo!");
				 break;
				
			case 2 :
				System.out.println("segunda-feira!");
				 break;
				
			case 3 :
				System.out.println("terça-feira!");
				 break;
				 
			case 4 :
				System.out.println("quarta-feira!");
				 break;
				
			case 5 :
				System.out.println("quinta-feira!");
				 break;
				
			case 6 :
				System.out.println("sexta-feira!");
				 break;
				
			case 7 :
				System.out.println("sábado!");
				break;
			 
			default:
				
				System.out.println("não é um dia da semana.");
		
		}
	}
	
}
