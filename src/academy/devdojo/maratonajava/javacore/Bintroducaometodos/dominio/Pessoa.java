package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        if (nome.isEmpty() || nome.equals(" ")) {
            System.out.println("Nome inválido!");
            return;
        }
        this.nome = nome;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }


    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida!");
            return;
        }
        this.idade = idade; // alto acoplamento ruim; baixo bom
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
