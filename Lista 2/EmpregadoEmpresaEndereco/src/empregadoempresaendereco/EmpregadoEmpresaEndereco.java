package empregadoempresaendereco;

public class EmpregadoEmpresaEndereco {

    public static void main(String[] args) {
        Endereco e1 = new Endereco("r 20", 01, "bairro feliz", "quadra 7 lote 1", "Goinia", "Goias");
        Endereco e2 = new Endereco("r 17", 01, "bairro feliz", "quadra 2 lote 3", "Goinia", "Goias");
        
        Empresa em1 =  new Empresa("XX. XXX. XXX/0001-XX", "Ze ramalio - 123.123.123.05", e1);
        Empresa em2 =  new Empresa("XX. XXX. XXX/0001-YY", "Juninho play - 884.158.612.30", e2);
        
        Empregado ep1 =  new Empregado("Caio", 7, em1);
        Empregado ep2 =  new Empregado("julia", 2, em2);
        Empregado ep3 =  new Empregado("marta", 6, em1);
        Empregado ep4 =  new Empregado("cassia", 1, em2);
        
        System.out.println(ep1);
        System.out.println(ep2);
        System.out.println(ep3);
        System.out.println(ep4);
    }
    
}
