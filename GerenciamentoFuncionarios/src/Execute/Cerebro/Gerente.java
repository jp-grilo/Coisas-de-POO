package Execute.Cerebro;

public class Gerente implements CalculaBonificacao{
    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private double valorHora;
    private double valorBonificacao;
    private double valorRemuneracao;
    private double valorSalario;
    
    @Override
    public void calcularBonificacao(double porcertagemBonificacao) {
        this.valorRemuneracao = this.horasTrabalhadas * this.valorHora;
        this.valorBonificacao = this.valorRemuneracao * porcertagemBonificacao;
        this.valorSalario = this.valorRemuneracao + this.valorBonificacao;
    }
    
    public Gerente() {
    }
    
    public Gerente(String nome, String documento, Endereco endereco, Integer horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
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

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    public double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

    @Override
    public String toString() {
        return "Gerente: " + "nome: " + nome +
                ", documento: " + documento +
                ", endereco: " + endereco.getRua() +
                ", horasTrabalhadas: " + horasTrabalhadas +
                ", valorHora: " + valorHora +
                ", valorBonificacao: " + valorBonificacao +
                ", valorRemuneracao: " + valorRemuneracao +
                ", salario total: " + valorSalario;
    }

    
    
     
    
}
