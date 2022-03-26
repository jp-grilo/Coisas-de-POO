package clienteendereco;

public class ClienteEndereco {

    public static void main(String[] args) {
        Endereco e1 = new Endereco("r 20", 01, "bairro feliz", "quadra 7 lote 1", "Goinia", "Goias");
        Endereco e2 = new Endereco("r 17", 01, "bairro feliz", "quadra 2 lote 3", "Goinia", "Goias");
        
        Cliente c1 =  new Cliente("joaozinho", "123.456.789.01", e1);
        Cliente c2 =  new Cliente("mariazinha", "123.456.789.15", e1);
        Cliente c3 =  new Cliente("Marquinhos", "987.654.321.09", e2);
        Cliente c4 =  new Cliente("Laurinha", "846.184.358.35", e2);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
    
}
