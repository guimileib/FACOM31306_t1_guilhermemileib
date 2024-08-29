import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_ALUNOS = 10000;
        
        System.out.println("====== Universidade Federal de Uberlândia ======");
        System.out.print("Quantos alunos serão cadastrados: ");
        int numAlunos = scanner.nextInt();
        scanner.nextLine(); 
        
        if (numAlunos > MAX_ALUNOS) {
            System.out.println("Número de alunos excede o limite permitido.");
            scanner.close();
            return;
        }
        
        int[] matricula = new int[numAlunos];
        char[] classeSocial = new char[numAlunos];
        double[] cra = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.print("\nEntre com o número do aluno: ");
            matricula[i] = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Entre com a classe social do aluno " + matricula[i] + ": ");
            classeSocial[i] = scanner.nextLine().charAt(0);
            
            System.out.print("Entre com o CRA do aluno " + matricula[i] + ": ");
            cra[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }
        
        System.out.println("\n==== Alunos Cadastrados ====");
        for (int i = 0; i < numAlunos; i++) {
            System.out.printf("Número: %d Classe Social: %c CRA: %.2f\n", matricula[i], classeSocial[i], cra[i]);
        }
        
    }
}
