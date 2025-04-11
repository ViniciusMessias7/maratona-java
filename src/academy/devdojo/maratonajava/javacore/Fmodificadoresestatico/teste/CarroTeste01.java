package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);
        Carro.setVelocidadeLimite(180); // é bom criar metodo static quando os metodos não acessam um atributo da instancia;
        //o atributo pertence a classe e todos objetos pertencem ao mesmo valor.
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
