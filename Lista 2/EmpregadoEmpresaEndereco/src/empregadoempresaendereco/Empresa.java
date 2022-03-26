package empregadoempresaendereco;

public class Empresa {
    private String cnpj;
    private String razao;
    private Endereco endereco;

    public Empresa(String cnpj, String razao, Endereco endereco) {
        this.cnpj = cnpj;
        this.razao = razao;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nEmpresa: " + "cnpj= " + cnpj + ", razao= " + razao + endereco;
    }
    
    
}
