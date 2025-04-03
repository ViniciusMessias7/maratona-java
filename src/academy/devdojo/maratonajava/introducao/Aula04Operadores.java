package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        double number02 = 20;
        double sumResult = number01 / number02;
        System.out.println(sumResult);

        // %
        int rest = 21 % 2;
        System.out.println(rest);
        System.out.println();

        // < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualsToTwenty = 10 == 20;
        boolean isTenEqualsToTen = 10 == 10;
        boolean isTenDifferentToTen = 10 != 10;
        System.out.println("10 é maior que 20? " + isTenGreaterThanTwenty);
        System.out.println("10 é menor que 20? " + isTenLessThanTwenty);
        System.out.println("10 é igual a 20? " + isTenEqualsToTwenty);
        System.out.println("10 é igual a 10? " + isTenEqualsToTen);
        System.out.println("10 é diferente de 10? " + isTenDifferentToTen);
        System.out.println();

        // &&(and) ||(or) !
        int age = 36;
        float salary = 3500F;
        boolean isWithinTheLawGreaterThanThirty = age >= 30 && salary > 4612;
        boolean isWithinTheLawLessThanThirty = age < 30 && salary >= 3381;
        System.out.println("Está dentro da lei maior que trinta? " + isWithinTheLawGreaterThanThirty);
        System.out.println("Está dentro da lei menor que trinta? " + isWithinTheLawLessThanThirty);
        System.out.println();

        double currentAccountTotal = 200;
        double savingsAccountTotal = 1000;
        float playstationValue = 5000F;
        boolean isPlaystationFivePurchasable = currentAccountTotal > playstationValue || savingsAccountTotal > playstationValue;
        System.out.println(isPlaystationFivePurchasable);
        System.out.println();

        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800 = 1000 + 1800
        bonus -= 1000; // 1800 = 2800 - 1000
        bonus *= 2; // 3600 = 1800 * 2
        bonus /= 2; // 3600 = 3600 / 2
        bonus %= 2; // 1800 = 1800 % 2 = 0
        System.out.println(bonus);

        // incrementador
        int count = 0;
        count += 1; // count = count + 1;
        count++; // count conta de um em um
        count--; // count diminui de um em um
        ++count; // conta primeiro e depois incrementa
        --count; // diminui primeiro dps incrementa
        System.out.println("count" + count);
        int count2 = 10;
        System.out.println("count2++ " + count2++); // printa e depois soma
        System.out.println("--count2 " + --count2); // soma primeiro

    }
}