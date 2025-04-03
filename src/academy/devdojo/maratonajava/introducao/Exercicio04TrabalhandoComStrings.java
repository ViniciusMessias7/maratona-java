package academy.devdojo.maratonajava.introducao;

/*
Escreva um programa que:

- Crie uma variável String chamada nomeCampeao e atribua o nome de um campeão (ex: "Ahri").
- Use o método length() para imprimir o número de caracteres desse nome.
- Use toUpperCase() e toLowerCase() para exibir o nome do campeão em maiúsculas e minúsculas.
- Verifique se o nome do campeão começa com a letra "A" usando o método startsWith().
 */
public class Exercicio04TrabalhandoComStrings {
    public static void main(String[] args) {
        String championName = "Jinx";
        System.out.println(championName.length());
        System.out.println(championName.toUpperCase());
        System.out.println(championName.toLowerCase());
        System.out.println(championName.startsWith("J"));
    }
}
