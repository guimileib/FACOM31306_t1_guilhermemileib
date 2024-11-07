import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.println("---- Divisão por inteiros -------");
        System.out.print("Digite o valor do numerador: ");
        int numerador = s.nextInt();

        System.out.print( "Digite o valor do denominador: ");
        int denominador = s.nextInt();
        
        Operacao op1 = new Operacao();
        op1.iniciarOperacao(numerador, denominador);

    }
    
}
