public class Time {
    private Jogador[] titulares;
    private Jogador substituto;
    private String nomeDoTime;
    private int countTitulares;  

    
    public Time(String nomeDoTime) {
        this.nomeDoTime = nomeDoTime;
        this.titulares = new Jogador[6];  
        this.countTitulares = 0;
    }

    public void adicionarTitular(Jogador jogador) {
        if (countTitulares < 6) {
            titulares[countTitulares] = jogador;
            countTitulares++;
        } else {
            System.out.println("O time já tem 6 titulares.");
        }
    }

    public void adicionarSubstituto(Jogador substituto) {
        this.substituto = substituto;
    }

    public void exibirInformacoes() {
        System.out.println("Time: " + nomeDoTime);
        System.out.println("Titulares:");
        for (int i = 0; i < countTitulares; i++) {
            titulares[i].exibirInformacoes();
        }
        if (substituto != null) {
            System.out.println("Substituto:");
            substituto.exibirInformacoes();
        }
    }

    public double calcularMediaIdade() {
        int somaIdades = 0;
        int totalJogadores = countTitulares;

        for (int i = 0; i < countTitulares; i++) {
            somaIdades += titulares[i].getIdade();
        }
        if (substituto != null) {
            somaIdades += substituto.getIdade();
            totalJogadores++;
        }

        return totalJogadores > 0 ? (double) somaIdades / totalJogadores : 0;
    }
}
