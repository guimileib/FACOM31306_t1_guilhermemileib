import java.util.Scanner;

// PS: Por algum motivo depois de conferir o codigo, não consegui rodar, mas pelo terminal consegui kkk

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("\nInforme o nome, o preco e a qtd. em estoque do produto " + (i + 1) + ":");
            String nome = scanner.next();
            float preco = scanner.nextFloat();
            int qtdEstoque = scanner.nextInt();

            produtos[i] = new Produto(nome, preco, qtdEstoque);
        }

        System.out.println("\nAumentando o preco em 10% do produto 1 e 3");

        produtos[0].alteraPreco(10);
        produtos[2].alteraPreco(10);

        System.out.println("\nReduzindo o preco em 5% do produto 2");

        if (produtos[1].alteraPreco(-5) == -1) {
            System.out.println("\nErro: preco nao alterado. Porcentagem invalida");
        } else {
            System.out.println("\nPreco alterado com sucesso");
        }

        System.out.println("\nAlterando o preco do produto 4");
        if (produtos[3].alteraPreco(-110) == -1) {
            System.out.println("\nErro: preco nao alterado. Porcentagem invalida");
        }

        System.out.println("\nProdutos Cadastrados:");
        for (Produto produto : produtos) {
            System.out.printf("\nProduto: %s\nPreco: %.2f\nEstoque: %d\n", produto.nome, produto.preco, produto.qtdEstoque);
        }
    }
}

class Produto {
    String nome;
    float preco;
    int qtdEstoque;

    Produto(String nome, float preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    int alteraPreco(float porcentagem) {
        if (porcentagem > -100) {
            float temp = 1 + porcentagem / 100; // Ex: 10 => 1 + 10/100 = 1.1; -5 => 1 + (-5/100) = 0.95
            preco *= temp;
            return 0;
        } else {
            return -1;
        }
    }
}
