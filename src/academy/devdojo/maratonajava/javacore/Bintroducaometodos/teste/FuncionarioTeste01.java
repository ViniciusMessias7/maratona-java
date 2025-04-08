package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Vinicius";
        funcionario.idade = 22;
        funcionario.salario = new double[]{10,10,10};
        funcionario.mostraOsDados();
    }
}
