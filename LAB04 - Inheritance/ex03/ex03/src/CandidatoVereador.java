public class CandidatoVereador extends Candidato {
    private String nmrTresDigitos;
    private String bairro;

    public CandidatoVereador(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean reeleger, int nmrPartido, String nmrTresDigitos, String bairro){
        super(nomeCompleto, dataNascimento, genero, totalBens, reeleger, nmrPartido);
        this.nmrTresDigitos = nmrTresDigitos;
        this.bairro = bairro;
    }

    public CandidatoVereador(Candidato candidato, String nmrTresDigitos, String bairro){
        super(candidato.getNomeCompleto(),candidato.getDataNascimento(), candidato.getGenero(), 
        candidato.getTotalBens(), candidato.getReeleger(), candidato.getNmrPartido());
        this.bairro = bairro;
        this.nmrTresDigitos = nmrTresDigitos;
    }

    @Override
    public String toString(){
        return super.toString() + "Número de Três Digitos: " + nmrTresDigitos + 
               "\nBairro: " + bairro;
    }
}
