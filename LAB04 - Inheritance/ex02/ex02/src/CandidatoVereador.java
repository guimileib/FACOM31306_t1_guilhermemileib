public class CandidatoVereador extends Candidato {
    private String nmrTresDigitos;
    private String bairro;

    public CandidatoVereador(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean reeleger, int nmrPartido, String nmrTresDigitos, String bairro){
        super(nomeCompleto, dataNascimento, genero, totalBens, reeleger, nmrPartido);
        this.nmrTresDigitos = nmrTresDigitos;
        this.bairro = bairro;
    }

    @Override
    public String toString(){
        return "Número de Três Digitos: " + nmrTresDigitos + 
               "\nBairro: " + bairro;
    }
}
