package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.name = "Sanji";
        System.out.println(estudante1.name);
        System.out.println(estudante1.age);
        System.out.println(estudante1.gender);

        System.out.println("-------");

        System.out.println(estudante2.name);
        System.out.println(estudante2.age);
        System.out.println(estudante2.gender);

    }
}
