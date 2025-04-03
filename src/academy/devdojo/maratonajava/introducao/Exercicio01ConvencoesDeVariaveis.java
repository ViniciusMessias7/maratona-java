package academy.devdojo.maratonajava.introducao;

/*
Crie variáveis para armazenar as seguintes informações de um campeão do League of Legends:

 - Nome do campeão (ex: "Yasuo")
 - Quantidade de vida (ex: 575)
  - Dano de ataque base (ex: 60.0)
  - Se é um campeão corpo a corpo ou à distância (ex: true para corpo a corpo, false para à distância)

Siga as convenções de nomes de variáveis do Java. Depois, imprima essas informações no console.
*/
public class Exercicio01ConvencoesDeVariaveis {
    public static void main(String[] args) {

        String championName = "Tristana";
        int championLife = 640;
        double baseDamage = 60.0;
        boolean isRanged = true;
        String printResult = "Champion name: " + championName + ".\nBase status: " + "\n Life: " + championLife + ".\n Base damage: " + baseDamage + ".\n Distance attack? " + isRanged + ".";
        System.out.println(printResult);
    }
}
