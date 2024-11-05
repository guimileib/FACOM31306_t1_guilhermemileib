public class Universidade {
    private String nomeUniversidade;
    private String dataFundacao;
    private Estudante[] estudantes = new Estudante[100];
    private int contadorEstudantes = 0;


    public Universidade(String nomeUniversidade, String dataFundacao){
        this.nomeUniversidade = nomeUniversidade;
        this.dataFundacao = dataFundacao;
    }

    public void adicionarEstudante(Estudante estudante){
        if(contadorEstudantes < 100){
            estudantes[contadorEstudantes++] = estudante;
        }
    }


    public void contarEstudantesPorTipo(){
        int graduacao = 0, mestrado = 0, doutorado = 0;
        for(int i = 0; i < contadorEstudantes; i++){ 
            if(estudantes[i] instanceof Doutorado) doutorado++;
            else if(estudantes[i] instanceof Mestrado) mestrado++;
            else if(estudantes[i] instanceof Graduacao) graduacao++;
        }
        System.out.println("Graduação: " + graduacao);
        System.out.println("Mestrado: " + mestrado);
        System.out.println("Doutorado: " + doutorado);

    }

    public void listarEstudantes(){
        for(int i =0; i< contadorEstudantes; i++){
            System.out.println(estudantes[i].getNome());
            if(estudantes[i] instanceof Doutorado){
                Doutorado doutorado = (Doutorado) estudantes[i];
                System.out.println("Título da tese: " + doutorado.getTituloTese() + 
                "; Linha de Pesquisa: " + doutorado.getLinhaPesquisa());
            }else {
                //System.out.println(" ");
            }
        }
    }

    public void copiarEstudantePosGraduacao(){
        
    }

    public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade Exemplo", "01/01/2000");

        universidade.adicionarEstudante(new Graduacao("Alice", "G001"));
        universidade.adicionarEstudante(new Mestrado("Bob", "M001", "Computação"));
        universidade.adicionarEstudante(new Doutorado("Charlie", "D001", "Inteligência Artificial", "Tese de IA"));

        universidade.contarEstudantesPorTipo();
        universidade.listarEstudantes();
        //universidade.copiarEstudantesPosGraduacao();
    }
}

