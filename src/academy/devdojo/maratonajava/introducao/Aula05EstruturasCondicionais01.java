package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedToBuyAlcohol = age >= 18;
        // ! caso não seja autorizado é tipo um else
        if (isAuthorizedToBuyAlcohol) {
            System.out.println("Autorizado a comprar bebida alcolica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        if (!isAuthorizedToBuyAlcohol) {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }
        System.out.println("Fora do if");
    }
}
