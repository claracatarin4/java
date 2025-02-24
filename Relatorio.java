public class Relatorio {
    public static void gerarRelatorioAluno(Aluno aluno) {
        aluno.imprimirDados();
        System.out.println("Média: " + aluno.calcularMedia());
    }

    public static void gerarRelatorioProfessor(Professor professor) {
        professor.imprimirDados();
    }
}
