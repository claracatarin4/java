public class Principal {
    public static void main(String[] args) {

        Aluno estudante1 = new Aluno("Maria", "Aluna", 100);
        estudante1.adicionarDisciplina(new Disciplina("Python", 9.6));

        Aluno estudante2 = new Aluno("Felipe", "Aluno", 103);
        estudante2.adicionarDisciplina(new Disciplina("Java", 8.8));
        estudante2.adicionarDisciplina(new Disciplina("Banco de Dados", 7.9));

        Aluno estudante3 = new Aluno("Laís", "Aluna", 101);
        estudante3.adicionarDisciplina(new Disciplina("Python", 9.5));

        Aluno estudante4 = new Aluno("Ralph", "Aluno", 102);
        estudante4.adicionarDisciplina(new Disciplina("Java", 9.3));
        estudante4.adicionarDisciplina(new Disciplina("Banco de Dados", 10.0));

        Professor professorHorista = new Professor("Bruno", "Professor", 13, 90.0);
        professorHorista.adicionarMateria("Projeto");

        Professor professor1 = new Professor("Reinaldo", "Professor", 22);
        professor1.adicionarMateria("Tec Web");

        Professor professor2 = new Professor("Roberto", "Professor", 11);
        professor2.adicionarMateria("Java");
        professor2.adicionarMateria("Python");
        professor2.adicionarMateria("Banco de Dados");

  
        System.out.println("Relatório do Professor 1:");
        Relatorio.gerarRelatorioProfessor(professor1);
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Relatório do Professor 2:");
        Relatorio.gerarRelatorioProfessor(professor2);
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Relatório do Professor Horista:");
        Relatorio.gerarRelatorioProfessor(professorHorista);
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Relatório do Estudante 1:");
        Relatorio.gerarRelatorioAluno(estudante1);
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Relatório do Estudante 2:");
        Relatorio.gerarRelatorioAluno(estudante2);
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Relatório do Estudante 3:");
        Relatorio.gerarRelatorioAluno(estudante3);
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Relatório do Estudante 4:");
        Relatorio.gerarRelatorioAluno(estudante4);
    }
}