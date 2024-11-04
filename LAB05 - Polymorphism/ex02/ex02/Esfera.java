package ex02;
public class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    @Override
    public double obterVolume(){
        return setVolume((4.0/3) * Math.PI * Math.pow(raio, 3) );
    }

    @Override
    public double obterArea(){
        return setArea(4 * Math.PI * Math.pow(raio, 2));
    }

    @Override
    public String descricao(){
        return "Esfera de raio: " + raio;
    }
    
}
