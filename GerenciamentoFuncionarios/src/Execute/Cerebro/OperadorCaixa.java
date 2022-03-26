package Execute.Cerebro;

public class OperadorCaixa extends FuncionarioCLT {

    public OperadorCaixa(String nome, String documento, Endereco endereco, double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    public OperadorCaixa() {
    }

    @Override
    public String toString() {
        return "OperadorCaixa{" + "nome=" + nome + ", documento=" + documento + ", endereco=" + endereco.getRua() + ", valorSalario=" + valorSalario + '}';
    }

    
}
