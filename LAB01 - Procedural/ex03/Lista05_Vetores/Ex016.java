import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int TAMANHO_VETOR = 8;
        int[] vetor = new int[TAMANHO_VETOR];
        Map<Integer, Integer> contagem = new HashMap<>();
        
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            System.out.print("Entre com o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }


        for (int valor : vetor) {
            contagem.put(valor, contagem.getOrDefault(valor, 0) + 1);
        }


        System.out.println("\nValores repetidos:");

        for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
            int valor = entry.getKey();
            int quantidade = entry.getValue();
            if (quantidade > 1) {
                System.out.println(valor + " aparece " + quantidade + " vezes");
            }
        }
        
    }

}

