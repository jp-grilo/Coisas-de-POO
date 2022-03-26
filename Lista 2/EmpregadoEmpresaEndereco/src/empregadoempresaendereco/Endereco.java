package empregadoempresaendereco;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String bairro, String complemento, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\nEndereco: " + "rua= " + rua + ", numero= " + numero + ", bairro= " + bairro + ", complemento= " + complemento + ", cidade= " + cidade + ", estado= " + estado + "\n";
    }
    
    
    
}
