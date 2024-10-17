public class CandidatoVereador {
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private double totalBens;
    private boolean reeleger;
    private int nmrPartido;
    private String nmrTresDigitos;
    private String bairro;

    public CandidatoVereador(String nomeCompleto, String dataNascimento, String genero, double totalBens,boolean reeleger, int nmrPartido, String nmrTresDigitos, String bairro){
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.bairro = bairro;
        this.nmrTresDigitos = nmrTresDigitos;
        this.genero = genero;
        this.totalBens = totalBens;
        this.reeleger = reeleger;
        this.nmrPartido = nmrPartido;
    }

    public String toString() {
        return "<< Informações do Verador >>" +
               "\nNome: " + nomeCompleto +
               "\nData de Nascimento: " + dataNascimento +
               "\nGênero: " + genero +
               "\nTotal de bens declarados: " + totalBens +
               "\nCandidato à reeleição: " + (reeleger ? "Sim" : "Não") +
               "\nNúmero do Partido: " + nmrPartido +
               "\nBairro do Vereador: " + bairro +
               "\nNúmero de Três Digitos: " + nmrTresDigitos +
               "\n";
    }

}
