public class Main {
    public static void main(String[] args) throws Exception {
        
        Candidato candidato1 = new Candidato("GLEIDSON GONTIJO AZEVEDO", "15/04/1982", "Masculino", 743894.96, true, 30, "Prefeito");
        Candidato candidato2 = new Candidato("LAIZ SOARES","28/02/1991","Feminino",50000.00, false,55,"Prefeito");
        Candidato candidato3 = new Candidato("PABLO HENRIQUE COSTA MARÇAL", "18/04/1987", "Cisgênero",  169503058.17, false, 28, "Prefeito");
        Candidato candidato4 = new Candidato("GUILHERME CASTRO BOULOS", "19/06/1982", "Cisgênero", 199596.87, false, 50, "Prefeito");

        Candidato[] candidatosEleicao1 = {candidato1, candidato2};
        Candidato[] candidatosEleicao2 = {candidato3, candidato4};

        Eleicao e1 = new Eleicao("Divinopolis", 171693, candidatosEleicao1 , "02/10/2024");
        Eleicao e2 = new Eleicao("São Paulo",1100000,candidatosEleicao2,"02/10/2024");
        
        e1.mostrarInformacoesEleicao();
        e2.mostrarInformacoesEleicao();
       
    }       
}
