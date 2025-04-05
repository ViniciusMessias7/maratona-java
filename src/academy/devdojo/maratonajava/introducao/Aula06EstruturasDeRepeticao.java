package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        while (true) {

            if (count1 <= 10) {
                System.out.println("\ncount1: " + count1);
                count1++;
            } else if (count2 <= 10) {
                System.out.println("\ncount2: " + count2);
                count2++;
            } else {
                System.out.println("\ncount3: " + count3);
                count3++;
                if (count3 > 10) {
                    break;
                }
            }

        }

        do {
            System.out.println("\nDentro do do-while");
        } while (count3 < 10);

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println("For: " + i);
        }
    }
}


