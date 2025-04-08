package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public int age;

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideTwoNumbers02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void printDivisionTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Invalid operation");
            return; // funciona como um break e/ou else.
        }
        System.out.println(num1 / num2);
    }

    public void changeTwoNumbers(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do changeTwoNumbers");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers){
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
