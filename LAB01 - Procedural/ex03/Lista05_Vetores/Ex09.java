import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos que você tem na turma: ");
        int numAlunos = scanner.nextInt();

        if(numAlunos > 100){
            System.out.println("Você não pode criar uma turma com mais de 100 alunos.");
        }

        double[] notas = new double[numAlunos];
        double soma = 0;

        for(int i = 0; i < numAlunos; i++){
            System.out.print("Informe a nota do aluno " + (i+1) +":");
            notas[i] = scanner.nextDouble();
            soma+= notas[i];
        }

        double media = soma / numAlunos;

        System.out.println("Notas dos alunos:");

        for(int i = 0; i< numAlunos; i++) {
            System.out.println("Aluno" + (i+1) + ":" + notas[i]);
        }

        System.out.println("Média da turma:" + media);


    }
}
