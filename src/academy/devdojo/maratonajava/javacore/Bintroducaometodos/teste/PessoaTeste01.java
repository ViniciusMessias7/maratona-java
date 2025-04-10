package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;
// problema com acoplamento, é o qual uma classe conecta com outra
// acoplamento tem a ver com o quanto uma classe sabe da outra
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
