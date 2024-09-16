public class Main {
    public static void main(String[] args) throws Exception {
        Candidato[] c1  = new Candidato[4];

        // Instanciando o vetor com o construtor com as informações que irei armazenar
        c1[0] = new Candidato("JUNINHO PROFESSOR", "03/06/1974",  "Masculino", "80.000,00", false, 55, "Prefeito");
        c1[1] = new Candidato("PABLO HENRIQUE COSTA MARÇAL", "18/04/1987", "Cisgênero",  "169.503.058,17", false, 28, "Prefeito");
        c1[2] = new Candidato("GLEIDSON GONTIJO AZEVEDO", "15/04/1982", "Masculino", "743.894,96", true, 30, "Prefeito");
        //c1[3] = new Candidato(null, null, null, null, false, 0, null);
        for(int i = 0; i < c1.length; i++){
            System.out.println("<<Informações dos Candidatos "+ i +":");
            c1[i].mostrarInformacoes();// Vai exibir o que estiver dentro do método
        }

    } 
}