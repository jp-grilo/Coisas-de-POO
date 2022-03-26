package alunocusrsodepartamento;

public class Aluno {
    private String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome, int matricula, int ano, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno= " + nome + ", matricula= " + matricula + ", ano= " + ano + ", curso= " + curso;
    }
    
    
    
}
