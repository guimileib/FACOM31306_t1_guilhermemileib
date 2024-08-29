import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculando a Probabilidade:");

        System.out.print("Digite a quantidade de bolinhas\nVerde: ");
        int verde = scanner.nextInt();
        
        System.out.print("Azul: ");
        int azul = scanner.nextInt();
        
        System.out.print("Amarela: ");
        int amarela = scanner.nextInt();
        
        System.out.print("Vermelha: ");
        int vermelha = scanner.nextInt();

        int totalBolinhas = verde + azul + amarela + vermelha;
        
        double probVerde = (double) verde / totalBolinhas * 100;
        double probAzul = (double) azul / totalBolinhas * 100;
        double probAmarela = (double) amarela / totalBolinhas * 100;
        double probVermelha = (double) vermelha / totalBolinhas * 100;
        
        double maiorProb = Math.max(Math.max(probVerde, probAzul), Math.max(probAmarela, probVermelha));
        String corMaiorProb = "";
        
        if (maiorProb == probVerde) {
            corMaiorProb = "Verde";
        } else if (maiorProb == probAzul) {
            corMaiorProb = "Azul";
        } else if (maiorProb == probAmarela) {
            corMaiorProb = "Amarela";
        } else if (maiorProb == probVermelha) {
            corMaiorProb = "Vermelha";
        }
        System.out.println("\nProbabilidades");
        System.out.printf("Verde: %.1f%%\n", probVerde);
        System.out.printf("Azul: %.1f%%\n", probAzul);
        System.out.printf("Amarela: %.1f%%\n", probAmarela);
        System.out.printf("Vermelha: %.1f%% << Maior probabilidade\n", probVermelha);
    }
}