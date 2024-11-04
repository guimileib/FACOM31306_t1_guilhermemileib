package ex02;
public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double obterArea(){
        return setArea(lado*lado);
    }

    public String descricao(){
        return "Quadrado com lado: " + lado;
    }

}
