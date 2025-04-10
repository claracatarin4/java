import java.util.Scanner;

public class ex21 {
	public static void main(String[] args){

        int[] numeros = new int[10];
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            
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
