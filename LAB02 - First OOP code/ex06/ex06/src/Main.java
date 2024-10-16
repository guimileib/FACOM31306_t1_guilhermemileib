public class Main {
    public static void main(String[] args) throws Exception {
        Candidato candidato1 = new Candidato("GLEIDSON GONTIJO AZEVEDO", "15/04/1982", "Masculino", 743894.96, true, 30, "Prefeito");
        Candidato candidato2 = new Candidato("LAIZ SOARES", "28/02/1991", "Feminino", 50000.00, false, 55, "Prefeito");
        Candidato candidato3 = new Candidato("PABLO HENRIQUE COSTA MARÇAL", "18/04/1987", "Cisgênero", 169503058.17, false, 28, "Prefeito");
        Candidato candidato4 = new Candidato("GUILHERME CASTRO BOULOS", "19/06/1982", "Cisgênero", 199596.87, false, 50, "Prefeito");
        Candidato candidato5 = new Candidato("RENATA OLIVEIRA", "05/12/1980", "Feminino", 300000.00, false, 45, "Prefeito");

        Candidato[] candidatosEleicao1 = {candidato1, candidato2, candidato3, candidato4, candidato5};

        Candidato candidato6 = new Candidato("MARCOS SILVA", "22/07/1985", "Masculino", 5000000.00, false, 10, "Prefeito");
        Candidato candidato7 = new Candidato("CARLA MENDES", "30/01/1990", "Feminino", 70000.00, true, 20, "Prefeito");
        Candidato candidato8 = new Candidato("ROBERTO PEREIRA", "12/03/1983", "Masculino", 150000.00, false, 35, "Prefeito");
        Candidato candidato9 = new Candidato("ALEXANDRE LIMA", "11/11/1988", "Cisgênero", 200000.00, false, 25, "Prefeito");
        Candidato candidato10 = new Candidato("FLAVIA ROCHA", "08/08/1975", "Feminino", 120000.00, true, 40, "Prefeito");

        Candidato[] candidatosEleicao2 = {candidato6, candidato7, candidato8, candidato9, candidato10};

        Eleicao e1 = new Eleicao("Divinópolis", 171693, candidatosEleicao1, "02/10/2024");
        Eleicao e2 = new Eleicao("São Paulo", 1100000, candidatosEleicao2, "02/10/2024");

        e1.mostrarInformacoesEleicao();
        e2.mostrarInformacoesEleicao();
    }
}
