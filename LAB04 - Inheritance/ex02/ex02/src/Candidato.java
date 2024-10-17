public class Candidato {
    protected String nomeCompleto;
    protected String dataNascimento;
    protected String genero;
    protected double totalBens;
    protected boolean reeleger;
    protected int nmrPartido;

    public Candidato(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean reeleger, int nmrPartido) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.reeleger = reeleger;
        this.nmrPartido = nmrPartido;
    }

    @Override
    public String toString() {
        return "<< Informações do Candidato >>" +
               "\nNome: " + nomeCompleto +
               "\nData de Nascimento: " + dataNascimento +
               "\nGênero: " + genero +
               "\nTotal de bens declarados: " + totalBens +
               "\nCandidato à reeleição: " + (reeleger ? "Sim" : "Não") +
               "\nNúmero do Partido: " + nmrPartido +
               "\n";
    }

}
