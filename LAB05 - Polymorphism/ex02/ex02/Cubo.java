package ex02;
public class Cubo extends FormaTridimensional{
    private double lado;

    public Cubo(double lado){
        this.lado = lado;
    }

    @Override
    public double obterVolume(){
        return setVolume(Math.pow(lado,3));
    }

    @Override
    public double obterArea(){
        return setArea(6 * Math.pow(lado,2));
    }

    public String descricao(){
        return "Cubo com lado: " + lado;
    }
}
