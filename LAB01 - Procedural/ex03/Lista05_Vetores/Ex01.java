import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int[] valores = new int[6];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor a ser lido: ");
        valores[0] = scanner.nextInt();

        System.out.println("Digite o segundo valor a ser lido: ");
        valores[1] = scanner.nextInt();

        System.out.println("Digite o terceiro valor a ser lido: ");
        valores[2] = scanner.nextInt();

        System.out.println("Digite o quarto valor a ser lido: ");
        valores[3] = scanner.nextInt();

        System.out.println("Digite o quinto valor a ser lido: ");
        valores[4] = scanner.nextInt();

        System.out.println("Digite o sexto valor a ser lido: ");
        valores[5] = scanner.nextInt();

        System.out.println("Os valores lidos foram:" + 
        valores[0] + " " + valores[1]+ " " + valores[2]+ " "
         + valores[3] + " " + valores[4] + " " + valores[5] );
        

    }
    
}
