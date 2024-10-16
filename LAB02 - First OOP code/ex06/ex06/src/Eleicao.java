public class Eleicao {
    private String nomeMunicipio;
    private int numeroVotantes;
    private Candidato[] candidatos;
    private String dataEleicao;

    public Eleicao(String nomeMunicipio, int numeroVotantes, Candidato[] candidatos, String dataEleicao) {
        this.nomeMunicipio = nomeMunicipio;
        this.numeroVotantes = numeroVotantes;
        this.candidatos = candidatos;
        this.dataEleicao = dataEleicao;
    }

    public void mostrarInformacoesEleicao() {
        System.out.println("<< Informações sobre a eleição >>");
        System.out.println("Nome do município: " + nomeMunicipio);
        System.out.println("Quantidade de votantes: " + numeroVotantes);
        System.out.println("Quantidade de candidatos: " + candidatos.length);
        System.out.println("Data da eleição: " + dataEleicao);
        System.out.println(" ");

        for (Candidato candidato : candidatos) {
            candidato.mostrarInformacoes(); // Chama o método mostrarInformacoes da classe Candidato
        }

        // Busca o candidato com o maior valor de bens
        Candidato candidatoComMaisBens = buscarCandidatoComMaisBens();
        if (candidatoComMaisBens != null) {
            double percentualBens = calcularPercentualBens(candidatoComMaisBens);
            System.out.println("Candidato com o maior valor de bens: " + candidatoComMaisBens.getNomeCompleto());
            System.out.println("Total de bens: " + candidatoComMaisBens.getTotalBens());
            System.out.printf("Percentual de bens em relação aos outros candidatos: %.2f%%\n", percentualBens);
        }
    }

    private Candidato buscarCandidatoComMaisBens() {
        Candidato candidatoMax = candidatos[0];
        for (Candidato candidato : candidatos) {
            if (candidato.getTotalBens() > candidatoMax.getTotalBens()) {
                candidatoMax = candidato;
            }
        }
        return candidatoMax;
    }

    private double calcularPercentualBens(Candidato candidatoComMaisBens) {
        double totalBensOutrosCandidatos = 0.0;
        for (Candidato candidato : candidatos) {
            if (!candidato.equals(candidatoComMaisBens)) {
                totalBensOutrosCandidatos += candidato.getTotalBens();
            }
        }
        return (candidatoComMaisBens.getTotalBens() / (totalBensOutrosCandidatos + candidatoComMaisBens.getTotalBens())) * 100;
    }
}
