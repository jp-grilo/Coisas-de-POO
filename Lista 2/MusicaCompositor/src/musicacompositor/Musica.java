package musicacompositor;

public class Musica {
    private String nome;
    private int ano;
    private String tipo;
    private Compositor compositor;

    public Musica(String nome, int ano, String tipo, Compositor compositor) {
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositor = compositor;
    }

    @Override
    public String toString() {
        return "nome= " + nome + ", ano= " + ano + ", tipo= " + tipo + ", compositor= " + compositor;
    }
    
    
}
