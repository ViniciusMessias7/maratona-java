package academy.devdojo.maratonajava.introducao;

//Imprima os primeiros 25 numeros de um dado valor. Por exemplo 50
public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int valor = 50;
        int valorMax = 25 + valor;
        for (int i = valor; i <= valorMax; i++) {
            if (i > valorMax) {
                break;
            }
            System.out.println(i);
        }
    }
}
