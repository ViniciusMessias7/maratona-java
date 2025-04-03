package academy.devdojo.maratonajava.introducao;

/*
Crie um programa que simula um dano causado por um campeão do LoL.

- Declare uma variável int danoBase = 70;
- Declare uma variável double multiplicador = 1.25;
- Converta o dano base para double, multiplique pelo multiplicador e armazene o resultado em uma variável double danoFinal.
- Converta danoFinal de volta para int e imprima o resultado.
 */
public class Exercicio05MisturandoTudo {
    public static void main(String[] args) {
        int baseDamage = 70;
        double multiplier = 1.25;
        double finalDamage = ((double) baseDamage) * multiplier;
        int finalDamageConvertedToInt = (int) finalDamage;
        System.out.println(finalDamageConvertedToInt);
    }
}
