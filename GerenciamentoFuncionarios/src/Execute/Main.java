package Execute;

import Execute.Cerebro.Endereco;
import Execute.Cerebro.Gerente;
import Execute.Cerebro.OperadorCaixa;
import Execute.Cerebro.Vendedor;

public class Main {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua 2", "setor 2", "Qd02, Lt 1");
        Endereco endereco2 = new Endereco("Rua 2", "setor 2", "Qd02, Lt 2");
        
        Vendedor vendedor = new Vendedor("keiroz", "123.456.789.01", endereco1, 1250.0);
        
        OperadorCaixa operadorDeCaixa = new OperadorCaixa("marquim", "111.111.111.11", endereco2, 1300.0);
    
        Gerente gerente = new Gerente("marquin", "sla mano", endereco1, 48, 8.35);
        
        gerente.calcularBonificacao(0.13);
        
        vendedor.calcularBonificacao(0.1);
        
        System.out.println(vendedor);
        System.out.println(operadorDeCaixa);
        System.out.println(gerente);
    }
    
}
