import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int[] valores = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("<<5 valores>>");

        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com número o %dº: %n", i + 1);
            valores[i] = scanner.nextInt();
        }

        System.out.printf("Os números digitados são:");

        for(int i = 0; i < 5; i++){
            System.out.print(valores[i] + " ");
        }

        int maior = valores[0];
        for(int i = 1; i < 5; i++ ){
            if(valores[i] > maior){
                maior = valores[i];
            }
        }
        System.out.println(" ");
        System.out.printf("O maior valor é: %d%n ", maior);
        
        int menor = valores[0];
        for(int i = 1; i < 5; i++){
            if(valores[i] < menor){
                menor = valores[i];
            }
        }

        System.out.printf("O menor valor é: %d%n", menor);

        int soma = valores[0];
        for(int i = 1 ; i < 5; i++){
            soma += valores[i];
            
        }
        double media = (double) soma / 5 ;
        System.out.printf("A média é: %.2f %n", media);

    }
}
