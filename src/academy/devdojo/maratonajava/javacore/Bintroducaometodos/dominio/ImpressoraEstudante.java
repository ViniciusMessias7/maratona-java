package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void print(Estudante estudante) {
        estudante.name = "Gohan";
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
    }
}
