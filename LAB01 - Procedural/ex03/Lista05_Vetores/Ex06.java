import java.util.Scanner;

public class Ex06 {
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
        int posicao_maior = 0;
        int maior = valores[0];
        for(int i = 1; i < 5; i++ ){
            if(valores[i] > maior){
                maior = valores[i];
                posicao_maior = i;
            }
        }
        System.out.println(" ");
        System.out.printf("O maior valor é: %d, localizado na posição %d do vetor%n ", maior, posicao_maior);
        
        int menor = valores[0];
        int posicao = 0;

        for( int j = 1; j < 5; j++){
            if(valores[j] < menor){
                menor = valores[j];
                posicao = j;
            }
        }

        System.out.printf("O menor valor é: %d, localizado na posicação %d%n", menor, posicao);

        int soma = valores[0];
        for(int i = 1 ; i < 5; i++){
            soma += valores[i];
            
        }
        double media = (double) soma / 5 ;
        System.out.printf("A média é: %.2f %n", media);

    }
}
