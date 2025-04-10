package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

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
        return (media + sum) / salario.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia(){
        return media;
    }

}
