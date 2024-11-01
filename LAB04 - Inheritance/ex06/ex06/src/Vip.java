public class Vip extends Ingresso {
    private double valorVip;

    
    public Vip(double valor, double valorVip){
        super(valor);
        this.valorVip = valorVip;
    }

    public double getValorVip(){
        return getValor() + valorVip;
    }


}
