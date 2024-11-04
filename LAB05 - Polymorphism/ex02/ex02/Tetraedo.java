package ex02;
public class Tetraedo extends FormaTridimensional {
    private double altura;
    private double lado;

    public Tetraedo(double altura, double lado){
        this.altura = altura;
        this.lado = lado;
    }

    @Override 
    public double obterArea() {
        return setArea(Math.pow(lado,2) * Math.sqrt(3));
    }

    @Override
    public double obterVolume(){
        double areaBase = (Math.sqrt(3)/4.0) * lado;
        return setVolume((1.0 / 3) * areaBase * altura);
    }

    @Override
    public String descricao(){
        return "O Tetraedo possui altura:  " + altura + " e lado: " + lado;
    }
    
}
