package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Vinicius";
        estudante.age = 22;
        estudante.gender = 'M'; //caracteristicas do estudante
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
    }
}
