public class Professor extends Pessoa {
    private String[] materias;
    private int numMaterias;
    private double horaAula;

    public Professor(String nome, String funcao, int matricula) {
        super(nome, funcao, matricula);
        materias = new String[5];
        numMaterias = 0;
        horaAula = 0;
    }

    public Professor(String nome, String funcao, int matricula, double horaAula) {
        super(nome, funcao, matricula);
        materias = new String[5];
        numMaterias = 0;
        this.horaAula = horaAula;
    }

    public void adicionarMateria(String materia) {
        if (numMaterias < 5) {
            materias[numMaterias] = materia;
            numMaterias++;
        }
    }

    public void imprimirDados() {
        System.out.println("Nome: " + getNome() + " | Função: " + getFuncao() + " | Matrícula: " + getMatricula());
        System.out.println("Matérias:");
        for (int i = 0; i < numMaterias; i++) {
            System.out.println(materias[i]);
        }
        if (horaAula > 0) {
            System.out.println("Tipo: Horista | Hora-aula: R$ " + horaAula);
        }
    }
}