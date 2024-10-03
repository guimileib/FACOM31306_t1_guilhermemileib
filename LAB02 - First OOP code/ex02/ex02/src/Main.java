
public class Main {
    public static void main(String[] args) throws Exception {
        Candidato c1 = new Candidato();
        Candidato c2 = new Candidato();
        Candidato c3 = new Candidato();

        // Alterar informações dos candidatos usando o método alterarInformacoes
        c1.alterarInformacoes("João Silva", "01/01/1970", "Masculino", "500000", true, 15, "Prefeito");
        c2.alterarInformacoes("Maria Souza", "15/06/1980", "Feminino", "300000", false, 22, "Vereadora");
        c3.alterarInformacoes("Maria Souza", "15/06/1980", "Feminino", "300000", false, 22, "Vereadora");

        // Exibir informações dos candidatos
        c1.mostrarInformacoes();
        c2.mostrarInformacoes();
        c3.mostrarInformacoes();
    }
}

