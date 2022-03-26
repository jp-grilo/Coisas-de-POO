package musicacompositor;

public class MusicaCompositor {

    public static void main(String[] args) {
        
        Compositor c1 = new Compositor("Chico Buarque", "Brasileiro");
        Compositor c2 = new Compositor("Cartola", "Brasileiro");

        Musica m1 = new Musica("Apesar de voce", 1978, "MPB", c1);
        Musica m2 = new Musica("Preciso me encontrar", 1976, "MPB", c2);
        Musica m3 = new Musica("Construcao/Deus lhe pague", 1971, "MPB", c1);
        Musica m4 = new Musica("O Mundo É Um Moinho.", 1976, "MPB", c2);
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
}
