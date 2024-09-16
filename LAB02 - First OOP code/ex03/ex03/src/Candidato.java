public class Candidato {
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private String totalBens;
    private boolean reeleger;
    private int nmrPartido;
    private String cargoPretendido;

    public Candidato(String nomeCompleto, String dataNascimento, String genero, String totalBens, boolean reeleger,
            int nmrPartido, String cargoPretendido) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.reeleger = reeleger;
        this.nmrPartido = nmrPartido;
        this.cargoPretendido = cargoPretendido;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome:" + nomeCompleto);
        System.out.println("Data nascimento: " + dataNascimento);
        System.out.println("Gênero: " + genero);
        System.out.println("Total de Bens: " + totalBens);
        System.out.println("Vai concorrer a reeleição?" + reeleger);
        System.out.println("Número do Partido: " + nmrPartido);
        System.out.println("Cargo Pretendido: " + cargoPretendido);
        System.out.println("");
    }


}
