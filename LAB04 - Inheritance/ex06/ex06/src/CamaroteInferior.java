public class CamaroteInferior extends Vip{
    private String localizacaoIngresso;
    
    public CamaroteInferior(double valor, double valorVip, String localizacaoIngresso, double valorCamaroteInferior) {
        super(valor,valorVip);
        this.localizacaoIngresso = localizacaoIngresso;
    }


    public String getLocalizacao(){
        return localizacaoIngresso;
    }

    public void mostrarLocalizacao(){
        System.out.println("Localização do camarote inferior: " + localizacaoIngresso);
    }
}
