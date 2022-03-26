package musicacompositor;

public class Compositor {
    private String nome;
    private String nacionalidade;

    public Compositor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return  nome + ", nacionalidade= " + nacionalidade;
    }
    
    
}
