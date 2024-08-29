import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int[] valores = new int[6];
        Scanner scanner = new Scanner(System.in);

        System.out.println("<<Listando um vetor em ordem inversa>>");
        int i = 0;
        do {
            System.out.println("Digite o " +(i + 1)+"º valor:");
            valores[i] = scanner.nextInt();
            i++;
        }while(i < 6);

        System.out.printf("A ordem inversa é: ");
        i=5;

        do{
            System.out.print(valores[i] + " ");
            i--; 
        }while(i >= 0);

    }
    
}
