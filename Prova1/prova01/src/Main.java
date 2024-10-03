import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do time: ");
        String nomeDoTime = scanner.nextLine();
        Time time = new Time(nomeDoTime);

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite as informações do jogador titular " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();
            scanner.nextLine();  
            Jogador jogador = new Jogador(nome, idade, altura, peso);
            time.adicionarTitular(jogador);
        }

        System.out.println("Digite as informações do substituto:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Altura (em metros): ");
        double altura = scanner.nextDouble();
        System.out.print("Peso (em kg): ");
        double peso = scanner.nextDouble();

        Jogador substituto = new Jogador(nome, idade, altura, peso);
        time.adicionarSubstituto(substituto);

        System.out.println("\nInformações do time:");
        System.out.println(time.toString());

        double mediaIdade = time.calcularMediaIdade();
        System.out.println("Média de idade dos jogadores: " + mediaIdade);

        time = null;
        System.out.println("Time removido.");
    }
}
