import javax.swing.JOptionPane;

public class ex4 {
	
	public static void main(String[] args) {

        String[] nomes = new String[3];
        String[] telefones = new String[3];


        for (int i = 0; i < 3; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1));
            telefones[i] = JOptionPane.showInputDialog("Digite o telefone de " + nomes[i]);
        }

 
        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "Nome: " + nomes[i] + "\nTelefone: " + telefones[i]);

        }
	}
}
