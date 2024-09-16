public class Candidato {
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private String totalBens;
    private boolean reeleger;
    private int nmrPartido;
    private String cargoPretendido;

    public void alterarInformacoes(String nomeCompleto, String dataNascimento, String genero, String totalBens, boolean reeleger, int nmrPartido, String cargoPretendido) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.reeleger = reeleger;
        this.nmrPartido = nmrPartido;
        this.cargoPretendido = cargoPretendido;
    }

    public void mostrarInformacoes() {
        System.out.println("<< Informações do candidato >>");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Gênero: " + genero);
        System.out.println("Total de bens declarados: " + totalBens);
        System.out.println("Candidato à reeleição: " + (reeleger ? "Sim" : "Não"));
        System.out.println("Número do Partido: " + nmrPartido);
        System.out.println("Cargo Pretendido: " + cargoPretendido);
        System.out.println();
    }
}
