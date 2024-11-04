package ex02;
import ex02.FormaBidimensional;

public class Triangulo extends FormaBidimensional{
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double obterArea(){
        return setArea(base*altura);
    }

    public String descricao(){
        return "Triangulo com base: " + base + "e altura: " + altura;
    }
}
