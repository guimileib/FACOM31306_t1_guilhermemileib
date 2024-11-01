public class Normal extends Ingresso{
    private double valorNormal;

    public Normal(double valor){
        super(valor);
    }
    
    public void imprimeTipoIngresso(){
        System.out.println("Ingresso Normal");
    }   
}
