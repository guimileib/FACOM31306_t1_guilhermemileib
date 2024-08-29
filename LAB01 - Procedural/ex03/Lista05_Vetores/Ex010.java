import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {

        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("<<Subtração de vetores>>");

        for(int i = 0; i < 3; i++){
            System.out.print("Digite o valor de"+ (i+1) +" em A:");
            A[i] = scanner.nextInt();
        }

        for(int i = 0; i < 3; i++){
            System.out.print("Digite o valor de"+ (i+1) +" em B:");
            B[i] = scanner.nextInt();
        }

        for(int i = 0; i < 3; i++){
            C[i] =  A[i] - B[i];
        }

        System.out.println("O vetor C, definido como C = A - B é: (");
        for (int i = 0; i < 3; i++) {
            System.out.print(C[i]);
            if (i < 3 - 1) {
                System.out.print(", ");
            }
        }

        System.out.print(")");
    }
}
