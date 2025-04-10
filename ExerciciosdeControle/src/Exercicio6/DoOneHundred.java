package Exercicio6;
import javax.swing.JOptionPane;

public class DoOneHundred {
	public static void main(String[] args) {
			 
		String nome = "";
		int count = 0;
		nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
			
		do {
			System.out.println(nome);
			
		} while (count < 100);
			
	}
	
}
