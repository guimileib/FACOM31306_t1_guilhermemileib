public class CandidatoPrefeito extends Candidato{
    private String nomeVicePrefeito;
    private String partidoVicePrefeito;

    public CandidatoPrefeito(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean reeleger, int nmrPartido, String nomeVicePrefeito, String partidoVicePrefeito){
        super(nomeCompleto, dataNascimento, genero, totalBens, reeleger, nmrPartido);
        this.nomeVicePrefeito = nomeVicePrefeito;
        this.partidoVicePrefeito = partidoVicePrefeito;
    }

    @Override
    public String toString(){
        return super.toString() + "Nome do Vice Prefeito: " + nomeVicePrefeito +
               "\nPartido do Vice Prefeito: " + partidoVicePrefeito +
               "\n";
    }
}
