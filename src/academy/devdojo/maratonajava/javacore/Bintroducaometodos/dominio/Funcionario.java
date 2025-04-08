package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void mostraOsDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        for (int i = 0; i < salario.length; i++) {
            System.out.print("Salario mês " + (i + 1) + ": " + salario[i] + " | ");
        }
        System.out.println("\nMédia Salarial: " + mediaDosSalarios());
    }

    public double mediaDosSalarios() {
        double sum = 0;
        for (double somandoSalarios : salario) {
            sum += somandoSalarios;
        }
        return sum / salario.length;
    }
}
