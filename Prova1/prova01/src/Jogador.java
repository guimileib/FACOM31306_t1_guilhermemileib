public class Jogador {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Jogador(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura + " metros, Peso: " + peso + " kg");
    }

    public int getIdade() {
        return idade;
    }
}
