abstract class Pessoa {
    private String nome;
    private String funcao;
    private int matricula;

    public Pessoa(String nome, String funcao, int matricula) {
        this.nome = nome;
        this.funcao = funcao;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public int getMatricula() {
        return matricula;
    }

    public abstract void imprimirDados();
}
