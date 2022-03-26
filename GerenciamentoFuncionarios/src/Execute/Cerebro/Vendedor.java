package Execute.Cerebro;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao{

    private double valorBonificacao;
    
    @Override
    public void calcularBonificacao(double porcertagemBonificacao) {
        this.valorBonificacao = super.getValorSalario() * porcertagemBonificacao;
    
    }

    public Vendedor() {
    }

    public Vendedor(String nome, String documento, Endereco endereco, double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }
        
    
    public double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    @Override
    public String toString() {
        return "Vendedor: " + "nome: " + nome +
                ", documento: " + documento +
                ", endereco: " + endereco.getRua() +
                ", valorSalario: " + valorSalario +
                ", valorBonificacao: " + valorBonificacao;
    }
    
}
