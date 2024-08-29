import java.util.Scanner;

public class Ex013{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Entre com o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }

        System.out.print("Zerando os negativos, obtém-se: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}
