public class CandidatoPrefeito {
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private double totalBens;
    private boolean reeleger;
    private int nmrPartido;
    private String nomeVicePrefeito;
    private String partidoVicePrefeito;

    public CandidatoPrefeito(String nomeCompleto, String dataNascimento, String genero, double totalBens,boolean reeleger, int nmrPartido, String nomeVicePrefeito, String partidoVicePrefeito){
        this.nomeCompleto = nomeCompleto;
        this.nomeVicePrefeito = nomeVicePrefeito;
        this.partidoVicePrefeito = partidoVicePrefeito;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.reeleger = reeleger;
        this.nmrPartido = nmrPartido;

    }
    
    public String toString() {
        return "<< Informações do Prefeito >>" +
               "\nNome: " + nomeCompleto +
               "\nData de Nascimento: " + dataNascimento +
               "\nGênero: " + genero +
               "\nTotal de bens declarados: " + totalBens +
               "\nCandidato à reeleição: " + (reeleger ? "Sim" : "Não") +
               "\nNúmero do Partido: " + nmrPartido +
               "\nNome do Vice Prefeito: " + nomeVicePrefeito +
               "\nNúmero do Partido do Vice Prefeito: " + partidoVicePrefeito +
               "\n";
    }
}
    

