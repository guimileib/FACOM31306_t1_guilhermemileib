public class Candidato {
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private double totalBens;
    private boolean reeleger;
    private int nmrPartido;
    private String cargoPretendido;


    public Candidato(String nomeCompleto, String dataNascimento, String genero,double totalBens,
    boolean reeleger, int nmrPartido, String cargoPretendido){
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


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getTotalBens() {
        return totalBens;
    }

    public void setTotalBens(double totalBens) {
        this.totalBens = totalBens;
    }

    public boolean isReeleger() {
        return reeleger;
    }

    public void setReeleger(boolean reeleger) {
        this.reeleger = reeleger;
    }

    public int getNmrPartido() {
        return nmrPartido;
    }

    public void setNmrPartido(int nmrPartido) {
        this.nmrPartido = nmrPartido;
    }

    public String getCargoPretendido() {
        return cargoPretendido;
    }

    public void setCargoPretendido(String cargoPretendido) {
        this.cargoPretendido = cargoPretendido;
    }
    
}
