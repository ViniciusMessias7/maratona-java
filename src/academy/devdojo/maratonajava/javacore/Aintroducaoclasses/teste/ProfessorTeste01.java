package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Marcos";
        professor.age = 47;
        professor.gender = 'M';
        System.out.println(professor.name + " " + professor.age + " " + professor.gender);
    }
}
