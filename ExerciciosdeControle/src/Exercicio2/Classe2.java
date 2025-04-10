package Exercicio2;
import javax.swing.JOptionPane;

public class Classe2 {
	public static void main(String[] args) {
		String firstword = "";
		String secondword = "";
		String thirdword = "";
		firstword = JOptionPane.showInputDialog("Insira seu primeiro nome: ");
		secondword = JOptionPane.showInputDialog("Insira seu segundo nome: ");
		thirdword = JOptionPane.showInputDialog("Insira seu terceiro nome: ");
		String msg = (" " +firstword+ " " +secondword+ " " +thirdword+ "");
		JOptionPane.showMessageDialog(null, msg);
	}
}
