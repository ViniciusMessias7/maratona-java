package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long ageLong = 10;
        double salaryDouble = 2000.0D;
        float salaryFloat = 2500.0F;
        byte ageByte = 10;
        short ageShort = (short) 33000;
        boolean isTrue = true;
        boolean isFalse = false;
        char character = 'A';
        String name = "Goku";

        System.out.println("The age is: " + age + " years old");
        System.out.println(isTrue);
        System.out.println(character);
        System.out.println(ageShort);
        System.out.println(age);
        System.out.println("Hello my name is: " + name);
    }
}
