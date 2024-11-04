package ex02;

public class Formas {
    public static void main(String[] args) {
        FormaBidimensional[] formabidimensional = {
            new Circulo(10),
            new Quadrado(20),
            new Triangulo(10,10)
        };

        FormaTridimensional[] formatridimensional = {
            new Cubo(10),
            new Esfera(10),
            new Tetraedo( 2, 10)
        };

        System.out.println("Formas Bidmensionais dados: ");
        System.out.println(" ");
        for(FormaBidimensional formabi : formabidimensional){
            System.out.println(formabi.descricao());
            System.out.println("Área: " + formabi.obterArea());
            
        }

        System.out.println(" ");
        System.out.println("Formas Tridimensional dados: ");
        System.out.println(" ");
        for (FormaTridimensional formatri : formatridimensional){
            System.out.println(formatri.descricao());
            System.out.println("Área: " + formatri.obterArea());
            System.out.println("Volume: " + formatri.obterVolume());
        }
    }
}
