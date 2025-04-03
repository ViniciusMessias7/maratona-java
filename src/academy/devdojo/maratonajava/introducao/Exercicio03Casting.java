package academy.devdojo.maratonajava.introducao;

/*
Imagine que um campeão do LoL ganha ouro ao abater tropas. O ouro é representado como um número double. Faça um programa que:

- Declare um double ouroTotal = 3599.75;
- Converta esse valor para um int e imprima o resultado (o que aconteceu com os centavos?)
- Converta o int de volta para double e imprima o resultado (o valor mudou?)
 */
public class Exercicio03Casting {
    public static void main(String[] args) {

        double totalGold = 3599.75;
        int totalGoldConversionInt = (int) totalGold;
        System.out.println("Valor decimal é invalido pra variaveis do tipo int: " + totalGoldConversionInt);
        totalGold = totalGoldConversionInt;
        System.out.println("O java descartou os centavos ao utilizar o casting pra int: " + totalGold);

    }
}
