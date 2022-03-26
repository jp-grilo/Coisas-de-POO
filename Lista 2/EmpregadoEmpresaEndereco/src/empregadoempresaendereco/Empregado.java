package empregadoempresaendereco;

public class Empregado {
    private String nome;
    private int matricula;
    private Empresa empresa;

    public Empregado(String nome, int matricula, Empresa empresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Funcionario= " + nome + ", matricula= " + matricula +  empresa;
    }
}
