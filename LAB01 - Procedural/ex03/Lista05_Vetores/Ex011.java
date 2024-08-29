import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] v = new int[5];
        int[] v1 = new int[5]; 
        int[] v2 = new int[5]; 
        int v1Index = 0;
        int v2Index = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            v[i] = scanner.nextInt();
            
            if (v[i] % 2 == 0) {
                v2[v2Index] = v[i];
                v2Index++;
            } else {
                v1[v1Index] = v[i];
                v1Index++;
            }
        }
        
        System.out.print("\nÍmpares: ");
        for (int i = 0; i < v1Index; i++) {
            System.out.print(v1[i]);
            if (i < v1Index - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("\nPares: ");
        for (int i = 0; i < v2Index; i++) {
            System.out.print(v2[i]);
            if (i < v2Index - 1) {
                System.out.print(", ");
            }
        }

    }
}

