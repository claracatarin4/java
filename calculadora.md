import java.util.Scanner;

public class calculadora {
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            mostrarmenu();
            String operador = scanner.nextLine();

            if (operador.equals("S")) {
                System.out.println("encerrando a calculadora.");
                continuar = false;
                continue;
            }

            if (!operadorvalido(operador)) {
                System.out.println("tente novamente.");
                continue;
            }

            System.out.print("insira o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("insira outro número: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine(); 

            double resultado = realizaroperacao(operador, num1, num2);
            System.out.println(resultado);
        }

        System.out.println("calculadora encerrada.");
    }

    private void mostrarmenu() {
        System.out.println("escolha o operador:");
        System.out.println("soma");
        System.out.println("subtração");
        System.out.println("multiplicação");
        System.out.println("divisão");
        System.out.println("sair (s)");
    }

    private boolean operadorvalido(String operador) {
        return operador.equals("+") || operador.equals("-") || operador.equals("x") || operador.equals("/") || operador.equals("s");
    }

    private double realizaroperacao(String operador, double num1, double num2) {
        double resultado = 0;
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "x":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("erro.");
                }
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        calculadora calc = new calculadora();
        calc.iniciar();
    }
}
