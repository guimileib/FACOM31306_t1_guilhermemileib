
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

