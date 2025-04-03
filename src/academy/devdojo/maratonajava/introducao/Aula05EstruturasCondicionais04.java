package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salary = 68508;
        String result;
        if (salary > 0 && salary < 34712) {
            result = "Tax: " + salary * (9.70 / 100);
        } else if (salary >= 34713 && salary <= 68507) {
            result = "Tax: " + salary * (37.35 / 100);
        } else {
            result = "Tax: " + salary * (49.50 / 100);
        }
        System.out.println(result);
    }
}
