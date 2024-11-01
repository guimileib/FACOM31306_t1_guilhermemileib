public class Main {
    public static void main(String[] args) {
        Normal ingressoNormal = new Normal(50);
        ingressoNormal.escreveValor();
        ingressoNormal.imprimeTipoIngresso();

        Vip ingressoVip = new Vip(50, 20);
        System.out.println("Valor do ingresso VIP: " + ingressoVip.getValorVip());
        
        CamaroteInferior camaroteInferior = new CamaroteInferior(50, 20, "Cadeira 34", 90);
        camaroteInferior.escreveValor();
        camaroteInferior.mostrarLocalizacao();  
        System.out.println("Valor do ingresso do Camarote Inferior: " + camaroteInferior.getValorVip());

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(50, 20, 40);
        camaroteSuperior.escreveValor();
        System.out.println("Valor do ingresso do Camarote Superior: " + camaroteSuperior.getValorCamaroteSuperior());
    }
}
