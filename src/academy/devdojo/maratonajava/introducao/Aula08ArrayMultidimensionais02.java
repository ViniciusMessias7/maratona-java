package academy.devdojo.maratonajava.introducao;

public class Aula08ArrayMultidimensionais02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{0, 1};
        arrayInt[1] = new int[]{0, 1, 2};
        arrayInt[2] = new int[]{0, 1, 2, 3, 4, 5};

        int[][] arrayInt2 = {{0, 1}, {0, 1, 2}, {0, 1, 2, 3, 4, 5}};
        for (int[] ints : arrayInt2) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println("\n------");
        }
    }
}
