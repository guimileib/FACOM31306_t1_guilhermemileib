public class Main {
    public static void main(String[] args) throws Exception {

        Candidatos c1 = new Candidatos("João Silva", "01/01/1970", "Masculino", "500000", true, 15, "Prefeito");
        Candidatos c2 = new Candidatos("Maria Souza", "15/06/1980", "Feminino", "300000", false, 22, "Vereadora");
        Candidatos c3 = new Candidatos("Maria Souza", "15/06/1980", "Feminino", "300000", false, 22, "Vereadora");

        c1.mostrarInformacoes();
        c2.mostrarInformacoes();
        c3.mostrarInformacoes();

        System.out.println(c1.getNomeCompleto());
        c1.setNomeCompleto("Guilherme Mileib");
        System.out.println(c1.getNomeCompleto());
        
    }
}
