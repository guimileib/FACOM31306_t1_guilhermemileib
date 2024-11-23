public class SpeedBike extends Bike implements Campeonato{
    private int espessuraPneu;

    public SpeedBike(double velocidadeInicial, 
    int numMaximo, int espessuraPneu, int numeroIdentificacao, 
    String nomeFabricante, double velocidade) {
        super(velocidadeInicial, numMaximo, 
        numeroIdentificacao, nomeFabricante,velocidade);
        setEspessuraPneu(espessuraPneu);
    }

    public int getEspessuraPneu() {
        return espessuraPneu;
    }

    public void setEspessuraPneu(int espessuraPneu) {
        this.espessuraPneu = espessuraPneu;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Espessura do pneu: " + espessuraPneu + " mm");
    }

    @Override 
    public boolean credencia(){
        if(espessuraPneu >= 23 && espessuraPneu <= 28){
            return true;
        }else{
            return false;
        }
    }

    @Override 
    public int comparaVelocidade(Bike b1 , Bike b2){
        if(b1.getVelocidade() < b2.getVelocidade()){
            return -1;
        }else if(b1.getVelocidade() == b2.getVelocidade()){
            return 0;
        }else{
            return 1;
        }
    }
    /* 
    public void enviarImpressora(){
        Impressora p = new Impressora("HP Lasejet");
        p.imprimir(this);
    }
    */
}
