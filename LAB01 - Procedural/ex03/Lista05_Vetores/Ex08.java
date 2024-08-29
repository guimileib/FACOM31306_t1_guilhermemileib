import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        double soma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        double media = soma / numeros.length;
        
        double somaQuadrados = 0;
        for (int i = 0; i < 5; i++) {
            somaQuadrados += Math.pow(numeros[i] - media, 2);
        }
        
        double desvioPadrao = Math.sqrt(somaQuadrados / (numeros.length - 1));
        
        System.out.println("Média: " + media);
        System.out.println("Desvio Padrão Amostral: " + desvioPadrao);

    }
}