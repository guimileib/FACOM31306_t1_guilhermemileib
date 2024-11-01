public class CamaroteSuperior extends Vip {
    private double valorCamaroteSuperior;


    public CamaroteSuperior(double valor, double valorVip, double valorCamaroteSuperior){
        super(valor, valorVip);
        this.valorCamaroteSuperior = valorCamaroteSuperior;    
    }

    public double getValorCamaroteSuperior(){
        return getValorVip() + valorCamaroteSuperior;
    }
    

}
