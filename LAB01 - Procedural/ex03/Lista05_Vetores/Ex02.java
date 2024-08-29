import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int[] valores = new int[6];
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<6;i++){
            System.out.printf("Digite o %dº:", i+1);
            valores[i] = scanner.nextInt();
        }
        for(int i=0; i < 6; i++){
            System.out.printf("%dº: %d%n",i + 1, valores[i]);
        }



    }
}
