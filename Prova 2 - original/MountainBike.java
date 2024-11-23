public class MountainBike extends Bike  implements Campeonato{
    private String tipoSuspensao; 

    public MountainBike(double velocidadeInicial, int numMaximo,String tipoSuspensao, 
    int numeroIdentificacao, String nomeFabricante, double velocidade) {
        super(velocidadeInicial, numMaximo, 
        numeroIdentificacao, nomeFabricante,velocidade);
        this.tipoSuspensao = tipoSuspensao;
    }

    public String getTipoSuspensao() {
        return tipoSuspensao;
    }

    public void setTipoSuspensao(String tipoSuspensao) {
        this.tipoSuspensao = tipoSuspensao;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Tipo de suspensão: " + tipoSuspensao);
    }

    @Override
    public boolean credencia(){
        if(tipoSuspensao.equals("Óleo") || tipoSuspensao.equals("ar")){
            return true;
        }else{
            return false;
        }
    }

    @Override 
    public int comparaVelocidade(Bike b1,  Bike b2){    
        if(b1.getVelocidade() < b2.getVelocidade()) {
            return -1;
        }else if(b1.getVelocidade() == b2.getVelocidade()){
            return 1;
        }else{
            return 0;
        }
        
    }
}
