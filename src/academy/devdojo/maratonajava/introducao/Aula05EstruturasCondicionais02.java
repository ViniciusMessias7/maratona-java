package academy.devdojo.maratonajava.introducao;

/*
   idade < 15 categoria infantil
   idade >= 15 && idade < 18 categoria juvenil
   idade >= 18 categoria adulta

 */
public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 15;
        String category;
        if (age < 15) {
            category = "categoria infantil";
        } else if (age >= 15 && age < 18) {
            category = "categoria juvenil";
        } else {
            category = "categoria adulta";
        }
        System.out.println(category);
    }
}
