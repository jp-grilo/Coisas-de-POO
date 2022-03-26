package alunocusrsodepartamento;

public class AlunoCusrsoDepartamento {

    public static void main(String[] args) {
        Departamento d1 = new Departamento("Instituto de informatica", "INF");
        Curso c1 = new Curso("Ciencias da computacai", "CC", d1);
        Aluno a1 = new Aluno("Joao Paulo", 111, 2019, c1);
        
        Departamento d2 = new Departamento("Faculdade de educacao fisica e danca", "FEFD");
        Curso c2 = new Curso("Educacao Fisica", "EF", d2);
        Aluno a2 = new Aluno("Natalia", 112, 2018, c2);
        
        Curso c3 = new Curso("Sistemas de informacao", "SI", d1);
        Aluno a3 = new Aluno("Marcos", 113, 2020, c3);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
    
}
