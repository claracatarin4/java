package Exercicio6;
import javax.swing.JOptionPane;

public class JoOneHundred {
	
	public static void main(String[] args) {
		
		 String nome = "";
		 nome = JOptionPane.showInputDialog("Insira um nome: ");
		 
		for (int i = 0; i < 100; i++) {
			System.out.println(nome);
		}
	}
}
