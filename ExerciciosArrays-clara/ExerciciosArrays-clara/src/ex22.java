import javax.swing.JOptionPane;

public class ex22 {
	public static void main(String[] args){
		
		int[] numeros = new int[10];
		
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Digite o número " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(input);
            
            int maiorNumero = numeros[0];
            for (int num : numeros) {
                if (num > maiorNumero) {
                    maiorNumero = num;
                }
            }

            System.out.println("O maior número é: " + maiorNumero);
        }
	}
}
