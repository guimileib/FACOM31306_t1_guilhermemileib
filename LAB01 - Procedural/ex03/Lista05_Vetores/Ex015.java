import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int TAMANHO_VETOR = 8;
        int[] vetor = new int[TAMANHO_VETOR];
        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> vistos = new HashSet<>();
        
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            System.out.print("Entre com o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        for (int valor : vetor) {
            if (vistos.contains(valor)) {
                repetidos.add(valor);
            } else {
                vistos.add(valor);
            }
        }

        System.out.print("Valores repetidos: ");
        if (repetidos.isEmpty()) {
            System.out.println("Nenhum valor repetido");
        } else {
            boolean primeiro = true;
            for (int valor : repetidos) {
                if (!primeiro) {
                    System.out.print(", ");
                }
                System.out.print(valor);
                primeiro = false;
            }
            System.out.println();
        }
        
    }
}
