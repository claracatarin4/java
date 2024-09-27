package exercícios;
import java.util.Scanner;

public class Boletim {
    
    public static void main(String[] args) {
        
        final int semestres = 4;
        final int discip = 5;

        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[semestres][discip];

        for (int disciplina = 0; disciplina < discip; disciplina++) {
            System.out.printf("Insira as notas para a Disciplina %d:\n", (disciplina + 1));
            for (int semestre = 0; semestre < semestres; semestre++) {
                System.out.printf("Semestre %d: ", (semestre + 1));
                notas[semestre][disciplina] = scanner.nextDouble();
            }
        }

        double[] media = new double[discip];
        boolean[] aprovado = new boolean[discip];
        boolean passou = true;

        for (int disciplina = 0; disciplina < discip; disciplina++) {
            double soma = 0;
            for (int semestre = 0; semestre < semestres; semestre++) {
                soma += notas[semestre][disciplina];
            }
            media[disciplina] = soma / semestres;

            aprovado[disciplina] = media[disciplina] >= 6.0;
            if (!aprovado[disciplina]) {
                passou = false;
            }
        }

        System.out.println("resultados:");
        for (int disciplina = 0; disciplina < discip; disciplina++) {
            String status = aprovado[disciplina] ? "Aprovado" : "Reprovado";
            System.out.printf("disciplina %d: média = %.2f - %s%n", (disciplina + 1), media[disciplina], status);
        }
        
        if (passou) {
            System.out.println("o aluno passou de ano.");
        } else {
            System.out.println("o aluno não passou de ano.");
        }

        scanner.close();
    }
}
