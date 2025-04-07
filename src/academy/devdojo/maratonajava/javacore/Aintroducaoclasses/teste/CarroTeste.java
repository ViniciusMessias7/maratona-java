package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1 = carro2;

        carro1.nome = "Toyota Corolla";
        carro1.ano = 2020;
        carro1.modelo = "XEi 2.0 Flex Automático";

        carro2.nome = "Honda Civic";
        carro2.ano = 2022;
        carro2.modelo = "Touring 1.5 Turbo CVT";

        System.out.println("Nome: " + carro1.nome + "\nAno: " + carro1.ano + "\nModelo: " + carro1.modelo);
        System.out.println("\nNome: " + carro2.nome + "\nAno: " + carro2.ano + "\nModelo: " + carro2.modelo);
    }
}
