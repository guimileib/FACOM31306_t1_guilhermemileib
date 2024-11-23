public abstract class VeiculosDuasRodas {
    private int numeroIdentificacao;
    private String nomeFabricante;
    private double velocidade;
    
    public VeiculosDuasRodas(int numeroIdentificacao, String nomeFabricante, double velocidade) {
        this.numeroIdentificacao =  numeroIdentificacao;
        this.nomeFabricante = nomeFabricante;
        this.velocidade = velocidade;
    }

    //métodos getters e setters que não são abstratos:
        public int getNumeroIdentificacao(){
            return numeroIdentificacao;
        }

        public void setNumeroIdentificacao(int numeroIdentificacao){
            this.numeroIdentificacao = numeroIdentificacao;
        }

        public String getNomeFabricante(){
            return nomeFabricante;
        }

        public void setNomeFabricante(String nomeFabricante){
            this.nomeFabricante = nomeFabricante;
        }

        public double getVelocidade(){
            return velocidade;
        }

        public void setVelocidade(double velocidade){
            this.velocidade = velocidade;
        }

    // método sem implementação, pois é abstrato:
    public abstract void imprimirDados();
}
