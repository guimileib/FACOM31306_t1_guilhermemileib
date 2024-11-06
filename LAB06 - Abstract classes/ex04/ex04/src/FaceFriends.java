import java.util.Scanner;

public class FaceFriends {
    private static Contato[] contatos = new Contato[100];
    private static int contadorContatos = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao = 0;
        
        do{
            System.out.println("\n--------- Selecione a opção que deseja ---------");
            System.out.println("1. Ver contatos. ");
            System.out.println("2. Adcionar contatos");
            System.out.println("3. Sair.");
            System.out.print("Escolha uma opção: ");
            
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    verContatos();
                    break;
                case 2:
                    adicionarContatos();
                    break;
                case 3:
                    System.out.println("Você saiu do menu.");
                    break;
                default:
                    System.out.println("Opção inválida, tente outra opção. ");
                    
            }
        }while(opcao != 3);

    }
        public static void verContatos(){
            
            System.out.println("\n--------- Selecione a opção que deseja ---------");
            System.out.println("1. Ver contatos somente de Familiares.");
            System.out.println("2. Ver contatos somente de Amigos.");
            System.out.println("3. Ver contatos somente de Colegas de trabalho.");
            System.out.print("Escolha uma opção: ");

            Scanner s = new Scanner(System.in);
            int subOpcao = s.nextInt();

            switch (subOpcao) {
                case 1:
                    System.out.println("\n--------- Contatos Família --------- "); 
                    for(Contato contato : contatos){
                        if(contato instanceof Familia){
                            contato.imprimirContato();
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--------- Contatos Amigos --------- ");
                    for(Contato contato : contatos){
                        if(contato instanceof Amigos){
                            contato.imprimirContato();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--------- Contatos Trabalho --------- ");
                    for(Contato contato : contatos){
                        if(contato instanceof Trabalho){
                            contato.imprimirContato();
                        }
                    }
                    break;
                
                default:
                    System.out.println("Opção inválida, tente novamente.");
                
            }
            
        }

        private static void adicionarContatos(){
            if(contadorContatos >= contatos.length){
                System.out.println("Não é possível adicionar mais contatos.");
                return;
            }
            
            System.out.println("\n--------- Escolha o tipo de contato que você quer adicionar: ---------");
            System.out.println("1. Familiar");
            System.out.println("2. Amigo");
            System.out.println("3. Colega de Trabalho");
            System.out.print("Escolha uma opção: ");

            Scanner s = new Scanner(System.in);
            int tipoContato = s.nextInt();
            s.nextLine(); // limpei o buffer

            System.out.print("Digite o apelido: ");
            String apelido = s.nextLine();

            System.out.print("Digite o nome: ");
            String nome = s.nextLine();

            System.out.print("Digite o email: ");
            String email = s.nextLine();

            System.out.print("Digite a data do seu aniversário: ");
            String aniversario = s.nextLine();

            

            Contato novoContato = null; // 
            switch(tipoContato){
                case 1:
                    System.out.print("Digite o grau de parentesco:");
                    String parentesco = s.nextLine();
                    novoContato = new Familia(apelido, nome, aniversario, email, parentesco);
                    break;
                case 2:
                    System.out.print("Digite o grau de amizaede: ");
                    String grau = s.nextLine();
                    novoContato = new Amigos(apelido, nome, aniversario, email, grau);
                    break;
                case 3:
                    System.out.print("Digite o tipo de proximidade: ");
                    String tipo = s.nextLine();
                    novoContato = new Trabalho(apelido, nome, aniversario, email, tipo);
                    break;
                default:
                    System.out.print("Opção inválida, tente novamente.");
            }
            contatos[contadorContatos++] = novoContato;
            System.out.println("Contato adicionado com sucesso!");

        }

    }



