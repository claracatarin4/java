import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2 {
	public static void main(String[] args) throws IOException {
     
        int[] numeros = new int[10];


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(reader.readLine());
            
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
