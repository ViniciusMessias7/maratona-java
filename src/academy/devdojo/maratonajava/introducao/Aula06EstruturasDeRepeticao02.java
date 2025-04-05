package academy.devdojo.maratonajava.introducao;

// Imprima todos os números pares de 0 até 100
// Imprima todos os números impares de 0 até 100

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        int maxSize = 100;
        for (int i = 0; i < maxSize; i++) {
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            }
        }
        System.out.println();
        for (int i = 0; i < maxSize; i++) {
            if (i % 2 == 1) {
                System.out.println("Impar: " + i);
            }
        }
    }
}
