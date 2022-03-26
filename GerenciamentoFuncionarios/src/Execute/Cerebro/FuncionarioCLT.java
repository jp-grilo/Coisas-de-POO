package Execute.Cerebro;

public abstract class FuncionarioCLT {
    protected String nome;
    protected String documento;
    protected Endereco endereco;    
    protected double valorSalario;

    public FuncionarioCLT(String nome, String documento, Endereco endereco, double valorSalario) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.valorSalario = valorSalario;
    }

    public FuncionarioCLT() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{" + "nome=" + nome + ", documento=" + documento + ", endereco=" + endereco + ", valorSalario=" + valorSalario + '}';
    }
    
    
    
} 
