public class Eleicao {
    private String nomeMunicipio;
    private int numeroVotantes;
    private Candidato[] candidatos;
    private String dataEleicao;

    public Eleicao(String nomeMunicipio, int numeroVotantes, Candidato[] candidatos,String dataEleicao){
        this.nomeMunicipio = nomeMunicipio;
        this.numeroVotantes = numeroVotantes;
        this.candidatos = candidatos;
        this.dataEleicao = dataEleicao;
    }

    public void mostrarInformacoesEleicao(){
        System.out.println("<< Informações sobre a eleição >>");
        System.out.println("Nome do município: " +nomeMunicipio);
        System.out.println("Quantidade de votantes: " +numeroVotantes);
        System.out.println("Quantidade de candidatos: " +candidatos.length);
        System.out.println("Data da eleição: " +dataEleicao);
        System.out.println(" ");

        for (Candidato candidato : candidatos) {

            candidato.mostrarInformacoes(); // Vai chamar o metodo mostrarInformacoes da classe Candidato
    
            }

    }

        

}
