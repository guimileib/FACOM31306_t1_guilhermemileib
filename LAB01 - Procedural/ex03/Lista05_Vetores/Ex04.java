import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int[] valores = new int[6];
        Scanner scanner = new Scanner(System.in);

        System.out.printf("<<Listando um vetor de números pares>>%n");

        int i = 0;  

        while (i < 6) {
            System.out.printf("Entre com o número %dº: ", i + 1);
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                valores[i] = numero;
                i++; 
            } else {
                System.out.println("Erro: Valor inválido. O número deve ser par.");
            }
        }

        System.out.println("Números pares inseridos:");
        for (int j = 0; j < valores.length; j++) {
            System.out.printf("Número %dº: %d%n", j + 1, valores[j]);
        }

        scanner.close();
    }
}