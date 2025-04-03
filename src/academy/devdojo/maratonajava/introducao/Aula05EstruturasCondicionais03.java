package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 6000;
        String messageDonate = "Eu vou doar 500 pro DevDojo";
        String messageNotDonate = "Ainda não tenho condições, mas vou ter!";
        //(condicao) ? verdadeiro : falso;
        String result = salary > 5000 ? messageDonate : messageNotDonate;

        System.out.println(result);
    }
}
