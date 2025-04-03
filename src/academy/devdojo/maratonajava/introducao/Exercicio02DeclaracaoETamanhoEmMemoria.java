package academy.devdojo.maratonajava.introducao;

/*
Escreva um programa que declare uma variável para cada tipo primitivo do Java (byte, short, int, long, float, double, char, boolean).
    Inicialize essas variáveis com valores válidos.
        Use o método System.out.println() para imprimir o nome da variável, seu valor e o número de bytes que ela ocupa na memória (utilizando Byte.SIZE / 8).
 */
public class Exercicio02DeclaracaoETamanhoEmMemoria {
    public static void main(String[] args) {
        byte sizeByte = 127;
        short sizeShort = 77;
        int sizeInt = 777;
        long sizeLong = 7777;
        float sizeFloat = 7.7777F;
        double sizeDouble = 7.77777;
        char sizeChar = 'M';
        boolean sizeBoolean = true;
        System.out.println("\nVariable Name = sizeByte." + "\nValue: " + sizeByte + ".\nValue in memory: " + Byte.SIZE / 8 + ".");
        System.out.println("\nVariable Name = sizeShort." + "\nValue: " + sizeShort + ".\nValue in memory: " + Short.SIZE / 8 + ".");
        System.out.println("\nVariable Name = sizeInt." + "\nValue: " + sizeInt + ".\nValue in memory: " + Integer.SIZE / 8 + ".");
        System.out.println("\nVariable Name = sizeLong." + "\nValue: " + sizeLong + ".\nValue in memory: " + Long.SIZE / 8 + ".");
        System.out.println("\nVariable Name = sizeFloat." + "\nValue: " + sizeFloat + ".\nValue in memory: " + Float.SIZE / 8 + ".");
        System.out.println("\nVariable Name = sizeDouble." + "\nValue: " + sizeDouble + ".\nValue in memory: " + Double.SIZE / 8 + ".");
        System.out.println("\nVariable Name = sizeChar." + "\nValue: " + sizeChar + ".\nValue in memory: " + Character.SIZE / 8 + ".");
        System.out.println("\nVariable Name = sizeBoolean." + "\nValue: " + sizeBoolean + ".\nValue in memory: Sera sempre 0(false) ou 1(true), não descobri uma maneira de ver o tamanho.");
    }
}
