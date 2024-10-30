public class Candidato {
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private double totalBens;
    private boolean reeleger;
    private int nmrPartido;

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
        return "\nNome: " + nomeCompleto +
               "\nData de Nascimento: " + dataNascimento +
               "\nGênero: " + genero +
               "\nTotal de bens declarados: " + totalBens +
               "\nCandidato à reeleição: " + (reeleger ? "Sim" : "Não") +
               "\nNúmero do Partido: " + nmrPartido +
               "\n";
    }

    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public double getTotalBens(){
        return totalBens;
    }

    public void setTotalBens(double totalBens){
        this.totalBens = totalBens;
    }

    public Boolean getReeleger(){
        return reeleger;
    }

    public void setReeleger(boolean reeleger){
        this.reeleger = reeleger;
    }

    public int getNmrPartido(){
        return nmrPartido;
    }

    public void setNmrPartido(int nmrPartido){
        this.nmrPartido = nmrPartido;
    }
    
}

