package academy.devdojo.maratonajava.introducao;

// Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
// Condição valorParcela >= 1000
public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double carValue = 100000;
        double minimumInstallment = 1000;
        double installmentValue;
        for (int i = 1; i < minimumInstallment; i++) {
            installmentValue = carValue / i;
            if (installmentValue >= 1000) {
                System.out.println(i + " parcela" + " no valor de: " + installmentValue);
            } else {
                break;
            }
        }
    }
}
