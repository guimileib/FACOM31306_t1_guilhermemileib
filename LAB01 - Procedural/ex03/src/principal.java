import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);
    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {

        int[] valores = new int[6];
        Scanner sc = new Scanner(System.in);

        System.out.println("<<Listando um vetor em ordem inversa>>");
        int i = 0;
        do {
            System.out.println("Digite o " +(i + 1)+"º valor:");
            valores[i] = sc.nextInt();
            i++;
        }while(i < 6);

        System.out.printf("A ordem inversa é: ");
        i=5;

        do{
            System.out.print(valores[i] + " ");
            i--; 
        }while(i >= 0);
    }


    public static void ex04(){
        int[] valores = new int[6];
        Scanner sc = new Scanner(System.in);

        System.out.printf("<<Listando um vetor de números pares>>%n");

        int i = 0;  

        while (i < 6) {
            System.out.printf("Entre com o número %dº: ", i + 1);
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                valores[i] = numero;
                i++; 
            } else {
                System.out.println("Erro: Valor inválido. O número deve ser par.");
            }
        }

        System.out.println("Números pares inseridos:");
        for (int j = 0; j < valores.length; j++) {
            System.out.printf("Número %dº: %d%n", j + 1, valores[j]);
        }
    }

    public static void ex05(){
        int[] valores = new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<<5 valores>>");

        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com número o %dº: %n", i + 1);
            valores[i] = sc.nextInt();
        }

        System.out.printf("Os números digitados são:");

        for(int i = 0; i < 5; i++){
            System.out.print(valores[i] + " ");
        }

        int maior = valores[0];
        for(int i = 1; i < 5; i++ ){
            if(valores[i] > maior){
                maior = valores[i];
            }
        }
        System.out.println(" ");
        System.out.printf("O maior valor é: %d%n ", maior);
        
        int menor = valores[0];
        for(int i = 1; i < 5; i++){
            if(valores[i] < menor){
                menor = valores[i];
            }
        }

        System.out.printf("O menor valor é: %d%n", menor);

        int soma = valores[0];
        for(int i = 1 ; i < 5; i++){
            soma += valores[i];
            
        }
        double media = (double) soma / 5 ;
        System.out.printf("A média é: %.2f %n", media);
    }

    public static void ex06(){
        int[] valores = new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<<5 valores>>");

        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com número o %dº: %n", i + 1);
            valores[i] = sc.nextInt();
        }

        System.out.printf("Os números digitados são:");

        for(int i = 0; i < 5; i++){
            System.out.print(valores[i] + " ");
        }
        int posicao_maior = 0;
        int maior = valores[0];
        for(int i = 1; i < 5; i++ ){
            if(valores[i] > maior){
                maior = valores[i];
                posicao_maior = i;
            }
        }
        System.out.println(" ");
        System.out.printf("O maior valor é: %d, localizado na posição %d do vetor%n ", maior, posicao_maior);
        
        int menor = valores[0];
        int posicao = 0;

        for( int j = 1; j < 5; j++){
            if(valores[j] < menor){
                menor = valores[j];
                posicao = j;
            }
        }

        System.out.printf("O menor valor é: %d, localizado na posicação %d%n", menor, posicao);

        int soma = valores[0];
        for(int i = 1 ; i < 5; i++){
            soma += valores[i];
            
        }
        double media = (double) soma / 5 ;
        System.out.printf("A média é: %.2f %n", media);

    }

    public static void ex07(){
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];
        int maiorNota = 0;

        System.out.println("<<Normalizando as notas>>");
        for (int i = 0; i < 5; i++) {
            System.out.print("Entre com a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextInt();

            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        System.out.println("\nNotas normalizadas");
        for (int i = 0; i < 5; i++) {
            int notaNormalizada = (notas[i] * 100) / maiorNota;
            System.out.println("A nota do aluno " + (i + 1) + " é: " + notaNormalizada);
        }
    }

    public static void ex08(){
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];
        double soma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
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

    public static void ex09(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de alunos que você tem na turma: ");
        int numAlunos = sc.nextInt();

        if(numAlunos > 100){
            System.out.println("Você não pode criar uma turma com mais de 100 alunos.");
        }

        double[] notas = new double[numAlunos];
        double soma = 0;

        for(int i = 0; i < numAlunos; i++){
            System.out.print("Informe a nota do aluno " + (i+1) +":");
            notas[i] = sc.nextDouble();
            soma+= notas[i];
        }

        double media = soma / numAlunos;

        System.out.println("Notas dos alunos:");

        for(int i = 0; i< numAlunos; i++) {
            System.out.println("Aluno" + (i+1) + ":" + notas[i]);
        }

        System.out.println("Média da turma:" + media);
    }

    public static void ex010(){
        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("<<Subtração de vetores>>");

        for(int i = 0; i < 3; i++){
            System.out.print("Digite o valor de"+ (i+1) +" em A:");
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            System.out.print("Digite o valor de"+ (i+1) +" em B:");
            B[i] = sc.nextInt();
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

    public static void ex011(){
        Scanner sc = new Scanner(System.in);
        
        int[] v = new int[5];
        int[] v1 = new int[5]; 
        int[] v2 = new int[5]; 
        int v1Index = 0;
        int v2Index = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
            
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

    public static void ex012(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculando a Probabilidade:");

        System.out.print("Digite a quantidade de bolinhas\nVerde: ");
        int verde = sc.nextInt();
        
        System.out.print("Azul: ");
        int azul = sc.nextInt();
        
        System.out.print("Amarela: ");
        int amarela = sc.nextInt();
        
        System.out.print("Vermelha: ");
        int vermelha = sc.nextInt();

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

    public static void ex013(){
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Entre com o número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }

        System.out.print("Zerando os negativos, obtém-se: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void ex014(){
        Scanner sc = new Scanner(System.in);
        final int MAX_ALUNOS = 10000;
        
        System.out.println("====== Universidade Federal de Uberlândia ======");
        System.out.print("Quantos alunos serão cadastrados: ");
        int numAlunos = sc.nextInt();
        sc.nextLine(); 
        
        if (numAlunos > MAX_ALUNOS) {
            System.out.println("Número de alunos excede o limite permitido.");
            sc.close();
            return;
        }
        
        int[] matricula = new int[numAlunos];
        char[] classeSocial = new char[numAlunos];
        double[] cra = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.print("\nEntre com o número do aluno: ");
            matricula[i] = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Entre com a classe social do aluno " + matricula[i] + ": ");
            classeSocial[i] = sc.nextLine().charAt(0);
            
            System.out.print("Entre com o CRA do aluno " + matricula[i] + ": ");
            cra[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        
        System.out.println("\n==== Alunos Cadastrados ====");
        for (int i = 0; i < numAlunos; i++) {
            System.out.printf("Número: %d Classe Social: %c CRA: %.2f\n", matricula[i], classeSocial[i], cra[i]);
        }
        
    }

    public static void ex015(){
         Scanner sc = new Scanner(System.in);
        
        final int TAMANHO_VETOR = 8;
        int[] vetor = new int[TAMANHO_VETOR];
        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> vistos = new HashSet<>();
        
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            System.out.print("Entre com o número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        
        for (int valor : vetor) {
            if (vistos.contains(valor)) {
                repetidos.add(valor);
            } else {
                vistos.add(valor);
            }
        }

        System.out.print("Valores repetidos: ");
        if (repetidos.isEmpty()) {
            System.out.println("Nenhum valor repetido");
        } else {
            boolean primeiro = true;
            for (int valor : repetidos) {
                if (!primeiro) {
                    System.out.print(", ");
                }
                System.out.print(valor);
                primeiro = false;
            }
            System.out.println();
        }
    }
    
    public static void ex016(){
        Scanner sc = new Scanner(System.in);
        
        final int TAMANHO_VETOR = 8;
        int[] vetor = new int[TAMANHO_VETOR];
        Map<Integer, Integer> contagem = new HashMap<>();
        
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            System.out.print("Entre com o número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }


        for (int valor : vetor) {
            contagem.put(valor, contagem.getOrDefault(valor, 0) + 1);
        }


        System.out.println("\nValores repetidos:");

        for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
            int valor = entry.getKey();
            int quantidade = entry.getValue();
            if (quantidade > 1) {
                System.out.println(valor + " aparece " + quantidade + " vezes");
            }
        }
    }

    public static void main(String[] args) {
        //ex01();
        ex02();
        //ex03();
<<<<<<< HEAD
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();
        //ex010();
        //ex011();
        //ex013();
        //ex014();
        //ex015();
        //ex016();
=======
>>>>>>> 410c8d194ee74c713f6bc5eb9b4c6d54659a1bed
    }


}
