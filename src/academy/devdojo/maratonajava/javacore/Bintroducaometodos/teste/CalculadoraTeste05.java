package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numbers = {1, 2, 3, 4, 5};
        calculadora.sumArray(numbers);
        calculadora.sumVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
