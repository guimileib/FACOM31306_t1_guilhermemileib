import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       System.out.print("Informe a quantidade de times: ");
       int n = s.nextInt();
        s.nextLine();
        Time[] times = new Time[n];
        
        for(int i = 0; i < n; i++){
            System.out.print("Digite o nome do time: ");
            String nomeTime = s.nextLine();
            System.out.print("\n<< Cadastro do Time " + (nomeTime)+ " >>");
            
            
            System.out.print("\nNome do Primeiro Jogador Titular: ");

            // Dados titular1
            String nomeTitular1 = s.nextLine();
            System.out.print("Digite a idade do Jogador: ");
            int idadeTitular1 = s.nextInt();
            System.out.print("Digite a altura do Jogador: ");
            double alturaTitular1 = s.nextDouble();
            System.out.print("Digite o peso do Jogador: ");
            double pesoTitular1 = s.nextDouble();
            s.nextLine(); // quebra de linha

            // Dados titular2
            System.out.print("Nome do Segundo Jogador Titular: ");
            String nomeTitular2 = s.nextLine();
            System.out.print("Digite a idade do Jogador: ");
            int idadeTitular2 = s.nextInt();
            System.out.print("Digite a altura do Jogador: ");
            double alturaTitular2 = s.nextDouble();
            System.out.print("Digite o peso do Jogador: ");
            double pesoTitular2 = s.nextDouble();
            s.nextLine();

            // Dados substituto
            System.out.print("Nome do Jogador Substituto: ");
            String nomeSubstituto = s.nextLine();
            System.out.print("Digite a idade do Jogador: ");
            int idadeSubstituto = s.nextInt();
            System.out.print("Digite a altura do Jogador: ");
            double alturaSubstituto = s.nextDouble();
            System.out.print("Digite o peso do Jogador: ");
            double pesoSubstituto = s.nextDouble();
            s.nextLine();

            // Instanciando e chamando os contrutores
            Jogador titular1 = new Jogador(nomeTitular1, idadeTitular1, alturaTitular1, pesoTitular1);
            Jogador titular2 = new Jogador(nomeTitular2, idadeTitular2, alturaTitular2, pesoTitular2);
            Jogador substituto = new Jogador(nomeSubstituto, idadeSubstituto,alturaSubstituto, pesoSubstituto);
            Time time = new Time(nomeTime, titular1, titular2, substituto);
            times[i] = time;
        }

        System.out.println("\n<< Informações dos Times >>");
        for(Time time : times){
            System.out.println(time);
            System.out.println("--------------------");
        }

        Time timeMaiorMedia = times[0];
        for(int i = 1; i < n; i++){
            if(times[i].calcIdadeMediaTime() > timeMaiorMedia.calcIdadeMediaTime()){
                timeMaiorMedia = times[i];
            }
        }

        System.out.println("O time com a Maior Média é: ");
        System.out.println(timeMaiorMedia);
    }
}