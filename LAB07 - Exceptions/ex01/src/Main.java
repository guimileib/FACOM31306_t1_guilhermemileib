import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o seu CPF: ");
        String cpf = s.nextLine();

        System.out.print("Digite o nome do funcionário: ");
        String nome = s.nextLine();

        System.out.print("Digite o salário atual: ");
        double salario = s.nextDouble();

        Funcionario f1 = new Funcionario(cpf, nome, salario);

        System.out.print("Digite a porcentagem de aumento de salário para esse funcionário: ");
        double aumentoPorcentagem = s.nextDouble();

        f1.aumentarSalario(aumentoPorcentagem);
    }
}
