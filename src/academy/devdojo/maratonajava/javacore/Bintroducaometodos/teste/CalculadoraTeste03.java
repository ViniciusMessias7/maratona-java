package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideTwoNumbers(0, 2);
        System.out.println(result);
        System.out.println(calculadora.divideTwoNumbers02(20, 2));
        System.out.println("-------");
        calculadora.printDivisionTwoNumbers(86, 0);
    }
}
