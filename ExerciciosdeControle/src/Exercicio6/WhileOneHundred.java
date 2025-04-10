package Exercicio6;
import javax.swing.JOptionPane;

public class WhileOneHundred {
	public static void main(String[] args) {
		
		String nome = "";
		int count = 0;
		nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
		
		while (count< 100) {
			System.out.println(nome);
			count++;
		}
		
	}

}
