package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.name = "Midoriya";
        estudante01.age = 15;
        estudante01.gender = 'M';

        estudante02.name = "Sakura";
        estudante02.age = 16;
        estudante02.gender = 'F';


        impressora.print(estudante01);
        System.out.println("-------");
        impressora.print(estudante01);

    }
}
