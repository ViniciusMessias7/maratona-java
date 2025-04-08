package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;


public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.name = "Midoriya";
        estudante01.age = 15;
        estudante01.gender = 'M';

        estudante02.name = "Sakura";
        estudante02.age = 16;
        estudante02.gender = 'F';

        estudante01.printer();
        estudante02.printer();
    }
}
