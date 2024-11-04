package ex02;
public class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double obterArea(){
        return setArea(Math.PI * Math.pow(raio,2));
    }

    public String descricao(){
        return "Circulo com raio: " + raio;
    }
}
