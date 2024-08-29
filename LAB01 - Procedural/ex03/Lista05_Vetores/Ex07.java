import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[5];
        int maiorNota = 0;

        System.out.println("<<Normalizando as notas>>");
        for (int i = 0; i < 5; i++) {
            System.out.print("Entre com a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();

            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        System.out.println("\nNotas normalizadas");
        for (int i = 0; i < 5; i++) {
            int notaNormalizada = (notas[i] * 100) / maiorNota;
            System.out.println("A nota do aluno " + (i + 1) + " é: " + notaNormalizada);
        }
    }
}
