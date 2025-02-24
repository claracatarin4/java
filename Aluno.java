public class Aluno extends Pessoa {
    private Disciplina[] disciplinas;
    private int numDisciplinas;

    public Aluno(String nome, String funcao, int matricula) {
        super(nome, funcao, matricula);
        disciplinas = new Disciplina[10];
        numDisciplinas = 0;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (numDisciplinas < 10) {
            disciplinas[numDisciplinas] = disciplina;
            numDisciplinas++;
        }
    }

    public double calcularMedia() {
        if (numDisciplinas == 0) return 0;
        double soma = 0;
        for (int i = 0; i < numDisciplinas; i++) {
            soma += disciplinas[i].getNota();
        }
        return soma / numDisciplinas;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + getNome() + " | Função: " + getFuncao() + " | Matrícula: " + getMatricula());
        for (int i = 0; i < numDisciplinas; i++) {
            System.out.println(disciplinas[i]);
        }
    }
}