package Exercicio3;
import javax.swing.JOptionPane;

public class JONotas {
	public static void main(String[] args) {
		
		String nome = "";
		double nota1 = 0;
		double nota2= 0;
		double nota3= 0;
	
		nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota: "));
		
		double media = (nota1 + nota2 + nota3) /3;
		
		String msg = ("A média do aluno(a) " +nome+ " é " +media+ " ");
		JOptionPane.showMessageDialog(null, msg);
	
	}
}
