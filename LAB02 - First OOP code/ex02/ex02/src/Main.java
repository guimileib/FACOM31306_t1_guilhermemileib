
public class Main {
    public static void main(String[] args) throws Exception {
        Candidato candidato1 = new Candidato();
        Candidato candidato2 = new Candidato();
        Candidato candidato3 = new Candidato();

        // Alterar informações dos candidatos usando o método alterarInformacoes
        candidato1.alterarInformacoes("João Silva", "01/01/1970", "Masculino", "500000", true, 15, "Prefeito");
        candidato2.alterarInformacoes("Maria Souza", "15/06/1980", "Feminino", "300000", false, 22, "Vereadora");
        candidato3.alterarInformacoes("Carlos Oliveira", "23/09/1975", "Masculino", "1000000", true, 35, "Prefeito");

        // Exibir informações dos candidatos
        candidato1.mostrarInformacoes();
        candidato2.mostrarInformacoes();
        candidato3.mostrarInformacoes();
    }
}

